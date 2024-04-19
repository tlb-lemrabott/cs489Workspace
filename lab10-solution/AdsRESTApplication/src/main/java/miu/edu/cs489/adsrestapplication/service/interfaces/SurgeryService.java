package miu.edu.cs489.adsrestapplication.service.interfaces;

import miu.edu.cs489.adsrestapplication.model.Dentist;
import miu.edu.cs489.adsrestapplication.model.Surgery;

import java.util.List;

public interface SurgeryService {
    public Surgery addNewSurgery(Surgery surgery);
    public Surgery updateSurgery(Integer id, Surgery surgery);
    public Surgery getSurgeryById(Integer id);
    public List<Surgery> getAllSurgeries(Surgery surgery);
    public boolean deleteSurgeryById(Integer id);
}
