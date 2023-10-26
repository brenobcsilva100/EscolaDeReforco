package com.example.escoladereforco.service;

import com.example.escoladereforco.perssitence.model.Aluno;
import com.example.escoladereforco.perssitence.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno Aluno) {
        return alunoRepository.save(Aluno);
    }

    public List<Aluno> mostrar() {
        return alunoRepository.findAll();
    }
    
}
