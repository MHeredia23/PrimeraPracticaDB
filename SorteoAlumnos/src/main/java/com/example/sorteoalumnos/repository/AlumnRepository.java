package com.example.sorteoalumnos.repository;

import com.example.sorteoalumnos.model.Alumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnRepository extends JpaRepository<Alumn, Integer> {
}
