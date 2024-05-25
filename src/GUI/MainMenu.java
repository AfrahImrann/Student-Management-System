package GUI;

/**
 *
 * @author Adeel
 */
public class MainMenu extends javax.swing.JFrame {


    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addStudentButton = new javax.swing.JButton();
        studentListButton = new javax.swing.JButton();
        addStaffButton = new javax.swing.JButton();
        addTeacherButton = new javax.swing.JButton();
        FeeButton = new javax.swing.JButton();
        staffListButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        teacherListButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/school.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);

        jPanel1.setLayout(null);

        addStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/admission form.jpg"))); // NOI18N
        addStudentButton.setText("Admission Form");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addStudentButton);
        addStudentButton.setBounds(170, 140, 150, 70);

        studentListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/student data.jpg"))); // NOI18N
        studentListButton.setText("Student Data");
        studentListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(studentListButton);
        studentListButton.setBounds(170, 220, 150, 70);

        addStaffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Staff form.jpg"))); // NOI18N
        addStaffButton.setText("Staff Form");
        addStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addStaffButton);
        addStaffButton.setBounds(490, 140, 140, 70);

        addTeacherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Untitled.jpg"))); // NOI18N
        addTeacherButton.setText("Teacher Form");
        addTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addTeacherButton);
        addTeacherButton.setBounds(330, 140, 150, 70);

        FeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Fee.jpg"))); // NOI18N
        FeeButton.setText("Fee Structure");
        FeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FeeButton);
        FeeButton.setBounds(330, 300, 150, 70);

        staffListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Staff data.jpg"))); // NOI18N
        staffListButton.setText("Staff Data");
        staffListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(staffListButton);
        staffListButton.setBounds(490, 220, 140, 70);

        logoutButton.setBackground(new java.awt.Color(255, 204, 0));
        logoutButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/logout.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setToolTipText("click here to logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton);
        logoutButton.setBounds(500, 440, 110, 30);

        addUserButton.setBackground(new java.awt.Color(255, 204, 0));
        addUserButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        addUserButton.setForeground(new java.awt.Color(0, 0, 0));
        addUserButton.setText("+Add User");
        addUserButton.setToolTipText("click here to add new user");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addUserButton);
        addUserButton.setBounds(380, 440, 110, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("           School Management System");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 717, 50);

        teacherListButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Teacher data.jpg"))); // NOI18N
        teacherListButton2.setText("Teacher Data");
        teacherListButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherListButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(teacherListButton2);
        teacherListButton2.setBounds(330, 220, 150, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/template final.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        StudentForm student=new StudentForm();
        this.hide();
        student.setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        UserRegisteration user=new UserRegisteration();
        this.hide();
        user.setVisible(true);
        
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void addTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherButtonActionPerformed
        TeacherForm teacher=new TeacherForm();
        this.hide();
        teacher.setVisible(true);
    }//GEN-LAST:event_addTeacherButtonActionPerformed

    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        StaffForm staff=new StaffForm();
        this.hide();
        staff.setVisible(true);
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void studentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListButtonActionPerformed
        StudentRecord record=new StudentRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_studentListButtonActionPerformed

    private void FeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeButtonActionPerformed
        FeesReceipt Fee =new FeesReceipt();
        this.hide();
        Fee.setVisible(true);
    }//GEN-LAST:event_FeeButtonActionPerformed

    private void staffListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffListButtonActionPerformed
        StaffRecord record=new  StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffListButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login login=new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void teacherListButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherListButton2ActionPerformed
        // TODO add your handling code here:
                TeacherRecord record=new  TeacherRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_teacherListButton2ActionPerformed

 
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FeeButton;
    private javax.swing.JButton addStaffButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton addTeacherButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton staffListButton;
    private javax.swing.JButton studentListButton;
    private javax.swing.JButton teacherListButton2;
    // End of variables declaration//GEN-END:variables
}
