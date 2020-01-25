package com.hms.constants;

public class PrescriptionConstants {

    public static final String FETCH_SQL = "SELECT "
            + "prescriptions.id, "
            + "patients_id, "
            + "patients.name, "
            + "patients.surname, "
            + "doctors_id, doctors.name, "
            + "doctors.surname, "
            + "name_of_medicine, "
            + "dose_mg, "
            + "number_of_tablets, "
            + "daily_dose, "
            + "explanation "
            + "FROM "
            + "prescriptions "
            + "JOIN patients ON patients.id = prescriptions.patients_id "
            + "JOIN doctors ON doctors.id = prescriptions.doctors_id "
            + "GROUP BY prescriptions.id;";
    public static final String PRESCRIPTION_SQL = "SELECT * FROM prescriptions WHERE id = ?";
    public static final String INSERT_SQL = "INSERT INTO hms.prescriptions(id, patients_id, doctors_id, name_of_medicine, dose_mg, daily_dose, explanation) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE hms.prescriptions SET name_of_medicine = ?, dose_mg = ?, number_of_tablets = ?, daily_dose = ?, explanation = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM hms.prescriptions WHERE prescriptions.id = ?";
}
