package com.hms.service;

import com.hms.constants.UserConstants;
import java.util.*;

import com.hms.dao.AdminDao;
import com.hms.dao.AppointmentDao;
import com.hms.dao.DepartmentDao;
import com.hms.dao.DoctorDao;
import com.hms.dao.PatientDao;
import com.hms.dao.PrescriptionDao;
import com.hms.dao.ReceptionistDao;
import com.hms.dao.UserDao;
import com.hms.dao.impl.AdminDaoImpl;
import com.hms.dao.impl.AppointmentDaoImpl;
import com.hms.dao.impl.DoctorDaoImpl;
import com.hms.dao.impl.DepartmentDaoImpl;
import com.hms.dao.impl.PatientDaoImpl;
import com.hms.dao.impl.PrescriptionDaoImpl;
import com.hms.dao.impl.ReceptionistDaoImpl;
import com.hms.dao.impl.UserDaoImpl;
import com.hms.model.Doctor;
import com.hms.model.Admin;
import com.hms.model.Appointment;
import com.hms.model.Department;
import com.hms.model.Patient;
import com.hms.model.Prescription;
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

    AdminDao adminDao = new AdminDaoImpl();
    AppointmentDao appointmentDao = new AppointmentDaoImpl();
    DepartmentDao departmentDao = new DepartmentDaoImpl();
    DoctorDao doctorDao = new DoctorDaoImpl();
    PatientDao patientDao = new PatientDaoImpl();
    PrescriptionDao prescriptionDao = new PrescriptionDaoImpl();
    ReceptionistDao receptionistDao = new ReceptionistDaoImpl();
    UserDao userDao = new UserDaoImpl();

    List<Admin> listAdmins;
    List<Appointment> listAppointments;
    List<Department> listDepartments;
    List<String> listDepartmentsId;
    List<Doctor> listDoctors;
    List<String> listDoctorsId;
    List<Patient> listPatients;
    List<String> listStringPatients;
    List<Prescription> listPrescriptions;
    List<Prescription> listPrescription;
    List<Receptionist> listReceptionists;
    List<User> listUsers;

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;

    public HMSService() {
        try {
            connection = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            Logger.getLogger(HMSService.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Connection Failed!");
        }
    }

    public boolean login(String username, String password) {
        try {
            preparedStatement = connection.prepareStatement(UserConstants.LOGIN_SQL);

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
    public List<Admin> showAdmins() {
        listAdmins = adminDao.admins();
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

    //Appointments
    public List<Appointment> showAppointments() {
        listAppointments = appointmentDao.appointments();
        return listAppointments;
    }

    public String getAppointmentStatus(String id) {
        return appointmentDao.getAppointmentStatus(id);
    }

    public void createAppointment(Appointment appointment) {
        appointmentDao.createAppointment(appointment);
    }

    public void updateAppointment(Appointment appointment) {
        appointmentDao.updateAppointment(appointment);
    }

    public void deleteAppointment(String id) {
        appointmentDao.deleteAppointment(id);
    }

    //Departments
    public List<Department> showDepartments() {
        listDepartments = departmentDao.departments();
        return listDepartments;
    }

    public List<String> departmentsId() {
        listDepartmentsId = departmentDao.departmentsId();
        return listDepartmentsId;
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
    public List<Doctor> showDoctors() {
        listDoctors = doctorDao.allDoctors();
        return listDoctors;
    }

    public Doctor getDoctor(String id) {
        return doctorDao.getDoctor(id);
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

    public List<String> getDoctorsId(String departmentId) {
        listDoctorsId = doctorDao.getDoctorsId(departmentId);
        return listDoctorsId;
    }

    public List<Doctor> doctors(String id) {
        listDoctors = doctorDao.doctors(id);
        return listDoctors;
    }

    //Patients
    public List<Patient> showPatients() {
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

    public List<String> patients(String patientId) {
        listStringPatients = patientDao.patients(patientId);
        return listStringPatients;
    }

    //Receptionists
    public List<Receptionist> showReceptionist() {
        listReceptionists = receptionistDao.receptionists();
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
    public List<User> showUsers() {
        listUsers = userDao.users();
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

    //Prescription
    public Prescription prescription(String id) {
        return prescriptionDao.prescription(id);
        
    }

    public void createPrescription(Prescription prescription) {
        prescriptionDao.createPrescription(prescription);
    }

    public void updatePrescription(Prescription prescription) {
        prescriptionDao.updatePrescription(prescription);
    }

    public void deletePrescription(String id) {
        prescriptionDao.deletePrescription(id);
    }

    public String lastPrescriptionId() {
        return prescriptionDao.lastId();
    }
}
