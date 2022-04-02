package one.digitalinnovationon.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaDadosDePessoaTest {
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }
    @AfterEach
    void removerDadosParaTeste(){
        BancoDeDados.removerDados(new Pessoa("João", LocalDate.of(2000,1,1)));
    }
    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
        System.out.println("OK!");
    }

    @AfterAll
    static void finalizaConexao(){
        BancoDeDados.finalizarConexao();
    }

}
