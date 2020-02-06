
package com.hms.constants;

public class DoctorConstants {
  
    public static final String FETCH_SQL = "SELECT * FROM doctors";
    public static final String DOCTOR_ID_SQL = "SELECT id FROM doctors WHERE departments_id = ?";
    public static final String DOCTOR_SQL = "SELECT * FROM doctors WHERE id = ?";
    public static final String INSERT_SQL = "INSERT INTO doctors(id, name, surname, title, email, phone, departments_id, users_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE doctors SET name = ?, surname = ?, title = ?, email = ?, phone = ?, departments_id = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM doctors WHERE doctors.id = ?";
}
