
import com.isaqueiodscompahia.exemplojunit.BancoDeDados;
import com.isaqueiodscompahia.exemplojunit.Pessoa;
import java.time.LocalDateTime;
import java.time.Month;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10 PRO
 */
public class ConsultarBancoDeDadosTest {
    
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }
    
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }
    
    @BeforeEach
    void insereDadosParaTeste2(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }
    
    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }
    
    
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
    
    
}
