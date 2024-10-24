package Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class AdminRegistration extends javax.swing.JFrame {
    public AdminRegistration() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        passwordtext = new javax.swing.JPasswordField();
        emailtext = new javax.swing.JTextField();
        departmenttext = new javax.swing.JTextField();
        maleradio = new javax.swing.JRadioButton();
        femaleradio = new javax.swing.JRadioButton();
        mobiletext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        moberror = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        departmenterror = new javax.swing.JLabel();
        usernameerror = new javax.swing.JLabel();
        passerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(248, 243, 237));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminregi.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 112, 128));
        jLabel1.setText("Admin Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 190, 170));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Username :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 100, 30));
        jPanel1.add(usernametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 200, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Password : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 110, 20));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Email : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Mobile no: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Department : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, 30));

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hidepass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel1.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 30, 50));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showpass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        jPanel1.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 31, 30));
        jPanel1.add(passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 200, 30));
        jPanel1.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 200, 30));
        jPanel1.add(departmenttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 200, 30));

        buttonGroup1.add(maleradio);
        maleradio.setSelected(true);
        maleradio.setText("Male");
        jPanel1.add(maleradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        buttonGroup1.add(femaleradio);
        femaleradio.setText("Female");
        jPanel1.add(femaleradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, -1, -1));
        jPanel1.add(mobiletext, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 200, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 90, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 600, 80, 30));

        moberror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        moberror.setForeground(java.awt.Color.red);
        jPanel1.add(moberror, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 200, 30));

        emailerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailerror.setForeground(java.awt.Color.red);
        jPanel1.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 200, 30));

        departmenterror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        departmenterror.setForeground(java.awt.Color.red);
        jPanel1.add(departmenterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 200, 30));

        usernameerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameerror.setForeground(java.awt.Color.red);
        jPanel1.add(usernameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 200, 30));

        passerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passerror.setForeground(java.awt.Color.red);
        jPanel1.add(passerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           ConstantValidation obj = new ConstantValidation();
        String User = usernametext.getText();
        String Email = emailtext.getText();
        String Mobile = mobiletext.getText();
        String Depatrment= departmenttext.getText();
        String Password =passwordtext.getText();
         String Gender = "";
         boolean nameEmpty = obj.emptyValidation(User);
         
           boolean emailEmpty = obj.emptyValidation(Email);
          boolean emailValid = obj.emailValidation(Email);
          
           boolean passwordEmpty = obj.emptyValidation(Password);
            boolean passwordValid = obj.passwordValidation(Password);
            
            boolean mobilenumberValid = obj.mobileNumberValidation(Mobile);
            boolean mobilenumberEmpty = obj.emptyValidation(Mobile);
         boolean isValid=true;
         
         if(Depatrment.isEmpty())
         {
             departmenterror.setText("Enter department name");
         }
         else
         {
             departmenterror.setText("");
         }
          if(maleradio.isSelected())
          {
              Gender = "Male";
          }
           
          if(femaleradio.isSelected())
          {
              Gender = "Female";
          }

           if(nameEmpty)
            {
                usernameerror.setText("Student name do not empty");
                isValid=false;
            }
            else
            {
               usernameerror.setText("");
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
       if(mobilenumberEmpty)
         {
             moberror.setText("Please enter mobile number");
             isValid=false;
         }
         else
         if(mobilenumberValid)
         {
             moberror.setText("");
         }
         else
         {
            moberror.setText("Please enter valid mobile number")   ; 
            isValid=false;
         }
         if(isValid)
        {
            try
            {
                ConstantConnetion connectionObj = new ConstantConnetion();
                Connection con = connectionObj.createConnection();
                
                String query ="insert into adminRegistration(Username,Password,Email,Department,Gender,Mobilenumber)values(?,?,?,?,?,?)";
                
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString(1,User);
                st.setString(2,Password);
                st.setString(3,Email);
                st.setString(4,Depatrment);
                  st.setString(5,Gender);
                   st.setString(6,Mobile);
                
                int a = st.executeUpdate();
                
                if(a>0)
                {
                    JOptionPane.showMessageDialog(this, "Registration successfully.");
                        AdminDashbord LoginObj = new  AdminDashbord();
                    this.hide();
                    LoginObj.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "This user is allready exits.");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "This user is allready exits.");
            }
           }
                System.out.println("Admin name:"+User);
                System.out.println("Admin email:"+Password);
                System.out.println("Admin faculty:"+Email);
                System.out.println("Admin class:"+Depatrment);
                System.out.println("Admin Password:"+Gender);
                System.out.println("Admin mobile no.:"+Mobile);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        // TODO add your handling code here:
        passwordtext.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        // TODO add your handling code here:
        passwordtext.setEchoChar('*');
        showpass.setVisible(true);
        hidepass.setVisible(false);
    }//GEN-LAST:event_hidepassMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         usernametext.setText("");
         emailtext.setText("");
         mobiletext.setText("");
         departmenttext.setText("");
         passwordtext.setText("");
                 
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel departmenterror;
    private javax.swing.JTextField departmenttext;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtext;
    private javax.swing.JRadioButton femaleradio;
    private javax.swing.JLabel hidepass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleradio;
    private javax.swing.JLabel moberror;
    private javax.swing.JTextField mobiletext;
    private javax.swing.JLabel passerror;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JLabel showpass;
    private javax.swing.JLabel usernameerror;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables
}
