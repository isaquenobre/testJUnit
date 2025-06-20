/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaqueiodscompahia.exemplojunit;

/**
 *
 * @author Windows 10 PRO
 */
public class TransferenciaEntreContas {
    
    
    
    public void transfere(Conta contaOrigem, Conta contaDestino, int valor){
        if (valor <=0){
            throw new IllegalArgumentException("valor deve ser mairo que zero");
        }
    }
}
