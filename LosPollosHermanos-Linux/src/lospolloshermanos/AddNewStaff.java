 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lospolloshermanos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zubaeyr
 */
public class AddNewStaff extends javax.swing.JPanel {

    /**
     * Creates new form AddNewStaff
     */
    JPanel DisplayPanel;
    Statement stmt;
    EmptyView empty;
    StaffMaintenance staffmaint;
    String ImgLocation,NewImgName;
    public AddNewStaff(Statement stmt, JPanel DisplayPanel,EmptyView empty) {
        this.stmt=stmt;
        this.DisplayPanel=DisplayPanel;
        this.empty=empty;
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

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(23, 23, 23));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 228, 228)));

        jComboBox1.setBackground(new java.awt.Color(135, 132, 132));
        jComboBox1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(16, 14, 14));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Staff", "Chef", "Manager" }));
        jComboBox1.setBorder(null);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 243, 243));
        jLabel1.setText("Register As");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 243, 243));
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 243, 243));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 243, 243));
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 243, 243));
        jLabel5.setText("Email ID");

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 243, 243));
        jLabel6.setText("Phone No.");

        jTextField1.setBackground(new java.awt.Color(83, 83, 83));
        jTextField1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(241, 234, 234));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(245, 235, 235));

        jTextField2.setBackground(new java.awt.Color(83, 83, 83));
        jTextField2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(241, 234, 234));
        jTextField2.setBorder(null);
        jTextField2.setCaretColor(new java.awt.Color(245, 235, 235));

        jTextField3.setBackground(new java.awt.Color(83, 83, 83));
        jTextField3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(241, 234, 234));
        jTextField3.setBorder(null);
        jTextField3.setCaretColor(new java.awt.Color(245, 235, 235));

        jPasswordField1.setBackground(new java.awt.Color(83, 83, 83));
        jPasswordField1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(246, 234, 234));
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(245, 243, 243));

        jTextField4.setBackground(new java.awt.Color(83, 83, 83));
        jTextField4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(241, 234, 234));
        jTextField4.setBorder(null);
        jTextField4.setCaretColor(new java.awt.Color(245, 235, 235));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(253, 243, 243));
        jLabel7.setText("Address");

        jTextPane1.setBackground(new java.awt.Color(92, 90, 90));
        jTextPane1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(241, 234, 234));
        jScrollPane1.setViewportView(jTextPane1);

        jLabel10.setBackground(new java.awt.Color(119, 119, 119));
        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(246, 238, 238));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Close");
        jLabel10.setBorder(null);
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(119, 119, 119));
        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(246, 238, 238));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Register");
        jLabel11.setBorder(null);
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(250, 243, 243));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add New Employee");

        jLabel12.setBackground(new java.awt.Color(119, 119, 119));
        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(246, 238, 238));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Add Pic");
        jLabel12.setBorder(null);
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(83, 83, 83));
        jTextField5.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(241, 234, 234));
        jTextField5.setBorder(null);
        jTextField5.setCaretColor(new java.awt.Color(245, 235, 235));

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(253, 243, 243));
        jLabel9.setText("Salary($)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setBackground(new java.awt.Color(235, 228, 228));
        jLabel10.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setBackground(new java.awt.Color(117, 117, 117));
        jLabel10.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
         jLabel11.setBackground(new java.awt.Color(235, 228, 228));
        jLabel11.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
         jLabel11.setBackground(new java.awt.Color(117, 117, 117));
        jLabel11.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
         DisplayPanel.removeAll();
         DisplayPanel.setLayout(new BorderLayout());
            this.show(false);
            DisplayPanel.add(empty);
            empty.show(true);
            DisplayPanel.revalidate();
        jTextField1.setText("");    
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jPasswordField1.setText("");
        jTextPane1.setText("");
        jLabel10.setBackground(new java.awt.Color(117, 117, 117));
        jLabel10.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        if(ImgLocation==null){
            NewImgName="Empty.png";
        }
        if(ImgLocation!=null){
            String finalloc="/home/zubaeyr/Pictures/images/Staff/"+NewImgName;
	File file=new File(ImgLocation);
	InputStream in;
	try {
            in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(finalloc);
	    byte[] buf = new byte[1024];        
	    int len = 0;
	    while ((len = in.read(buf)) != -1) {
	        out.write(buf, 0, len);
	    }
	    out.flush();
	    out.close();
	} catch (Exception e) {
            e.printStackTrace();
	}   
        }
        int i=0;
        String Name=jTextField1.getText().trim();
        String UserName=jTextField3.getText().trim();
        String Password=jPasswordField1.getText().trim();
        String Email=jTextField2.getText().trim();
        String Phone=jTextField4.getText().trim();
        String Position=jComboBox1.getSelectedItem().toString();
        String Address=jTextPane1.getText();
        String Salary=jTextField5.getText();
        String sql="insert into StaffDetails values('"+UserName+"','"+Password+"','"+Name+"','"+Position+"','"+Email+"','"+Phone+"','"+Address+"','Active','"+NewImgName+"','"+Salary+"');";
        try {
            if(Name.equals("")||UserName.equals("")||Password.equals("")||Email.equals("")||Phone.equals("")||Position.equals("")||Address.equals("")){
               throw new NullPointerException();
            }
            stmt.executeUpdate(sql);
        }catch(NullPointerException e){
            //do nothing
           new ErrorDialog(2); 
        }catch(Exception e){ 
            new ErrorDialog(1);
            i=1;
            jTextField3.setText("");
        }
        if(!Name.equals("")&&!UserName.equals("")&&i==0&&!Password.equals("")&&!Email.equals("")&&!Phone.equals("")&&!Position.equals("")&&!Address.equals("")){
                   jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jPasswordField1.setText("");
        jTextPane1.setText("");
        staffmaint.Update(staffmaint.sql);           
       }
        i=0;
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
              FileChooser fchose=new FileChooser(this);
        fchose.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
           jLabel12.setBackground(new java.awt.Color(235, 228, 228));
        jLabel12.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
           jLabel12.setBackground(new java.awt.Color(117, 117, 117));
        jLabel12.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_jLabel12MouseExited
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
