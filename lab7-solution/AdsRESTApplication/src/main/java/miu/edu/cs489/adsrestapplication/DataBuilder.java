package miu.edu.cs489.adsrestapplication;

import miu.edu.cs489.adsrestapplication.model.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class DataBuilder {

    public static List<Address> pullAddresses(){
        Address address1 = new Address();
        address1.setStreet("123 Main Street");
        address1.setCity("Fairfield");
        address1.setCity("Iowa");
        address1.setZipCode("12345");

        Address address2 = new Address();
        address2.setStreet("1000 N 4th Street");
        address2.setCity("Burlington");
        address2.setCity("Iowa");
        address2.setZipCode("55069");
        address2.setApt("MR#590");

        Address address3 = new Address();
        address3.setStreet("3350 East 87th Street");
        address3.setCity("Detroit");
        address3.setCity("Michigan");
        address3.setZipCode("11270");
        address3.setApt("APT#45A");

        Address address4 = new Address();
        address4.setStreet("SpringRoad 90th Street");
        address4.setCity("Flushing");
        address4.setCity("NY");
        address4.setZipCode("55069");
        address4.setApt("APT#1f");

        return Arrays.asList(address1, address2, address3, address4);
    }
    public static List<Appointment> pullAppointments(){
        Appointment TonyAppointment1 = new Appointment();
        TonyAppointment1.setScheduleTime(LocalDateTime.of(2017, Month.FEBRUARY,23,6,30,40));

        Appointment TonyAppointment2 = new Appointment();
        TonyAppointment2.setScheduleTime(LocalDateTime.now());

        Appointment HelenAppointment1 = new Appointment();
        HelenAppointment1.setScheduleTime(LocalDateTime.of(2019, Month.JANUARY,23,9,20,00));

        Appointment HelenAppointment2 = new Appointment();
        HelenAppointment2.setScheduleTime(LocalDateTime.of(2019, Month.JANUARY,23,9,20,00));

        Appointment robinAppointment1 = new Appointment();
        robinAppointment1.setScheduleTime(LocalDateTime.now());

        Appointment robinAppointment2 = new Appointment();
        robinAppointment2.setScheduleTime(LocalDateTime.now());

        return Arrays.asList(TonyAppointment1, TonyAppointment2, HelenAppointment1, HelenAppointment2, robinAppointment1, robinAppointment2);
    }
    public static List<Patient> pullPatients(){
        Patient patient1 = new Patient();
        patient1.setPatName("Gillian White");

        Patient patient2 = new Patient();
        patient2.setPatName("Jill Bell");

        Patient patient3 = new Patient();
        patient3.setPatName("Ian MacKay");

        Patient patient4 = new Patient();
        patient4.setPatName("John Walker");

        return Arrays.asList(patient1, patient2, patient3, patient4);
    }
    public static List<Dentist> pullDentists(){
        Dentist dentist1 = new Dentist();
        dentist1.setDentistName("Tony Smith");
//        dentist1.setAppointments(Arrays.asList(DataBuilder.pullAppointments().get(0), DataBuilder.pullAppointments().get(1)));

        Dentist dentist2 = new Dentist();
        dentist2.setDentistName("Helen Pearson");
//        dentist2.setAppointments(Arrays.asList(DataBuilder.pullAppointments().get(2), DataBuilder.pullAppointments().get(3)));

        Dentist dentist3 = new Dentist();
        dentist3.setDentistName("Robin Plevin");
 //       dentist3.setAppointments(Arrays.asList(DataBuilder.pullAppointments().get(4), DataBuilder.pullAppointments().get(5)));

        Dentist dentist4 = new Dentist();
        dentist4.setDentistName("Dr. Michel");
        return Arrays.asList(dentist1, dentist2, dentist3, dentist4);
    }
    public static List<Surgery> pullSurgeries(){
        Surgery surgery1 = new Surgery();
        surgery1.setSurgeryName("Surgery-S10");

        Surgery surgery2 = new Surgery();
        surgery2.setSurgeryName("Surgery-S13");

        Surgery surgery3 = new Surgery();
        surgery3.setSurgeryName("Surgery-S15");

        Surgery surgery4 = new Surgery();
        surgery4.setSurgeryName("Wisdom Tooth Extraction");

        return Arrays.asList(surgery1, surgery2, surgery3, surgery4);
    }

}
