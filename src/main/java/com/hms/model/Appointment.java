package com.hms.model;

import java.sql.Date;

public class Appointment {

    private String id;
    private String patientsId;
    private String patientsName;
    private String patientsSurname;
    private String doctorsId;
    private String doctorsName;
    private String doctorsSurname;
    private String doctorsDepartment;
    private Date appointmentDate;
    private String appointmentStatus;

    public Appointment(String appointmentId, String patientsId, String doctorsId, Date appointmentDate, String appointmentStatus) {
        this.id = appointmentId;
        this.patientsId = patientsId;
        this.doctorsId = doctorsId;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    public Appointment(String id, String patientsId, String doctorsId, Date appointmentDate) {
        this.id = id;
        this.patientsId = patientsId;
        this.doctorsId = doctorsId;
        this.appointmentDate = appointmentDate;
    }

    public Appointment(String id, String patientsId, String patientsName, String patientsSurname, String doctorsId, String doctorsName, String doctorsSurname, String doctorsDepartment, Date appointmentDate, String appointmentStatus) {
        this.id = id;
        this.patientsId = patientsId;
        this.patientsName = patientsName;
        this.patientsSurname = patientsSurname;
        this.doctorsId = doctorsId;
        this.doctorsName = doctorsName;
        this.doctorsSurname = doctorsSurname;
        this.doctorsDepartment = doctorsDepartment;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    public String getDoctorsDepartment() {
        return doctorsDepartment;
    }

    public void setDoctorsDepartment(String doctorsDepartment) {
        this.doctorsDepartment = doctorsDepartment;
    }

    public String getPatientsName() {
        return patientsName;
    }

    public void setPatientsName(String patientsName) {
        this.patientsName = patientsName;
    }

    public String getPatientsSurname() {
        return patientsSurname;
    }

    public void setPatientsSurname(String patientsSurname) {
        this.patientsSurname = patientsSurname;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public String getDoctorsSurname() {
        return doctorsSurname;
    }

    public void setDoctorsSurname(String doctorsSurname) {
        this.doctorsSurname = doctorsSurname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(String patientsId) {
        this.patientsId = patientsId;
    }

    public String getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(String doctorsId) {
        this.doctorsId = doctorsId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    @Override
    public String toString() {
        return "Appointment{" + "appointmentId=" + id + ", patientId=" + patientsId + ", doctorId=" + doctorsId + ", appointmentDate=" + appointmentDate + ", appointmentStatus=" + appointmentStatus + '}';
    }
}
