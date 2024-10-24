
package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Adminlogin extends javax.swing.JFrame {

    
    public Adminlogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        showpass = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        submitbtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        emailerror = new javax.swing.JLabel();
        passerror = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/onlinelearning.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 418, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 112, 128));
        jLabel3.setText("ADMIN LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 188, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Emiail :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 74, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 20));

        emailtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 190, 30));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showpass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showpassMousePressed(evt);
            }
        });
        jPanel1.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 31, 30));

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hidepass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel1.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 30, 50));

        passfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 190, 30));

        submitbtn.setBackground(new java.awt.Color(102, 255, 102));
        submitbtn.setText("SUBMIT");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 82, 29));

        clear.setBackground(new java.awt.Color(255, 102, 102));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 83, 29));

        emailerror.setForeground(java.awt.Color.red);
        jPanel1.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 180, 20));

        passerror.setForeground(java.awt.Color.red);
        jPanel1.add(passerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 190, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Forgot password ?");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("__________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 330, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Dont have an account ?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 180, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Register");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        // TODO add your handling code here:
          passfield.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        // TODO add your handling code here:
         passfield.setEchoChar('*');
        showpass.setVisible(true);
        hidepass.setVisible(false);
    }//GEN-LAST:event_hidepassMouseClicked

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
       
        String Email =emailtext.getText();
        String Pass = passfield.getText();
        
         boolean isValid = true;
        
        ConstantValidation obj = new ConstantValidation();
        
        boolean emailEmpty = obj.emptyValidation(Email);
        boolean passwordEmpty = obj.emptyValidation(Pass);
        
        boolean emailValid = obj.emailValidation(Email);
        boolean passwordValid = obj.passwordValidation(Pass);
        
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
        if(passwordEmpty)
        {
            passerror.setText("Password do not empty");
            isValid = false;
        }
        else
        if(passwordValid)
        {
            passerror.setText("");
           
        }
        else
        {
            passerror.setText("Please enter strong password.");
            isValid = false;
        }
       
        if(isValid)
        {
            try
            {
                boolean check = false;
                ConstantConnetion con = new ConstantConnetion();
                Connection connectionObj = con.createConnection();
                
                String query = "select Email,Password from adminregistration where Email=? and Password=?";
                
                PreparedStatement st = connectionObj.prepareStatement(query);
                st.setString(1,Email);
                st.setString(2,Pass);
                
                ResultSet rs = st.executeQuery();
                
                while(rs.next())
                {
                    check = true;
                    JOptionPane.showMessageDialog(this,"Login Succesfully.");
                    AdminDashbord dashbordObj = new AdminDashbord();
                    this.hide();
                    dashbordObj.setVisible(true);
                }
                
                if(check == false)
                {
                    JOptionPane.showMessageDialog(this, "Invalid User.");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_submitbtnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
         emailtext.setText("");
        passfield.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        Forgotpass obj = new Forgotpass();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        
        
        AdminRegistration obj = new AdminRegistration();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void showpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_showpassMousePressed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passerror;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel showpass;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
