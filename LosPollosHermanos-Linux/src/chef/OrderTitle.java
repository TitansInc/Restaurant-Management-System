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
public class OrderTitle extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetails
     */
    String orderNo,dAddress,time;
    JPanel orderDetailsPanel,ordersPanel;
    Color color;
    public OrderTitle()
    {
        initComponents();
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

        orderNoLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        orderNoLabel.setForeground(new java.awt.Color(255, 245, 245));
        orderNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderNoLabel.setText("Order Number");
        orderNoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        timeLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(252, 245, 245));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("Order Time");

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel orderNoLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

 
}
