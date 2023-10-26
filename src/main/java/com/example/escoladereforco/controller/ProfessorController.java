package com.example.escoladereforco.controller;

import com.example.escoladereforco.perssitence.model.Professor;
import com.example.escoladereforco.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping("/salvarProfessor")
    private ResponseEntity<Professor> salvarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.salvar(professor), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarProfessor")
    private ResponseEntity<?> mostrarProfessor(){
        return new ResponseEntity<>(professorService.mostrar(), HttpStatus.OK);
    }

}
