package com.hms.constants;

public class AdminConstants {

    public static final String FETCH_SQL = "SELECT * FROM hms.admin";
    public static final String INSERT_SQL = "INSERT INTO hms.admin(id, name, surname, title, email, phone, department) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE hms.admin SET name = ?, surname = ?, title = ?, email = ?, phone = ?, department = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM hms.admin WHERE admin.id = ?";
}
