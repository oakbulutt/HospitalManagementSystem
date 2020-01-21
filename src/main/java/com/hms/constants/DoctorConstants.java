
package com.hms.constants;

public class DoctorConstants {
    public static final String FETCH_SQL = "SELECT * FROM Doctors";
    public static final String INSERT_SQL = "INSERT INTO Doctors(id, name, surname, title, email, phone, department) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE Doctors SET name = ?, surname = ?, title = ?, email = ?, phone = ?, department = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM Doctors WHERE Doctors.id = ?";
}
