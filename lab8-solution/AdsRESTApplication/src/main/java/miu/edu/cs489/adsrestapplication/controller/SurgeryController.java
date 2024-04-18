package miu.edu.cs489.adsrestapplication.controller;

import miu.edu.cs489.adsrestapplication.service.interfaces_imp.SurgeryServiceImp;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurgeryController {
    private SurgeryServiceImp surgeryService;
    public SurgeryController(SurgeryServiceImp surgeryService) {
        this.surgeryService = surgeryService;
    }






}
