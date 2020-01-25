
package com.hms.model;

public class Doctor {
    private String id;
    private String name;
    private String surname;
    private String title;
    private String email;
    private String phone;
    private String departmentsId;
    private String usersId;

    public Doctor(String id, String name, String surname, String title, String email, String phone, String departmentsId, String usersId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.departmentsId = departmentsId;
        this.usersId = usersId;
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

    public String getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(String departmentsId) {
        this.departmentsId = departmentsId;
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", title=" + title + ", email=" + email + ", phone=" + phone + ", departmentsId=" + departmentsId + ", usersId=" + usersId + '}';
    }
}
