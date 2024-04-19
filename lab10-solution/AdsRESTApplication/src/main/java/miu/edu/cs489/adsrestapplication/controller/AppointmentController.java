package miu.edu.cs489.adsrestapplication.controller;

import miu.edu.cs489.adsrestapplication.service.interfaces_imp.AppointmentServiceImp;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
    private AppointmentServiceImp appointmentService;
    public AppointmentController(AppointmentServiceImp appointmentService) {
        this.appointmentService = appointmentService;
    }






}
