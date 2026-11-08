package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 35 — Mensagem de multa.
public class Exercicio35 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); carro1.velocidadeAtual = 90;
        Carro carro2 = new Carro(); carro2.velocidadeAtual = 70;
        carro1.imprimirMulta(80);
        carro2.imprimirMulta(80);
    }
}
