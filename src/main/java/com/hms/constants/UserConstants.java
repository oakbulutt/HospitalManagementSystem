/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.constants;

/**
 *
 * @author domin
 */
public class UserConstants {

    public static final String FETCH_SQL = "SELECT * FROM users";
    public static final String INSERT_SQL = "INSERT INTO users(id, password) VALUES (?, ?)";
    public static final String UPDATE_SQL = "UPDATE users SET password = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM user WHERE users.id = ?";
    public static final String LOGIN_SQL = "SELECT * FROM users WHERE id = ? AND password = ?";
}
