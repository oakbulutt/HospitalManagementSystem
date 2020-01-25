/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hms.dao;

import com.hms.model.Prescription;
import java.util.List;

/**
 *
 * @author Akbulut
 */
public interface PrescriptionDao {

    public List<Prescription> allPrescriptions();
    
    public List<Prescription> prescriptions(String id);

    public void createPrescription(Prescription prescription);

    public void updatePrescription(Prescription prescription);

    public void deletePrescription(String id);
}
