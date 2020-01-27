package com.hms.constants;

public class PrescriptionConstants {

    public static final String LAST_ID_SQL = "SELECT MAX(id) as last_id FROM prescriptions";
    public static final String PRESCRIPTION_SQL = "SELECT * FROM prescriptions WHERE id = ?";
    public static final String INSERT_SQL = "INSERT INTO hms.prescriptions(id, patients_id, doctors_id, name_of_medicine, dose_mg, number_of_tablets, daily_dose, explanation) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE hms.prescriptions SET doctors_id = ?, name_of_medicine = ?, dose_mg = ?, number_of_tablets = ?, daily_dose = ?, explanation = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM hms.prescriptions WHERE prescriptions.id = ?";
}
