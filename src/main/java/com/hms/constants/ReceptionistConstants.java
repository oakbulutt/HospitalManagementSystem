
package com.hms.constants;

public class ReceptionistConstants {
    public static final String FETCH_SQL = "SELECT * FROM receptionists";
    public static final String INSERT_SQL = "INSERT INTO receptionists(id, name, surname, email, phone, users_id) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String UPDATE_SQL = "UPDATE receptionists SET name = ?, surname = ?, email = ?, phone = ? WHERE id = ?";
    public static final String DELETE_SQL = "DELETE FROM receptionists WHERE receptionists.id = ?";
}
