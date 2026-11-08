package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 47 — Trocar velocidades entre carros.
public class Exercicio47 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); carro1.nome = "A"; carro1.velocidadeAtual = 30;
        Carro carro2 = new Carro(); carro2.nome = "B"; carro2.velocidadeAtual = 70;
        System.out.println("Antes: " + carro1.velocidadeAtual + " | " + carro2.velocidadeAtual);
        Oficina oficina = new Oficina();
        oficina.trocarVelocidades(carro1, carro2);
        System.out.println("Depois: " + carro1.velocidadeAtual + " | " + carro2.velocidadeAtual);
    }
}
