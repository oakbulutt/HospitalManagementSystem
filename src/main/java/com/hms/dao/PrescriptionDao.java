
package com.hms.dao;

import com.hms.model.Prescription;
import java.util.List;

public interface PrescriptionDao {

    public List<String> prescription(String id);
    
    public String lastId();

    public void createPrescription(Prescription prescription);

    public void updatePrescription(Prescription prescription);

    public void deletePrescription(String id);
}
