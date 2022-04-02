package one.digitalinnovationon.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getCanonicalName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("Iniciou a conexao");
    }

    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou a conexao");
    }

    public static void inserirDados(Pessoa pessoa){
        // inseriu os dados
        LOGGER.info("Inseriu dados");
    }

    public static void removerDados(Pessoa pessoa) {
        //removeu alguma coisa
        LOGGER.info("Removeu dados");
    }
}
