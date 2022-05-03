/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Dimension;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author becsc
 * @author tturba
 */

public class Gui extends javax.swing.JFrame {

    // Variables declaration                    
    private javax.swing.JTable Brand;
    private javax.swing.JButton BrandAdd;
    private javax.swing.JTable Buys;
    private javax.swing.JTable Customer;
    private javax.swing.JTable Makes;
    private javax.swing.JTable Model;
    private javax.swing.JButton ModelAdd;
    private javax.swing.JButton ModelDelete;
    private javax.swing.JButton ModelUpdate;
    private javax.swing.JButton addButton;
    private javax.swing.JButton brandDelete;
    private javax.swing.JButton brandUpdate;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCity2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCust;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSil;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtState2;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtStreet2;
    private javax.swing.JTextField txtStyle;
    private javax.swing.JTextField txtYear;
    private javax.swing.JTextField txtZip;
    private javax.swing.JTextField txtZip2;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton buttonq1;
    private javax.swing.JButton buttonq2;
    private javax.swing.JButton buttonq3;
    private javax.swing.JButton buttonq4;
    private javax.swing.JButton buttonq5;
    private javax.swing.JButton buttonq6;
    private Database db = new Database();
    // End of variables declaration

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }
    
    /**
     * Creates new form GUI
     */
    public Gui() {
        initComponents();
        //set jpanel with Customer table in it to not visible

        /* connect to database */
        try {
            db.connect();
        } 
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")                      
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCust = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtFirst = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Brand = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtStreet2 = new javax.swing.JTextField();
        txtCity2 = new javax.swing.JTextField();
        txtState2 = new javax.swing.JTextField();
        txtZip2 = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        BrandAdd = new javax.swing.JButton();
        brandUpdate = new javax.swing.JButton();
        brandDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Model = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtStyle = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSil = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        ModelAdd = new javax.swing.JButton();
        ModelUpdate = new javax.swing.JButton();
        ModelDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Makes = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Buys = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        //new gui page
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        buttonq1 = new javax.swing.JButton();
        buttonq2 = new javax.swing.JButton();
        buttonq3 = new javax.swing.JButton();
        buttonq4 = new javax.swing.JButton();
        buttonq5 = new javax.swing.JButton();
        buttonq6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerId", "PhoneNumber", "Email", "StreetAddress", "CityAddress", "StateAddress", "ZipAddress", "FirstName", "LastName"
            }
        ));
        jScrollPane1.setViewportView(Customer);

        jButton1.setText("Show Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateCustomerTable();
            }
        });

        jLabel1.setText("CustomerId");

        jLabel2.setText("PhoneNumber");

        jLabel3.setText("Email");

        jLabel4.setText("Street");

        jLabel5.setText("City");

        jLabel6.setText("State");

        jLabel7.setText("Zip Code");

        jLabel8.setText("FirstName");

        jLabel9.setText("LastName");

        txtCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCust, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateButton)
                            .addComponent(addButton)
                            .addComponent(deleteButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer", jPanel2);

        Brand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BrandId", "YearEstablished", "StreetAddress", "CityAddress", "StateAddress", "ZipAddress", "CountryAddress", "Name"
            }
        ));
        jScrollPane2.setViewportView(Brand);

        jButton2.setText("Show Brand");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // jButton2ActionPerformed(evt);
                populateBrandTable();
            }
        });

        jLabel10.setText("BrandId");

        jLabel11.setText("YearEstablished");

        jLabel12.setText("Street");

        jLabel13.setText("City");

        jLabel14.setText("State");

        jLabel15.setText("Zip Code");

        jLabel16.setText("Country");

        jLabel17.setText("Name");

        txtState2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtState2ActionPerformed(evt);
            }
        });

        BrandAdd.setText("Add");
        BrandAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandAddActionPerformed(evt);
            }
        });

        brandUpdate.setText("Update");
        brandUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandUpdateActionPerformed(evt);
            }
        });

        brandDelete.setText("Delete");
        brandDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZip2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brandDelete)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(brandUpdate)
                                .addComponent(BrandAdd))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtState2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtZip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BrandAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brandDelete))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Brand", jPanel3);

        Model.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ModelId", "StyleId", "Price", "Silhouette", "ModelName", "Color"
            }
        ));
        jScrollPane3.setViewportView(Model);

        jButton3.setText("Show Model");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateModelTable();
            }
        });

        jLabel18.setText("ModelId");

        jLabel19.setText("StyleId");

        jLabel20.setText("Price");

        jLabel21.setText("Silhouette");

        jLabel22.setText("ModelName");

        jLabel23.setText("Color");

        ModelAdd.setText("Add");
        ModelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelAddActionPerformed(evt);
            }
        });

        ModelUpdate.setText("Update");
        ModelUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelUpdateActionPerformed(evt);
            }
        });

        ModelDelete.setText("Delete");
        ModelDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSil, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModelUpdate)
                                    .addComponent(ModelAdd)
                                    .addComponent(ModelDelete))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(44, 44, 44)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(ModelAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModelUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModelDelete))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Model", jPanel4);

        Makes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RealeaseDate", "BrandId", "ModelId"
            }
        ));
        jScrollPane4.setViewportView(Makes);

        jButton4.setText("Show Makes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateMakesTable();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Makes", jPanel1);

        Buys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PaymentType", "ReceiptNumber", "TotalCost", "Quantity", "Size", "Color", "CustomerId", "ModelId"
            }
        ));
        jScrollPane5.setViewportView(Buys);

        jButton5.setText("Show Buys");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateBuysTable();
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton5)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        buttonq1.setText("Query 1");
        buttonq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedQuery1();
            }
        });

        buttonq2.setText("Query 2");
        buttonq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedQuery2();
            }
        });

        buttonq3.setText("Query 3");
        buttonq3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedQuery3();
            }
        });

        buttonq4.setText("Query 4");
        buttonq4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedQuery4();
            }
        });

        buttonq5.setText("Query 5");
        buttonq5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedQuery5();
            }
        });

        buttonq6.setText("Query 6");
        buttonq6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedQuery6();
            }
        }); 

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonq1)
                        .addComponent(buttonq2)
                        .addComponent(buttonq3)
                        .addComponent(buttonq4)
                        .addComponent(buttonq5)
                        .addComponent(buttonq6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonq1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonq2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonq3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonq4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonq5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonq6))
                        ))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Advanced Queries", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }                       

    // CUSTOMER
    private void populateCustomerTable() { 
           try{
            String sql = "SELECT * FROM Customer";
            ResultSet rs = db.executeSQL(sql);
            DefaultTableModel tblModel = (DefaultTableModel)Customer.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                //data will be added until finished
                String customerId = String.valueOf(rs.getInt("CustomerId"));
                String phoneNumber = rs.getString("PhoneNumber");
                String email = rs.getString("Email");
                String streetAddress = rs.getString("StreetAddress");
                String cityAddress = rs.getString("CityAddress");
                String stateAddress = String.valueOf(rs.getString("StateAddress"));
                String zipAddress = String.valueOf(rs.getString("ZipAddress"));
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                
                String tbData[] = {customerId, phoneNumber, email, streetAddress, 
                        cityAddress, stateAddress, zipAddress, firstName, lastName};
                
                //addstring array into jtable
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }       

    // BRAND
    private void populateBrandTable() {                                        
         try{
            String sql = "SELECT * FROM Brand";
            ResultSet rs = db.executeSQL(sql);
            DefaultTableModel tblModel = (DefaultTableModel)Brand.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                //data will be added until finished
                String brandId = String.valueOf(rs.getInt("BrandId"));
                String yearEstablished = String.valueOf(rs.getInt("YearEstablished"));
                String streetAddress = rs.getString("AddressStreet");
                String cityAddress = rs.getString("AddressCity");
                String stateAddress = String.valueOf(rs.getString("AddressState"));
                String zipAddress = String.valueOf(rs.getString("AddressZip"));
                String countryAddress = rs.getString("AddressCountry");
                String name = rs.getString("Name");

                String tbData[] = {brandId, yearEstablished, streetAddress,
                    cityAddress, stateAddress, zipAddress, countryAddress, name};
                

                //addstring array into jtable
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }       
                                     
    //MODEL
    private void populateModelTable() {                                    
        try{
            String sql = "SELECT * FROM Model";
            ResultSet rs = db.executeSQL(sql);
            DefaultTableModel tblModel = (DefaultTableModel)Model.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                //data will be added until finished
                String modelId = rs.getString("ModelId");
                String styleId = rs.getString("StyleId");
                String price = String.valueOf(rs.getInt("Price"));
                String silhouette = rs.getString("Silhouette");
                String modelName = rs.getString("ModelName");
                String color = rs.getString("Color");

                String tbData[] = {modelId, styleId, price,
                    silhouette, modelName, color};

                //addstring array into jtable
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }                                        

    // MAKES
    private void populateMakesTable() {
        try{
            String sql = "SELECT * FROM Makes";
            ResultSet rs = db.executeSQL(sql);
            DefaultTableModel tblModel = (DefaultTableModel)Makes.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                //data will be added until finished
                String releaseDate = rs.getString("ReleaseDate");
                String brandId = rs.getString("BrandId");
                String modelId = rs.getString("ModelId");

                String tbData[] = {releaseDate, brandId, modelId};

                //addstring array into jtable
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }      

    // BUYS 
    private void populateBuysTable() {
        try{
            String sql = "SELECT * FROM Buys";
            ResultSet rs = db.executeSQL(sql);
            DefaultTableModel tblModel = (DefaultTableModel)Buys.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                //data will be added until finished
                String paymentType = rs.getString("PaymentType");
                String receiptNumber = String.valueOf(rs.getInt("ReceiptNumber"));
                String totalCost = String.valueOf(rs.getInt("TotalCost"));
                String quantity = String.valueOf(rs.getInt("Quantity"));
                String size = String.valueOf(rs.getInt("Size"));
                String color = rs.getString("Color");
                String customerId = String.valueOf(rs.getInt("CustomerId"));
                String modelId = rs.getString("ModelId");

                String tbData[] = {paymentType, receiptNumber, totalCost, quantity,
                    size, color, customerId, modelId};

                //addstring array into jtable
                tblModel.addRow(tbData);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }                                        

    private void txtCustActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }        

    //CUSTOMER ADD BUTTON
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(txtPhone.getText().equals("") ||
                txtEmail.getText().equals("") ||
                txtStreet.getText().equals("") ||
                txtCity.getText().equals("") ||
                txtState.getText().equals("") ||
                txtZip.getText().equals("") ||
                txtFirst.getText().equals("")||
                txtLast.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields besides CustomerId!");
        }
        else{
            Customer c = new Customer(
                txtEmail.getText(),
                txtPhone.getText(),
                txtStreet.getText(),
                txtCity.getText(),
                txtState.getText(),
                Integer.valueOf(txtZip.getText()),
                txtFirst.getText(),
                txtLast.getText()
            );
            db.addCustomer(c);
            populateCustomerTable();
            clearCustomerTextBoxes();
        }
    }                              

    //CUSTOMER DELETE BUTTON
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(txtCust.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields");
        }
        else{
            db.deleteCustomer(txtCust.getText());
            populateCustomerTable();
            clearCustomerTextBoxes();
        } 
    }       

    //CUSTOMER UPDATE BUTTON
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
         if(txtCust.getText().equals("") || txtPhone.getText().equals("") ||
                txtEmail.getText().equals("") ||
                txtStreet.getText().equals("") ||
                txtCity.getText().equals("") ||
                txtState.getText().equals("") ||
                txtZip.getText().equals("") ||
                txtFirst.getText().equals("")||
                txtLast.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields");
        }
        else{
            Customer c = new Customer(
                Integer.valueOf(txtCust.getText()),
                txtEmail.getText(),
                txtPhone.getText(),
                txtStreet.getText(),
                txtCity.getText(),
                txtState.getText(),
                Integer.valueOf(txtZip.getText()),
                txtFirst.getText(),
                txtLast.getText()
            );
            db.updateCustomer(c);
            populateCustomerTable();
            clearCustomerTextBoxes();
        }
    }                                            

    private void txtState2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    //BRAND ADD BUTTON
    private void BrandAddActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.out.println("action performed");
        if(txtYear.getText().equals("") ||
                txtStreet2.getText().equals("") ||
                txtCity2.getText().equals("") ||
                txtState2.getText().equals("") ||
                txtZip2.getText().equals("") ||
                txtCountry.getText().equals("")||
                txtName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields besides BrandId!");
        }
        else{
            Brand newBrand = new Brand(
                            Integer.valueOf(txtYear.getText()),
                            txtStreet2.getText(),
                            txtCity2.getText(),
                            txtState2.getText(),
                            Integer.valueOf(txtZip2.getText()),
                            txtCountry.getText(),
                            txtName.getText()
            );
            System.out.println(newBrand);
            db.addBrand(newBrand);
            populateBrandTable();
            resetBrandTextBoxes();
        }
    }                                        
    
    //BRAND UPDATE BUTTON
    private void brandUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(txtYear.getText().equals("") ||
                txtStreet2.getText().equals("") ||
                txtCity2.getText().equals("") ||
                txtState2.getText().equals("") ||
                txtZip2.getText().equals("") ||
                txtCountry.getText().equals("")||
                txtName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields");
        }
        else{            
            Brand brand = new Brand(
                Integer.valueOf(txtYear.getText()),
                txtStreet2.getText(),
                txtCity2.getText(),
                txtState2.getText(),
                Integer.valueOf(txtZip2.getText()),
                txtCountry.getText(),
                txtName.getText(),
                Integer.valueOf(txtBrand.getText())
            );                
            db.updateBrand(brand);
            populateBrandTable();
            resetBrandTextBoxes();
        }
    }          

    //BRAND DELETE BUTTON
    private void brandDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(txtBrand.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in BrandId");
        }
        else{           
            db.deleteBrand(txtBrand.getText());
            populateBrandTable();
            resetBrandTextBoxes();
        } 
    }

    // REMOVE THE TEXT FROM THE CUSTOMER TEXT BOXES
    private void clearCustomerTextBoxes() {
        txtCust.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtFirst.setText("");
        txtLast.setText("");
    }
    
    // REMOVE THE TEXT FROM THE BRAND TEXT BOXES
    private void resetBrandTextBoxes() {
        txtBrand.setText("");
        txtYear.setText("");
        txtStreet2.setText("");
        txtCity2.setText("");
        txtState2.setText("");
        txtZip2.setText("");
        txtCountry.setText("");
        txtName.setText("");
    }

    // REMOVE THE TEXT FROM THE MODEL TEXT BOXES
    private void resetModelTextBoxes() {
        txtModel.setText("");
        txtStyle.setText("");
        txtPrice.setText("");
        txtSil.setText("");
        txtName2.setText("");
        txtColor.setText("");
        txtFirst.setText("");
        txtLast.setText("");
    }

    //MODEL ADD BUTTON
    private void ModelAddActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(txtModel.getText().equals("") ||
                txtStyle.getText().equals("") ||
                txtPrice.getText().equals("") ||
                txtSil.getText().equals("") ||
                txtName2.getText().equals("") ||
                txtColor.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields!");
        }
        else{            
            ShoeModel s = new ShoeModel(
                txtModel.getText(),
                txtStyle.getText(),
                Integer.valueOf(txtPrice.getText()),
                txtSil.getText(),
                txtName2.getText(),
                txtColor.getText()
            );
            db.addShoeModel(s);
            populateModelTable();
            resetModelTextBoxes();
        }                                    
    }                                        

    //MODEL UPDATE BUTTON
    private void ModelUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(txtModel.getText().equals("") || 
                txtStyle.getText().equals("") ||
                txtPrice.getText().equals("") ||
                txtSil.getText().equals("") ||
                txtName2.getText().equals("") ||
                txtColor.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in all fields");
        }
        else{         
            ShoeModel s = new ShoeModel(
                txtModel.getText(),
                txtStyle.getText(),
                Integer.valueOf(txtPrice.getText()),
                txtSil.getText(),
                txtName2.getText(),
                txtColor.getText()
            );
            db.updateShoeModel(s);
            populateModelTable();
            resetModelTextBoxes();
        }
    }

    //MODEL DELETE BUTTON
    private void ModelDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(txtModel.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in ModelId field");
        }
        else {
            db.deleteShoeModel(txtModel.getText());
            populateModelTable();
            resetModelTextBoxes();
        } 
    }    
    
    // RUN ADVANCED QUERY 1
    private void advancedQuery1() {
        // Find the number of shoes that are classified by the same Silhouette
        if(q1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in Query1 field");
        }
        else {
            String silhouette = q1.getText();
            ResultSet rs = db.advancedQ1(silhouette);
            q1.setText("");

            String count = "";
            try {
				while(rs.next()) {
				    count = rs.getString("count");
				}
                JOptionPane.showMessageDialog(this, "There are " + count +
                    " shoes that match the Silhouette \"" + silhouette + "\"");
			} catch (SQLException e) {
				e.printStackTrace();
			}
        } 
    }

    // RUN ADVANCED QUERY 2
    private void advancedQuery2() {
        //Which brands have shoes that cost more than _____

        if(q2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in Query2 field");
        }
        else {
            int x = Integer.valueOf(q2.getText());
            ResultSet rs = db.advancedQ2(x);
            q2.setText("");

            String count = "";
            try {
				while(rs.next()) {
				    count = rs.getString("count");
				}
                JOptionPane.showMessageDialog(this, "There are " + count +
                    " shoes that cost more than " + x + "");
			} catch (SQLException e) {
				e.printStackTrace();
			}
            
        } 
    }

    // RUN ADVANCED QUERY 3
    private void advancedQuery3() {
        // Find the __ most purchasing customer
        if(q3.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in Query3 field");
        }
        else {
            int x = Integer.valueOf(q3.getText());
            ResultSet rs = db.advancedQ3(x-1);
            q1.setText("");

            String name = "";
            try {
				while(rs.next()) {
				    name += rs.getString("FirstName") + " ";
                    name += rs.getString("LastName");
				}
                JOptionPane.showMessageDialog(this, name + " is the " + x + " most purchasing customer.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
        } 
    }

    // RUN ADVANCED QUERY 4
    private void advancedQuery4() {
        //Show the top _ brands with the highest revenue
        if(q4.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in Query4 field");
        }
        else {
            int num = Integer.valueOf(q4.getText());
            ResultSet rs = db.advancedQ4(num);
            q4.setText("");
            
            String names = "The following are in the top "+ num + " brands with the highest revenue: \n";
            try {
				while(rs.next()) {
				    names += rs.getString("Name") + "\n";
				}
                JOptionPane.showMessageDialog(this, names);
			} catch (SQLException e) {
				e.printStackTrace();
			}           
        } 
    }

    // RUN ADVANCED QUERY 5
    private void advancedQuery5() {
        // Which shoes are more expensive than the least expensive shoe made by _______
        if(q5.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in Query5 field");
        }
        else {
            String x = q5.getText();
            ResultSet rs = db.advancedQ5(x);
            q5.setText("");
            
            String s = "The following shoes are more expensive than the least expensive " + x + " shoe: \n";
            try {
				while(rs.next()) {
				    s += "$" + rs.getString("Price") + " - " + rs.getString("Silhouette") + "\n";
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
            JTextArea textArea = new JTextArea(s);
            JScrollPane scrollPane = new JScrollPane(textArea);  
            textArea.setLineWrap(true);  
            textArea.setWrapStyleWord(true); 
            textArea.setPreferredSize(new Dimension(500, 500));
            JOptionPane.showMessageDialog(this, scrollPane);
        } 
    }

    // RUN ADVANCED QUERY 6
    private void advancedQuery6() {
        //Count the number of customers in the states _____
        if(q6.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter data in Query6 field");
        }
        else {
            String states = q6.getText();

            String[] arr = states.split(", ");

            String listed = "";
            for(String s : arr){
                listed += "\'" + s + "\'";
            }
            ResultSet rs = db.advancedQ6(listed);
            q6.setText("");

            String count = "";
            try {
				while(rs.next()) {
				    count = rs.getString("count");
				}
                JOptionPane.showMessageDialog(this, "There are " + count +
                    " customers in the states " +  states);
			} catch (SQLException e) {
				e.printStackTrace();
			}

        } 
    }
}
