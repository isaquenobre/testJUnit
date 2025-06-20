
import com.isaqueiodscompahia.exemplojunit.Conta;
import com.isaqueiodscompahia.exemplojunit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 10 PRO
 */
public class ExceptionTeste {
    
    @Test
    void validarCenarioDeExcecaoTransferencia(){
        Conta contaOrigem = new Conta("123456",0);
        Conta contaDestino = new Conta("6546515",100);
        
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
        transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
        
        
    }
}
