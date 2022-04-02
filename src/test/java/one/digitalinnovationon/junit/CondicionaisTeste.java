package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named="USER",matches = "root")
    void validarAlgoSomenteNoUsuario(){
        Assertions.assertEquals(10,5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named="USER",matches = "root")
    void validarAlgoSomenteNoUsuarioDisable(){
        Assertions.assertEquals(10,5+5);
    }

    @Test
    @EnabledOnOs({OS.LINUX,OS.WINDOWS}) // Linux ou Windows
    void validarAlgoSobreOS(){
        Assertions.assertEquals(10,5+5);
    }

    @Test
    @EnabledOnJre (JAVA_8) // java aceito
    void validarAlgoSobreJAVA(){
        Assertions.assertEquals(10,5+5);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17) // faixa de aceitação
    void validarAlgoSobreJavaRange(){
        Assertions.assertEquals(10,5+5);
    }
}
