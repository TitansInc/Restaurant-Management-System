/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chef;

//import javaapplication1.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class Order extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetails
     */
    String orderNo,Ip,serviceType,time;
    JPanel orderDetailsPanel;
    MainFrame mainFrame;
    Color color;
    public Order(String orderNo,String serviceType,String time,JPanel orderDetailsPanel,MainFrame mainFrame,String Ip) {
        this.orderNo=orderNo;
        this.Ip=Ip;
        this.orderDetailsPanel=orderDetailsPanel;
        this.serviceType=serviceType;
        this.time=time;
        this.mainFrame=mainFrame;        
        initComponents();
        setColor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderNoLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(1, 1, 1));
        setForeground(new java.awt.Color(12, 0, 255));
        setMaximumSize(new java.awt.Dimension(1300, 29));
        setMinimumSize(new java.awt.Dimension(200, 29));
        setPreferredSize(new java.awt.Dimension(420, 29));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        orderNoLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        orderNoLabel.setForeground(new java.awt.Color(255, 245, 245));
        orderNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderNoLabel.setText(orderNo);
        orderNoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        timeLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(252, 245, 245));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText(time);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(orderNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(orderNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(timeLabel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        setBackground(Color.GRAY);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        setBackground(color);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        orderDetailsPanel.removeAll();
        if(!serviceType.equalsIgnoreCase("Delivery") && !serviceType.equalsIgnoreCase("CollectMyself"))
        {
            LocalOrderDetails orderDetails=new LocalOrderDetails(orderNo,serviceType,mainFrame,this,orderDetailsPanel,Ip);   
            orderDetailsPanel.add(orderDetails);
        }
        else
        {
            orderDetailsPanel.add(new ExternalOrderDetails(orderNo, time, serviceType, mainFrame, this, orderDetailsPanel,Ip));
        }
        orderDetailsPanel.revalidate();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel orderNoLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void setColor() {
        if(serviceType.equalsIgnoreCase("Delivery"))
        {
            color=Color.MAGENTA;
            setToolTipText("Home Delivery");
        }
        else if(serviceType.equalsIgnoreCase("CollectMyself"))
        {
            color=Color.blue;
            setToolTipText("Collect MySelf");
        }
        else
        {
            color=Color.red;
            setToolTipText("Local Customer");
            
        }
        setBackground(color);
        
    }
}
