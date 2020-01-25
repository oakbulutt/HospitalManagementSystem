package com.hms.dao.impl;

import com.hms.constants.DepartmentConstants;
import com.hms.model.Department;
import com.hms.util.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.hms.dao.DepartmentDao;

public class DepartmentDaoImpl implements DepartmentDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public DepartmentDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<Department> departments() {
        List<Department> departments = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DepartmentConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                departments.add(new Department(id, name));
            }
            return departments;
        } catch (SQLException e) {
            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }

    @Override
    public void createDepartment(Department department) {
        try {
            preparedStatement = connection.prepareStatement(DepartmentConstants.INSERT_SQL);
            preparedStatement.setString(1, department.getId());
            preparedStatement.setString(2, department.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updateDepartment(Department department) {
        try {
            preparedStatement = connection.prepareStatement(DepartmentConstants.UPDATE_SQL);
            preparedStatement.setString(1, department.getName());
            preparedStatement.setString(2, department.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteDepartment(String id) {
        try {
            preparedStatement = connection.prepareStatement(DepartmentConstants.DELETE_SQL);
            preparedStatement.setString(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(DepartmentDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
