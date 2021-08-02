package com.mercadolibre.appconsultoriomysql.service;

import com.mercadolibre.appconsultoriomysql.model.Patient;
import com.mercadolibre.appconsultoriomysql.model.Turn;
import com.mercadolibre.appconsultoriomysql.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Integer savePatient(Patient patient) {
        patient = patientRepository.save(patient);
        return patient.getId();
    }

    @Override
    public void addTurnPatient(Integer patientID, Turn turn) throws Exception {
        Patient patient = patientRepository.findById(patientID)
                .orElseThrow(()->new Exception("Not found"));
        patient.getTurns().add(turn);
        turn.setPatient(patient);
        patientRepository.save(patient);
    }

    @Override
    public void removeTurnPatient(Integer patientID, Turn turn) throws Exception {
        Patient patient = patientRepository.findById(patientID)
                .orElseThrow(()->new Exception("Not found"));
        patient.getTurns().remove(turn);
        patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Integer id) {
        return patientRepository.getById(id);
    }
}
