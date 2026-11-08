package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 39 — Frear o carro.
public class Exercicio39 {
    public static void main(String[] args) {
        Carro carro = new Carro(); carro.velocidadeAtual = 30;
        carro.frear(50);
        System.out.println("Velocidade final: " + carro.velocidadeAtual);
    }
}
