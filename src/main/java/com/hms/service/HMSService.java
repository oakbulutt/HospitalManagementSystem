package com.hms.service;

import java.util.List;
import com.hms.dao.impl.AdminDaoImpl;
import com.hms.dao.impl.DoctorDaoImpl;
import com.hms.dao.impl.DepartmentDaoImpl;
import com.hms.dao.impl.PatientDaoImpl;
import com.hms.dao.impl.ReceptionistDaoImpl;
import com.hms.dao.impl.UserDaoImpl;
import com.hms.model.Doctor;
import com.hms.model.Admin;
import com.hms.model.Department;
import com.hms.model.Patient;
import com.hms.model.Receptionist;
import com.hms.model.User;
import com.hms.util.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HMSService {

    AdminDaoImpl adminDao;
    DepartmentDaoImpl departmentDao;
    DoctorDaoImpl doctorDao;
    PatientDaoImpl patientDao;
    ReceptionistDaoImpl receptionistDao;
    UserDaoImpl userDao;

    List<Admin> listAdmins;
    List<Department> listDepartments;
    List<Doctor> listDoctors;
    List<Patient> listPatients;
    List<Receptionist> listReceptionists;
    List<User> listUsers;

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    
    public HMSService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
        }

        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(HMSService.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }
    public boolean login(String username, String password) {
        String query = "SELECT * FROM users WHERE userid = ? AND password = ?";

        try {
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();

        } catch (SQLException ex) {
            Logger.getLogger(HMSService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Admins
    public List<Admin> showAllAdmins() {
        listAdmins = adminDao.allAdmins();
        return listAdmins;
    }

    public void createAdmin(Admin admin) {
        adminDao.createAdmin(admin);
    }

    public void updateAdmin(Admin admin) {
        adminDao.updateAdmin(admin);
    }

    public void deleteAdmin(String id) {
        adminDao.deleteAdmin(id);
    }

    //Departments
    public List<Department> showAllDepartments() {
        listDepartments = departmentDao.allDepartments();
        return listDepartments;
    }

    public void createDepartment(Department department) {
        departmentDao.createDepartment(department);
    }

    public void updateDepartment(Department department) {
        departmentDao.updateDepartment(department);
    }

    public void deleteDepartment(String id) {
        departmentDao.deleteDepartment(id);
    }

    //Doctors
    public List<Doctor> showAllDoctors() {
        listDoctors = doctorDao.allDoctors();
        return listDoctors;
    }

    public void createDoctor(Doctor doctor) {
        doctorDao.createDoctor(doctor);
    }

    public void updateDoctor(Doctor doctor) {
        doctorDao.updateDoctor(doctor);
    }

    public void deleteDoctor(String id) {
        doctorDao.deleteDoctor(id);
    }

    
    //Patients
    public List<Patient> showAllPatients() {
        listPatients = patientDao.allPatients();
        return listPatients;
    }

    public void createPatient(Patient patient) {
        patientDao.createPatient(patient);
    }

    public void updatePatient(Patient patient) {
        patientDao.updatePatient(patient);
    }

    public void deletePatient(String id) {
        patientDao.deletePatient(id);
    }
    
    //Receptionists
    public List<Receptionist> showAllReceptionist() {
        listReceptionists = receptionistDao.allReceptionists();
        return listReceptionists;
    }

    public void createReceptionist(Receptionist receptionist) {
        receptionistDao.createReceptionist(receptionist);
    }

    public void updateReceptionist(Receptionist receptionist) {
        receptionistDao.updateReceptionist(receptionist);
    }

    public void deleteReceptionist(String id) {
        receptionistDao.deleteReceptionist(id);
    }
    
    //Users
    public List<User> showAllUsers() {
        listUsers = userDao.allUsers();
        return listUsers;
    }

    public void createUser(User user) {
        userDao.createUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(String username) {
        userDao.deleteUser(username);
    }
}
