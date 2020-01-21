
package com.hms.model;

import java.util.Date;

public class Patient {
    private String id;
    private String name;
    private String surname;
    private String gender;
    private Date birthdate;
    private String email;
    private String phone;

    public Patient(String id, String name, String surname, String gender, Date birthdate, String email, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Patients{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthdate=" + birthdate + ", email=" + email + ", phone=" + phone + '}';
    }
    
}
