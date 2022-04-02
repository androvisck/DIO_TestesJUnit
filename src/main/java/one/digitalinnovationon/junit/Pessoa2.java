package one.digitalinnovationon.junit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa2 {

    private String nome;

    private LocalDateTime nascimento;

    public Pessoa2(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa2 Pessoa2 = (Pessoa2) o;
        return nome.equals(Pessoa2.nome) && Objects.equals(nascimento, Pessoa2.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nascimento);
    }
}