/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderAndReservation;

/**
 *
 * @author student
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class ViewTables extends javax.swing.JPanel {

    /**
     * Creates new form ViewTabless
     */
     
    Connection con;
    Statement s,stmt;
    ResultSet r,rs;
    String sql,Ip;
    boolean setFlag=true;
    public ViewTables(String Ip) {
        this.Ip=Ip;
         getConnection();
        initComponents();
        setSize(900,800);        
        tablePanel.setLayout(new WrapLayout());
        tagPanel.setLayout(new WrapLayout());
        setSearchPanelComponents();
        start();
    }

     public void setSearchPanelComponents()
    {
        Calendar cal=Calendar.getInstance();        
        dayCombobox.setSelectedItem(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
        monthCombobox.setSelectedItem(String.valueOf(cal.get(Calendar.MONTH)+1));
        yearSpinner.setValue(cal.get(Calendar.YEAR));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dayCombobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        monthCombobox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        yearSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        stimeSpinner = new javax.swing.JSpinner();
        etimeSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        currentTablesButton = new javax.swing.JButton();
        tagHeaderPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tagPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        descriptionLabel = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(17, 17, 17));

        tablePanel.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(tablePanel);

        bottomPanel.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        searchPanel.setBackground(new java.awt.Color(80, 80, 80));
        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search and View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(253, 243, 243))); // NOI18N

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 235, 235));
        jLabel1.setText("Day");

        dayCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayCombobox.setBorder(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 235, 235));
        jLabel2.setText("Month");

        monthCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthCombobox.setBorder(null);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 235, 235));
        jLabel3.setText("Year");

        yearSpinner.setModel(new javax.swing.SpinnerNumberModel(2015, 2014, 2500, 1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 235, 235));
        jLabel4.setText("STime : ");

        stimeSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30"}));

        etimeSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30"}));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 235, 235));
        jLabel5.setText("ETime :");

        searchButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        currentTablesButton.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        currentTablesButton.setText("View Current Tables");
        currentTablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentTablesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(dayCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(stimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(etimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(160, 160, 160)
                .addComponent(currentTablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dayCombobox)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentTablesButton)
                    .addComponent(searchButton)))
        );

        tagHeaderPanel.setBackground(new java.awt.Color(1, 1, 1));
        tagHeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 167, 167)));
        tagHeaderPanel.setPreferredSize(new java.awt.Dimension(300, 20));

        jLabel6.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 241, 241));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Table No");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setMaximumSize(new java.awt.Dimension(45, 30));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(45, 20));

        jLabel7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 241, 241));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("STime");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setOpaque(true);

        jLabel8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 241, 241));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ETime");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout tagHeaderPanelLayout = new javax.swing.GroupLayout(tagHeaderPanel);
        tagHeaderPanel.setLayout(tagHeaderPanelLayout);
        tagHeaderPanelLayout.setHorizontalGroup(
            tagHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tagHeaderPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tagHeaderPanelLayout.setVerticalGroup(
            tagHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tagPanel.setBackground(new java.awt.Color(1, 1, 1));

        javax.swing.GroupLayout tagPanelLayout = new javax.swing.GroupLayout(tagPanel);
        tagPanel.setLayout(tagPanelLayout);
        tagPanelLayout.setHorizontalGroup(
            tagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        tagPanelLayout.setVerticalGroup(
            tagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(tagPanel);

        jPanel2.setBackground(new java.awt.Color(89, 89, 89));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 25));

        descriptionLabel.setBackground(new java.awt.Color(1, 1, 1));
        descriptionLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(254, 250, 245));
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText("Upcoming Reservations");
        descriptionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setPreferredSize(new java.awt.Dimension(225, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 756, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tagHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            // TODO add your handling code here:
            setFlag=false;
            String date=""+yearSpinner.getValue()+"-"+(String)monthCombobox.getSelectedItem()+"-"+(String)dayCombobox.getSelectedItem();
            String stime=stimeSpinner.getValue()+":00";
            String etime=etimeSpinner.getValue()+":00",tableNo;
            int size=0;
            tablePanel.removeAll();
            sql="select TableNo from (select Tables.TableNo,Temp1.ResTableNo from Tables left join (select ResTableNo from Reservation where ((ResSTime >= '"+stime+"' and ResSTime <'"+etime+"') or (ResETime >'"+stime+"' and ResETime<='"+etime+"') or ((ResSTime<='"+stime+"' and ResSTime<'"+etime+"') and (ResETime>'"+stime+"' and ResETime>='"+etime+"'))) and ResDate='"+date+"' group by ResTableNo) as Temp1 on Temp1.ResTableNo=Tables.TableNo) as Temp2 where ResTableNo is null;";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                tableNo=rs.getString("TableNo");
                sql="select Size from Tables where TableNo='"+tableNo+"';";
                r=s.executeQuery(sql);
                if(r.next())
                {
                    size=r.getInt("Size");
                }
                tablePanel.add(new Table(tableNo,"unoccupied",size,Ip));
                tablePanel.revalidate();
            }
            sql="select ResTableNo from Reservation where ((ResSTime >= '"+stime+"' and ResSTime <'"+etime+"') or (ResETime >'"+stime+"' and ResETime<='"+etime+"') or ((ResSTime<='"+stime+"' and ResSTime<'"+etime+"') and (ResETime>'"+stime+"' and ResETime>='"+etime+"'))) and ResDate='"+date+"' group by ResTableNo;";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                tableNo=rs.getString("ResTableNo");
                sql="select Size from Tables where TableNo='"+tableNo+"';";
                r=s.executeQuery(sql);
                if(r.next())
                {
                    size=r.getInt("Size");
                }
                tablePanel.add(new Table(tableNo,"reserved",size,Ip));
                tablePanel.revalidate();
            }
            tablePanel.repaint();
        }
        catch(Exception s)
        {
            System.out.println("Problem in searching given time....");
            s.printStackTrace();
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void currentTablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentTablesButtonActionPerformed
        // TODO add your handling code here:
        setSearchPanelComponents();
        setFlag=true;
        updateTables();
        updateStatusPanels();
    }//GEN-LAST:event_currentTablesButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton currentTablesButton;
    private javax.swing.JComboBox dayCombobox;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JSpinner etimeSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox monthCombobox;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JSpinner stimeSpinner;
    javax.swing.JPanel tablePanel;
    private javax.swing.JPanel tagHeaderPanel;
    private javax.swing.JPanel tagPanel;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables

    
     private void start() {
        
        new RefreshTables(this);        
    }
    public void updateTables()
    {
        try {
            tablePanel.removeAll(); 
            tagPanel.removeAll();
            sql="select * from Tables;";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                tablePanel.add(new Table(rs.getString("TableNo"),rs.getString("Status"),rs.getInt("Size"),Ip));
                tablePanel.revalidate();
            }
            tablePanel.repaint();
        } catch (SQLException ex) {
            System.out.println("Problem in updating tables.....");
            ex.printStackTrace();
        }
    
    }
    public void updateStatusPanels()
    {
        try {
            String startTime,endTime;
            Calendar cal=Calendar.getInstance();
            SimpleDateFormat sd=new SimpleDateFormat("HH:mm:ss");
            startTime=sd.format(cal.getTime());
            cal.add(Calendar.MINUTE,30);
            endTime=sd.format(cal.getTime());
            tagPanel.removeAll();
            sql="select ResTableNo,ResSTime,ResETime from Reservation where ResDate=CURDATE() and ((ResSTime<'"+startTime+"' and ResETime>'"+startTime+"') or (ResSTime<'"+endTime+"' and ResETime>'"+endTime+"') or(ResSTime<'"+startTime+"' and ResETime>'"+endTime+"'));";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                tagPanel.add(new Tag(rs.getString("ResTableNo"),rs.getString("ResSTime"),rs.getString("ResETime")));
                tagPanel.revalidate();
                tagPanel.repaint();
            }
            tagPanel.repaint();
        } catch (SQLException ex) {
            System.out.println("Problem in updating status of tables in next 30 minutes......");
            ex.printStackTrace();
        }
        
    }
    public void updateStatus()
    {
        try {
            
                sql="select curtime(),curdate();";            
                rs=stmt.executeQuery(sql);
                if(rs.next())
                {         
                    sql="select ResTableNo from Reservation where ResSTime<'"+rs.getString("curtime()")+"' and ResETime>'"+rs.getString("curtime()")+"' and ResDate='"+rs.getString("curdate()")+"';";
                    rs=stmt.executeQuery(sql);
                }
                while(rs.next())
                {
                    
                    String tableNo=rs.getString("ResTableNo");//System.out.println("Check Point :");                    
                    sql="update Tables set Status='"+"reserved"+"' where TableNo='"+tableNo+"' and (Status<>'occupied' or Status<>'Occupied');" ;                   
                    s.executeUpdate(sql);
                }
        } catch (SQLException ex) {
            System.out.println("Problem in updating status......");
            ex.printStackTrace();
        }
    }
    private void getConnection() {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Sorry, Driver Class is not found");
            }
            System.out.println("Successfully loaded driver.....");
            con=DriverManager.getConnection("jdbc:mysql://"+Ip+":3306/LosPollosHermanos","root","8154219449");
            System.out.println("Connecting to the database.....");
            stmt=con.createStatement();
            s=con.createStatement();
            System.out.println("Successfully created connection.....!!");
        } catch (SQLException ex) {
            System.out.println("Error in getting the Connection");
        }
    }
}
class RefreshTables extends Thread{
    ViewTables v;
    public RefreshTables(ViewTables v) {
        this.v=v;
        start()                ;
    }
    public void run()
    {
        updateAll();
    }
    public synchronized void updateAll()
    {
       for(;v.setFlag;)
        {
          
            v.updateStatus();
            v.updateTables();
            v.updateStatusPanels();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.out.println("Sleeping Interrupted!!");
                ex.printStackTrace();
            }
            
        } 
    }
}

