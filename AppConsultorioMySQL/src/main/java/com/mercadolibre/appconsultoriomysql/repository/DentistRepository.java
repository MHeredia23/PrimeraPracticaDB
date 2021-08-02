package com.mercadolibre.appconsultoriomysql.repository;

import com.mercadolibre.appconsultoriomysql.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Integer> {
}
