
package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class StaffGrievanceHistory extends javax.swing.JFrame {

    
    public StaffGrievanceHistory() {
        initComponents();
        loadData();
    }

     public void loadData()
    {

        try
        {
               ConstantConnetion conn = new ConstantConnetion();
                Connection con = conn.createConnection();

                String query="Select Gid,Reply,Date,Description from staffreply";

                
                PreparedStatement st =con.prepareStatement(query);

                ResultSet rs=st.executeQuery();
                ResultSetMetaData obj = rs.getMetaData();
                int col =obj.getColumnCount();
                DefaultTableModel df =(DefaultTableModel)historytable.getModel();
                df.setRowCount(0);
                while(rs.next())
                {
                    Vector vc = new Vector();
                    for(int i=0;i<=col;i++)
                    {
                        vc.add(rs.getString("Gid"));
                        vc.add(rs.getString("Reply"));

                        vc.add(rs.getString("Date"));
                        vc.add(rs.getString("Description"));
                        
                    }
                    df.addRow(vc);
                }
                        
                
        }catch(Exception q)
        {
            System.out.println(q);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(213, 112, 128));
        jLabel2.setText("GRIEVANCE REPLY HISTORY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 158, 370, 47));

        historytable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grievance id", "Reply by", "Date", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historytable);
        if (historytable.getColumnModel().getColumnCount() > 0) {
            historytable.getColumnModel().getColumn(0).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(1).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(2).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(3).setPreferredWidth(600);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 223, 816, 412));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        AdminDashbord obj = new AdminDashbord();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffGrievanceHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTable historytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
