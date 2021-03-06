package com.company.exercicio04e05e06;

public class Pessoa {
    private int idade;
    private String nome;

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
