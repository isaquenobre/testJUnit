
import com.isaqueiodscompahia.exemplojunit.Pessoa;
import java.time.LocalDateTime;
import java.time.Month;
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
public class PessoaTeste {
    
    @Test
    void deveCalcularIdadeCorretamente(){
        LocalDateTime localDateTime = null;
       
      Pessoa jessica = new Pessoa("Jéssica", localDateTime.of(2000,1,1,15,0,0));
      Assertions.assertEquals(25,jessica.getIdade());
    }
    
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa ("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }
    
}
