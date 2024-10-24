
package Frame;

import javax.swing.JOptionPane;
import java.sql.*;


public class Login extends javax.swing.JFrame {

   
    public Login() {
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
        emailtext = new javax.swing.JTextField();
        hidepass = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        studentRadio = new javax.swing.JRadioButton();
        teacherRadio = new javax.swing.JRadioButton();
        staffRadio = new javax.swing.JRadioButton();
        loginbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        passerror = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setForeground(new java.awt.Color(248, 243, 237));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 600));

        jPanel2.setBackground(new java.awt.Color(248, 243, 237));
        jPanel2.setMinimumSize(new java.awt.Dimension(330, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 112, 128));
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 92, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, 20));

        emailtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });
        jPanel2.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 210, 30));

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hidepass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel2.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 30, 50));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showpass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 30, 30));

        passfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 210, 30));

        studentRadio.setBackground(new java.awt.Color(248, 243, 237));
        buttonGroup1.add(studentRadio);
        studentRadio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        studentRadio.setSelected(true);
        studentRadio.setText("Student ");
        studentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioActionPerformed(evt);
            }
        });
        jPanel2.add(studentRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        teacherRadio.setBackground(new java.awt.Color(248, 243, 237));
        buttonGroup1.add(teacherRadio);
        teacherRadio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        teacherRadio.setText("Teacher");
        teacherRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRadioActionPerformed(evt);
            }
        });
        jPanel2.add(teacherRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 260, 100, -1));

        staffRadio.setBackground(new java.awt.Color(248, 243, 237));
        buttonGroup1.add(staffRadio);
        staffRadio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        staffRadio.setText("Staff");
        staffRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRadioActionPerformed(evt);
            }
        });
        jPanel2.add(staffRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        loginbtn.setBackground(new java.awt.Color(102, 255, 102));
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, 29));

        clearbtn.setBackground(new java.awt.Color(255, 102, 102));
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, 29));

        passerror.setForeground(java.awt.Color.red);
        jPanel2.add(passerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 210, 20));

        emailerror.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailerror.setForeground(java.awt.Color.red);
        jPanel2.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 200, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Dont have an account ?");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 180, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Register");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("____________________________________");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 330, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Forgot password ?");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 0, 460, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

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

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
       
    }//GEN-LAST:event_emailtextActionPerformed

    private void teacherRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRadioActionPerformed
       
    }//GEN-LAST:event_teacherRadioActionPerformed

    private void studentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRadioActionPerformed
       
    }//GEN-LAST:event_studentRadioActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
       
         emailtext.setText("");
        passfield.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
      
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
        
        if(studentRadio.isSelected())
        {
            if(isValid)
            {
                if(isValid)
        {
            try
            {
                boolean check = false;
                ConstantConnetion con = new ConstantConnetion();
                Connection connectionObj = con.createConnection();
                
                String query = "select Email,Password from studentregistration where Email=? and Password=?";
                
                PreparedStatement st = connectionObj.prepareStatement(query);
                st.setString(1,Email);
                st.setString(2,Pass);
                
                ResultSet rs = st.executeQuery();
                
                while(rs.next())
                {
                    check = true;
                    JOptionPane.showMessageDialog(this,"Login Succesfully.");
                    StudentDashbord dashbordObj = new StudentDashbord();
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
            }
        }
        
        if(teacherRadio.isSelected())
        {
            if(isValid)
            {
                // Communicate with teacher table
                if(isValid)
        {
            try
            {
                boolean check = false;
                ConstantConnetion con = new ConstantConnetion();
                Connection connectionObj = con.createConnection();
                
                String query = "select Email,Password from teacherregistration where Email=? and Password=?";
                
                PreparedStatement st = connectionObj.prepareStatement(query);
                st.setString(1,Email);
                st.setString(2,Pass);
                
                ResultSet rs = st.executeQuery();
                
                while(rs.next())
                {
                    check = true;
                    JOptionPane.showMessageDialog(this,"Login Succesfully.");
                    TeacherDashbord dashbordObj = new TeacherDashbord();
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
            
            }
        }
        
        
        
        
        if(staffRadio.isSelected())
        {
             if(isValid)
            {
                // Communicate with staff table
                       if(isValid)
        {
            try
            {
                boolean check = false;
                ConstantConnetion con = new ConstantConnetion();
                Connection connectionObj = con.createConnection();
                
                String query = "select Email,Password from staffregistration where Email=? and Password=?";
                
                PreparedStatement st = connectionObj.prepareStatement(query);
                st.setString(1,Email);
                st.setString(2,Pass);
                
                ResultSet rs = st.executeQuery();
                
                while(rs.next())
                {
                    check = true;
                    JOptionPane.showMessageDialog(this,"Login Succesfully.");
                    Dashbord dashbordObj = new Dashbord();
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
            }
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        Student_registration obj = new Student_registration();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
       FirstFrame obj = new FirstFrame();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void staffRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRadioActionPerformed
        // TODO add your handling code here:
        Dashbord obj = new Dashbord();
        this.hide();
        obj.setVisible(true);

    }//GEN-LAST:event_staffRadioActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        Forgotpass obj = new Forgotpass();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        // TODO add your handling code here:
         passfield.setEchoChar('*');
        showpass.setVisible(true);
        hidepass.setVisible(false);
        
    }//GEN-LAST:event_hidepassMouseClicked

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        // TODO add your handling code here:
         passfield.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMouseClicked

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel passerror;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel showpass;
    private javax.swing.JRadioButton staffRadio;
    private javax.swing.JRadioButton studentRadio;
    private javax.swing.JRadioButton teacherRadio;
    // End of variables declaration//GEN-END:variables
}
