/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Akbulut
 */
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
    public List<Prescription> allPrescriptions() {
        List<Prescription> prescriptions = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(PrescriptionConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String patientsId = resultSet.getString("patients_id");
                String doctorsId = resultSet.getString("doctors_id");
                String nameOfMedicine = resultSet.getString("name_of_medicine");
                int doseMg = resultSet.getInt("dose_mg");
                int numberOfTablets = resultSet.getInt("number_of_tablets");
                int dailyDose = resultSet.getInt("daily_dose");
                String explanation = resultSet.getString("explanation");

                prescriptions.add(new Prescription(id, patientsId, doctorsId, nameOfMedicine, doseMg, numberOfTablets, dailyDose, explanation));
            }
            return prescriptions;
        } catch (SQLException e) {
            Logger.getLogger(PrescriptionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public List<Prescription> prescriptions(String id) {
        List<Prescription> prescriptions = new LinkedList<>();
        try {
            preparedStatement = connection.prepareStatement(PrescriptionConstants.PRESCRIPTION_SQL);
            preparedStatement.setString(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String patientsId = resultSet.getString("patients_id");
                String doctorsId = resultSet.getString("doctors_id");
                String nameOfMedicine = resultSet.getString("name_of_medicine");
                int doseMg = resultSet.getInt("dose_mg");
                int numberOfTablets = resultSet.getInt("number_of_tablets");
                int dailyDose = resultSet.getInt("daily_dose");
                String explanation = resultSet.getString("explanation");

                prescriptions.add(new Prescription(id, patientsId, doctorsId, nameOfMedicine, doseMg, numberOfTablets, dailyDose, explanation));
            }
            return prescriptions;
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
            preparedStatement.setString(1, prescription.getPatientsId());
            preparedStatement.setString(2, prescription.getDoctorsId());
            preparedStatement.setString(3, prescription.getNameOfMedicine());
            preparedStatement.setInt(4, prescription.getDoseMg());
            preparedStatement.setInt(5, prescription.getNumberOfTablets());
            preparedStatement.setInt(6, prescription.getDailyDose());
            preparedStatement.setString(7, prescription.getExplanation());
            preparedStatement.setString(8, prescription.getId());

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

}
