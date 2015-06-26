/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderAndReservation;

/**
 *
 * @author zubaeyr
 */
public class ExternalOrderDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExternalOrderDetailsPanel
     */
    public ExternalOrderDetailsPanel() {
        initComponents();
        AddressF.setEnabled(false);
        AddressF.setBackground(new java.awt.Color(125, 125, 125));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PhoneNoF = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        ServingTypeCombo = new javax.swing.JComboBox();
        Label5 = new javax.swing.JLabel();
        MemberIDF = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AddressF = new javax.swing.JTextPane();
        ReceiverNameF = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(29, 29, 29));

        PhoneNoF.setBackground(new java.awt.Color(203, 203, 203));
        PhoneNoF.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        PhoneNoF.setPreferredSize(new java.awt.Dimension(8, 24));

        Label2.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        Label2.setForeground(new java.awt.Color(250, 243, 243));
        Label2.setText("Receiver Name");

        ServingTypeCombo.setBackground(new java.awt.Color(203, 203, 203));
        ServingTypeCombo.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        ServingTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CollectMyself", "Delivery" }));
        ServingTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServingTypeComboActionPerformed(evt);
            }
        });

        Label5.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        Label5.setForeground(new java.awt.Color(250, 243, 243));
        Label5.setText("Serving Type");

        MemberIDF.setBackground(new java.awt.Color(203, 203, 203));
        MemberIDF.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        MemberIDF.setPreferredSize(new java.awt.Dimension(8, 23));

        Label1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        Label1.setForeground(new java.awt.Color(250, 243, 243));
        Label1.setText("Member ID");

        AddressF.setBackground(new java.awt.Color(203, 203, 203));
        AddressF.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(AddressF);

        ReceiverNameF.setBackground(new java.awt.Color(203, 203, 203));
        ReceiverNameF.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        ReceiverNameF.setPreferredSize(new java.awt.Dimension(8, 24));

        Label3.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        Label3.setForeground(new java.awt.Color(250, 243, 243));
        Label3.setText("Phone Number");

        Label6.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        Label6.setForeground(new java.awt.Color(250, 243, 243));
        Label6.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(PhoneNoF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ServingTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MemberIDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReceiverNameF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberIDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReceiverNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ServingTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ServingTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServingTypeComboActionPerformed
        // TODO add your handling code here:
        if(ServingTypeCombo.getSelectedItem().equals("CollectMyself")){  
            AddressF.setEnabled(false);
            AddressF.setText("");
            AddressF.setBackground(new java.awt.Color(125, 125, 125));
        }
        else if(ServingTypeCombo.getSelectedItem().equals("Delivery")){
            AddressF.setEnabled(true);
            AddressF.setBackground(new java.awt.Color(203, 203, 203));            
        }
    }//GEN-LAST:event_ServingTypeComboActionPerformed
    public void ClearExtOrdDet(){
        AddressF.setText("");
        PhoneNoF.setText("");
        ReceiverNameF.setText("");
        MemberIDF.setText("");
        ServingTypeCombo.setSelectedIndex(0);
        this.show(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextPane AddressF;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    javax.swing.JTextField MemberIDF;
    javax.swing.JTextField PhoneNoF;
    javax.swing.JTextField ReceiverNameF;
    javax.swing.JComboBox ServingTypeCombo;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
