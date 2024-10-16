package br.com.alura.modelos;

public class Pessoa {
    public String nome;
    public int idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
