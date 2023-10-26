package com.example.escoladereforco.perssitence.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Professor implements Serializable {
    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professor", orphanRemoval = true)
    private List<Aluno> aluno;

    private Date idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public Date getIdade() {
        return idade;
    }

    public void setIdade(Date idade) {
        this.idade = idade;
    }
}
