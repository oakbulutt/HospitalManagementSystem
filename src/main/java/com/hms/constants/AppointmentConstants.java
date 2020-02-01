
package com.hms.constants;

public class AppointmentConstants {
    public static final String FETCH_SQL = "SELECT"
            + " appointments.id,"
            + " patients_id,"
            + " patients.name as patient_name,"
            + " patients.surname as patient_surname,"
            + " doctors_id,"
            + " doctors.name as doctor_name,"
            + " doctors.surname as doctor_surname,"
            + " CONCAT(departments.id, ' - ', departments.name) as doctor_department,"
            + " appointment_date,"
            + " appointment_status"
            + " FROM hms.appointments"
            + " JOIN patients ON appointments.patients_id = patients.id"
            + " JOIN doctors ON appointments.doctors_id = doctors.id"
            + " JOIN departments ON doctors.departments_id = departments.id"
            + " GROUP BY appointments.id;";
    public static final String STATUS_SQL = "SELECT appointment_status FROM hms.appointments WHERE patients_id = ?";
    public static final String INSERT_SQL = "INSERT INTO hms.appointments(id, patients_id, doctors_id, appointment_date, appointment_status) VALUES (?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE hms.appointments SET patients_id = ?, doctors_id = ?, appointment_date = ?, appointment_status = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM hms.appointments WHERE appointments.id = ?";
}
