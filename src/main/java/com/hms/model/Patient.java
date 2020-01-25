
package com.hms.model;

import java.sql.Date;

public class Patient {
    private String id;
    private String name;
    private String surname;
    private String gender;
    private Date birthdate;
    private String email;
    private String phone;
    private String anamnesis;
    private String prescriptionId;

    public Patient(String id, String name, String surname, String gender, Date birthdate, String email, String phone, String anamnesis, String prescriptionId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
        this.anamnesis = anamnesis;
        this.prescriptionId = prescriptionId;
    }

    public Patient(String id, String name, String surname, String gender, Date birthdate, String email, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthdate=" + birthdate + ", email=" + email + ", phone=" + phone + ", anamnesis=" + anamnesis + ", prescriptionId=" + prescriptionId + '}';
    }

    
}
