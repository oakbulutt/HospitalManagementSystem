package com.hms.constants;

public class PatientConstants {

    public static final String FETCH_SQL = "SELECT * FROM patients";
    public static final String PATIENT_SQL = "SELECT * FROM patients WHERE id = ?";
    public static final String INSERT_SQL = "INSERT INTO patients(id, name, surname, gender, birthdate, email, phone, anamnesis, prescription_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE patients SET name = ?, surname = ?, gender = ?, birthdate = ?, email = ?, phone = ?, anamnesis = ?, prescription_id = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM patients WHERE patients.id = ?";
}
