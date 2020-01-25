
package com.hms.model;

public class User {
    private String id;
    private String password;

    public User(String username, String password) {
        this.id = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + id + '}';
    }
    
    
}
