package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioSeTrue(){
        Assumptions.assumeTrue("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10,5+5);
    }

    @Test
    void validarAlgoSomenteNoUsuarioSeFalse(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10,5+5);
        System.out.println("usuario = "+ System.getenv("USER"));
    }
}
