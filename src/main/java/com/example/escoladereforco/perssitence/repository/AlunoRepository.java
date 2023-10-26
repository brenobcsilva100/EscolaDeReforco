package com.example.escoladereforco.perssitence.repository;

import com.example.escoladereforco.perssitence.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
