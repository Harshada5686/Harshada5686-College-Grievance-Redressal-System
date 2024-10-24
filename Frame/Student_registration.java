package Frame;
import javax.swing.JOptionPane;
import java.sql.*;
public class Student_registration extends javax.swing.JFrame {
    public Student_registration() {
        initComponents();

        tid.setVisible(false);
        tiderror.setVisible(false);
        idtext.setVisible(false);
        
        deptitem.setVisible(false);
        dept.setVisible(false);
        depterror.setVisible(false);
        
        post.setVisible(false);
        postitem.setVisible(false);
       posterror.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        urn = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        faculty = new javax.swing.JLabel();
        classs = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        facultyitem = new javax.swing.JComboBox<>();
        classsitem = new javax.swing.JComboBox<>();
        maleradio = new javax.swing.JRadioButton();
        femaleradio = new javax.swing.JRadioButton();
        subbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        studentRadio = new javax.swing.JRadioButton();
        teacherRadio = new javax.swing.JRadioButton();
        staffRadio = new javax.swing.JRadioButton();
        tid = new javax.swing.JLabel();
        mobtext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        urntext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        dept = new javax.swing.JLabel();
        deptitem = new javax.swing.JComboBox<>();
        post = new javax.swing.JLabel();
        postitem = new javax.swing.JComboBox<>();
        emailtext = new javax.swing.JTextField();
        showpass = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        urnerror = new javax.swing.JLabel();
        tiderror = new javax.swing.JLabel();
        nameerror = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        facultyerror = new javax.swing.JLabel();
        passerror = new javax.swing.JLabel();
        moberror = new javax.swing.JLabel();
        depterror = new javax.swing.JLabel();
        classerror = new javax.swing.JLabel();
        posterror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(248, 243, 237));
        jLabel1.setForeground(new java.awt.Color(213, 112, 128));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/parents.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 817));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        jPanel2.setBackground(new java.awt.Color(248, 243, 237));
        jPanel2.setPreferredSize(new java.awt.Dimension(396, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(213, 112, 128));
        jLabel2.setText("Registration ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 161, -1));

        urn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        urn.setText("URN no :");
        jPanel2.add(urn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 98, -1));

        name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        name.setText("Name : ");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        email.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        email.setText("Email :");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        faculty.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        faculty.setText("Faculty :");
        jPanel2.add(faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        classs.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        classs.setText("Class :");
        jPanel2.add(classs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 62, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Password : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 578, -1, 30));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("Gender : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 84, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Mobile no :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 90, -1));

        facultyitem.setEditable(true);
        facultyitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        facultyitem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Arts", "Commerce", "Science" }));
        facultyitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyitemActionPerformed(evt);
            }
        });
        jPanel2.add(facultyitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 253, 30));

        classsitem.setEditable(true);
        classsitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        classsitem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "FY BSC", "FY BCS", "FY BA", "SY BSC", "SY BCS", "SY BA", "TY BSC", "TY BCS", "TY BA" }));
        classsitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classsitemActionPerformed(evt);
            }
        });
        jPanel2.add(classsitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 253, 30));

        maleradio.setBackground(new java.awt.Color(213, 112, 128));
        buttonGroup2.add(maleradio);
        maleradio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maleradio.setSelected(true);
        maleradio.setText("Male");
        maleradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleradioActionPerformed(evt);
            }
        });
        jPanel2.add(maleradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, 70, -1));

        femaleradio.setBackground(new java.awt.Color(213, 112, 128));
        buttonGroup2.add(femaleradio);
        femaleradio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        femaleradio.setText("Female");
        femaleradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleradioActionPerformed(evt);
            }
        });
        jPanel2.add(femaleradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 690, -1, -1));

        subbtn.setBackground(new java.awt.Color(102, 255, 102));
        subbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subbtn.setText("SUBMIT");
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });
        jPanel2.add(subbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 740, -1, 30));

        clearbtn.setBackground(new java.awt.Color(255, 102, 102));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clearbtn.setText("CLEAR");
        clearbtn.setPreferredSize(new java.awt.Dimension(81, 23));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 740, 80, 30));

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
        jPanel2.add(studentRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

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
        jPanel2.add(teacherRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

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
        jPanel2.add(staffRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 70, -1));

        tid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tid.setText("Id :");
        jPanel2.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 40, -1));

        mobtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobtextActionPerformed(evt);
            }
        });
        jPanel2.add(mobtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 250, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, 150));

        idtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });
        jPanel2.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, 30));

        urntext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urntextActionPerformed(evt);
            }
        });
        jPanel2.add(urntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 250, 30));

        nametext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });
        jPanel2.add(nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 250, 30));

        dept.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        dept.setText("Department : ");
        jPanel2.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, 20));

        deptitem.setEditable(true);
        deptitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deptitem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Computer Science", "Zoology", "Botany", "Physics", "Chemistry", "Statistic", "Mathematics", "English", "Marathi", "Geography" }));
        deptitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptitemActionPerformed(evt);
            }
        });
        jPanel2.add(deptitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 250, 30));

        post.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        post.setText("Post :");
        jPanel2.add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 60, 20));

        postitem.setEditable(true);
        postitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        postitem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "Clark", "Librarians", "Lab Assistant" }));
        jPanel2.add(postitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 250, 30));

        emailtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });
        jPanel2.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 250, 30));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/showpass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showpassMousePressed(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 30, 30));

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
        jPanel2.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 30, 30));

        passfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 250, 30));

        urnerror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        urnerror.setForeground(java.awt.Color.red);
        jPanel2.add(urnerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 250, 30));

        tiderror.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tiderror.setForeground(java.awt.Color.red);
        jPanel2.add(tiderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 160, 20));

        nameerror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nameerror.setForeground(java.awt.Color.red);
        jPanel2.add(nameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 250, 30));

        emailerror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        emailerror.setForeground(java.awt.Color.red);
        jPanel2.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 250, 30));

        facultyerror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        facultyerror.setForeground(java.awt.Color.red);
        jPanel2.add(facultyerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 250, 20));

        passerror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        passerror.setForeground(java.awt.Color.red);
        jPanel2.add(passerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 210, 20));

        moberror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        moberror.setForeground(java.awt.Color.red);
        jPanel2.add(moberror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 250, 30));

        depterror.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        depterror.setForeground(java.awt.Color.red);
        jPanel2.add(depterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 250, 20));

        classerror.setForeground(java.awt.Color.red);
        jPanel2.add(classerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 200, 20));

        posterror.setForeground(java.awt.Color.red);
        jPanel2.add(posterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 200, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 0, 363, 817));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void femaleradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleradioActionPerformed

    private void facultyitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyitemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_facultyitemActionPerformed

    private void classsitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classsitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classsitemActionPerformed

    private void maleradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleradioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleradioActionPerformed

    private void studentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRadioActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_studentRadioActionPerformed

    private void studentRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRadioMousePressed
        // TODO add your handling code here:
        tid.setVisible(false);
        tid.setVisible(false);
        tiderror.setVisible(false);
        
        
        deptitem.setVisible(false);
        dept.setVisible(false);
        depterror.setVisible(false);
        
 
        post.setVisible(false);
        postitem.setVisible(false);
        posterror.setVisible(false);
        
        urnerror.setVisible(true);
        urn.setVisible(true);
        urntext.setVisible(true);
         
        
        classs.setVisible(true);
        classsitem.setVisible(true);
        classerror.setVisible(true);
        
        faculty.setVisible(true);
        facultyitem.setVisible(true);
        facultyerror.setVisible(true);
    }//GEN-LAST:event_studentRadioMousePressed

    private void teacherRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherRadioMousePressed
        // TODO add your handling code here:
        urn.setVisible(false);
        urnerror.setVisible(false);
        urntext.setVisible(false);
        
        classs.setVisible(false);
        classsitem.setVisible(false);
        classerror.setVisible(false);
     
        posterror.setVisible(false);
        post.setVisible(false);
        postitem.setVisible(false);
        
         tid.setVisible(true);
        tiderror.setVisible(true);
        idtext.setVisible(true);
        
        dept.setVisible(true);
        deptitem.setVisible(true);
        depterror.setVisible(true);
        
        faculty.setVisible(true);
        facultyerror.setVisible(true);
        facultyitem.setVisible(true);
        
    }//GEN-LAST:event_teacherRadioMousePressed

    private void mobtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobtextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mobtextActionPerformed

    private void teacherRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRadioActionPerformed
        // TODO add your handling code here:
       


    }//GEN-LAST:event_teacherRadioActionPerformed

    private void staffRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRadioActionPerformed


        
    }//GEN-LAST:event_staffRadioActionPerformed

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed

    private void urntextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urntextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urntextActionPerformed

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nametextActionPerformed

    private void deptitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptitemActionPerformed

    private void staffRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffRadioMousePressed
        // TODO add your handling code here:
         urn.setVisible(false);
         idtext.setVisible(false);
        classs.setVisible(false);
        classsitem.setVisible(false);
        faculty.setVisible(false);
        facultyitem.setVisible(false);
        
        posterror.setVisible(true);
        post.setVisible(true);
        postitem.setVisible(true);
       
        dept.setVisible(true);
        depterror.setVisible(true);
        deptitem.setVisible(true);
        
        tid.setVisible(true);
        idtext.setVisible(true);
        tiderror.setVisible(true);
    }//GEN-LAST:event_staffRadioMousePressed

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed

    private void showpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_showpassMousePressed

    private void hidepassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMousePressed
        // TODO add your handling code here: passfield.setEchoChar((char)0);

        
    }//GEN-LAST:event_hidepassMousePressed

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

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        idtext.setText("");
        urntext.setText("");
       nametext.setText("");
       passfield.setText("");
       mobtext.setText("");
      
    }//GEN-LAST:event_clearbtnActionPerformed

    private void subbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbtnActionPerformed
        // TODO add your handling code here:
        ConstantValidation obj = new ConstantValidation();
        
        String Tid = idtext.getText();
        String Urn = urntext.getText();
        String Name = nametext.getText();
        String Email = emailtext.getText();
        String Pass = passfield.getText();
        String Mob =mobtext.getText();
        String Gender = "";
        
        boolean isValid=true;
        String Faculty = facultyitem.getSelectedItem().toString();
        String Class = classsitem.getSelectedItem().toString();
        String Post =postitem.getSelectedItem().toString();
        String Dept =deptitem.getSelectedItem().toString();
        boolean tidEmpty = obj.emptyValidation(Tid);
         boolean tidValid = obj.emptyValidation(Tid);
         
         boolean staffEmpty = obj.emptyValidation(Tid);
         boolean staffValid = obj.emptyValidation(Urn);
        
        boolean urnEmpty = obj.emptyValidation(Urn);
        boolean nameEmpty = obj.emptyValidation(Name);
        
         boolean emailEmpty = obj.emptyValidation(Email);
          boolean emailValid = obj.emailValidation(Email);
          
           boolean passwordEmpty = obj.emptyValidation(Pass);
            boolean passwordValid = obj.passwordValidation(Pass);
            
            boolean mobilenumberValid = obj.mobileNumberValidation(Mob);
            boolean mobilenumberEmpty = obj.emptyValidation(Mob);
            
            System.out.println(mobilenumberEmpty);
          
          if(maleradio.isSelected())
          {
              Gender = "Male";
          }
           
          if(femaleradio.isSelected())
          {
              Gender = "Female";
          }

        if(studentRadio.isSelected())
        {
            if(urnEmpty)
            {
                urnerror.setText("URN do not empty.");
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
            
            if(nameEmpty)
            {
                nameerror.setText("Student name do not empty");
                isValid=false;
            }
            else
            {
                nameerror.setText("");
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
            if(Faculty == "Select")
            {
            facultyerror.setText("Please select once");
            isValid=false;
            }
            else
            {
            facultyerror.setText("");
            }
         if(Class == "Select")
         {
             classerror.setText("Please select once");
             isValid=false;
         }
         else
         {
             classerror.setText("");
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
                
                String query ="insert into StudentRegistration(URN,Name,Email,Faculty,Class,Password,Gender,Mobilenumber) values(?,?,?,?,?,?,?,?)";
                
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString(1,Urn);
                st.setString(2, Name);
                st.setString(3,Email);
                st.setString(4,Faculty);
                 st.setString(5,Class);
                  st.setString(6,Pass);
                  st.setString(7,Gender);
                   st.setString(8,Mob);
                
                int a = st.executeUpdate();
                
                if(a>0)
                {
                    JOptionPane.showMessageDialog(this, "Registration successfully.");
                    Login LoginObj = new Login();
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
        }
            
        
        
        
        
        
        
        
        
        
        
        
        
//        Teacher
        
        if(teacherRadio.isSelected())
        {
            if(tidEmpty)
            {
                tiderror.setText("Teacher id do not empty.");
                isValid=false;
            }
            else
            if(Tid.length() < 6) 
            {
                tiderror.setText("Please enter 6 digit id");
                isValid=false;
            }
            else
            if(Tid.length()>6){
                tiderror.setText("Please enter 6 digit id");
                isValid=false;
            }
            else
            {
               tiderror.setText("");
            }
            
            if(nameEmpty)
            {
                nameerror.setText(" Teacher name do not empty");
                isValid=false;
            }
            else
            {
                nameerror.setText("");
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
            if(Faculty == "Select")
            {
            facultyerror.setText("Please select once");
            isValid=false;
            }
            else
            {
            facultyerror.setText("");
            }
         if(Dept == "Select")
            {
            depterror.setText("Please select once");
            isValid=false;
            }
            else
            {
            depterror.setText("");
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
                
                String query ="insert into TeacherRegistration(ID,Name,Email,Faculty,Department,Password,Gender,Mobilenumber) values(?,?,?,?,?,?,?,?)";
                
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString(1,Tid);
                st.setString(2,Name);
                st.setString(3,Email);
                st.setString(4,Faculty);
                 st.setString(5,Dept);
                  st.setString(6,Pass);
                  st.setString(7,Gender);
                   st.setString(8,Mob);
                
                int a = st.executeUpdate();
                
                if(a>0)
                {
                    JOptionPane.showMessageDialog(this, "Registration successfully");
                    Login LoginObj = new Login();
                    this.hide();
                    LoginObj.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "This user is allready exits");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);  
            }
        }
        }
        
//        STAFF

            if(staffRadio.isSelected())
        {
//            System.out.println("Staff Id"+Urn);
            System.out.println("Staff Id"+Tid);
            
            if(staffEmpty)
            {
                tiderror.setText("Staff id do not empty");
                isValid=false;
            }
            else
            if(Tid.length() < 6) 
            {
                tiderror.setText("Please enter 6 digit id");
                isValid=false;
            }
            else
            if(Urn.length()>6){
                tiderror.setText("Please enter 6 digit id");
                isValid=false;
            }
            else
            {
                tiderror.setText("");
            }
            
            if(nameEmpty)
            {
                nameerror.setText("Staff name do not empty");
                isValid=false;
            }
            else
            {
                nameerror.setText("");
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
            passerror.setText("Please enter strong password");
            isValid = false;
        }
         if(Dept == "Select")
            {
            depterror.setText("Please select once");
            isValid=false;
            }
            else
            {
            depterror.setText("");
            }
        if(Post == "Select")
            {
            posterror.setText("Post Please select once");
            isValid=false;
            }
            else
            {
            posterror.setText("");
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
            moberror.setText("Please enter valid mobile number"); 
            isValid=false;
         }
         
           if(isValid)
        {
            try
            {
                ConstantConnetion connectionObj = new ConstantConnetion();
                Connection con = connectionObj.createConnection();
                
                String query ="insert into staffregistration(ID,Name,Email,Post,Department,Password,Gender,Mobilenumber) values(?,?,?,?,?,?,?,?)";
                
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString(1,Tid);
                st.setString(2,Name);
                st.setString(3,Email);
                st.setString(4,Post);
                 st.setString(5,Dept);
                  st.setString(6,Pass);
                  st.setString(7,Gender);
                   st.setString(8,Mob);
                
                int a = st.executeUpdate();
                
                if(a>0)
                {
                    JOptionPane.showMessageDialog(this, "Registration successfully");
                    Login LoginObj = new Login();
                    this.hide();
                    LoginObj.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "This user is allready exits");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this,"This user is allready exits");
            }
        }
         
        }
            
        if(isValid)
        {
            if(studentRadio.isSelected())
            {
                System.out.println("Student URN:"+Urn);
                System.out.println("Student name:"+Name);
                System.out.println("Student email:"+Email);
                System.out.println("Student faculty:"+Faculty);
                System.out.println("Student class:"+Class);
                System.out.println("Student Password:"+Pass);
                System.out.println("Student mobile no.:"+Mob);
               
            }
            
            if(teacherRadio.isSelected())
            {
                System.out.println("Teacher Tid:"+Tid);
                System.out.println("Teacher name:"+Name);
                System.out.println("Teacher Email:"+Email);
                System.out.println("Teacherfaculty :"+Faculty);
                System.out.println("Teacher Department:"+Dept);
                System.out.println("Teacher password: "+Pass);
                System.out.println("Teachwe Mobile no. :"+Mob);
            }
            
            if(staffRadio.isSelected())
            {
                System.out.println("Staff TID:"+Tid);
                System.out.println("Staff name:"+Name);
                System.out.println("Staff Email"+Email);
                System.out.println("Staff post :"+Post);
                System.out.println("Staff dept:"+Dept);
                System.out.println("Staff Password:"+Pass);
                System.out.println("Staff Mobile no. :"+Mob);
            }
        }
        
            
    }//GEN-LAST:event_subbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Login obj = new Login();
        this.hide();
        obj.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
//         tid.setVisible(false);
//        tid.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel classerror;
    private javax.swing.JLabel classs;
    private javax.swing.JComboBox<String> classsitem;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel dept;
    private javax.swing.JLabel depterror;
    private javax.swing.JComboBox<String> deptitem;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel faculty;
    private javax.swing.JLabel facultyerror;
    private javax.swing.JComboBox<String> facultyitem;
    private javax.swing.JRadioButton femaleradio;
    private javax.swing.JLabel hidepass;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleradio;
    private javax.swing.JLabel moberror;
    private javax.swing.JTextField mobtext;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameerror;
    private javax.swing.JTextField nametext;
    private javax.swing.JLabel passerror;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel post;
    private javax.swing.JLabel posterror;
    private javax.swing.JComboBox<String> postitem;
    private javax.swing.JLabel showpass;
    private javax.swing.JRadioButton staffRadio;
    private javax.swing.JRadioButton studentRadio;
    private javax.swing.JButton subbtn;
    private javax.swing.JRadioButton teacherRadio;
    private javax.swing.JLabel tid;
    private javax.swing.JLabel tiderror;
    private javax.swing.JLabel urn;
    private javax.swing.JLabel urnerror;
    private javax.swing.JTextField urntext;
    // End of variables declaration//GEN-END:variables
}
