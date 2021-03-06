package com.hms.view.admin;

import com.hms.model.Doctor;
import com.hms.service.HMSService;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AdminDoctorsView extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    HMSService service = new HMSService();

    public AdminDoctorsView() {
        initComponents();
        model = (DefaultTableModel) adminDoctorsTable.getModel();
        showDoctor();
        fillDepartmentComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminDoctorsSearchTextField = new javax.swing.JTextField();
        adminDoctorsIdLabel = new javax.swing.JLabel();
        adminDoctorsIdTextField = new javax.swing.JTextField();
        adminDoctorsTitleTextField = new javax.swing.JTextField();
        adminDoctorsPhoneTextField = new javax.swing.JTextField();
        adminDoctorsEmailTextField = new javax.swing.JTextField();
        adminDoctorsSurnameTextField = new javax.swing.JTextField();
        adminDoctorsNameTextField = new javax.swing.JTextField();
        adminDoctorsNameLabel = new javax.swing.JLabel();
        adminDoctorsSurnameLabel = new javax.swing.JLabel();
        adminDoctorsEmailLabel = new javax.swing.JLabel();
        adminDoctorsTitleLabel = new javax.swing.JLabel();
        adminDoctorsPhoneLabel = new javax.swing.JLabel();
        adminDoctorsDepartmentLabel = new javax.swing.JLabel();
        adminDoctorsDeleteButton = new javax.swing.JButton();
        adminDoctorsUpdateButton = new javax.swing.JButton();
        adminDoctorsAddButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        adminDoctorsTable = new javax.swing.JTable();
        adminDoctorsDepartmentComboBox = new javax.swing.JComboBox<>();
        adminDoctorsClear = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Doctors");

        adminDoctorsSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adminDoctorsSearchTextFieldKeyReleased(evt);
            }
        });

        adminDoctorsIdLabel.setText("ID                   :");

        adminDoctorsNameLabel.setText("Name              :");

        adminDoctorsSurnameLabel.setText("Surname         :");

        adminDoctorsEmailLabel.setText("E-Mail             :");

        adminDoctorsTitleLabel.setText("Title                :");

        adminDoctorsPhoneLabel.setText("Phone            :");

        adminDoctorsDepartmentLabel.setText("Department   :");

        adminDoctorsDeleteButton.setText("Delete");
        adminDoctorsDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDoctorsDeleteButtonActionPerformed(evt);
            }
        });

        adminDoctorsUpdateButton.setText("Update");
        adminDoctorsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDoctorsUpdateButtonActionPerformed(evt);
            }
        });

        adminDoctorsAddButton.setText("Add");
        adminDoctorsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDoctorsAddButtonActionPerformed(evt);
            }
        });

        adminDoctorsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        adminDoctorsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDoctorsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(adminDoctorsTable);

        adminDoctorsDepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Department" }));

        adminDoctorsClear.setText("Clear");
        adminDoctorsClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDoctorsClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(adminDoctorsSearchTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminDoctorsIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminDoctorsNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(adminDoctorsSurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminDoctorsIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminDoctorsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminDoctorsSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminDoctorsTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminDoctorsEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminDoctorsTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminDoctorsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adminDoctorsPhoneLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adminDoctorsPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adminDoctorsDepartmentLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(adminDoctorsDepartmentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminDoctorsAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adminDoctorsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adminDoctorsDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adminDoctorsClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminDoctorsSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminDoctorsIdLabel)
                            .addComponent(adminDoctorsIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminDoctorsNameLabel)
                            .addComponent(adminDoctorsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminDoctorsSurnameLabel)
                            .addComponent(adminDoctorsSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminDoctorsPhoneLabel)
                                    .addComponent(adminDoctorsPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminDoctorsDepartmentLabel)
                                    .addComponent(adminDoctorsDepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminDoctorsTitleLabel)
                                    .addComponent(adminDoctorsTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminDoctorsEmailLabel)
                                    .addComponent(adminDoctorsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminDoctorsAddButton)
                            .addComponent(adminDoctorsUpdateButton)
                            .addComponent(adminDoctorsDeleteButton)
                            .addComponent(adminDoctorsClear))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminDoctorsSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminDoctorsSearchTextFieldKeyReleased
        String search = adminDoctorsSearchTextField.getText();
        dynamicSearch(search);
    }//GEN-LAST:event_adminDoctorsSearchTextFieldKeyReleased

    private void adminDoctorsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDoctorsTableMouseClicked
        int selectedRow = adminDoctorsTable.getSelectedRow();

        adminDoctorsIdTextField.setText(model.getValueAt(selectedRow, 0).toString());
        adminDoctorsNameTextField.setText(model.getValueAt(selectedRow, 1).toString());
        adminDoctorsSurnameTextField.setText(model.getValueAt(selectedRow, 2).toString());
        adminDoctorsTitleTextField.setText(model.getValueAt(selectedRow, 3).toString());
        adminDoctorsEmailTextField.setText(model.getValueAt(selectedRow, 4).toString());
        adminDoctorsPhoneTextField.setText(model.getValueAt(selectedRow, 5).toString());
        adminDoctorsDepartmentComboBox.setSelectedItem(model.getValueAt(selectedRow, 6).toString());
    }//GEN-LAST:event_adminDoctorsTableMouseClicked

    private void adminDoctorsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDoctorsAddButtonActionPerformed
        String id = adminDoctorsIdTextField.getText();
        String name = adminDoctorsNameTextField.getText();
        String surname = adminDoctorsSurnameTextField.getText();
        String title = adminDoctorsTitleTextField.getText();
        String email = adminDoctorsEmailTextField.getText();
        String phone = adminDoctorsPhoneTextField.getText();
        String departmentsId = adminDoctorsDepartmentComboBox.getSelectedItem().toString();
        String usersId = id;

        Doctor doctor = new Doctor(id, name, surname, title, email, phone, departmentsId, usersId);
        service.createDoctor(doctor);

        showDoctor();
        JOptionPane.showMessageDialog(this, "New Doctor has been Added!");

        adminDoctorsIdTextField.setText("");
        adminDoctorsNameTextField.setText("");
        adminDoctorsSurnameTextField.setText("");
        adminDoctorsTitleTextField.setText("");
        adminDoctorsEmailTextField.setText("");
        adminDoctorsPhoneTextField.setText("");
        adminDoctorsDepartmentComboBox.setSelectedItem("Choose Department");
    }//GEN-LAST:event_adminDoctorsAddButtonActionPerformed

    private void adminDoctorsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDoctorsUpdateButtonActionPerformed
        String id = adminDoctorsIdTextField.getText();
        String name = adminDoctorsNameTextField.getText();
        String surname = adminDoctorsSurnameTextField.getText();
        String title = adminDoctorsTitleTextField.getText();
        String email = adminDoctorsEmailTextField.getText();
        String phone = adminDoctorsPhoneTextField.getText();
        String departmentsId = adminDoctorsDepartmentComboBox.getSelectedItem().toString();
        String usersId = id;

        Doctor doctor = new Doctor(id, name, surname, title, email, phone, departmentsId, usersId);
        service.updateDoctor(doctor);

        showDoctor();
        JOptionPane.showMessageDialog(this, "Doctor has been Uptaded!");

        adminDoctorsIdTextField.setText("");
        adminDoctorsNameTextField.setText("");
        adminDoctorsSurnameTextField.setText("");
        adminDoctorsTitleTextField.setText("");
        adminDoctorsEmailTextField.setText("");
        adminDoctorsPhoneTextField.setText("");
        adminDoctorsDepartmentComboBox.setSelectedItem("Choose Department");
    }//GEN-LAST:event_adminDoctorsUpdateButtonActionPerformed

    private void adminDoctorsDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDoctorsDeleteButtonActionPerformed
        String id = adminDoctorsIdTextField.getText();
        String name = adminDoctorsNameTextField.getText();
        String surname = adminDoctorsSurnameTextField.getText();
        String title = adminDoctorsTitleTextField.getText();
        String email = adminDoctorsEmailTextField.getText();
        String phone = adminDoctorsPhoneTextField.getText();
        String departmentId = adminDoctorsDepartmentComboBox.getSelectedItem().toString();

        int selectedRow = adminDoctorsTable.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Doctor table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select the doctor who you want to delete.");
            }
        } else {
            service.deleteDoctor(id);
            showDoctor();
            JOptionPane.showMessageDialog(this, "Doctor has been deleted!");

            adminDoctorsIdTextField.setText("");
            adminDoctorsNameTextField.setText("");
            adminDoctorsSurnameTextField.setText("");
            adminDoctorsTitleTextField.setText("");
            adminDoctorsEmailTextField.setText("");
            adminDoctorsPhoneTextField.setText("");
            adminDoctorsDepartmentComboBox.setSelectedItem("Choose Department");
        }
    }//GEN-LAST:event_adminDoctorsDeleteButtonActionPerformed

    private void adminDoctorsClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDoctorsClearActionPerformed
        adminDoctorsIdTextField.setText("");
        adminDoctorsNameTextField.setText("");
        adminDoctorsSurnameTextField.setText("");
        adminDoctorsTitleTextField.setText("");
        adminDoctorsEmailTextField.setText("");
        adminDoctorsPhoneTextField.setText("");
        adminDoctorsDepartmentComboBox.setSelectedItem("Choose Department");
    }//GEN-LAST:event_adminDoctorsClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminDoctorsAddButton;
    private javax.swing.JButton adminDoctorsClear;
    private javax.swing.JButton adminDoctorsDeleteButton;
    private javax.swing.JComboBox<String> adminDoctorsDepartmentComboBox;
    private javax.swing.JLabel adminDoctorsDepartmentLabel;
    private javax.swing.JLabel adminDoctorsEmailLabel;
    private javax.swing.JTextField adminDoctorsEmailTextField;
    private javax.swing.JLabel adminDoctorsIdLabel;
    private javax.swing.JTextField adminDoctorsIdTextField;
    private javax.swing.JLabel adminDoctorsNameLabel;
    private javax.swing.JTextField adminDoctorsNameTextField;
    private javax.swing.JLabel adminDoctorsPhoneLabel;
    private javax.swing.JTextField adminDoctorsPhoneTextField;
    private javax.swing.JTextField adminDoctorsSearchTextField;
    private javax.swing.JLabel adminDoctorsSurnameLabel;
    private javax.swing.JTextField adminDoctorsSurnameTextField;
    private javax.swing.JTable adminDoctorsTable;
    private javax.swing.JLabel adminDoctorsTitleLabel;
    private javax.swing.JTextField adminDoctorsTitleTextField;
    private javax.swing.JButton adminDoctorsUpdateButton;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void showDoctor() {
        model.setRowCount(0);
        List<Doctor> doctors = new LinkedList<>();

        doctors = service.showDoctors();

        if (doctors != null) {
            for (Doctor doctor : doctors) {
                Object[] willAdd = {
                    doctor.getId(), doctor.getName(),
                    doctor.getSurname(), doctor.getTitle(),
                    doctor.getEmail(), doctor.getPhone(),
                    doctor.getDepartmentsId()
                };
                model.addRow(willAdd);
            }
        }
    }

    private void dynamicSearch(String search) {
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);

        adminDoctorsTable.setRowSorter(tableRowSorter);

        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }

    public void fillDepartmentComboBox() {
        List<String> departmentsId = new LinkedList<>();
        departmentsId = service.departmentsId();

        for (String departmentId : departmentsId) {
            adminDoctorsDepartmentComboBox.addItem(departmentId);

        }
    }
}
