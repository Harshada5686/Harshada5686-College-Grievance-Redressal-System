
package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class ViewTeacherGrievance extends javax.swing.JFrame {

    
    public ViewTeacherGrievance() {
        initComponents();
        loadData();
        loadData1();
    }
 public void loadData()
    {

        try
        {
               ConstantConnetion conn = new ConstantConnetion();
                Connection con = conn.createConnection();
                  String query="Select Date,ID,Grievancetype,Description from teachergrievance";


                
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
                        vc.add(rs.getString("ID"));
                        vc.add(rs.getString("Date"));

                        vc.add(rs.getString("Grievancetype"));
                        vc.add(rs.getString("Description"));
                        
                    }
                    df.addRow(vc);
                }
                        
                
        }catch(Exception q)
        {
            System.out.println(q);
     
        }
    }
  public void loadData1()
    {

        try
        {
               ConstantConnetion conn = new ConstantConnetion();
                Connection con = conn.createConnection();

                String query="Select Gid,Date,Description from staffreply where Reply='teacher'";

                
                PreparedStatement st =con.prepareStatement(query);

                ResultSet rs=st.executeQuery();
                ResultSetMetaData obj = rs.getMetaData();
                int col =obj.getColumnCount();
                DefaultTableModel df =(DefaultTableModel)teacherreply.getModel();
                df.setRowCount(0);
                while(rs.next())
                {
                    Vector vc = new Vector();
                    for(int i=0;i<=col;i++)
                    {
                        vc.add(rs.getString("Gid"));
                  
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
        jScrollPane2 = new javax.swing.JScrollPane();
        historytable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teacherreply = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 112, 128));
        jLabel1.setText("TEACHER GRIEVANCES");

        historytable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grievance id", "Date", "Subject", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historytable);
        if (historytable.getColumnModel().getColumnCount() > 0) {
            historytable.getColumnModel().getColumn(0).setMinWidth(100);
            historytable.getColumnModel().getColumn(0).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(0).setMaxWidth(100);
            historytable.getColumnModel().getColumn(1).setResizable(false);
            historytable.getColumnModel().getColumn(1).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(2).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(3).setPreferredWidth(600);
        }

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        teacherreply.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grievance id", "Date", "Reply"
            }
        ));
        jScrollPane1.setViewportView(teacherreply);
        if (teacherreply.getColumnModel().getColumnCount() > 0) {
            teacherreply.getColumnModel().getColumn(0).setResizable(false);
            teacherreply.getColumnModel().getColumn(0).setPreferredWidth(110);
            teacherreply.getColumnModel().getColumn(1).setPreferredWidth(100);
            teacherreply.getColumnModel().getColumn(2).setPreferredWidth(600);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

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
       
        TeacherDashbord obj = new TeacherDashbord();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTeacherGrievance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTable historytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable teacherreply;
    // End of variables declaration//GEN-END:variables
}
