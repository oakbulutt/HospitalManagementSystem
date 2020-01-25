/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.dao;

import com.hms.model.Appointment;
import java.util.List;

/**
 *
 * @author Akbulut
 */
public interface AppointmentDao {

    public List<Appointment> appointments();

    public void createAppointment(Appointment appointment);

    public void updateAppointment(Appointment appointment);

    public void deleteAppointment(String id);
}
