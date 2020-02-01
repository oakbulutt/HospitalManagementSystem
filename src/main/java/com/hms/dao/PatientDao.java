package com.hms.dao;

import java.util.List;
import com.hms.model.Patient;

public interface PatientDao {

    List<Patient> allPatients();

    List<String> patients(String id);

    void createPatient(Patient patient);

    void updatePatient(Patient patient);

    void deletePatient(String id);
}
