package miu.edu.cs489.adsrestapplication.controller;

import miu.edu.cs489.adsrestapplication.service.interfaces_imp.DentistServiceImp;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DentistController {
    private DentistServiceImp dentistService;
    public DentistController(DentistServiceImp dentistService) {
        this.dentistService = dentistService;
    }





}
