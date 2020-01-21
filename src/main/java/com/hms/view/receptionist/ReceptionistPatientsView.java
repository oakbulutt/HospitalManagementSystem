/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.view.receptionist;

import com.hms.view.admin.*;

/**
 *
 * @author domin
 */
public class ReceptionistPatientsView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdminPatientsView
     */
    public ReceptionistPatientsView() {
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

        receptionistPatientsSearchTextField = new javax.swing.JTextField();
        receptionistPatientsIdLabel = new javax.swing.JLabel();
        receptionistPatientsIdTextField = new javax.swing.JTextField();
        receptionistPatientsPhoneTextField = new javax.swing.JTextField();
        receptionistPatientsBirthdateTextField = new javax.swing.JTextField();
        receptionistPatientsEmailTextField = new javax.swing.JTextField();
        receptionistPatientsSurnameTextField = new javax.swing.JTextField();
        receptionistPatientsNameTextField = new javax.swing.JTextField();
        receptionistPatientsNameLabel = new javax.swing.JLabel();
        receptionistPatientsSurnameLabel = new javax.swing.JLabel();
        receptionistPatientsEmailLabel = new javax.swing.JLabel();
        receptionistPatientsPhoneLabel = new javax.swing.JLabel();
        receptionistPatientsBirthdateLabel = new javax.swing.JLabel();
        receptionistPatientsDeleteButton = new javax.swing.JButton();
        receptionistPatientsUpdateButton = new javax.swing.JButton();
        receptionistPatientsAddButton = new javax.swing.JButton();
        receptionistPatientsGenderComboBox = new javax.swing.JComboBox<>();
        receptionistPatientsGenderLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        receptionistPatientTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Patients");

        receptionistPatientsIdLabel.setText("ID                   :");

        receptionistPatientsNameLabel.setText("Name              :");

        receptionistPatientsSurnameLabel.setText("Surname         :");

        receptionistPatientsEmailLabel.setText("E-Mail             :");

        receptionistPatientsPhoneLabel.setText("Phone            :");

        receptionistPatientsBirthdateLabel.setText("Birthdate         :");

        receptionistPatientsDeleteButton.setText("Delete");

        receptionistPatientsUpdateButton.setText("Update");

        receptionistPatientsAddButton.setText("Add");

        receptionistPatientsGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        receptionistPatientsGenderLabel.setText("Gender           :");

        receptionistPatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Gender", "Birthdate", "E-mail", "Phone", "Anamnesis", "Prescription Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(receptionistPatientTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(receptionistPatientsSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(receptionistPatientsSurnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(receptionistPatientsNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptionistPatientsIdLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receptionistPatientsIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptionistPatientsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptionistPatientsSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(receptionistPatientsAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(receptionistPatientsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(receptionistPatientsDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(receptionistPatientsBirthdateLabel)
                                        .addGap(5, 5, 5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(receptionistPatientsGenderLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(receptionistPatientsGenderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(receptionistPatientsBirthdateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(receptionistPatientsEmailLabel)
                                        .addGap(3, 3, 3)
                                        .addComponent(receptionistPatientsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(receptionistPatientsPhoneLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(receptionistPatientsPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receptionistPatientsSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptionistPatientsIdLabel)
                            .addComponent(receptionistPatientsIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptionistPatientsGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptionistPatientsGenderLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptionistPatientsNameLabel)
                            .addComponent(receptionistPatientsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receptionistPatientsBirthdateLabel)
                            .addComponent(receptionistPatientsBirthdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptionistPatientsSurnameLabel)
                            .addComponent(receptionistPatientsSurnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptionistPatientsPhoneLabel)
                            .addComponent(receptionistPatientsPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptionistPatientsEmailLabel)
                            .addComponent(receptionistPatientsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(receptionistPatientsAddButton)
                            .addComponent(receptionistPatientsUpdateButton)
                            .addComponent(receptionistPatientsDeleteButton))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable receptionistPatientTable;
    private javax.swing.JButton receptionistPatientsAddButton;
    private javax.swing.JLabel receptionistPatientsBirthdateLabel;
    private javax.swing.JTextField receptionistPatientsBirthdateTextField;
    private javax.swing.JButton receptionistPatientsDeleteButton;
    private javax.swing.JLabel receptionistPatientsEmailLabel;
    private javax.swing.JTextField receptionistPatientsEmailTextField;
    private javax.swing.JComboBox<String> receptionistPatientsGenderComboBox;
    private javax.swing.JLabel receptionistPatientsGenderLabel;
    private javax.swing.JLabel receptionistPatientsIdLabel;
    private javax.swing.JTextField receptionistPatientsIdTextField;
    private javax.swing.JLabel receptionistPatientsNameLabel;
    private javax.swing.JTextField receptionistPatientsNameTextField;
    private javax.swing.JLabel receptionistPatientsPhoneLabel;
    private javax.swing.JTextField receptionistPatientsPhoneTextField;
    private javax.swing.JTextField receptionistPatientsSearchTextField;
    private javax.swing.JLabel receptionistPatientsSurnameLabel;
    private javax.swing.JTextField receptionistPatientsSurnameTextField;
    private javax.swing.JButton receptionistPatientsUpdateButton;
    // End of variables declaration//GEN-END:variables
}
