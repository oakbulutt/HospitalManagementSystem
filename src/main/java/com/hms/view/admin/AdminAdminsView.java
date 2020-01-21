/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.view.admin;

import com.hms.model.Admin;
import com.hms.service.HMSService;
import java.util.LinkedList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author domin
 */
public class AdminAdminsView extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    HMSService service = new HMSService();

    /**
     * Creates new form AdminsView
     */
    public AdminAdminsView() {
        initComponents();
        model = (DefaultTableModel) adminAdminsTable.getModel();
        showAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        adminAdminsTable = new javax.swing.JTable();
        adminAdminsSearchTextField = new javax.swing.JTextField();
        adminAdminsIdLabel = new javax.swing.JLabel();
        adminAdminsNameLabel = new javax.swing.JLabel();
        adminAdminsSurnameLabel = new javax.swing.JLabel();
        adminAdminsTitleLabel = new javax.swing.JLabel();
        adminAdminsIdTextField = new javax.swing.JTextField();
        adminAdminsNameTextField = new javax.swing.JTextField();
        adminAdminsSurnameTextField = new javax.swing.JTextField();
        adminAdminsTitleTextField = new javax.swing.JTextField();
        adminAdminsEmailLabel = new javax.swing.JLabel();
        adminAdminsPhoneLabel = new javax.swing.JLabel();
        adminAdminsDepartmentLabel = new javax.swing.JLabel();
        adminAdminsDepartmentTextField = new javax.swing.JTextField();
        adminAdminsPhoneTextField = new javax.swing.JTextField();
        adminAdminsEmailTextField = new javax.swing.JTextField();
        adminAdminsAddButton = new javax.swing.JButton();
        adminAdminsUpdateButton = new javax.swing.JButton();
        adminAdminsDeleteButton = new javax.swing.JButton();
        adminAdminsMessageLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Admins");

        adminAdminsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Title", "E-mail", "Phone", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminAdminsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminAdminsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(adminAdminsTable);

        adminAdminsSearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAdminsSearchTextFieldActionPerformed(evt);
            }
        });
        adminAdminsSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adminAdminsSearchTextFieldKeyReleased(evt);
            }
        });

        adminAdminsIdLabel.setText("ID                  :");

        adminAdminsNameLabel.setText("Name             :");

        adminAdminsSurnameLabel.setText("Surname        :");

        adminAdminsTitleLabel.setText("Title                 :");

        adminAdminsEmailLabel.setText("E-Mail              :");

        adminAdminsPhoneLabel.setText("Phone            :");

        adminAdminsDepartmentLabel.setText("Department    :");

        adminAdminsAddButton.setText("Add");
        adminAdminsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAdminsAddButtonActionPerformed(evt);
            }
        });

        adminAdminsUpdateButton.setText("Update");
        adminAdminsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAdminsUpdateButtonActionPerformed(evt);
            }
        });

        adminAdminsDeleteButton.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(adminAdminsIdLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(adminAdminsNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminAdminsSurnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminAdminsIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminAdminsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminAdminsEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminAdminsTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(adminAdminsSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminAdminsTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAdminsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAdminsAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminAdminsDepartmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminAdminsPhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminAdminsDepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminAdminsPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminAdminsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(adminAdminsDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addComponent(jScrollPane2)
                    .addComponent(adminAdminsSearchTextField)
                    .addComponent(adminAdminsMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminAdminsSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminAdminsIdLabel)
                            .addComponent(adminAdminsIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminAdminsSurnameLabel)
                            .addComponent(adminAdminsSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminAdminsTitleLabel)
                            .addComponent(adminAdminsTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAdminsPhoneLabel)
                            .addComponent(adminAdminsPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminAdminsEmailLabel)
                            .addComponent(adminAdminsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAdminsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminAdminsNameLabel)
                            .addComponent(adminAdminsDepartmentLabel)
                            .addComponent(adminAdminsDepartmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminAdminsAddButton)
                            .addComponent(adminAdminsUpdateButton)
                            .addComponent(adminAdminsDeleteButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminAdminsMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamicSearch(String search) {
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);

        adminAdminsTable.setRowSorter(tableRowSorter);

        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }
    private void adminAdminsSearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAdminsSearchTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_adminAdminsSearchTextFieldActionPerformed

    private void adminAdminsSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminAdminsSearchTextFieldKeyReleased
        String search = adminAdminsSearchTextField.getText();
        dinamicSearch(search);
    }//GEN-LAST:event_adminAdminsSearchTextFieldKeyReleased

    private void adminAdminsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAdminsAddButtonActionPerformed
        String id = adminAdminsIdTextField.getText();
        String name = adminAdminsNameTextField.getText();
        String surname = adminAdminsSurnameTextField.getText();
        String title = adminAdminsTitleTextField.getText();
        String email = adminAdminsEmailTextField.getText();
        String phone = adminAdminsPhoneTextField.getText();
        String department = adminAdminsDepartmentTextField.getText();

        Admin admin = new Admin(id, name, surname, title, email, phone, department);
        service.createAdmin(admin);
    }//GEN-LAST:event_adminAdminsAddButtonActionPerformed

    private void adminAdminsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAdminsUpdateButtonActionPerformed
        adminAdminsMessageLabel.setText("");
        String id = adminAdminsIdTextField.getText();
        String name = adminAdminsNameTextField.getText();
        String surname = adminAdminsSurnameTextField.getText();
        String title = adminAdminsTitleTextField.getText();
        String email = adminAdminsEmailTextField.getText();
        String phone = adminAdminsPhoneTextField.getText();
        String department = adminAdminsDepartmentTextField.getText();

        int selectedRow = adminAdminsTable.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                adminAdminsMessageLabel.setText("Employee table is empty.");
            } else {
                adminAdminsMessageLabel.setText("Please select the employee who you want to update employee data.");
            }
        } else {
            service.updateAdmin(new Admin(id, name, surname, title, email, phone, department));
            showAdmin();
            adminAdminsMessageLabel.setText("Employee updated!");
        }
    }//GEN-LAST:event_adminAdminsUpdateButtonActionPerformed

    private void adminAdminsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminAdminsTableMouseClicked
        int selectedRow = adminAdminsTable.getSelectedRow();

        adminAdminsIdTextField.setText(model.getValueAt(selectedRow, 0).toString());
        adminAdminsNameTextField.setText(model.getValueAt(selectedRow, 1).toString());
        adminAdminsSurnameTextField.setText(model.getValueAt(selectedRow, 2).toString());
        adminAdminsTitleTextField.setText(model.getValueAt(selectedRow, 3).toString());
        adminAdminsEmailTextField.setText(model.getValueAt(selectedRow, 4).toString());
        adminAdminsPhoneTextField.setText(model.getValueAt(selectedRow, 5).toString());
        adminAdminsDepartmentTextField.setText(model.getValueAt(selectedRow, 6).toString());


    }//GEN-LAST:event_adminAdminsTableMouseClicked

    public void showAdmin() {
        model.setRowCount(0);
        List<Admin> admins = new LinkedList<>();

        admins = service.showAllAdmins();

        if (admins != null) {
            for (Admin admin : admins) {
                Object[] willAdd = {
                    admin.getId(), admin.getName(),
                    admin.getSurname(), admin.getTitle(),
                    admin.getEmail(), admin.getPhone(),
                    admin.getDepartment()
                };
                model.addRow(willAdd);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminAdminsAddButton;
    private javax.swing.JButton adminAdminsDeleteButton;
    private javax.swing.JLabel adminAdminsDepartmentLabel;
    private javax.swing.JTextField adminAdminsDepartmentTextField;
    private javax.swing.JLabel adminAdminsEmailLabel;
    private javax.swing.JTextField adminAdminsEmailTextField;
    private javax.swing.JLabel adminAdminsIdLabel;
    private javax.swing.JTextField adminAdminsIdTextField;
    private javax.swing.JLabel adminAdminsMessageLabel;
    private javax.swing.JLabel adminAdminsNameLabel;
    private javax.swing.JTextField adminAdminsNameTextField;
    private javax.swing.JLabel adminAdminsPhoneLabel;
    private javax.swing.JTextField adminAdminsPhoneTextField;
    private javax.swing.JTextField adminAdminsSearchTextField;
    private javax.swing.JLabel adminAdminsSurnameLabel;
    private javax.swing.JTextField adminAdminsSurnameTextField;
    private javax.swing.JTable adminAdminsTable;
    private javax.swing.JLabel adminAdminsTitleLabel;
    private javax.swing.JTextField adminAdminsTitleTextField;
    private javax.swing.JButton adminAdminsUpdateButton;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
