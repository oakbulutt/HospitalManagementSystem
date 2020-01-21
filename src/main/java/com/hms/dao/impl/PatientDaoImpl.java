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
import java.util.Date;
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
                Date birthdate = resultSet.getDate("date");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");

                patients.add(new Patient(id, name, surname, gender, birthdate, email, phone));
            }
            return patients;
        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
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
            preparedStatement.setDate(5, (java.sql.Date) patient.getBirthdate());
            preparedStatement.setString(6, patient.getEmail());
            preparedStatement.setString(7, patient.getPhone());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(PatientDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updatePatient(Patient patient) {
        try {
            preparedStatement = connection.prepareStatement(PatientConstants.INSERT_SQL);
            preparedStatement.setString(1, patient.getName());
            preparedStatement.setString(2, patient.getSurname());
            preparedStatement.setString(3, patient.getGender());
            preparedStatement.setDate(4, (java.sql.Date) patient.getBirthdate());
            preparedStatement.setString(5, patient.getEmail());
            preparedStatement.setString(6, patient.getPhone());
            preparedStatement.setString(7, patient.getId());

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
