
package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;


public class Reply extends javax.swing.JFrame {

   
    public Reply() {
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
        jLabel6 = new javax.swing.JLabel();
        ridtext = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        destext = new javax.swing.JTextArea();
        savebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        rdate = new com.toedter.calendar.JDateChooser();
        riderror = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();
        deserroe = new javax.swing.JLabel();
        replyBy = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        replyerror = new javax.swing.JLabel();
        backarrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 243, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reply.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 512, 610));

        jPanel2.setBackground(new java.awt.Color(248, 243, 237));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 112, 128));
        jLabel3.setText("REPLY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 82, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Reply By :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Date :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 52, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Description :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        ridtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(ridtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 30));

        destext.setColumns(20);
        destext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        destext.setRows(5);
        jScrollPane1.setViewportView(destext);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 230, 110));

        savebtn.setBackground(new java.awt.Color(102, 255, 102));
        savebtn.setText("SAVE");
        savebtn.setPreferredSize(new java.awt.Dimension(93, 23));
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        jPanel2.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 31));

        clearbtn.setBackground(new java.awt.Color(255, 102, 102));
        clearbtn.setText("CLEAR");
        clearbtn.setPreferredSize(new java.awt.Dimension(93, 23));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, 31));
        jPanel2.add(rdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 230, 30));

        riderror.setForeground(java.awt.Color.red);
        jPanel2.add(riderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, 20));

        dateError.setForeground(java.awt.Color.red);
        jPanel2.add(dateError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 220, 20));

        deserroe.setForeground(java.awt.Color.red);
        jPanel2.add(deserroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 230, 20));

        replyBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Teacher", "Student", "Staff" }));
        jPanel2.add(replyBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 230, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Gid :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 71, -1));

        replyerror.setForeground(java.awt.Color.red);
        jPanel2.add(replyerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 220, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 410, 610));

        backarrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backarrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backarrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backarrowMouseClicked(evt);
            }
        });
        jPanel1.add(backarrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

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

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        
        Date date = rdate.getDate();
        String Rid=ridtext.getText();
        boolean isValid=true;
        String Des=destext.getText();
        String Reply=replyBy.getSelectedItem().toString();
        
  String dateFormat="";
         System.out.println("date is "+date);
         if(date!=null)
         {
         String y = String.valueOf(date.getYear()+1900);
            String d = String.valueOf(date.getDate());
           String m = String.valueOf(date.getMonth()+1);
             dateFormat = y+"-"+m+"-"+d;
         }

            if(date == null)
         {
             dateError.setText("Date do not empty");
             isValid=false;
         }
         else
         {
             dateError.setText("");
         }
         
         
        if(Rid.isEmpty())
        {
            riderror.setText("Please enter replay id.");
            isValid=false;
        }else
        {
            riderror.setText("");
        }
        if(Des.isEmpty())
        {
        deserroe.setText("Please enter text.");
        isValid=false;
        }else
        {
            deserroe.setText("");
        }
        if(Reply.equals("Select")){
            replyerror.setText("Please select once");
    
    }else
        {
            replyerror.setText("");
        }
         if(isValid)
        {

            
             if(isValid)
        {
            try
            {
                ConstantConnetion connectionObj = new ConstantConnetion();
                Connection con = connectionObj.createConnection();
                
                String query ="insert into StaffReply(Gid,Reply,Date,description) values(?,?,?,?)";
                
                PreparedStatement st = con.prepareStatement(query);
                
                st.setString(1,Rid);
                st.setString(2,Reply);
                st.setString(3,dateFormat);
                
                st.setString(4,Des);
               
                
                int a = st.executeUpdate();
                
                if(a>0)
                {
                    JOptionPane.showMessageDialog(this, "Reply added successfully.");
                    AdminDashbord LoginObj = new AdminDashbord();
                    this.hide();
                    LoginObj.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Something wrong");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "This user is allready exits.");
            }
           }
        }                                                                            
    }//GEN-LAST:event_savebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        ridtext.setText("");
        destext.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void backarrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backarrowMouseClicked
       AdminDashbord admin = new AdminDashbord();
       this.hide();
       admin.setVisible(true);
        
    }//GEN-LAST:event_backarrowMouseClicked

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backarrow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel dateError;
    private javax.swing.JLabel deserroe;
    private javax.swing.JTextArea destext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser rdate;
    private javax.swing.JComboBox<String> replyBy;
    private javax.swing.JLabel replyerror;
    private javax.swing.JLabel riderror;
    private javax.swing.JTextField ridtext;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
