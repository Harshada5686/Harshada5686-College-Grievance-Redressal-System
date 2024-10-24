/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import java.sql.Connection;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewStaffGrievance extends javax.swing.JFrame {

    /**
     * Creates new form ViewstudentGrievance
     */
    public ViewStaffGrievance() {
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

                String query="Select Date,ID,Grievancetype,Description from staffgrievance";
                PreparedStatement st =con.prepareStatement(query);

                ResultSet rs=st.executeQuery();
                ResultSetMetaData obj = rs.getMetaData();
                int col =obj.getColumnCount();
                DefaultTableModel df =(DefaultTableModel)historyTable.getModel();
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

                String query="Select Gid,Date,Description from staffreply where Reply='Staff'";

                
                PreparedStatement st =con.prepareStatement(query);
               
                ResultSet rs=st.executeQuery();
                ResultSetMetaData obj = rs.getMetaData();
                int col =obj.getColumnCount();
                DefaultTableModel df =(DefaultTableModel)staffreply.getModel();
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
        historyTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffreply = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 112, 128));
        jLabel1.setText("STAFF GRIEVANCES");

        historyTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(historyTable);
        if (historyTable.getColumnModel().getColumnCount() > 0) {
            historyTable.getColumnModel().getColumn(0).setMinWidth(100);
            historyTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            historyTable.getColumnModel().getColumn(0).setMaxWidth(100);
            historyTable.getColumnModel().getColumn(1).setResizable(false);
            historyTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            historyTable.getColumnModel().getColumn(2).setResizable(false);
            historyTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N

        staffreply.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grievance id", "Date", "Reply"
            }
        ));
        jScrollPane1.setViewportView(staffreply);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(back))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStaffGrievance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable staffreply;
    // End of variables declaration//GEN-END:variables
}
