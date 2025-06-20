
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10 PRO
 */
public class AssumptionsTeste {
    
    @Test
    void validarAlgoSomenteNoUsuarioIsaque(){
        Assumptions.assumeFalse("usuario".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 10);
        
    }
}
