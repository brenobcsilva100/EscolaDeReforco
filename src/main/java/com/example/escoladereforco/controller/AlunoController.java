package com.example.escoladereforco.controller;

import com.example.escoladereforco.perssitence.model.Aluno;
import com.example.escoladereforco.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/salvarAluno")
    private ResponseEntity<Aluno> salvarAluno(@RequestBody Aluno aluno){
        return new ResponseEntity<>(alunoService.salvar(aluno), HttpStatus.CREATED);
    }

    @GetMapping("/mostrarAluno")
    private ResponseEntity<?> mostrarAluno(){
        return new ResponseEntity<>(alunoService.mostrar(), HttpStatus.OK);
    }

}
