/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.view.doctor;

import com.hms.view.receptionist.*;

/**
 *
 * @author domin
 */
public class DoctorAppointmentView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReceptionistAppointmentView
     */
    public DoctorAppointmentView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorAppointmentViewAcceptButton = new javax.swing.JButton();
        doctorAppointmentViewDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorAppointmentViewTable = new javax.swing.JTable();
        doctorAppointmentViewPatientIdLable = new javax.swing.JLabel();
        doctorAppointmentViewPatientNameLabel = new javax.swing.JLabel();
        doctorAppointmentViewPatientSurnameLabel = new javax.swing.JLabel();
        doctorAppointmentViewPatientIdTextField = new javax.swing.JTextField();
        doctorAppointmentViewPatientNameTextField = new javax.swing.JTextField();
        doctorAppointmentViewPatientSurnameTextLabel = new javax.swing.JTextField();
        doctorAppointmentViewAppointmentDateLabel = new javax.swing.JLabel();
        doctorAppointmentViewAppointmentDateTextField = new javax.swing.JTextField();

        setTitle("Appointment");

        doctorAppointmentViewAcceptButton.setText("Accept Patient");
        doctorAppointmentViewAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorAppointmentViewAcceptButtonActionPerformed(evt);
            }
        });

        doctorAppointmentViewDeleteButton.setText("Delete Appointment");

        doctorAppointmentViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Patient Surname", "Doctor ID", "Doctor Name", "Doctor Surname", "Doctor Department", "Appointment Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorAppointmentViewTable);

        doctorAppointmentViewPatientIdLable.setText("Patient ID                 :");

        doctorAppointmentViewPatientNameLabel.setText("Patient Name            :");

        doctorAppointmentViewPatientSurnameLabel.setText("Patient Surname       :");

        doctorAppointmentViewAppointmentDateLabel.setText("Appointment Date    :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doctorAppointmentViewPatientIdLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doctorAppointmentViewPatientNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(doctorAppointmentViewPatientIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(doctorAppointmentViewPatientNameTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doctorAppointmentViewAcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(doctorAppointmentViewDeleteButton)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doctorAppointmentViewPatientSurnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorAppointmentViewPatientSurnameTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(doctorAppointmentViewAppointmentDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorAppointmentViewAppointmentDateTextField)))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAppointmentViewPatientIdLable)
                    .addComponent(doctorAppointmentViewPatientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorAppointmentViewPatientSurnameLabel)
                    .addComponent(doctorAppointmentViewPatientSurnameTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAppointmentViewPatientNameLabel)
                    .addComponent(doctorAppointmentViewPatientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorAppointmentViewAppointmentDateLabel)
                    .addComponent(doctorAppointmentViewAppointmentDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorAppointmentViewAcceptButton)
                    .addComponent(doctorAppointmentViewDeleteButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorAppointmentViewAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorAppointmentViewAcceptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorAppointmentViewAcceptButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doctorAppointmentViewAcceptButton;
    private javax.swing.JLabel doctorAppointmentViewAppointmentDateLabel;
    private javax.swing.JTextField doctorAppointmentViewAppointmentDateTextField;
    private javax.swing.JButton doctorAppointmentViewDeleteButton;
    private javax.swing.JLabel doctorAppointmentViewPatientIdLable;
    private javax.swing.JTextField doctorAppointmentViewPatientIdTextField;
    private javax.swing.JLabel doctorAppointmentViewPatientNameLabel;
    private javax.swing.JTextField doctorAppointmentViewPatientNameTextField;
    private javax.swing.JLabel doctorAppointmentViewPatientSurnameLabel;
    private javax.swing.JTextField doctorAppointmentViewPatientSurnameTextLabel;
    private javax.swing.JTable doctorAppointmentViewTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
