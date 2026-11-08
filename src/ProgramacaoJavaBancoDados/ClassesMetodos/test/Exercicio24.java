package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 24 — Mensagem da multa.
public class Exercicio24 {
    public static void main(String[] args) {
        Carro carro = new Carro(); carro.velocidadeAtual = 90;
        System.out.println(carro.gerarMensagemMulta(80));
    }
}
