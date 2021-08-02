package com.example.sorteoalumnos.service;

import com.example.sorteoalumnos.model.Alumn;
import com.example.sorteoalumnos.repository.AlumnRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    private final AlumnRepository alumnRepository;

    public AlumnoServiceImpl(AlumnRepository alumnRepository) {
        this.alumnRepository = alumnRepository;
    }

    @Override
    public Set<Alumn> getTenAleatoryStudent() {
        Set<Alumn> alumns = new HashSet<>();
        while(alumns.size()!=10){
            int index = (int) (Math.random()*100)+1;
            alumns.add(alumnRepository.findById(index).get());
        }
        return alumns;
    }
}
