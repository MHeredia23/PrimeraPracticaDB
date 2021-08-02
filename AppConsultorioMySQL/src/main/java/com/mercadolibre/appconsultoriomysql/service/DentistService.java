package com.mercadolibre.appconsultoriomysql.service;

import com.mercadolibre.appconsultoriomysql.model.Dentist;

import java.time.LocalDateTime;

public interface DentistService {

    Integer saveDentist(Dentist dentist);

    void createTurns(Integer dentistId, LocalDateTime startDate, LocalDateTime endDate) throws Exception;

}
