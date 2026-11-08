package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 38 — Aumentar velocidade do carro.
public class Exercicio38 {
    public static void main(String[] args) {
        Carro carro = new Carro(); carro.velocidadeAtual = 30;
        System.out.println("Velocidade antes: " + carro.velocidadeAtual);
        carro.acelerar(20);
        System.out.println("Velocidade depois: " + carro.velocidadeAtual);
    }
}
