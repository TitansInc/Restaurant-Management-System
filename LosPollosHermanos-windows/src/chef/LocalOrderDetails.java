/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chef;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class LocalOrderDetails extends javax.swing.JPanel {

    /**
     * Creates new form LocalOrder
     */
    String tableNo,orderNo;

    /**
     * Creates new form LocalOrderDetails
     */
    Connection con;
    Statement s,stmt;
    ResultSet r,rs;
    String sql,Ip;
    Order order;
    MainFrame mainFrame;
    JPanel orderDetailsPanel;
    public LocalOrderDetails(String orderNo,String tableNo, MainFrame mainFrame, Order aThis, JPanel orderDetailsPanel,String Ip) {
        this.orderNo=orderNo;
        this.Ip=Ip;
        this.tableNo=tableNo;
        order=aThis;
        this.mainFrame=mainFrame;
        this.orderDetailsPanel=orderDetailsPanel;
        getConnection();        
        initComponents();
        itemsPanel.setLayout(new WrapLayout());      
        
        addItems();
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
        finishButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        orderNoLabel = new javax.swing.JLabel();
        tableNoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(1, 1, 1));
        setForeground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(420, 417));

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));

        finishButton.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        finishButton.setText("Finished");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(finishButton))
        );

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));

        orderNoLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        orderNoLabel.setForeground(new java.awt.Color(254, 254, 254));
        orderNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderNoLabel.setText("Order No :"+orderNo);

        tableNoLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        tableNoLabel.setForeground(new java.awt.Color(254, 254, 254));
        tableNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tableNoLabel.setText("Table No: "+tableNo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tableNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(orderNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(420, 32767));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(420, 250));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(420, 250));

        itemsPanel.setBackground(new java.awt.Color(1, 1, 1));
        itemsPanel.setMaximumSize(new java.awt.Dimension(420, 32767));
        itemsPanel.setMinimumSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(itemsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        // TODO add your handling code here:
        sql="update Orders set CookStatus='finished' where OrderNo='"+orderNo+"';";
        try {
            stmt.executeUpdate(sql);
            sql="update Tables set Status='occupied2' where TableNo='"+tableNo+"';";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error in updating the database....");
            ex.printStackTrace();
        }
        mainFrame.updateOrders();
        orderDetailsPanel.removeAll();
        javax.swing.JPanel j=new javax.swing.JPanel();
        j.setBackground(Color.black);
        orderDetailsPanel.add(j);
        orderDetailsPanel.revalidate();
    }//GEN-LAST:event_finishButtonActionPerformed
    private void getConnection() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Sorry, Driver Class is not found");
            }
            con=DriverManager.getConnection("jdbc:mysql://"+Ip+":3306/LosPollosHermanos","root","8154219449");
            stmt=con.createStatement();
            s=con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error in getting the Connection");
        }
    }
    private void addItems()
    {
        try {
            sql="select MName,Quantity from OrderDetails where OrderNo='"+orderNo+"';";
            rs=stmt.executeQuery(sql);
            String mealName;
            int qty;
            while(rs.next())
            {
                mealName=rs.getString("MName");
                qty=rs.getInt("Quantity");
                sql="select MImage from Meals where MName='"+mealName+"';";
                r=s.executeQuery(sql);
                r.next();
                itemsPanel.add(new ItemDetails(r.getString("MImage"), mealName,qty));
                r.next();
                itemsPanel.revalidate();
            }
        } catch (SQLException ex) {
            System.out.println("Error in adding items......\n"+ex.getCause());
            ex.printStackTrace();
            
        }
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finishButton;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orderNoLabel;
    private javax.swing.JLabel tableNoLabel;
    // End of variables declaration//GEN-END:variables

    
}