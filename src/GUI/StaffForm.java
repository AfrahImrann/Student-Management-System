/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Adeel
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class StaffForm extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public StaffForm() {
        initComponents();
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        fatherNameField = new javax.swing.JTextField();
        cnicLabel = new javax.swing.JLabel();
        cnicField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<String>();
        dobLabel = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        PhoneLabel1 = new javax.swing.JLabel();
        emailAddressField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        designationField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aqField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        experienceField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        salaryField = new javax.swing.JTextField();
        staffIdField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dojField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        newButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        getDataButton = new javax.swing.JButton();
        staffRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff Form");
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(1366, 730));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 700));
        jPanel1.setName("Staff Details"); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("                                                     Staff's Details");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Basic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        firstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name:");

        firstNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        firstNameField.setForeground(new java.awt.Color(0, 0, 0));
        firstNameField.setToolTipText("Enter First Name here");
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyTyped(evt);
            }
        });

        lastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name:");
        lastNameLabel.setToolTipText("");

        lastNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(0, 0, 0));
        lastNameField.setToolTipText("Enter Last Name Here");
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyTyped(evt);
            }
        });

        fatherNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        fatherNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fatherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fatherNameLabel.setText("Father's Name:");

        fatherNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fatherNameField.setForeground(new java.awt.Color(0, 0, 0));
        fatherNameField.setToolTipText("Enter Father's Name here");
        fatherNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameFieldActionPerformed(evt);
            }
        });
        fatherNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fatherNameFieldKeyTyped(evt);
            }
        });

        cnicLabel.setBackground(new java.awt.Color(0, 0, 0));
        cnicLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cnicLabel.setForeground(new java.awt.Color(255, 255, 255));
        cnicLabel.setText("CNIC Number:");

        cnicField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cnicField.setForeground(new java.awt.Color(0, 0, 0));
        cnicField.setToolTipText("Enter Father's CNIC Number");
        cnicField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnicFieldKeyTyped(evt);
            }
        });

        mobileLabel.setBackground(new java.awt.Color(0, 0, 0));
        mobileLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mobileLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileLabel.setText("Mobile Number: ");

        mobileField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mobileField.setForeground(new java.awt.Color(0, 0, 0));
        mobileField.setToolTipText("Enter Father's Mobile Number here");
        mobileField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileFieldKeyTyped(evt);
            }
        });

        addressLabel.setBackground(new java.awt.Color(0, 0, 0));
        addressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address:");

        addressField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addressField.setForeground(new java.awt.Color(0, 0, 0));
        addressField.setToolTipText("EnterStudent's Address here");
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        genderLabel.setBackground(new java.awt.Color(0, 0, 0));
        genderLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender:");

        cmbGender.setBackground(new java.awt.Color(102, 102, 102));
        cmbGender.setForeground(new java.awt.Color(255, 255, 255));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Male", "Female" }));

        dobLabel.setBackground(new java.awt.Color(0, 0, 0));
        dobLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Date of Birth:");

        dobField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dobField.setForeground(new java.awt.Color(0, 0, 0));
        dobField.setToolTipText("Enter Student's Date of Birth here");
        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });

        PhoneLabel1.setBackground(new java.awt.Color(0, 0, 0));
        PhoneLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PhoneLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel1.setText("Email Address:");

        emailAddressField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        emailAddressField.setForeground(new java.awt.Color(0, 0, 0));
        emailAddressField.setToolTipText("Enter Father's Phone Number here");
        emailAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fatherNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(fatherNameField)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dobLabel)
                                .addGap(30, 30, 30)
                                .addComponent(dobField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileLabel)
                            .addComponent(cnicLabel)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(cnicField)
                            .addComponent(mobileField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressField)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PhoneLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(343, 343, 343))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fatherNameLabel)
                    .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnicLabel)
                    .addComponent(cnicField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileLabel)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobLabel)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneLabel1)
                            .addComponent(emailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        designationField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        designationField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Designation:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Academic Qualification:");

        aqField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        aqField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Experience:");

        experienceField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        experienceField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Salary:");

        salaryField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        salaryField.setForeground(new java.awt.Color(0, 0, 0));
        salaryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryFieldActionPerformed(evt);
            }
        });
        salaryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salaryFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryFieldKeyTyped(evt);
            }
        });

        staffIdField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        staffIdField.setForeground(new java.awt.Color(0, 0, 0));
        staffIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffIdFieldActionPerformed(evt);
            }
        });
        staffIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffIdFieldKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Staff ID:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of joining:");

        dojField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dojField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aqField))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(experienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dojField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(staffIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(designationField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aqField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(experienceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dojField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        newButton.setBackground(new java.awt.Color(0, 0, 0));
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        getDataButton.setBackground(new java.awt.Color(0, 0, 0));
        getDataButton.setForeground(new java.awt.Color(255, 255, 255));
        getDataButton.setText("Get Data");
        getDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataButtonActionPerformed(evt);
            }
        });

        staffRecord.setBackground(new java.awt.Color(0, 0, 0));
        staffRecord.setForeground(new java.awt.Color(255, 255, 255));
        staffRecord.setText("Staff Record");
        staffRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getDataButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffRecord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, deleteButton, getDataButton, newButton, saveButton, staffRecord, updateButton});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffRecord)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton)
                        .addComponent(newButton)
                        .addComponent(saveButton)
                        .addComponent(updateButton)
                        .addComponent(deleteButton)
                        .addComponent(getDataButton)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backButton, deleteButton, getDataButton, newButton, saveButton, updateButton});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void fatherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherNameFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void emailAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressFieldActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        reset();
    }//GEN-LAST:event_newButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainMenu menu=new MainMenu();
        this.hide();
        menu.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        try{
            con = Connect.ConnectDB();
            if("".equals(staffIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Staff ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Statement st;
            st = con.createStatement();
            String sql1="select StaffID from StaffRecord where StaffID='"+staffIdField.getText()+"'";
            rs = st.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Staff ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                staffIdField.setText("");
                staffIdField.requestDefaultFocus();
                return;
            }

            String sql= "insert into StaffRecord(StaffID,FirstName,LastName,FatherName,EmailAddress,ContactNo,CNIC,Salary,Designation,AcademicQualification,Address,Gender,Experience,DateOfBirth,DateOfJoinning) values ('"+staffIdField.getText()+"','"+firstNameField.getText()+"','"+lastNameField.getText()+"','"+fatherNameField.getText()+"','"+emailAddressField.getText()+"','"+mobileField.getText()+"','"+cnicField.getText()+"','"+salaryField.getText()+"','"+designationField.getText()+"','"+aqField.getText()+"','"+addressField.getText()+"','"+cmbGender.getSelectedItem()+"','"+experienceField.getText()+"','"+dobField.getText()+"','"+dojField.getText()+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered!", "Staff", JOptionPane.INFORMATION_MESSAGE);
            saveButton.setEnabled(false);
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    void reset(){
        firstNameField.setText("");
        staffIdField.setText("");
        lastNameField.setText("");
        salaryField.setText("");
        fatherNameField.setText("");
        emailAddressField.setText("");
        mobileField.setText("");
        cnicField.setText("");
        designationField.setText("");
        aqField.setText("");
        addressField.setText("");
        cmbGender.setSelectedIndex(0);
        experienceField.setText("");
        dobField.setText("");
        dojField.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        staffIdField.requestFocus();
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try{
            con = Connect.ConnectDB();
            String sql = "update StaffRecord set FirstName='"+firstNameField.getText()+"',LastName='"+lastNameField.getText()+"',FatherName='"+fatherNameField.getText()+"',EmailAddress='"+emailAddressField.getText()+"',ContactNo='"+mobileField.getText()+"',CNIC='"+cnicField.getText()+"',Salary='"+salaryField.getText()+"',Designation='"+designationField.getText()+"',AcademicQualification='"+aqField.getText()+"',Address='"+addressField.getText()+"',Gender='"+cmbGender.getSelectedItem()+"',Experience='"+experienceField.getText()+"',DateOfBirth='"+ dobField.getText()+"',DateOfJoinning='"+dojField.getText()+"'where StaffID='"+staffIdField.getText()+"'";

            pst = con.prepareStatement(sql);
            pst.execute();
            
            if("".equals(staffIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please Select a record to update");
                return;
            }
           
            JOptionPane.showMessageDialog(this, "Updated Successfully!","Record",JOptionPane.INFORMATION_MESSAGE);
            updateButton.setEnabled(false);
        }
        
        catch(HeadlessException | SQLException ex){

            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try{
            if("".equals(staffIdField.getText())){
                    JOptionPane.showMessageDialog(null, "Please enter Staff ID to delete record!");
                    return;
                }
            int d = JOptionPane.showConfirmDialog(this, "Are sure want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(d==0){
                con = Connect.ConnectDB();
                String sql = "delete from StaffRecord where StaffID='"+staffIdField.getText()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                if("".equals(staffIdField.getText())){
                    JOptionPane.showMessageDialog(null, "Please select a record to delete!");
                    return;
                }
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                reset();
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void getDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataButtonActionPerformed
        this.hide();
        StaffRecord staff=new StaffRecord();
        staff.setVisible(true);
    }//GEN-LAST:event_getDataButtonActionPerformed

    private void staffIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffIdFieldActionPerformed

    private void salaryFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryFieldKeyPressed
       
    }//GEN-LAST:event_salaryFieldKeyPressed

    private void salaryFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryFieldKeyTyped
         char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }//GEN-LAST:event_salaryFieldKeyTyped

    private void salaryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryFieldActionPerformed

    private void staffRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRecordActionPerformed
        StaffRecord record=new StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffRecordActionPerformed

    private void cnicFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnicFieldKeyTyped
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }//GEN-LAST:event_cnicFieldKeyTyped

    private void mobileFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileFieldKeyTyped
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }//GEN-LAST:event_mobileFieldKeyTyped

    private void staffIdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffIdFieldKeyTyped
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "ID can not be accepted in Letters Please enter digits!");
         }
    }//GEN-LAST:event_staffIdFieldKeyTyped

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyTyped
        char input = evt.getKeyChar();
         if(!(input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         }
    }//GEN-LAST:event_firstNameFieldKeyTyped

    private void fatherNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fatherNameFieldKeyTyped
       char input = evt.getKeyChar();
         if(!(input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         }
    }//GEN-LAST:event_fatherNameFieldKeyTyped

    private void lastNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyTyped
        char input = evt.getKeyChar();
         if(!(input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
         }
    }//GEN-LAST:event_lastNameFieldKeyTyped

   
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
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PhoneLabel1;
    public javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    public javax.swing.JTextField aqField;
    private javax.swing.JButton backButton;
    public javax.swing.JComboBox<String> cmbGender;
    public javax.swing.JTextField cnicField;
    private javax.swing.JLabel cnicLabel;
    public javax.swing.JButton deleteButton;
    public javax.swing.JTextField designationField;
    public javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    public javax.swing.JTextField dojField;
    public javax.swing.JTextField emailAddressField;
    public javax.swing.JTextField experienceField;
    public javax.swing.JTextField fatherNameField;
    private javax.swing.JLabel fatherNameLabel;
    public javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton getDataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    public javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JButton newButton;
    public javax.swing.JTextField salaryField;
    public javax.swing.JButton saveButton;
    public javax.swing.JTextField staffIdField;
    private javax.swing.JButton staffRecord;
    public javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
