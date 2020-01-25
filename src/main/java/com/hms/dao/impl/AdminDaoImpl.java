package com.hms.dao.impl;

import com.hms.constants.AdminConstants;
import com.hms.dao.AdminDao;
import com.hms.model.Admin;
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

public class AdminDaoImpl implements AdminDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public AdminDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<Admin> admins() {
        List<Admin> Admins = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(AdminConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String title = resultSet.getString("title");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String departmentsId = resultSet.getString("departments_id");
                String usersId = resultSet.getString("users_id");

                Admins.add(new Admin(id, name, surname, title, email, phone, departmentsId, usersId));
            }
            return Admins;
        } catch (SQLException e) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public void createAdmin(Admin admin) {
        try {
            preparedStatement = connection.prepareStatement(AdminConstants.INSERT_SQL);
            preparedStatement.setString(1, admin.getId());
            preparedStatement.setString(2, admin.getName());
            preparedStatement.setString(3, admin.getSurname());
            preparedStatement.setString(4, admin.getTitle());
            preparedStatement.setString(5, admin.getEmail());
            preparedStatement.setString(6, admin.getPhone());
            preparedStatement.setString(7, admin.getDepartmentsId());
            preparedStatement.setString(8, admin.getUsersId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updateAdmin(Admin admin) {
        try {
            preparedStatement = connection.prepareStatement(AdminConstants.UPDATE_SQL);
            preparedStatement.setString(1, admin.getName());
            preparedStatement.setString(2, admin.getSurname());
            preparedStatement.setString(3, admin.getTitle());
            preparedStatement.setString(4, admin.getEmail());
            preparedStatement.setString(5, admin.getPhone());
            preparedStatement.setString(6, admin.getDepartmentsId());
            preparedStatement.setString(7, admin.getUsersId());
            preparedStatement.setString(8, admin.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteAdmin(String id) {
        try {
            preparedStatement = connection.prepareStatement(AdminConstants.DELETE_SQL);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(AdminDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
