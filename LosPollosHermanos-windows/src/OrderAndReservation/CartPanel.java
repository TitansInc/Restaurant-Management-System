/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderAndReservation;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author zubaeyr
 */
public class CartPanel extends javax.swing.JPanel {

    /**
     * Creates new form CartPanel
     */
    
    HashMap itemsqty=new HashMap();
    HashMap itemsprice=new HashMap();
    HashMap itemsimages=new HashMap();
    float GrandTotal=0.00f;
    Random random=new Random();
    Statement statement;
    ResultSet result;
    ExternalOrderDetailsPanel extordpan=new ExternalOrderDetailsPanel();
    EmptyPanel2 empty=new EmptyPanel2();
    JFrame f;
    CartItems tabs[];
    
    public CartPanel(Statement statement,JFrame f) {
        this.statement=statement;
        this.f=f;
        initComponents();
      //  UpdateDisplayCart();
        ExtParentPanel.setLayout(new BorderLayout());
        ExtParentPanel.add(empty);
        ExtParentPanel.revalidate();
    }
    
    
    public void UpdateDisplayCart(){
     Float SubTotal=0.00f;   
     Set set=itemsqty.keySet();
     Iterator i=set.iterator();
     GrandTotal=0.00f;
     int no_of_meals=itemsqty.size();
         int no_of_rows=itemsqty.size()/3;
         if(no_of_meals%3!=0){no_of_rows++;}
         if(no_of_meals<=6){
             no_of_rows=2;
         }
         ItemsDisplayPanel.removeAll();
         ItemsDisplayPanel.setLayout(new GridLayout(no_of_rows,3));
     tabs=new CartItems[no_of_meals];
     int k=0;
     while(i.hasNext()){
         String key=(String) i.next();         
         int qty=Integer.valueOf((String)itemsqty.get(key)).intValue();
         float price=Float.valueOf((String)itemsprice.get(key)).floatValue();
         SubTotal=(float)price*qty;
         
         CartItems cartitms=new CartItems(statement,key,itemsimages.get(key).toString(),String.valueOf(qty),String.valueOf(price),String.valueOf(SubTotal),this);
         tabs[k]=cartitms; 
         k++;
         ItemsDisplayPanel.add(cartitms);
         GrandTotal=GrandTotal+SubTotal;
     }
     
     for(int j=0;j<((no_of_rows*3)-(no_of_meals));j++){
       
            ItemsDisplayPanel.add(new CartItems(statement,"","black.png","","","",this));
        }
     PriceLabel.setText("Grand Total : $"+String.valueOf(GrandTotal));
     if(OrderTypeCombo.getSelectedItem().equals("Local")){
         extordpan.show(false);
     }
     ItemsDisplayPanel.revalidate();
    }
    
    public void showPanel(){
       // if(itemsqty.size()>0){
            UpdateDisplayCart();
        //}
        this.show(true);

    }
    
    public void UpdateCart(String ItemName, String quantity,String Price,String ImageName){
        if(itemsqty.containsKey(ItemName)){
            int qty=Integer.valueOf(quantity).intValue();
            int oldqty=Integer.valueOf((String)itemsqty.get(ItemName)).intValue();
            qty=qty+oldqty;
            if(qty!=0){
                itemsqty.put(ItemName,String.valueOf(qty));
            }
            else if(qty==0){
                if(itemsqty.containsKey(ItemName)){
                    itemsqty.remove(ItemName);
                }
            }
        }
        else{
            if(Integer.valueOf(quantity).intValue()!=0){
                itemsqty.put(ItemName, quantity);
            }
            itemsprice.put(ItemName, Price);
            itemsimages.put(ItemName, ImageName);
        }
        
    }
    
    public void SubmitCart(){

     String OrderNo=GenerateOrderNo();
     String MemberID=extordpan.MemberIDF.getText().trim();
     String ReceiverName=extordpan.ReceiverNameF.getText().trim();
     String PhoneNo=extordpan.PhoneNoF.getText().trim();
     String DAddress=extordpan.AddressF.getText().trim();
     float SubTotal=0.00f;
     Set set=itemsqty.keySet();
     Iterator i=set.iterator();
     GrandTotal=0.00f;
     while(i.hasNext()){
         String key=(String) i.next();         
         int qty=Integer.valueOf((String)itemsqty.get(key)).intValue();
         float price=Float.valueOf((String)itemsprice.get(key)).floatValue();
         SubTotal=(float)price*qty;
         String sql="insert into OrderDetails values('"+OrderNo+"','"+key+"',"+qty+","+SubTotal+");";
         try{
             statement.executeUpdate(sql);
         }catch(Exception e){
             System.out.println("Breaking point-1 Cart:Submitcart()");
         }
         GrandTotal=GrandTotal+SubTotal;
     }
     String OrderType=OrderTypeCombo.getSelectedItem().toString();
     String Date = null,Time = null;
     try{
         ResultSet res;
         String DnT="Select CURDATE();";
         res=statement.executeQuery(DnT);
         res.next();
         Date=res.getString("CURDATE()");
         DnT="Select CURTIME()";
         res=statement.executeQuery(DnT);
         res.next();
         Time=res.getString("CURTIME()");
     }catch(Exception e){}
     if(OrderType.equals("Local")){
         OrderType=TableNoF.getText();
     }else{
         OrderType=extordpan.ServingTypeCombo.getSelectedItem().toString();
     }
     
     String sql="insert into Orders values('"+OrderNo+"',"+GrandTotal+",'"+Date+"','"+Time+"','"+OrderType+"','Waiting','"+MemberID+"');";
     String sql_del="insert into Delivery values('"+OrderNo+"','"+ReceiverName+"','"+PhoneNo+"','"+DAddress+"','00:00:00');";
     
     try{
        ResultSet res=null;
        if(OrderTypeCombo.getSelectedItem().equals("External")){
            statement.executeUpdate(sql);
            statement.executeUpdate(sql_del);
         }
         if(OrderTypeCombo.getSelectedItem().equals("Local")){
           
           
             statement.executeUpdate(sql);
             String sql2="update Tables set Status='occupied1' where TableNo='"+OrderType+"';";             
             statement.executeUpdate(sql2);
             String sql3="delete from Reservation where ResDate=CURDATE() and ResSTIme<=CURTIME() and ResETime>CURTIME() and ResTableNo='"+OrderType+"'";
             statement.executeUpdate(sql3);
             
             
             
         }

     }catch(Exception e){System.out.println("Breaking point-2 Cart:SubmitCart()");
      e.printStackTrace();
     }
     
     ClearCart();   
    }
    
    
    
    
    public void ClearCart(){
        itemsqty.clear();
        GrandTotal=0.00f;
        extordpan.ClearExtOrdDet();
        TableNoF.setText("");
        OrderTypeCombo.setSelectedIndex(0);
        PriceLabel.setText("Grand Total : $ 0.00");
        ItemsDisplayPanel.removeAll();
      f.setVisible(false);
    }  
    
    
    public String GenerateOrderNo(){
        int i=0;
        Long OrderNo=Math.abs(random.nextLong()/1000000000);
        ResultSet result=null;
        try{
            String sql="select * from Orders where OrderNo='LPH"+OrderNo+"';";
            result=statement.executeQuery(sql);
            result.next();
            result.getString("OrderNo");
        }catch(Exception e){
            i=1;
        }
        if(i==1){
            return "LPH"+OrderNo;
        }
        else{
            return  GenerateOrderNo();  
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ExtParentPanel = new javax.swing.JPanel();
        InformationLabel = new javax.swing.JLabel();
        MakeOrderButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        OrderTypeLabel = new javax.swing.JLabel();
        OrderTypeCombo = new javax.swing.JComboBox();
        TableNumLabel = new javax.swing.JLabel();
        TableNoF = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        ClearCartButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsDisplayPanel = new javax.swing.JPanel();
        RemoveButton = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(15, 15, 15));

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExtParentPanel.setBackground(new java.awt.Color(29, 29, 29));
        ExtParentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "External Order Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(191, 191, 191))); // NOI18N

        InformationLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        InformationLabel.setForeground(new java.awt.Color(255, 250, 250));
        InformationLabel.setText("Select Order Type as 'External' for Non-Local Orders");

        javax.swing.GroupLayout ExtParentPanelLayout = new javax.swing.GroupLayout(ExtParentPanel);
        ExtParentPanel.setLayout(ExtParentPanelLayout);
        ExtParentPanelLayout.setHorizontalGroup(
            ExtParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExtParentPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(InformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ExtParentPanelLayout.setVerticalGroup(
            ExtParentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExtParentPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(InformationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        MakeOrderButton.setBackground(new java.awt.Color(119, 119, 119));
        MakeOrderButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        MakeOrderButton.setForeground(new java.awt.Color(246, 238, 238));
        MakeOrderButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MakeOrderButton.setText("Order");
        MakeOrderButton.setBorder(null);
        MakeOrderButton.setOpaque(true);
        MakeOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MakeOrderButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MakeOrderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MakeOrderButtonMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(29, 29, 29));

        OrderTypeLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        OrderTypeLabel.setForeground(new java.awt.Color(250, 243, 243));
        OrderTypeLabel.setText("Order Type");

        OrderTypeCombo.setBackground(new java.awt.Color(203, 203, 203));
        OrderTypeCombo.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        OrderTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Local", "External" }));
        OrderTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderTypeComboActionPerformed(evt);
            }
        });

        TableNumLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        TableNumLabel.setForeground(new java.awt.Color(250, 243, 243));
        TableNumLabel.setText("Table No ");

        TableNoF.setBackground(new java.awt.Color(203, 203, 203));
        TableNoF.setPreferredSize(new java.awt.Dimension(8, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(OrderTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrderTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TableNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TableNoF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TableNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TableNoF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PriceLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(250, 243, 243));
        PriceLabel.setText("Grand Total");

        ClearCartButton.setBackground(new java.awt.Color(119, 119, 119));
        ClearCartButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        ClearCartButton.setForeground(new java.awt.Color(246, 238, 238));
        ClearCartButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClearCartButton.setText("Clear Cart");
        ClearCartButton.setBorder(null);
        ClearCartButton.setOpaque(true);
        ClearCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearCartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearCartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearCartButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ClearCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(MakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(ExtParentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExtParentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ClearCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ItemsDisplayPanel.setBorder(null);
        ItemsDisplayPanel.setAutoscrolls(true);

        javax.swing.GroupLayout ItemsDisplayPanelLayout = new javax.swing.GroupLayout(ItemsDisplayPanel);
        ItemsDisplayPanel.setLayout(ItemsDisplayPanelLayout);
        ItemsDisplayPanelLayout.setHorizontalGroup(
            ItemsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
        );
        ItemsDisplayPanelLayout.setVerticalGroup(
            ItemsDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ItemsDisplayPanel);

        RemoveButton.setBackground(new java.awt.Color(103, 103, 103));
        RemoveButton.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        RemoveButton.setForeground(new java.awt.Color(250, 243, 243));
        RemoveButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveButton.setText("-");
        RemoveButton.setToolTipText("Remove Selected Tables");
        RemoveButton.setOpaque(true);
        RemoveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RemoveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RemoveButtonMouseExited(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(123, 118, 113));
        CloseButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(250, 250, 250));
        CloseButton.setText(" X ");
        CloseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CloseButton.setOpaque(true);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloseButton)
                    .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MakeOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakeOrderButtonMouseClicked
        // TODO add your handling code here:
        if(itemsqty.size()>0){
            SubmitCart();
        }
        f.show(false);
    }//GEN-LAST:event_MakeOrderButtonMouseClicked

    private void MakeOrderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakeOrderButtonMouseEntered
        // TODO add your handling code here:
        MakeOrderButton.setBackground(new java.awt.Color(235, 228, 228));
        MakeOrderButton.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_MakeOrderButtonMouseEntered

    private void MakeOrderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MakeOrderButtonMouseExited
        // TODO add your handling code here:
        MakeOrderButton.setBackground(new java.awt.Color(117, 117, 117));
        MakeOrderButton.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_MakeOrderButtonMouseExited

    private void ClearCartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearCartButtonMouseClicked
        // TODO add your handling code here:
        ClearCart();
    }//GEN-LAST:event_ClearCartButtonMouseClicked

    private void ClearCartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearCartButtonMouseEntered
        // TODO add your handling code here:
        ClearCartButton.setBackground(new java.awt.Color(235, 228, 228));
        ClearCartButton.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_ClearCartButtonMouseEntered

    private void ClearCartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearCartButtonMouseExited
        // TODO add your handling code here:
        ClearCartButton.setBackground(new java.awt.Color(117, 117, 117));
        ClearCartButton.setForeground(new java.awt.Color(248, 244, 244));
         
    }//GEN-LAST:event_ClearCartButtonMouseExited

    private void RemoveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveButtonMouseClicked
           for(int i=0;i<tabs.length;i++){
            if(tabs[i].click==1){
                UpdateCart(tabs[i].ItemName, "-1", tabs[i].Price, tabs[i].IconName);
            }
        }
 
        UpdateDisplayCart();
    }//GEN-LAST:event_RemoveButtonMouseClicked

    private void RemoveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveButtonMouseEntered
        // TODO add your handling code here:
        RemoveButton.setBackground(new java.awt.Color(235, 228, 228));
        RemoveButton.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_RemoveButtonMouseEntered

    private void RemoveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveButtonMouseExited
        // TODO add your handling code here:
        RemoveButton.setBackground(new java.awt.Color(103, 103, 103));
        RemoveButton.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_RemoveButtonMouseExited

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        // TODO add your handling code here:
        f.setVisible(false);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
        // TODO add your handling code here:
        CloseButton.setBackground(new java.awt.Color(235, 228, 228));
        CloseButton.setForeground(new java.awt.Color(13, 9, 9));
        CloseButton.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
    
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
        // TODO add your handling code here:
        CloseButton.setBackground(new java.awt.Color(123, 118, 113));

        CloseButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        CloseButton.setForeground(new java.awt.Color(250, 250, 250));
    }//GEN-LAST:event_CloseButtonMouseExited
  
    private void OrderTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderTypeComboActionPerformed
        // TODO add your handling code here:
       
        if(OrderTypeCombo.getSelectedItem().equals("Local")){
            extordpan.ClearExtOrdDet();
            ExtParentPanel.add(empty);
            empty.show(true);
            TableNoF.setEditable(true);
            TableNoF.setBackground(new java.awt.Color(203, 203, 203));
        }
        else if(OrderTypeCombo.getSelectedItem().equals("External")){
            empty.show(false);
            ExtParentPanel.setLayout(new BorderLayout());
            ExtParentPanel.add(extordpan);
            extordpan.show(true);
            TableNoF.setEditable(false);
            TableNoF.setText("");
            TableNoF.setBackground(new java.awt.Color(125, 125, 125));
        }
        ExtParentPanel.revalidate();
    }//GEN-LAST:event_OrderTypeComboActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClearCartButton;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JPanel ExtParentPanel;
    private javax.swing.JLabel InformationLabel;
    private javax.swing.JPanel ItemsDisplayPanel;
    private javax.swing.JLabel MakeOrderButton;
    private javax.swing.JComboBox OrderTypeCombo;
    private javax.swing.JLabel OrderTypeLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel RemoveButton;
    private javax.swing.JTextField TableNoF;
    private javax.swing.JLabel TableNumLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
