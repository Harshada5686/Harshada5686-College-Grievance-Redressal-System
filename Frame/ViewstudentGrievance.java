package Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class ViewstudentGrievance extends javax.swing.JFrame {
    public ViewstudentGrievance() {
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
                String query="Select Date,URN,Grievancetype,Description from studentgrievance";
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
                        vc.add(rs.getString("URN"));
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

                String query="Select Gid,Date,Description from staffreply where Reply='Student'";
                PreparedStatement st =con.prepareStatement(query);
                ResultSet rs=st.executeQuery();
                ResultSetMetaData obj = rs.getMetaData();
                int col =obj.getColumnCount();
                DefaultTableModel df =(DefaultTableModel)studentreply.getModel();
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
        studentreply = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 112, 128));
        jLabel1.setText("STUDENT GRIEVANCES");

        historytable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grievance id", "Date", "Subject", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historytable);
        if (historytable.getColumnModel().getColumnCount() > 0) {
            historytable.getColumnModel().getColumn(0).setResizable(false);
            historytable.getColumnModel().getColumn(0).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(1).setResizable(false);
            historytable.getColumnModel().getColumn(1).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(2).setResizable(false);
            historytable.getColumnModel().getColumn(2).setPreferredWidth(100);
            historytable.getColumnModel().getColumn(3).setResizable(false);
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

        studentreply.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grievance id", "Date", "Reply"
            }
        ));
        jScrollPane1.setViewportView(studentreply);
        if (studentreply.getColumnModel().getColumnCount() > 0) {
            studentreply.getColumnModel().getColumn(0).setPreferredWidth(100);
            studentreply.getColumnModel().getColumn(1).setPreferredWidth(100);
            studentreply.getColumnModel().getColumn(2).setPreferredWidth(600);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(499, 499, 499)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
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
       
        StudentDashbord obj = new StudentDashbord();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewstudentGrievance().setVisible(true);
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
    private javax.swing.JTable studentreply;
    // End of variables declaration//GEN-END:variables
}
