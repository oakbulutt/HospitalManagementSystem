package com.hms.model;

public class Admin {
    private String id;
    private String name;
    private String surname;
    private String title;
    private String email;
    private String phone;
    private String department;

    public Admin(String id, String name, String surname, String title, String email, String phone, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.department = department;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Admins{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", title=" + title + ", email=" + email + ", phone=" + phone + ", department=" + department + '}';
    }
}
