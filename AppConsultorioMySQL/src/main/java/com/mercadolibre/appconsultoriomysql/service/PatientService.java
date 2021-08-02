package com.mercadolibre.appconsultoriomysql.service;

import com.mercadolibre.appconsultoriomysql.model.Patient;
import com.mercadolibre.appconsultoriomysql.model.Turn;

public interface PatientService {

    Integer savePatient(Patient patient);

    void addTurnPatient(Integer patientId, Turn turn) throws Exception;

    void removeTurnPatient(Integer patientId, Turn turn) throws Exception;

    Patient getPatientById(Integer id);

}
