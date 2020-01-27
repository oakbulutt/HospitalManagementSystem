
package com.hms.dao.impl;

import com.hms.constants.PrescriptionConstants;
import com.hms.dao.PrescriptionDao;
import com.hms.model.Prescription;
import com.hms.util.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrescriptionDaoImpl implements PrescriptionDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public PrescriptionDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<String> prescription(String id) {
        List<String> prescription = new LinkedList<>();
        try {
            preparedStatement = connection.prepareStatement(PrescriptionConstants.PRESCRIPTION_SQL);
            preparedStatement.setString(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String patientId = resultSet.getString("patients_id");
                String doctorId = resultSet.getString("doctors_id");
                String nameOfMedicine = resultSet.getString("name_of_medicine");
                int doseMg = resultSet.getInt("dose_mg");
                int numberOfTablets = resultSet.getInt("number_of_tablets");
                int dailyDose = resultSet.getInt("daily_dose");
                String explanation = resultSet.getString("explanation");

                prescription.add(patientId);
                prescription.add(doctorId);
                prescription.add(nameOfMedicine);
                prescription.add(Integer.toString(doseMg));
                prescription.add(Integer.toString(numberOfTablets));
                prescription.add(Integer.toString(dailyDose));
                prescription.add(explanation);
            }
            return prescription;
        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public void createPrescription(Prescription prescription) {

        try {
            preparedStatement = connection.prepareStatement(PrescriptionConstants.INSERT_SQL);
            preparedStatement.setString(1, prescription.getId());
            preparedStatement.setString(2, prescription.getPatientsId());
            preparedStatement.setString(3, prescription.getDoctorsId());
            preparedStatement.setString(4, prescription.getNameOfMedicine());
            preparedStatement.setInt(5, prescription.getDoseMg());
            preparedStatement.setInt(6, prescription.getNumberOfTablets());
            preparedStatement.setInt(7, prescription.getDailyDose());
            preparedStatement.setString(8, prescription.getExplanation());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updatePrescription(Prescription prescription) {
        try {
            preparedStatement = connection.prepareStatement(PrescriptionConstants.UPDATE_SQL);
            preparedStatement.setString(1, prescription.getDoctorsId());
            preparedStatement.setString(2, prescription.getNameOfMedicine());
            preparedStatement.setInt(3, prescription.getDoseMg());
            preparedStatement.setInt(4, prescription.getNumberOfTablets());
            preparedStatement.setInt(5, prescription.getDailyDose());
            preparedStatement.setString(6, prescription.getExplanation());
            preparedStatement.setString(7, prescription.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deletePrescription(String id) {
        try {
            preparedStatement = connection.prepareStatement(PrescriptionConstants.DELETE_SQL);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String lastId() {
        String lastId = "";
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(PrescriptionConstants.LAST_ID_SQL);
            if (resultSet.next()) {
                lastId = resultSet.getString("last_id");
            }
            return lastId;
        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
