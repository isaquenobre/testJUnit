
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10 PRO
 */

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {
    
    /*@Order(4)
    @Test
    void validaFluxoA(){
        
        Assertions.assertTrue(true, "validação 1");
        
    }
    
    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true, "validação 2");
    }
    
    @Order(2)
    @Test
    void validaFluxoC(){
     Assertions.assertTrue(true, "validação 3");   
    }
    
    
    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true, "validação 4");
    }*/
    
    /* @Test
    void validaFluxoA(){
        
        Assertions.assertTrue(true, "validação 1");
        
    }
    
    
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true, "validação 2");
    }
    
    
    @Test
    void validaFluxoC(){
     Assertions.assertTrue(true, "validação 3");   
    }
    
    
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true, "validação 4");
    }*/
    
    @DisplayName("teste para usuario criado")
    @Test
    void validaFluxoA(){
        
        Assertions.assertTrue(true);
        
    }
    
    @DisplayName("B")
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true, "validação 2");
    }
    
    @DisplayName("C")
    @Test
    void validaFluxoC(){
     Assertions.assertTrue(true, "validação 3");   
    }
    
    @DisplayName("D ")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true, "validação 4");
    }
    
}
