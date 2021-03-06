
package com.hms.dao;

import com.hms.model.Prescription;

public interface PrescriptionDao {

    public Prescription prescription(String id);
    
    public String lastId();

    public void createPrescription(Prescription prescription);

    public void updatePrescription(Prescription prescription);

    public void deletePrescription(String id);
}
