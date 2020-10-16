package com.company.exercicio07;

public class Main {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Joao", 22, 6500);
        Supervisor supervisor = new Supervisor("Ana", 24, 4500);
        Vendedor vendedor = new Vendedor("Helio", 19, 3000);

        System.out.println("Bonificacao do gerente : " + gerente.bonificacao());
        System.out.println("Bonificacao do supervisor : " + supervisor.bonificacao());
        System.out.println("Bonificacao do vendedor : " + vendedor.bonificacao());

    }
}
