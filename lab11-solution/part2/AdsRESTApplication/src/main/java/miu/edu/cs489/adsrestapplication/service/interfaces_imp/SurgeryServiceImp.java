package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import miu.edu.cs489.adsrestapplication.model.Surgery;
import miu.edu.cs489.adsrestapplication.repository.SurgeryRepository;
import miu.edu.cs489.adsrestapplication.service.interfaces.SurgeryService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class SurgeryServiceImp implements SurgeryService {
    private SurgeryRepository surgeryRepository;
    public SurgeryServiceImp(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }

    @Override
    public Surgery addNewSurgery(Surgery surgery) {
        if(Objects.nonNull(surgery)){
            return surgeryRepository.save(surgery);
        }else {
            return null;
        }
    }

    @Override
    public Surgery updateSurgery(Integer id, Surgery surgery) {
        return null;
    }

    @Override
    public Surgery getSurgeryById(Integer id) {
        return null;
    }

    @Override
    public List<Surgery> getAllSurgeries(Surgery surgery) {
        return null;
    }

    @Override
    public boolean deleteSurgeryById(Integer id) {
        return false;
    }
}
