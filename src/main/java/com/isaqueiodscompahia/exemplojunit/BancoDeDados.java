/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaqueiodscompahia.exemplojunit;

import java.util.logging.Logger;

/**
 *
 * @author Windows 10 PRO
 */
public class BancoDeDados {
    
 private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
 
 public static void iniciarConexao(){
     LOGGER.info("Inicou conexão");
 }
 
 public static void finalizarConexao(){
     LOGGER.info("Finalizou conexÃo");
 }
 
 public static void insereDados(Pessoa pessoa){
     LOGGER.info("Inseriu dados");
 }
 
 public static void removeDados(Pessoa pessoa){
     LOGGER.info("Removeu dados");
 }
    
}

