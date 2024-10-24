
package Frame;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;


public class StaffGrievance extends javax.swing.JFrame {

   
    public StaffGrievance() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        emailtext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptiontext = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        grievanceitem = new javax.swing.JComboBox<>();
        iderror = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        grievanceerror = new javax.swing.JLabel();
        descriptionerror = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        dateError = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 160, 440, 520));

        jPanel2.setBackground(new java.awt.Color(248, 243, 237));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 8, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 112, 128));
        jLabel3.setText("STAFF GRIEVANCE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("GID :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 313, 53, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Email id : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 393, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Grievance type :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 466, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Date :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 58, 32));

        idtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 305, 295, 37));

        emailtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 384, 295, 37));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Description :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 533, 117, -1));

        descriptiontext.setColumns(20);
        descriptiontext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descriptiontext.setRows(5);
        jScrollPane1.setViewportView(descriptiontext);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 533, 295, -1));

        submit.setBackground(new java.awt.Color(102, 255, 102));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 648, -1, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 648, 77, 30));

        grievanceitem.setEditable(true);
        grievanceitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grievanceitem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Salary", "Canteen", "Laboratory", "Library", " ", " " }));
        jPanel2.add(grievanceitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 456, 295, 38));

        iderror.setForeground(java.awt.Color.red);
        jPanel2.add(iderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 348, 231, 18));

        emailerror.setForeground(java.awt.Color.red);
        jPanel2.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 425, 237, 21));

        grievanceerror.setForeground(java.awt.Color.red);
        jPanel2.add(grievanceerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 500, 236, 15));

        descriptionerror.setForeground(java.awt.Color.red);
        jPanel2.add(descriptionerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 630, 247, 18));

        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 158, 27));

        dateError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(dateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 267, 150, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 0, 560, 700));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         emailtext.setText("");
        descriptiontext.setText("");
        idtext.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String Cdate="";
        String Id = idtext.getText();
        String Email = emailtext.getText();
         ConstantValidation obj = new ConstantValidation();
          Date g_date = date.getDate();
          
          if(g_date != null)
          {
              String y = String.valueOf(g_date.getYear()+1900);
              String d = String.valueOf(g_date.getDate());
              String m = String.valueOf(g_date.getMonth()+1);
              Cdate = y+"-"+m+"-"+d;
          }
        
         boolean idEmpty = obj.emptyValidation(Id);
         String Description = descriptiontext.getText();
         boolean isValid=true;
         
        String Grievance = grievanceitem.getSelectedItem().toString();
         boolean emailValid = obj.emailValidation(Email);
         boolean emailEmpty = obj.emptyValidation(Email);
         
         if(g_date == null)
         {
             dateError.setText("Date do not empty");
             isValid = false;
         }
         else
         {
             dateError.setText("");
         }
         if(idEmpty)
            {
                iderror.setText("ID do not empty.");
                 isValid = false;
            }
            else
            if(Id.length() <3) 
            {
                iderror.setText("Please enter 6 digit Id");
                 isValid = false;
            }
            else
            if(Id.length()>3){
                iderror.setText("Please enter 6 digit Id");
                 isValid = false;
            }
            else
            {
                iderror.setText("");
            }
         if(emailEmpty)
        {
            emailerror.setText("Email do not empty");
            isValid = false;
        } 
        else
        if(emailValid)
        {
            emailerror.setText("");
             
        }
        else
        {
            emailerror.setText("Please enter valid email");
            isValid = false;
        }
          if(Grievance == "Select")
            {
                grievanceerror.setText("Please select once");
                isValid=false;
            }
            else
            {
            grievanceerror.setText("");
            }
          if(Description.isEmpty())
          {
            descriptionerror.setText("Please enter description");
             isValid = false;
          }
          else
          {
              descriptionerror.setText("");
          }
          
          if(isValid)
        {
            try
            {
                ConstantConnetion connectionObj = new ConstantConnetion();
                Connection con = connectionObj.createConnection();
                 String query ="insert into staffgrievance(Date,ID,Emailid,Grievancetype,Description) values(?,?,?,?,?)";
                
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1,Cdate);
                st.setString(2,Id);
                st.setString(3,Email);
                st.setString(4,Grievance);
                st.setString(5,Description);
                 
                 int a = st.executeUpdate();
                
                if(a>0)
                {
                    JOptionPane.showMessageDialog(this, " Grievance registration successfully done");
                    Dashbord LoginObj = new  Dashbord();
                    this.hide();
                    LoginObj.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "This user is allready exits");
                }
                
                System.out.println("date URN:"+Cdate);
                System.out.println("Staff name:"+Id);
                System.out.println("Staff email:"+Email);
                System.out.println("Staff grievance :"+Grievance);
                System.out.println("Student description :"+Description);
            }
                catch(Exception e)
            {
                System.out.println(e);    
            }  
        }   
    }//GEN-LAST:event_submitActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        StudentDashbord obj = new StudentDashbord();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dateMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffGrievance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffGrievance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffGrievance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffGrievance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffGrievance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel dateError;
    private javax.swing.JLabel descriptionerror;
    private javax.swing.JTextArea descriptiontext;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel grievanceerror;
    private javax.swing.JComboBox<String> grievanceitem;
    private javax.swing.JLabel iderror;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
