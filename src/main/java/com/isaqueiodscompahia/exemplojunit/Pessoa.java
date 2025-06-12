
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.isaqueiodscompahia.exemplojunit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Windows 10 PRO
 */
public class Pessoa {
 
private String nome;
private LocalDateTime nascimento;

public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
}

public int getIdade(){
    return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
}

public boolean ehMaiorDeIdade(){
    return getIdade() >=18;
}



    public static void main(String[] args) {
        
    }
}
