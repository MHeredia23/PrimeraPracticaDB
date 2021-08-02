package com.example.sorteoalumnos.controller;

import com.example.sorteoalumnos.model.Alumn;
import com.example.sorteoalumnos.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/Alumno")
public class AlumnContoller {

    private final AlumnoService alumnoService;

    public AlumnContoller(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/random")
    public Set<Alumn> random(){
        return alumnoService.getTenAleatoryStudent();
    }

}
