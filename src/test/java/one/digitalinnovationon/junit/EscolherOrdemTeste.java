package one.digitalinnovationon.junit;

import org.junit.jupiter.api.*;
// ou simplismente
// import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // respeita a ordem definida no @Order
//@TestMethodOrder(MethodOrderer.MethodName.class) // respeita a ordem alfabetica dos metodos
@TestMethodOrder(MethodOrderer.DisplayName.class) // respeita a ordem definida no @DisplayName

public class EscolherOrdemTeste {
    @DisplayName("X - Texto do caso de teste")
//    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
