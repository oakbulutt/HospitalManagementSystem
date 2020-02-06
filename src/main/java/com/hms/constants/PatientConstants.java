package com.hms.constants;

public class PatientConstants {
 
    public static final String FETCH_SQL = "SELECT patients.*, prescriptions.id as prescription_id FROM patients LEFT JOIN prescriptions ON patients.id = prescriptions.patients_id GROUP BY patients.id";
    public static final String PATIENT_SQL = "SELECT name, surname FROM patients WHERE id = ?";
    public static final String INSERT_SQL = "INSERT INTO patients(id, name, surname, gender, birthdate, email, phone, anamnesis) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE patients SET name = ?, surname = ?, gender = ?, birthdate = ?, email = ?, phone = ?, anamnesis = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM patients WHERE patients.id = ?";
}
