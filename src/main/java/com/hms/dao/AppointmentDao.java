
package com.hms.dao;

import com.hms.model.Appointment;
import java.util.List;

public interface AppointmentDao {

    public List<Appointment> appointments();

    public void createAppointment(Appointment appointment);

    public void updateAppointment(Appointment appointment);

    public void deleteAppointment(String id);
}
