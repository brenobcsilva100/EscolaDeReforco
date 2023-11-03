package com.example.escoladereforco.service;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class CalcularIdade {

    private static int calculoIdade(Date dataNascimento){
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR)-dataNascimento.getYear();
        int mesAtual = hoje.get(Calendar.MONTH)+1;
        if((mesAtual==dataNascimento.getMonth()&&  hoje.get(Calendar.DAY_OF_MONTH)<dataNascimento.getDay())
                ||mesAtual<dataNascimento.getMonth()){
            idade--;
        }
        return idade;
    }

    public int resultadoIdade(Date idade){

        calculoIdade(idade);

        if(calculoIdade(idade)<18){
            menorDeIdade();
        }else{
            maiorDeIdade();
        }
        return 0;
    }

    private static void maiorDeIdade() {
        System.out.println("Seja bem vindo, voce é responsavel por assinar o contrato aqui na escola");
    }

    private static void menorDeIdade() {
        System.out.println("Voltar com o reponsavel para fazer seu cadastro.");
    }

}
