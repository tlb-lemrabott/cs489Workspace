package miu.edu.cs489.adsrestapplication.service.interfaces;

import miu.edu.cs489.adsrestapplication.model.Dentist;
import miu.edu.cs489.adsrestapplication.model.Patient;

import java.util.List;

public interface DentistService {
    public Dentist registerNewDentist(Dentist dentist);
    public Dentist updateDentist(Integer id, Dentist dentist);
    public Dentist getDentistById(Integer id);
    public List<Dentist> getAllDentists(Dentist dentist);
    public boolean deleteDentistById(Integer id);
}
