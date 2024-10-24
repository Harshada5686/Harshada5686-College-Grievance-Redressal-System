
package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Forgotpass extends javax.swing.JFrame {

    
    public Forgotpass() {
        initComponents();
        id.setVisible(false);
        iderror.setVisible(false);
        idtext.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        emailtext2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        studentRadio = new javax.swing.JRadioButton();
        teacherRadio = new javax.swing.JRadioButton();
        staffRadio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        urntext = new javax.swing.JTextField();
        showpass = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        passtext = new javax.swing.JPasswordField();
        savebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        emailerror = new javax.swing.JLabel();
        passerror = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        urnerror = new javax.swing.JLabel();
        urn = new javax.swing.JLabel();
        iderror = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        emailtext2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 560));

        jPanel2.setBackground(new java.awt.Color(248, 243, 237));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 21, -1, 151));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 112, 128));
        jLabel3.setText("FORGOT PASSWORD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        studentRadio.setBackground(new java.awt.Color(248, 243, 237));
        buttonGroup1.add(studentRadio);
        studentRadio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        studentRadio.setSelected(true);
        studentRadio.setText("Student");
        studentRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentRadioMousePressed(evt);
            }
        });
        studentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioActionPerformed(evt);
            }
        });
        jPanel2.add(studentRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 91, -1));

        teacherRadio.setBackground(new java.awt.Color(248, 243, 237));
        buttonGroup1.add(teacherRadio);
        teacherRadio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        teacherRadio.setText("Teacher");
        teacherRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacherRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teacherRadioMousePressed(evt);
            }
        });
        teacherRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRadioActionPerformed(evt);
            }
        });
        jPanel2.add(teacherRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        staffRadio.setBackground(new java.awt.Color(248, 243, 237));
        buttonGroup1.add(staffRadio);
        staffRadio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        staffRadio.setText("Staff");
        staffRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                staffRadioMousePressed(evt);
            }
        });
        staffRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRadioActionPerformed(evt);
            }
        });
        jPanel2.add(staffRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 91, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("New Password :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 20));

        urntext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(urntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, 30));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showpass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showpassMousePressed(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 30, 30));

        hidepass.setBackground(new java.awt.Color(255, 255, 255));
        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hidepass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidepassMousePressed(evt);
            }
        });
        jPanel2.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 30, 50));

        passtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 190, 30));

        savebtn.setBackground(new java.awt.Color(255, 255, 255));
        savebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        savebtn.setForeground(new java.awt.Color(213, 112, 128));
        savebtn.setText("SAVE");
        savebtn.setPreferredSize(new java.awt.Dimension(81, 23));
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        jPanel2.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 81, 31));

        clearbtn.setBackground(new java.awt.Color(255, 255, 255));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(213, 112, 128));
        clearbtn.setText("CLEAR");
        clearbtn.setPreferredSize(new java.awt.Dimension(81, 23));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 81, 31));

        emailerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailerror.setForeground(java.awt.Color.red);
        jPanel2.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 190, 20));

        passerror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passerror.setForeground(java.awt.Color.red);
        jPanel2.add(passerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 190, 20));

        id.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        id.setText("ID :");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, -1));

        emailtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, 30));

        urnerror.setForeground(java.awt.Color.red);
        jPanel2.add(urnerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, 20));

        urn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        urn.setText("URN :");
        jPanel2.add(urn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, -1));

        iderror.setForeground(java.awt.Color.red);
        jPanel2.add(iderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 180, 20));

        idtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 0, 380, 560));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRadioMousePressed
        
         urntext.setVisible(true);
        urn.setVisible(true);
        urnerror.setVisible(true);
        iderror.setVisible(false);
        idtext.setVisible(false);
        id.setVisible(false);
    }//GEN-LAST:event_studentRadioMousePressed

    private void teacherRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherRadioMousePressed
        
        urntext.setVisible(false);
        urn.setVisible(false);
        urnerror.setVisible(false);
        idtext.setVisible(true);
        id.setVisible(true);
        iderror.setVisible(true);
    }//GEN-LAST:event_teacherRadioMousePressed

    private void staffRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffRadioMousePressed
       
        urn.setVisible(false);
        urntext.setVisible(false);
        urnerror.setVisible(false);
        id.setVisible(true);
        idtext.setVisible(true);
        iderror.setVisible(true);
    }//GEN-LAST:event_staffRadioMousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        Login obj = new Login();
        this.hide();
        obj.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void studentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRadioActionPerformed
        
    }//GEN-LAST:event_studentRadioActionPerformed

    private void staffRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffRadioActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
       
        String Email =emailtext.getText();
        String Pass = passtext.getText();
         
         String Urn = urntext.getText();
         String Id=idtext.getText();

        boolean isValid = true;

        ConstantValidation obj = new ConstantValidation();
         boolean urnEmpty = obj.emptyValidation(Urn);
        boolean emailEmpty = obj.emptyValidation(Email);
        boolean passwordEmpty = obj.emptyValidation(Pass);

        boolean emailValid = obj.emailValidation(Email);
        boolean passwordValid = obj.passwordValidation(Pass);
        
       
             boolean idEmpty = obj.emptyValidation(Id);
         boolean idValid = obj.emptyValidation(Id);
            
            if(urnEmpty)
            {
                urnerror.setText("Please enter URN");
                isValid=false;
            }
            else
            if(Urn.length() < 6) 
            {
                urnerror.setText("Please enter 6 digit urn");
                isValid=false;
            }
            else
            if(Urn.length()>6){
                urnerror.setText("Please enter 6 digit urn");
                isValid=false;
            }
            else
            {
                urnerror.setText("");
            }
        if(emailEmpty)
        {
            emailerror.setText("Please enter email");
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
            passerror.setText("Please enter password");
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
            iderror.setVisible(false);
            if(isValid)
            {
                 if(isValid)
            {
                // Communicate with student table
                try
                {
                ConstantConnetion conn = new ConstantConnetion();
                Connection con = conn.createConnection();
                String query="Update studentregistration set Password=? where Email=? and URN=?";
                PreparedStatement st =con.prepareStatement(query);
                
                st.setString(1,Pass);
                st.setString(3,Urn);
                st.setString(2,Email);
                int res=st.executeUpdate();
                if(res>0)
                {
                    JOptionPane.showMessageDialog(this, "Password set successfully");
                    Login obj1 = new Login();
                    this.hide();
                    obj1.setVisible(true);
                    
                }
                else
                {
                JOptionPane.showMessageDialog(this, "Invalid user");
                }
                }
                catch(Exception e)
                {
                    System.out.println(e);           
                } 
            }
                 
            }
             System.out.println("id"+Urn);
                System.out.println("email"+Email);
                System.out.println("pass"+Pass);
        }
       
        
//        Teacher
        if(teacherRadio.isSelected())
        {
            urnerror.setVisible(false);
             if(idEmpty)
            {
                iderror.setText("Please enter id");
                isValid=false;
            }
            else
            if(Id.length()<6) 
            {
                iderror.setText("Please enter 6 digit id");
                isValid=false;
            }
            else
            if(Id.length()>6){
                iderror.setText("Please enter 6 digit urn");
                isValid=false;
            }
            else
            {
                iderror.setText("");
            }
            
            if(isValid)
            {
               
                if(isValid)
            {
                
                try
                {
                ConstantConnetion conn = new ConstantConnetion();
                Connection con = conn.createConnection();
                String query="Update teacherregistration set Password=? where Email=? and ID=?";
                PreparedStatement st =con.prepareStatement(query);
                
                st.setString(1,Pass);
                st.setString(3,Id);
                st.setString(2,Email);
                int res=st.executeUpdate();
                if(res>0)
                {
                    JOptionPane.showMessageDialog(this, "Password set successfully");
                    Login obj1 = new Login();
                    this.hide();
                    obj1.setVisible(true);
                    
                }
                else
                {
                JOptionPane.showMessageDialog(this, "Invalid user");
                }
                }
                catch(Exception e)
                {
                    System.out.println(e);           
                } 
            }
               
                        
            }
             System.out.println("id"+Id);
                System.out.println("email"+Email);
                System.out.println("pass"+Pass);
            }
        
//Staff
      if(staffRadio.isSelected())
        {
            urnerror.setVisible(false);
             if(idEmpty)
            {
                iderror.setText("Please enter id");
                isValid=false;
            }
            else
            if(Id.length() < 6) 
            {
                iderror.setText("Please enter 6 digit id");
                isValid=false;
            }
            else
            if(Id.length()>6){
                iderror.setText("Please enter 6 digit urn");
                isValid=false;
            }
            else
            {
                iderror.setText("");
            }
            
            if(isValid)
            {
                
                
               if(isValid)
            {
                // Communicate with student table
                try
                {
                ConstantConnetion conn = new ConstantConnetion();
                Connection con = conn.createConnection();
                String query="Update stafftregistration set Password=? where Email=? and ID=?";
                PreparedStatement st =con.prepareStatement(query);
                
                st.setString(1,Pass);
                st.setString(3,Id);
                st.setString(2,Email);
                int res=st.executeUpdate();
                if(res>0)
                {
                    JOptionPane.showMessageDialog(this, "Password set successfully");
                    Login obj1 = new Login();
                    this.hide();
                    obj1.setVisible(true);
                    
                }
                else
                {
                JOptionPane.showMessageDialog(this, "Invalid user");
                }
                }
                catch(Exception e)
                {
                    System.out.println(e);           
                } 
            }
            }   
        }
    }//GEN-LAST:event_savebtnActionPerformed

    
    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
//        System.out.println("Hii");
        emailtext.setText("");
        passtext.setText("");
        urntext.setText("");
        idtext.setText("");
        
    }//GEN-LAST:event_clearbtnActionPerformed

    private void teacherRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherRadioActionPerformed

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        // TODO add your handling code here:
        passtext.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMouseClicked

    private void showpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMousePressed
        // TODO add your handling code here:
        passtext.setEchoChar((char)0);
        showpass.setVisible(false);
        hidepass.setVisible(true);
    }//GEN-LAST:event_showpassMousePressed

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        // TODO add your handling code here:
        passtext.setEchoChar('*');
        showpass.setVisible(true);
        hidepass.setVisible(false);

    }//GEN-LAST:event_hidepassMouseClicked

    private void hidepassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMousePressed
        // TODO add your handling code here: passfield.setEchoChar((char)0);

    }//GEN-LAST:event_hidepassMousePressed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgotpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtext;
    private javax.swing.JTextField emailtext2;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel id;
    private javax.swing.JLabel iderror;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passerror;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel showpass;
    private javax.swing.JRadioButton staffRadio;
    private javax.swing.JRadioButton studentRadio;
    private javax.swing.JRadioButton teacherRadio;
    private javax.swing.JLabel urn;
    private javax.swing.JLabel urnerror;
    private javax.swing.JTextField urntext;
    // End of variables declaration//GEN-END:variables
}
