package one.digitalinnovationon.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    // cenário de erro
    @Test
    void validarCenraioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("45678", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino, -1));
    }
    // cenário de acerto
    @Test
    void validarCenraioDeExcecaoNaTransferencia2(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("45678", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(contaOrigem,contaDestino,  1));
    }
}
