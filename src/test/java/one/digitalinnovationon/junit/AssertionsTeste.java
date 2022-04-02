package one.digitalinnovationon.junit;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertionsTeste {

    @Test
    void validarLacamento(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 2, 3, 4, 5};

//        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumeroDeTiposDiferentes(){
        double valor = 5.0;
        double outrovalor = 5.0;

        assertEquals(valor, outrovalor);
    }
}
