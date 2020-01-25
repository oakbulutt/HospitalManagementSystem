package com.hms.dao;

import java.util.List;
import com.hms.model.Receptionist;

public interface ReceptionistDao {

    public List<Receptionist> receptionists();

    public void createReceptionist(Receptionist receptionist);

    public void updateReceptionist(Receptionist receptionist);

    public void deleteReceptionist(String id);
}
