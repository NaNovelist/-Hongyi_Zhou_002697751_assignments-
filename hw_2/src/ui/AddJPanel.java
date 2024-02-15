/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.HomeAddress;
import model.Person;
import model.PersonDirectory;
import model.WorkAddress;

/**
 *
 * @author hyZHO
 */
public class AddJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    /**
     * Creates new form AddJPanel
     */
    PersonDirectory personDirectory;
    Person person;
            
    public AddJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.person = person;
        this.personDirectory = personDirectory;
        this.userProcessContainer = userProcessContainer;
    }
    
    public AddJPanel(JPanel userProcessContainer, Person person, PersonDirectory personDirectory) {
        initComponents();
        this.person = person;
        this.personDirectory = personDirectory;
        this.userProcessContainer = userProcessContainer;
        populatePerson();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        lblHStreet = new javax.swing.JLabel();
        txtHStreet = new javax.swing.JTextField();
        lblHCity = new javax.swing.JLabel();
        txtHCity = new javax.swing.JTextField();
        lblHZip = new javax.swing.JLabel();
        txtHZip = new javax.swing.JTextField();
        lblHUnit = new javax.swing.JLabel();
        txtHUnit = new javax.swing.JTextField();
        txtWCity = new javax.swing.JTextField();
        lblWZip = new javax.swing.JLabel();
        txtWZip = new javax.swing.JTextField();
        lbWUnit = new javax.swing.JLabel();
        txtWUnit = new javax.swing.JTextField();
        lblWStreet = new javax.swing.JLabel();
        txtWStreet = new javax.swing.JTextField();
        lblWCity = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblWAddress = new javax.swing.JLabel();
        lblHAddress1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Person");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 22, 464, 40));

        lblFirstName.setText("First Name:");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 80, 206, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 103, 206, -1));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 502, 114, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 103, 206, -1));

        lblLastName.setText("Last Name:");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 206, -1));

        lblSSN.setText("Social Security Number:");
        add(lblSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 144, 206, -1));
        add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 173, 206, -1));

        lblLicenseNumber.setText("License Number:");
        add(lblLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 144, 206, -1));
        add(txtLicenseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 173, 206, -1));

        lblHStreet.setText("Street Address:");
        add(lblHStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 305, 206, -1));
        add(txtHStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 334, 206, -1));

        lblHCity.setText("City:");
        add(lblHCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 375, 206, -1));
        add(txtHCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 404, 206, -1));

        lblHZip.setText("Zip Code:");
        add(lblHZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 375, 206, -1));
        add(txtHZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 404, 206, -1));

        lblHUnit.setText("Unit Number:");
        add(lblHUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 305, 206, -1));
        add(txtHUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 334, 206, -1));
        add(txtWCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 626, 206, -1));

        lblWZip.setText("Zip Code:");
        add(lblWZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 597, 206, -1));
        add(txtWZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 626, 206, -1));

        lbWUnit.setText("Unit Number:");
        add(lbWUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 512, 206, -1));
        add(txtWUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 547, 206, -1));

        lblWStreet.setText("Street Address:");
        add(lblWStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 512, 206, -1));
        add(txtWStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 547, 206, -1));

        lblWCity.setText("City:");
        add(lblWCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 597, 206, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 559, 114, -1));

        lblWAddress.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lblWAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWAddress.setText("Work Address");
        add(lblWAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 470, -1, -1));

        lblHAddress1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lblHAddress1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHAddress1.setText("Home Address");
        add(lblHAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 254, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
//        btnCreate.setEnabled(true);
//        btnUpdate.setEnabled(false);

        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String SSN = txtSSN.getText();
        String LicenseNumber = txtLicenseNumber.getText();

        Person p = personDirectory.addPersons();
        p.setFirstName(firstName);
        p.setLastName(lastName);
        p.setSSN(SSN);
        p.setLicenseNumber(LicenseNumber);

        String hStreet = txtHStreet.getText();
        String hUnit = txtHUnit.getText();
        String hCity = txtHCity.getText();
        String hZip = txtHZip.getText();

        HomeAddress ha = p.addNewHomes(hStreet, hUnit, hCity, hZip);
        
        String wStreet = txtWStreet.getText();
        String wUnit = txtWUnit.getText();
        String wCity = txtWCity.getText();
        String wZip = txtWZip.getText();
        
        WorkAddress wa = p.addNewWorks(wStreet, wUnit, wCity, wZip);

        JOptionPane.showMessageDialog(this, "New Person added.");
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtSSN.setText("");
        txtLicenseNumber.setText("");
        
        txtHStreet.setText("");
        txtHUnit.setText("");
        txtHCity.setText("");
        txtHZip.setText("");
        
        txtWStreet.setText("");
        txtWUnit.setText("");
        txtWCity.setText("");
        txtWZip.setText("");
      
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        person
//        person
//        account.setAccountNumber(txtAccountNumber.getText());
//        account.setBankName(txtBankName.getText());
//        
//        btnSave.setEnabled(false);
//        btnUpdate.setEnabled(true);
//        
//        JOptionPane.showMessageDialog(null, "Account updated successfully!");
//        txtFirstName.setEnabled(true);
//        txtLastName.setEnabled(true);
//        txtSSN.setEnabled(true);
//        txtLicenseNumber.setEnabled(true);
//        
//        txtHStreet.setEnabled(true);
//        txtHUnit.setEnabled(true);
//        txtHUnit.setEnabled(true);
//        txtHZip.setEnabled(true);
//        
//        txtWStreet.setEnabled(true);
//        txtWUnit.setEnabled(true);
//        txtWUnit.setEnabled(true);
//        txtWZip.setEnabled(true);
//        btnSave.setEnabled(true);
//        btnCreate.setEnabled(false);
        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtLastName.getText());
        person.setSSN(txtSSN.getText());
        person.setLicenseNumber(txtLicenseNumber.getText());
        person.getHomeAddress().sethStreet(txtHStreet.getText());
        person.getHomeAddress().sethUnit(txtHUnit.getText());
        person.getHomeAddress().sethCity(txtHCity.getText());
        person.getHomeAddress().sethZip(txtHZip.getText());
        person.getWorkAddress().setwStreet(txtWStreet.getText());
        person.getWorkAddress().setwUnit(txtWUnit.getText());
        person.getWorkAddress().setwCity(txtWCity.getText());
        person.getWorkAddress().setwZip(txtWZip.getText());
        
        JOptionPane.showMessageDialog(null, "Account updated successfully!");
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbWUnit;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHAddress1;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHStreet;
    private javax.swing.JLabel lblHUnit;
    private javax.swing.JLabel lblHZip;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWAddress;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWStreet;
    private javax.swing.JLabel lblWZip;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHCity;
    private javax.swing.JTextField txtHStreet;
    private javax.swing.JTextField txtHUnit;
    private javax.swing.JTextField txtHZip;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWCity;
    private javax.swing.JTextField txtWStreet;
    private javax.swing.JTextField txtWUnit;
    private javax.swing.JTextField txtWZip;
    // End of variables declaration//GEN-END:variables

    private void populatePerson() {
        txtFirstName.setText(this.person.getFirstName());
        txtLastName.setText(this.person.getLastName());
        txtSSN.setText(this.person.getSSN());
        txtLicenseNumber.setText(this.person.getLicenseNumber());
        txtHStreet.setText(this.person.getHomeAddress().gethStreet());
        txtHUnit.setText(this.person.getHomeAddress().gethUnit());
        txtHCity.setText(this.person.getHomeAddress().gethCity());
        txtHZip.setText(this.person.getHomeAddress().gethZip());
        txtWStreet.setText(this.person.getWorkAddress().getwStreet());
        txtWUnit.setText(this.person.getWorkAddress().getwUnit());
        txtWCity.setText(this.person.getWorkAddress().getwCity());
        txtWZip.setText(this.person.getWorkAddress().getwZip());
        
    }
}
