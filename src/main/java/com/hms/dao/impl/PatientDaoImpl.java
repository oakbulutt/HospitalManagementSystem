package com.hms.dao.impl;

import com.hms.constants.PatientConstants;
import com.hms.model.Patient;
import com.hms.util.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.hms.dao.PatientDao;

public class PatientDaoImpl implements PatientDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public PatientDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<Patient> allPatients() {
        List<Patient> patients = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(PatientConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String gender = resultSet.getString("gender");
                Date birthdate = resultSet.getDate("birthdate");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String anamnesis = resultSet.getString("anamnesis");
                String prescriptionId = resultSet.getString("prescription_id");

                patients.add(new Patient(id, name, surname, gender, birthdate, email, phone, anamnesis, prescriptionId));
            }
            return patients;
        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    @Override
    public List<String> patients(String id) {
        List<String> patients = new LinkedList<>();
        try {
            preparedStatement = connection.prepareStatement(PatientConstants.PATIENT_SQL);
            preparedStatement.setString(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                patients.add(name);
                patients.add(surname);
            }
            return patients;
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    @Override
    public void createPatient(Patient patient) {
        
        
        try {
            preparedStatement = connection.prepareStatement(PatientConstants.INSERT_SQL);
            preparedStatement.setString(1, patient.getId());
            preparedStatement.setString(2, patient.getName());
            preparedStatement.setString(3, patient.getSurname());
            preparedStatement.setString(4, patient.getGender());
            preparedStatement.setDate(5, patient.getBirthdate());
            preparedStatement.setString(6, patient.getEmail());
            preparedStatement.setString(7, patient.getPhone());
            preparedStatement.setString(8, patient.getAnamnesis());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updatePatient(Patient patient) {
        try {
            preparedStatement = connection.prepareStatement(PatientConstants.UPDATE_SQL);
            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getSurname());
            preparedStatement.setString(3, patient.getGender());
            preparedStatement.setDate(4, patient.getBirthdate());
            preparedStatement.setString(5, patient.getEmail());
            preparedStatement.setString(6, patient.getPhone());
            preparedStatement.setString(7, patient.getAnamnesis());
            preparedStatement.setString(8, patient.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deletePatient(String id) {
        try {
            preparedStatement = connection.prepareStatement(PatientConstants.DELETE_SQL);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
