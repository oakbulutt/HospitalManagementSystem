package com.hms.view.receptionist;

import com.hms.model.Appointment;
import com.hms.model.Doctor;
import com.hms.service.HMSService;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReceptionistAppointmentView extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    HMSService service = new HMSService();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public ReceptionistAppointmentView() {
        initComponents();
        model = (DefaultTableModel) receptionistAppointmentTable.getModel();
        showAppointment();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receptionistAppointmentViewAddButton = new javax.swing.JButton();
        receptionistAppointmentViewDeleteButton = new javax.swing.JButton();
        receptionistAppointmentViewUpdateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receptionistAppointmentTable = new javax.swing.JTable();
        receptionistAppointmentPatientIdLable = new javax.swing.JLabel();
        receptionistAppointmentPatientNameLabel = new javax.swing.JLabel();
        receptionistAppointmentPatientSurnameLabel = new javax.swing.JLabel();
        receptionistAppointmentPatientIdTextField = new javax.swing.JTextField();
        receptionistAppointmentPatientNameTextField = new javax.swing.JTextField();
        receptionistAppointmentPatientSurnameTextField = new javax.swing.JTextField();
        receptionistAppointmentDoctorIdLabel = new javax.swing.JLabel();
        receptionistAppointmentDoctorNameTextField = new javax.swing.JTextField();
        receptionistAppointmentDoctorNameLabel = new javax.swing.JLabel();
        receptionistAppointmentDoctorSurnameLabel = new javax.swing.JLabel();
        receptionistAppointmentDoctorSurnameTextField = new javax.swing.JTextField();
        receptionistAppointmentDoctorDepartmentLabel = new javax.swing.JLabel();
        receptionistAppointmentAppointmentDateLabel = new javax.swing.JLabel();
        receptionistAppointmentDateChooser = new com.toedter.calendar.JDateChooser();
        receptionistAppointmentDoctorDepartmentComboBox = new javax.swing.JComboBox<>();
        receptionistAppointmentIdLable = new javax.swing.JLabel();
        receptionistAppointmentIdTextField = new javax.swing.JTextField();
        receptionistAppointmentDoctorIdComboBox = new javax.swing.JComboBox<>();
        receptionistAppointmentClear = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Appointment");

        receptionistAppointmentViewAddButton.setText("Add");
        receptionistAppointmentViewAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistAppointmentViewAddButtonActionPerformed(evt);
            }
        });

        receptionistAppointmentViewDeleteButton.setText("Delete");
        receptionistAppointmentViewDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistAppointmentViewDeleteButtonActionPerformed(evt);
            }
        });

        receptionistAppointmentViewUpdateButton.setText("Update");
        receptionistAppointmentViewUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistAppointmentViewUpdateButtonActionPerformed(evt);
            }
        });

        receptionistAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A. ID", "P. ID", "P. Name", "P. Surname", "D. ID", "D. Name", "D. Surname", "Department", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        receptionistAppointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionistAppointmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(receptionistAppointmentTable);

        receptionistAppointmentPatientIdLable.setText("Patient ID                 :");

        receptionistAppointmentPatientNameLabel.setText("Patient Name            :");

        receptionistAppointmentPatientSurnameLabel.setText("Patient Surname       :");

        receptionistAppointmentPatientIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistAppointmentPatientIdTextFieldActionPerformed(evt);
            }
        });

        receptionistAppointmentPatientNameTextField.setEditable(false);

        receptionistAppointmentPatientSurnameTextField.setEditable(false);

        receptionistAppointmentDoctorIdLabel.setText("Doctor ID                 :");

        receptionistAppointmentDoctorNameTextField.setEditable(false);

        receptionistAppointmentDoctorNameLabel.setText("Doctor Name            :");

        receptionistAppointmentDoctorSurnameLabel.setText("Doctor Surname       :");

        receptionistAppointmentDoctorSurnameTextField.setEditable(false);

        receptionistAppointmentDoctorDepartmentLabel.setText("Doctor Department  :");

        receptionistAppointmentAppointmentDateLabel.setText("Appointment Date    :");

        receptionistAppointmentDateChooser.setDateFormatString("yyyy-MM-dd");

        receptionistAppointmentDoctorDepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Department", "DEP001 - Cardiology", "DEP002 - Neurology", "DEP003 - Physiotherapy", "DEP004 - Urology", "DEP005 - General Surgery", "DEP006 - Renal Unit", "DEP007 - Gynecology", "DEP008 - ENT", "DEP009 - Gastroenterology", "DEP010 - Orthopedics" }));
        receptionistAppointmentDoctorDepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistAppointmentDoctorDepartmentComboBoxActionPerformed(evt);
            }
        });

        receptionistAppointmentIdLable.setText("Appointment ID        :");

        receptionistAppointmentDoctorIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Doctor" }));
        receptionistAppointmentDoctorIdComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                receptionistAppointmentDoctorIdComboBoxItemStateChanged(evt);
            }
        });

        receptionistAppointmentClear.setText("Clear");
        receptionistAppointmentClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistAppointmentClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(receptionistAppointmentIdLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receptionistAppointmentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(receptionistAppointmentPatientSurnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(receptionistAppointmentPatientNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(receptionistAppointmentPatientIdLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(receptionistAppointmentAppointmentDateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(receptionistAppointmentPatientIdTextField)
                                    .addComponent(receptionistAppointmentPatientNameTextField)
                                    .addComponent(receptionistAppointmentPatientSurnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(receptionistAppointmentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(receptionistAppointmentDoctorNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receptionistAppointmentDoctorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(receptionistAppointmentDoctorIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receptionistAppointmentDoctorIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(receptionistAppointmentDoctorDepartmentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receptionistAppointmentDoctorDepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(receptionistAppointmentDoctorSurnameLabel)
                                    .addComponent(receptionistAppointmentViewAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(receptionistAppointmentClear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(receptionistAppointmentDoctorSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(receptionistAppointmentViewUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(receptionistAppointmentViewDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(8, 8, 8)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receptionistAppointmentIdLable)
                    .addComponent(receptionistAppointmentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receptionistAppointmentDoctorDepartmentLabel)
                    .addComponent(receptionistAppointmentDoctorDepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receptionistAppointmentPatientIdLable)
                    .addComponent(receptionistAppointmentPatientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receptionistAppointmentDoctorIdLabel)
                    .addComponent(receptionistAppointmentDoctorIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receptionistAppointmentPatientNameLabel)
                    .addComponent(receptionistAppointmentPatientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receptionistAppointmentDoctorNameLabel)
                    .addComponent(receptionistAppointmentDoctorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receptionistAppointmentPatientSurnameLabel)
                    .addComponent(receptionistAppointmentPatientSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receptionistAppointmentDoctorSurnameLabel)
                    .addComponent(receptionistAppointmentDoctorSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receptionistAppointmentAppointmentDateLabel)
                    .addComponent(receptionistAppointmentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(receptionistAppointmentViewAddButton)
                        .addComponent(receptionistAppointmentViewUpdateButton)
                        .addComponent(receptionistAppointmentViewDeleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receptionistAppointmentClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receptionistAppointmentViewAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistAppointmentViewAddButtonActionPerformed
        String id = receptionistAppointmentIdTextField.getText();
        String patientId = receptionistAppointmentPatientIdTextField.getText();
        String patientName = receptionistAppointmentPatientNameTextField.getText();
        String patientSurname = receptionistAppointmentPatientSurnameTextField.getText();
        Date appointmentDate = new java.sql.Date(receptionistAppointmentDateChooser.getDate().getTime());
        String doctorId = receptionistAppointmentDoctorIdComboBox.getSelectedItem().toString();
        String doctorName = receptionistAppointmentDoctorNameTextField.getText();
        String doctorSurname = receptionistAppointmentDoctorSurnameTextField.getText();
        String doctorDepartment = receptionistAppointmentDoctorDepartmentComboBox.getSelectedItem().toString();
        String appointmentStatus = "Scheduled";
        service.createAppointment(new Appointment(id, patientId, doctorId, appointmentDate, appointmentStatus));
        showAppointment();
        JOptionPane.showMessageDialog(this, "Appointment has been added");

        receptionistAppointmentIdTextField.setText("");
        receptionistAppointmentPatientIdTextField.setText("");
        receptionistAppointmentPatientNameTextField.setText("");
        receptionistAppointmentPatientSurnameTextField.setText("");
        receptionistAppointmentDoctorNameTextField.setText("");
        receptionistAppointmentDoctorSurnameTextField.setText("");
        receptionistAppointmentDoctorDepartmentComboBox.setSelectedItem("Choose Department");
        receptionistAppointmentDoctorIdComboBox.setSelectedItem("Choose Doctor");
        receptionistAppointmentDateChooser.setDate(null);
    }//GEN-LAST:event_receptionistAppointmentViewAddButtonActionPerformed

    private void receptionistAppointmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionistAppointmentTableMouseClicked
        int selectedRow = receptionistAppointmentTable.getSelectedRow();

        receptionistAppointmentIdTextField.setText(model.getValueAt(selectedRow, 0).toString());
        receptionistAppointmentPatientIdTextField.setText(model.getValueAt(selectedRow, 1).toString());
        receptionistAppointmentPatientNameTextField.setText(model.getValueAt(selectedRow, 2).toString());
        receptionistAppointmentPatientSurnameTextField.setText(model.getValueAt(selectedRow, 3).toString());
        receptionistAppointmentDoctorNameTextField.setText(model.getValueAt(selectedRow, 5).toString());
        receptionistAppointmentDoctorSurnameTextField.setText(model.getValueAt(selectedRow, 6).toString());
        receptionistAppointmentDoctorDepartmentComboBox.setSelectedItem(model.getValueAt(selectedRow, 7).toString());
        receptionistAppointmentDoctorIdComboBox.setSelectedItem(model.getValueAt(selectedRow, 4).toString());
        receptionistAppointmentDateChooser.setDate((Date) model.getValueAt(selectedRow, 8));

    }//GEN-LAST:event_receptionistAppointmentTableMouseClicked

    private void receptionistAppointmentViewUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistAppointmentViewUpdateButtonActionPerformed
        String id = receptionistAppointmentIdTextField.getText();
        String patientId = receptionistAppointmentPatientIdTextField.getText();
        String patientName = receptionistAppointmentPatientNameTextField.getText();
        String patientSurname = receptionistAppointmentPatientSurnameTextField.getText();
        Date appointmentDate = new java.sql.Date(receptionistAppointmentDateChooser.getDate().getTime());
        String doctorId = receptionistAppointmentDoctorIdComboBox.getSelectedItem().toString();
        String doctorName = receptionistAppointmentDoctorNameTextField.getText();
        String doctorSurname = receptionistAppointmentDoctorSurnameTextField.getText();
        String doctorDepartment = receptionistAppointmentDoctorDepartmentComboBox.getSelectedItem().toString();
        String appointmentStatus = "Scheduled";

        int selectedRow = receptionistAppointmentTable.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Appointment table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select the appointment which you want to update.");
            }
        } else {
            service.updateAppointment(new Appointment(id, patientId, doctorId, appointmentDate, appointmentStatus));
            showAppointment();
            JOptionPane.showMessageDialog(this, "Appointment has been updated!");

            receptionistAppointmentIdTextField.setText("");
            receptionistAppointmentPatientIdTextField.setText("");
            receptionistAppointmentPatientNameTextField.setText("");
            receptionistAppointmentPatientSurnameTextField.setText("");
            receptionistAppointmentDoctorNameTextField.setText("");
            receptionistAppointmentDoctorSurnameTextField.setText("");
            receptionistAppointmentDoctorDepartmentComboBox.setSelectedItem("Choose Department");
            receptionistAppointmentDoctorIdComboBox.setSelectedItem("Choose Doctor");
            receptionistAppointmentDateChooser.setDate(null);
        }

    }//GEN-LAST:event_receptionistAppointmentViewUpdateButtonActionPerformed

    private void receptionistAppointmentViewDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistAppointmentViewDeleteButtonActionPerformed
        String id = receptionistAppointmentIdTextField.getText();
        String patientId = receptionistAppointmentPatientIdTextField.getText();
        String patientName = receptionistAppointmentPatientNameTextField.getText();
        String patientSurname = receptionistAppointmentPatientSurnameTextField.getText();
        Date appointmentDate = new java.sql.Date(receptionistAppointmentDateChooser.getDate().getTime());
        String doctorId = receptionistAppointmentDoctorIdComboBox.getSelectedItem().toString();
        String doctorName = receptionistAppointmentDoctorNameTextField.getText();
        String doctorSurname = receptionistAppointmentDoctorSurnameTextField.getText();
        String doctorDepartment = receptionistAppointmentDoctorDepartmentComboBox.getSelectedItem().toString();

        int selectedRow = receptionistAppointmentTable.getSelectedRow();
        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Appointment table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select the appointment which you want to delete.");
            }
        } else {
            service.deleteAppointment(id);
            showAppointment();
            JOptionPane.showMessageDialog(this, "Appointment has been deleted!");

            receptionistAppointmentIdTextField.setText("");
            receptionistAppointmentPatientIdTextField.setText("");
            receptionistAppointmentPatientNameTextField.setText("");
            receptionistAppointmentPatientSurnameTextField.setText("");
            receptionistAppointmentDoctorNameTextField.setText("");
            receptionistAppointmentDoctorSurnameTextField.setText("");
            receptionistAppointmentDoctorDepartmentComboBox.setSelectedItem("Choose Department");
            receptionistAppointmentDoctorIdComboBox.setSelectedItem("Choose Doctor");
            receptionistAppointmentDateChooser.setDate(null);
        }
    }//GEN-LAST:event_receptionistAppointmentViewDeleteButtonActionPerformed

    private void receptionistAppointmentPatientIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistAppointmentPatientIdTextFieldActionPerformed
        String patientId = receptionistAppointmentPatientIdTextField.getText();

        List<String> patientInfo = new LinkedList<>();
        patientInfo = service.patients(patientId);

        receptionistAppointmentPatientNameTextField.setText(patientInfo.get(0));
        receptionistAppointmentPatientSurnameTextField.setText(patientInfo.get(1));
    }//GEN-LAST:event_receptionistAppointmentPatientIdTextFieldActionPerformed

    private void receptionistAppointmentDoctorDepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistAppointmentDoctorDepartmentComboBoxActionPerformed
        receptionistAppointmentDoctorIdComboBox.removeAllItems();
        receptionistAppointmentDoctorIdComboBox.addItem("Choose Doctor");

        String departmentId = receptionistAppointmentDoctorDepartmentComboBox.getSelectedItem().toString();
        departmentId = departmentId.substring(0, 6);

        List<String> doctorsId = new LinkedList<>();
        doctorsId = service.getDoctorsId(departmentId);

        for (String doctorId : doctorsId) {
            receptionistAppointmentDoctorIdComboBox.addItem(doctorId);
        }
    }//GEN-LAST:event_receptionistAppointmentDoctorDepartmentComboBoxActionPerformed

    private void receptionistAppointmentDoctorIdComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_receptionistAppointmentDoctorIdComboBoxItemStateChanged
        String placeholder = "Choose Doctor";
        final Object selectedItem = receptionistAppointmentDoctorIdComboBox.getSelectedItem();
        String doctorId = (String) selectedItem;
        if (selectedItem != null && !doctorId.equalsIgnoreCase(placeholder)) {
            Doctor doctor = service.getDoctor(doctorId);

            receptionistAppointmentDoctorNameTextField.setText(doctor.getName());
            receptionistAppointmentDoctorSurnameTextField.setText(doctor.getSurname());
        }
    }//GEN-LAST:event_receptionistAppointmentDoctorIdComboBoxItemStateChanged

    private void receptionistAppointmentClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistAppointmentClearActionPerformed
        // TODO add your handling code here:
        receptionistAppointmentIdTextField.setText("");
        receptionistAppointmentPatientIdTextField.setText("");
        receptionistAppointmentPatientNameTextField.setText("");
        receptionistAppointmentPatientSurnameTextField.setText("");
        receptionistAppointmentDoctorNameTextField.setText("");
        receptionistAppointmentDoctorSurnameTextField.setText("");
        receptionistAppointmentDoctorDepartmentComboBox.setSelectedItem("Choose Department");
        receptionistAppointmentDoctorIdComboBox.setSelectedItem("Choose Doctor");
        receptionistAppointmentDateChooser.setDate(null);
    }//GEN-LAST:event_receptionistAppointmentClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel receptionistAppointmentAppointmentDateLabel;
    private javax.swing.JButton receptionistAppointmentClear;
    private com.toedter.calendar.JDateChooser receptionistAppointmentDateChooser;
    private javax.swing.JComboBox<String> receptionistAppointmentDoctorDepartmentComboBox;
    private javax.swing.JLabel receptionistAppointmentDoctorDepartmentLabel;
    private javax.swing.JComboBox<String> receptionistAppointmentDoctorIdComboBox;
    private javax.swing.JLabel receptionistAppointmentDoctorIdLabel;
    private javax.swing.JLabel receptionistAppointmentDoctorNameLabel;
    private javax.swing.JTextField receptionistAppointmentDoctorNameTextField;
    private javax.swing.JLabel receptionistAppointmentDoctorSurnameLabel;
    private javax.swing.JTextField receptionistAppointmentDoctorSurnameTextField;
    private javax.swing.JLabel receptionistAppointmentIdLable;
    private javax.swing.JTextField receptionistAppointmentIdTextField;
    private javax.swing.JLabel receptionistAppointmentPatientIdLable;
    private javax.swing.JTextField receptionistAppointmentPatientIdTextField;
    private javax.swing.JLabel receptionistAppointmentPatientNameLabel;
    private javax.swing.JTextField receptionistAppointmentPatientNameTextField;
    private javax.swing.JLabel receptionistAppointmentPatientSurnameLabel;
    private javax.swing.JTextField receptionistAppointmentPatientSurnameTextField;
    private javax.swing.JTable receptionistAppointmentTable;
    private javax.swing.JButton receptionistAppointmentViewAddButton;
    private javax.swing.JButton receptionistAppointmentViewDeleteButton;
    private javax.swing.JButton receptionistAppointmentViewUpdateButton;
    // End of variables declaration//GEN-END:variables

    private void showAppointment() {
        model.setRowCount(0);
        List<Appointment> appointments = new LinkedList<>();

        appointments = service.showAppointments();

        if (appointments != null) {
            for (Appointment appointment : appointments) {
                Object[] willAdd = {
                    appointment.getId(), appointment.getPatientsId(),
                    appointment.getPatientsName(), appointment.getPatientsSurname(),
                    appointment.getDoctorsId(), appointment.getDoctorsName(),
                    appointment.getDoctorsSurname(), appointment.getDoctorsDepartment(),
                    appointment.getAppointmentDate(), appointment.getAppointmentStatus()
                };
                model.addRow(willAdd);
            }
        }
    }

}
