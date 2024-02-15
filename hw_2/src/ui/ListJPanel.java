/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author hyZHO
 */
public class ListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListJPanel
     */
    PersonDirectory personDirectory;
    Person person;
    private JPanel userProcessContainer;
    
    public ListJPanel(JPanel userProcessContainer,PersonDirectory personDirectory) {
        initComponents();
        this.person = person;
        this.personDirectory = personDirectory;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }
    
    public ListJPanel(JPanel userProcessContainer,Person person, PersonDirectory personDirectory) {
        initComponents();
        this.person = person;
        this.personDirectory = personDirectory;
        this.userProcessContainer = userProcessContainer;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("List Person");

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home Zip Code", "Work City", "Work Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersons);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView)
                            .addGap(38, 38, 38)
                            .addComponent(btnDelete))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//
//        int selectedRowIndex = tblPersons.getSelectedRow();
//
//        if (selectedRowIndex<0) {
//            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
//        Person selectedPersons = (Person) model.getValueAt(selectedRowIndex, 0);
//
//        person.deletePersons(selectedPersons);
//
//        JOptionPane.showMessageDialog(this, "Person deleted.");
//
//        populateTable();

        int selectedRow = tblPersons.getSelectedRow();
        if(selectedRow >= 0){//有选中
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the account details?", "Warning", dialogButton);//warning是提示框/button的类型
            if(dialogResult == JOptionPane.YES_OPTION){
                Person person = (Person) tblPersons.getValueAt(selectedRow, 0);//获取选中行的对象，才知道在directory中删除哪个。（Account）是设置类型
                this.personDirectory.deletePersons(person);//this=class里的
                populateTable();//想要tbl刷新需要像这样重新调用
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

//        int selectedRowIndex = tblPersons.getSelectedRow();
//
//        if (selectedRowIndex<0) {
//            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
//            return;
//        }
//
//        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
//        Person selectedPersons = (Person) model.getValueAt(selectedRowIndex, 0);

        int selectedRow = tblPersons.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Person person = (Person)tblPersons.getValueAt(selectedRow, 0);
            AddJPanel panel = new AddJPanel(userProcessContainer, person, personDirectory);
            userProcessContainer.add("AddJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
//        txtFirstName.setText(String.valueOf(selectedPersons.getFirstName()));//convert any types into string
//        txtAge.setText(String.valueOf(selectedPersons.getAge()));
//        txtGender.setText(String.valueOf(selectedPersons.getGender()));
//        txtJob.setText(String.valueOf(selectedPersons.getJob()));
//        txtPhone.setText(String.valueOf(selectedPersons.getPhone()));

    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPersons;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();//table model is used to manipulate model content
        model.setRowCount(0);
        
        for (Person p : personDirectory.getPerson()){
            
            Object[] row = new Object[6];
            row[0] = p;//第一个不要用p. 这样才能拿到全部的对象
            row[1] = p.getLastName();
            row[2] = p.getHomeAddress().gethCity();
            row[3] = p.getHomeAddress().gethZip();
            row[4] = p.getWorkAddress().getwCity();
            row[5] = p.getWorkAddress().getwZip();
            
            model.addRow(row);
        }
    }
}
