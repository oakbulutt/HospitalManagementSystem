/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.dao.impl;

import com.hms.constants.UserConstants;
import com.hms.dao.UserDao;
import com.hms.model.User;
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

/**
 *
 * @author domin
 */
public class UserDaoImpl implements UserDao{
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public UserDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<User> allUsers() {
        List<User> users = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(UserConstants.FETCH_SQL);

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                users.add(new User(username, password));
            }
            return users;
        } catch (SQLException e) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

    @Override
    public void createUser(User user) {
        try {
            preparedStatement = connection.prepareStatement(UserConstants.INSERT_SQL);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            preparedStatement = connection.prepareStatement(UserConstants.UPDATE_SQL);
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteUser(String username) {
        try {
            preparedStatement = connection.prepareStatement(UserConstants.DELETE_SQL);
            preparedStatement.setString(1, username);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
