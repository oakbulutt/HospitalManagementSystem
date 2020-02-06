package com.hms.dao.impl;

import com.hms.constants.AppointmentConstants;
import com.hms.dao.AppointmentDao;
import com.hms.model.Appointment;
import com.hms.util.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppointmentDaoImpl implements AppointmentDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public AppointmentDaoImpl() {
        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(AppointmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<Appointment> appointments() {
        List<Appointment> appointments = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(AppointmentConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String patientsId = resultSet.getString("patients_id");
                String patientsName = resultSet.getString("patient_name");
                String patientsSurname = resultSet.getString("patient_surname");
                String doctorsId = resultSet.getString("doctors_id");
                String doctorsName = resultSet.getString("doctor_name");
                String doctorsSurname = resultSet.getString("doctor_surname");
                String doctorsDepartment = resultSet.getString("doctor_department");
                Date appointmentDate = resultSet.getDate("appointment_date");
                String appointmentStatus = resultSet.getString("appointment_status");

                appointments.add(new Appointment(id, patientsId, patientsName, patientsSurname, doctorsId, doctorsName, doctorsSurname, doctorsDepartment, appointmentDate, appointmentStatus));
            }
            return appointments;
        } catch (SQLException e) {
            Logger.getLogger(AppointmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public void createAppointment(Appointment appointment) {
        try {
            preparedStatement = connection.prepareStatement(AppointmentConstants.INSERT_SQL);
            preparedStatement.setString(1, appointment.getId());
            preparedStatement.setString(2, appointment.getPatientsId());
            preparedStatement.setString(3, appointment.getDoctorsId());
            preparedStatement.setDate(4, appointment.getAppointmentDate());
            preparedStatement.setString(5, appointment.getAppointmentStatus());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(AppointmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public String getAppointmentStatus(String id) {
        String status = "";
        try {
            preparedStatement = connection.prepareStatement(AppointmentConstants.STATUS_SQL);
            preparedStatement.setString(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                status = resultSet.getString("appointment_status");
            }
        } catch (SQLException e) {
            Logger.getLogger(DoctorDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        try {
            preparedStatement = connection.prepareStatement(AppointmentConstants.UPDATE_SQL);
            preparedStatement.setString(1, appointment.getPatientsId());
            preparedStatement.setString(2, appointment.getDoctorsId());
            preparedStatement.setDate(3, appointment.getAppointmentDate());
            preparedStatement.setString(4, appointment.getAppointmentStatus());
            preparedStatement.setString(5, appointment.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(AppointmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteAppointment(String id) {
        try {
            preparedStatement = connection.prepareStatement(AppointmentConstants.DELETE_SQL);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(AppointmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
