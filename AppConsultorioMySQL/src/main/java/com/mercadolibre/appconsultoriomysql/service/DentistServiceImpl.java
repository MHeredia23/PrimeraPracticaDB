package com.mercadolibre.appconsultoriomysql.service;

import com.mercadolibre.appconsultoriomysql.model.Dentist;
import com.mercadolibre.appconsultoriomysql.model.Turn;
import com.mercadolibre.appconsultoriomysql.repository.DentistRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class DentistServiceImpl implements DentistService{

    private final Integer DURATION = 30;

    private final DentistRepository dentistRepository;

    public DentistServiceImpl(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public Integer saveDentist(Dentist dentist) {
        dentistRepository.save(dentist);
        return dentist.getId();
    }

    @Override
    public void createTurns(Integer dentistId, LocalDateTime startDate, LocalDateTime endDate) throws Exception {
        Dentist dentist = dentistRepository.findById(dentistId)
                .orElseThrow(()-> new Exception("Not found"));
        Long cantMinutes = startDate.until(endDate, ChronoUnit.MINUTES);
        int cantTurn = Math.toIntExact(cantMinutes / DURATION);
        for(int i=0; i<cantTurn; i++){
            Turn turn = new Turn();
            turn.setStartDate(startDate);
            startDate = startDate.plusMinutes(DURATION);
            turn.setEndDate(startDate);
            turn.setDentist(dentist);
            dentist.getTurns().add(turn);
        }
        dentistRepository.save(dentist);
    }
}
