package com.hms.dao.impl;

import com.hms.constants.ReceptionistConstants;
import com.hms.model.Receptionist;
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
import com.hms.dao.ReceptionistDao;

public class ReceptionistDaoImpl implements ReceptionistDao {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public ReceptionistDaoImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(ReceptionistDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    @Override
    public List<Receptionist> receptionists() {
        List<Receptionist> receptionists = new LinkedList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ReceptionistConstants.FETCH_SQL);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String usersId = resultSet.getString("users_id");

                receptionists.add(new Receptionist(id, name, surname, email, phone, usersId));
            }
            return receptionists;
        } catch (SQLException e) {
            Logger.getLogger(ReceptionistDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    @Override
    public void createReceptionist(Receptionist receptionist) {
        try {
            preparedStatement = connection.prepareStatement(ReceptionistConstants.INSERT_SQL);
            preparedStatement.setString(1, receptionist.getId());
            preparedStatement.setString(2, receptionist.getName());
            preparedStatement.setString(3, receptionist.getSurname());
            preparedStatement.setString(4, receptionist.getEmail());
            preparedStatement.setString(5, receptionist.getPhone());
            preparedStatement.setString(6, receptionist.getUsersId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ReceptionistDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void updateReceptionist(Receptionist receptionist) {
        try {
            preparedStatement = connection.prepareStatement(ReceptionistConstants.UPDATE_SQL);
            preparedStatement.setString(1, receptionist.getName());
            preparedStatement.setString(2, receptionist.getSurname());
            preparedStatement.setString(3, receptionist.getEmail());
            preparedStatement.setString(4, receptionist.getPhone());
            preparedStatement.setString(5, receptionist.getUsersId());
            preparedStatement.setString(6, receptionist.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(ReceptionistDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void deleteReceptionist(String id) {
        try {
            preparedStatement = connection.prepareStatement(ReceptionistConstants.DELETE_SQL);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(ReceptionistDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }

    }

}
