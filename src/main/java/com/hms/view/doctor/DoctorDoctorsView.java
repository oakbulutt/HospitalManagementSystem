
package com.hms.view.doctor;

import com.hms.model.Doctor;
import com.hms.service.HMSService;
import java.util.LinkedList;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DoctorDoctorsView extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    HMSService service = new HMSService();

    public DoctorDoctorsView() {
        initComponents();
        model = (DefaultTableModel) doctorDoctorsTable.getModel();
        showDoctor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorDoctorsSearchTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        doctorDoctorsTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Doctors");

        doctorDoctorsSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                doctorDoctorsSearchTextFieldKeyReleased(evt);
            }
        });

        doctorDoctorsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(doctorDoctorsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doctorDoctorsSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorDoctorsSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorDoctorsSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctorDoctorsSearchTextFieldKeyReleased
        String search = doctorDoctorsSearchTextField.getText();
        dinamicSearch(search);
    }//GEN-LAST:event_doctorDoctorsSearchTextFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doctorDoctorsSearchTextField;
    private javax.swing.JTable doctorDoctorsTable;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void dinamicSearch(String search) {
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<>(model);

        doctorDoctorsTable.setRowSorter(tableRowSorter);

        tableRowSorter.setRowFilter(RowFilter.regexFilter(search));
    }

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
}
