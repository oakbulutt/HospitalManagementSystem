package com.hms.dao.impl;

import com.hms.constants.DoctorConstants;
import com.hms.model.Doctor;
import com.hms.util.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.hms.dao.DoctorDao;

public class DoctorDaoImpl implements DoctorDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public DoctorDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<Doctor> allDoctors() {
        List<Doctor> doctors = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DoctorConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String title = resultSet.getString("title");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String departmentsId = resultSet.getString("departments_id");
                String usersId = resultSet.getString("users_id");

                doctors.add(new Doctor(id, name, surname, title, email, phone, departmentsId, usersId));
            }
            return doctors;
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public List<String> doctors(String id) {
        List<String> doctors = new LinkedList<>();
        try {
            preparedStatement = connection.prepareStatement(DoctorConstants.DOCTOR_SQL);
            preparedStatement.setString(1, id);
            
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String title = resultSet.getString("title");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String departmentsId = resultSet.getString("departments_id");
                String usersId = resultSet.getString("users_id");
                
                doctors.add(name);
                doctors.add(surname);
                doctors.add(title);
                doctors.add(email);
                doctors.add(phone);
                doctors.add(departmentsId);
            }
            return doctors;
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public void createDoctor(Doctor doctor) {
        try {
            preparedStatement = connection.prepareStatement(DoctorConstants.INSERT_SQL);
            preparedStatement.setString(1, doctor.getId());
            preparedStatement.setString(2, doctor.getName());
            preparedStatement.setString(3, doctor.getSurname());
            preparedStatement.setString(4, doctor.getTitle());
            preparedStatement.setString(5, doctor.getEmail());
            preparedStatement.setString(6, doctor.getPhone());
            preparedStatement.setString(7, doctor.getDepartmentsId());
            preparedStatement.setString(8, doctor.getUsersId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        String userId = doctor.getId();
        try {
            preparedStatement = connection.prepareStatement(DoctorConstants.UPDATE_SQL);
            preparedStatement.setString(1, doctor.getName());
            preparedStatement.setString(2, doctor.getSurname());
            preparedStatement.setString(3, doctor.getTitle());
            preparedStatement.setString(4, doctor.getEmail());
            preparedStatement.setString(5, doctor.getPhone());
            preparedStatement.setString(6, doctor.getDepartmentsId());
            preparedStatement.setString(7, doctor.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteDoctor(String id) {
        try {
            preparedStatement = connection.prepareStatement(DoctorConstants.DELETE_SQL);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public List<String> getDoctorsId(String departmentId) {
        List<String> ids = new LinkedList();
        try {
            preparedStatement = connection.prepareStatement(DoctorConstants.DOCTOR_ID_SQL);
            preparedStatement.setString(1, departmentId);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                ids.add(id);
            }
            return ids;
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
