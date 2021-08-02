package com.mercadolibre.appconsultoriomysql.controller;

import com.mercadolibre.appconsultoriomysql.model.Dentist;
import com.mercadolibre.appconsultoriomysql.model.Patient;
import com.mercadolibre.appconsultoriomysql.model.Turn;
import com.mercadolibre.appconsultoriomysql.repository.TurnRepository;
import com.mercadolibre.appconsultoriomysql.service.DentistService;
import com.mercadolibre.appconsultoriomysql.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class PatientController {

    private final PatientService patientService;
    private final DentistService dentistService;
    private final TurnRepository turn; //Esto esta mal, solo fines de prueba

    public PatientController(PatientService patientService, DentistService dentistService, TurnRepository turnRepository) {
        this.patientService = patientService;
        this.dentistService = dentistService;
        this.turn = turnRepository;

    }

    @GetMapping("/createPatient")
    public Integer createPatient(){
        Patient patient = new Patient();
        patient.setFirstName("Marcos");
        patient.setLastName("Heredia");
        return patientService.savePatient(patient);
    }


    @GetMapping("/createDentist")
    public Integer createDentist(){
        Dentist dentist = new Dentist();
        dentist.setFirstName("Maria");
        dentist.setLastName("Lopez");
        return dentistService.saveDentist(dentist);
    }

    @GetMapping("/createTurn")
    public void createTurn() throws Exception {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime des = LocalDateTime.now().plusHours(4);
        dentistService.createTurns(1,now, des);
    }

    @GetMapping("/asignarTurno")
    public void asignarTurno() throws Exception {
        Turn t = turn.findById(1).get();
        patientService.addTurnPatient(1,t);
    }

}
