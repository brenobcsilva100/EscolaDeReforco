package com.example.escoladereforco.service;

import java.util.Calendar;
import java.util.Date;

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

    public static void main(String[] args) {
        Date d1 = new Date(2013,11,20);
        System.out.println(calculoIdade(d1));
    }

}
