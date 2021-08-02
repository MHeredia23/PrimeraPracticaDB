package com.mercadolibre.appconsultoriomysql.repository;

import com.mercadolibre.appconsultoriomysql.model.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Turn, Integer> {
}
