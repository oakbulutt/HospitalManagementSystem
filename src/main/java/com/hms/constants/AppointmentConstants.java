/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.constants;

/**
 *
 * @author Akbulut
 */
public class AppointmentConstants {
    public static final String FETCH_SQL = "SELECT"
            + " appointments.id,"
            + " patients_id,"
            + " patients.name,"
            + " patients.surname,"
            + " doctors_id,"
            + " doctors.name,"
            + " doctors.surname,"
            + " CONCAT(departments.id, ' - ', departments.name) as departments_id,"
            + " appointment_date,"
            + " appointment_status"
            + " FROM hms.appointments"
            + " JOIN patients ON appointments.patients_id = patients.id"
            + " JOIN doctors ON appointments.doctors_id = doctors.id"
            + " JOIN departments ON doctors.departments_id = departments.id"
            + " GROUP BY appointments.id;";
    public static final String INSERT_SQL = "INSERT INTO hms.appointment(id, patients_id, doctors_id, appointment_date, appointment_status) VALUES (?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE hms.appointment SET patients_id = ?, doctors_id = ?, appointment_date = ?, appointment_status = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM hms.appointment WHERE appointment.id = ?";
}
