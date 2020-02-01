package com.hms.dao;

import com.hms.model.Appointment;
import java.util.List;

public interface AppointmentDao {

    List<Appointment> appointments();

    String getAppointmentStatus(String id);

    void createAppointment(Appointment appointment);

    void updateAppointment(Appointment appointment);

    void deleteAppointment(String id);
}
