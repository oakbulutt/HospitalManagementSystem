package com.hms.dao;

import com.hms.model.Doctor;
import java.util.List;

public interface DoctorDao {

    public List<Doctor> allDoctors();
    
    public List<Doctor> doctors(String id);
    
    public Doctor getDoctor(String id);

    public List<String> getDoctorsId(String departmentId);

    public void createDoctor(Doctor doctor);

    public void updateDoctor(Doctor doctor);

    public void deleteDoctor(String id);
}
