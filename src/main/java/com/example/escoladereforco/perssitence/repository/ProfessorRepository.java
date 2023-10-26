package com.example.escoladereforco.perssitence.repository;

import com.example.escoladereforco.perssitence.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
