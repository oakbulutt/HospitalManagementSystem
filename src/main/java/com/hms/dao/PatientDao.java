package com.hms.dao;

import java.util.List;
import com.hms.model.Patient;

public interface PatientDao {

    public List<Patient> allPatients();

    public List<Patient> patients(String id);

    public void createPatient(Patient patient);

    public void updatePatient(Patient patient);

    public void deletePatient(String id);
}
