package com.hms.dao;

import com.hms.model.Admin;
import java.util.List;

public interface AdminDao {

    public List<Admin> admins();

    public void createAdmin(Admin admin);

    public void updateAdmin(Admin admin);

    public void deleteAdmin(String id);
}
