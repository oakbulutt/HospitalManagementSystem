
package com.hms.constants;

public class DepartmentConstants {
    public static final String FETCH_SQL = "SELECT * FROM departments";
    public static final String INSERT_SQL = "INSERT INTO departments(id, name) VALUES (?, ?)";
    public static final String UPDATE_SQL = "UPDATE departments SET name = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM departments WHERE departments.id = ?";
}
