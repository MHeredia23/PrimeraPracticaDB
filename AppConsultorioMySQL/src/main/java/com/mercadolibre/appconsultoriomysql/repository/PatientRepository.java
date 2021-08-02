package com.mercadolibre.appconsultoriomysql.repository;

import com.mercadolibre.appconsultoriomysql.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
