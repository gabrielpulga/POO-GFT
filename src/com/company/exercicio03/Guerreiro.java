package com.company.exercicio03;

import java.util.List;

public class Guerreiro extends Personagem {
    private List<String> Habilidade;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getHabilidade() {
        return Habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        Habilidade = habilidade;
    }

    int novaVida = 0;
    int novaForca = 0;
    public void lvlUp() {
        novaVida = novaVida + 5 + this.getVida();
        novaForca = novaForca + 10 + this.getForca();

        System.out.println("O personagem " + this.getNome() + " subiu de nível e agora possui " + novaVida + " de vida e " + novaForca + " de forca");

    }

    public void attack() {
        double danoDoAtaque = getForca()*getLevel() + Math.floor(Math.random() * 301);

        System.out.println(getNome() + " realizou um ataque e causou " + danoDoAtaque + " de dano");
    }

    public void aprenderHabilidade(String habilidadeAprendida) {
        System.out.println(this.getNome() + " acabou de aprender a habilidade " + habilidadeAprendida + " e esta pronto para utiliza-la");
    }
}
