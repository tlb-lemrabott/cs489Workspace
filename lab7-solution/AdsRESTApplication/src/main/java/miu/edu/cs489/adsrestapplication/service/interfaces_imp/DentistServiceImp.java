package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import miu.edu.cs489.adsrestapplication.model.Dentist;
import miu.edu.cs489.adsrestapplication.repository.DentistRepository;
import miu.edu.cs489.adsrestapplication.service.interfaces.DentistService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class DentistServiceImp implements DentistService {
    private DentistRepository dentistRepository;
    public DentistServiceImp(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public Dentist registerNewDentist(Dentist dentist) {
        if(Objects.nonNull(dentist)){
            return dentistRepository.save(dentist);
        }else {
            return null;
        }
    }

    @Override
    public Dentist updateDentist(Integer id, Dentist dentist) {
        return null;
    }

    @Override
    public Dentist getDentistById(Integer id) {
        return null;
    }

    @Override
    public List<Dentist> getAllDentists(Dentist dentist) {
        return null;
    }

    @Override
    public boolean deleteDentistById(Integer id) {
        return false;
    }
}
