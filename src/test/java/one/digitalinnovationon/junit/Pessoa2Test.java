package one.digitalinnovationon.junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Pessoa2Test {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa2 jessica = new Pessoa2("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa2 jessica = new Pessoa2("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa2 joao = new Pessoa2("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

    @Test
    void validaIgualdade() {
        Pessoa2 pessoa = new Pessoa2("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }
}