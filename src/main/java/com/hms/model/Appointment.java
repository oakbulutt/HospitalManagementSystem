package com.hms.model;

import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private Date appointmentDate;
    private String appointmentStatus;

    public Appointment(Patient patient, Doctor doctor, Date appointmentDate, String appointmentStatus) {
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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
        return "Appointment{" + "patient=" + patient + ", doctor=" + doctor + ", appointmentDate=" + appointmentDate + ", appointmentStatus=" + appointmentStatus + '}';
    }
    
    
}
