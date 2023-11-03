package com.example.escoladereforco.service;

import com.example.escoladereforco.perssitence.model.Aluno;
import com.example.escoladereforco.perssitence.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

@Service
public class AlunoService {

    Aluno aluno;

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno Aluno) {
        CalcularIdade calcularIdade = new CalcularIdade();
        calcularIdade.resultadoIdade(new Date("1990-11-03 11:35:19"));
        return alunoRepository.save(Aluno);
    }

    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
        int i = calculateAge(LocalDate.parse("1990-11-20"), LocalDate.now());
        System.out.println(i);
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate){
        return Period.between(birthDate, currentDate).getYears();
    }



    public List<Aluno> mostrar() {
        return alunoRepository.findAll();
    }

}
