/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lospolloshermanos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author zubaeyr
 */
public class TableManagement extends javax.swing.JPanel {

    /**
     * Creates new form TableManagement
     */
    Statement stmt;
    String sql;
    ResultSet result;
    Item[] tabs;
    public TableManagement(Statement stmt) {
        this.stmt=stmt;
        initComponents();
        Update();
    }
    
    public void Update(){
      
        jPanel3.removeAll();
        int no_of_tab=0,no_of_gridrows=0;
        sql="Select TableNo,Size from Tables order by TableNo;";
        try {
            result=stmt.executeQuery(sql);
            result.last();
            no_of_tab=result.getRow();
            no_of_gridrows=no_of_tab/5;
            result.first();
        } catch (SQLException ex) {
           System.out.println("Break-Point : TableMaintenance-1");
        }
        if(no_of_tab%5!=0){
            no_of_gridrows++;
        }
        if(no_of_tab<15){
            no_of_gridrows=3;
        }
        jPanel3.setLayout(new GridLayout(no_of_gridrows,5));       
        tabs=new Item[no_of_tab];
         for(int i=0;i<no_of_tab;i++)
        {
            try {
                tabs[i]=new Item("table.jpeg",result.getString("TableNo"),result.getString("Size"));
                jPanel3.add(tabs[i]);
                result.next();
            } catch (SQLException ex) {
                System.out.println("Break-Point : Table Maintenance 2");
            }
        }
         for(int i=0;i<((no_of_gridrows*5)-(no_of_tab));i++){
            jPanel3.add(new Item("black.png"," "," "));
         }
         jPanel3.revalidate();
         jPanel3.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(21, 21, 21));

        jLabel6.setBackground(new java.awt.Color(103, 103, 103));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 243, 243));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("+");
        jLabel6.setToolTipText("Add Table");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(103, 103, 103));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 243, 243));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        jLabel5.setToolTipText("Remove Selected Tables");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(87, 82, 82));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        for(int i=0;i<tabs.length;i++){
            if(tabs[i].click==1){
                String sql="Delete from Tables where TableNo='"+tabs[i].TableNo+"';";
                try{
                stmt.executeUpdate(sql);
                }catch(Exception e){System.out.println("Breaking Point 3: TableManag");}
            }
        }
 
        Update();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setBackground(new java.awt.Color(235, 228, 228));
        jLabel5.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setBackground(new java.awt.Color(103, 103, 103));
        jLabel5.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        TableInformation tableinf=new TableInformation(this,stmt);
        tableinf.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setBackground(new java.awt.Color(235, 228, 228));
        jLabel6.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
                jLabel6.setBackground(new java.awt.Color(103, 103, 103));
        jLabel6.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_jLabel6MouseExited
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
