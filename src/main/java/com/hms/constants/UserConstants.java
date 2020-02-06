
package com.hms.constants;

public class UserConstants {
   
    public static final String FETCH_SQL = "SELECT * FROM users";
    public static final String INSERT_SQL = "INSERT INTO users(id, password) VALUES (?, ?)";
    public static final String UPDATE_SQL = "UPDATE users SET password = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM users WHERE users.id = ?";
    public static final String LOGIN_SQL = "SELECT * FROM users WHERE id = ? AND password = ?";
}
