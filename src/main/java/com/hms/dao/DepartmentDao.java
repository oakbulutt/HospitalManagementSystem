package com.hms.dao;

import java.util.List;
import com.hms.model.Department;

public interface DepartmentDao {

    public List<Department> departments();

    public List<String> departmentsId();

    public void createDepartment(Department department);

    public void updateDepartment(Department department);

    public void deleteDepartment(String id);
}
