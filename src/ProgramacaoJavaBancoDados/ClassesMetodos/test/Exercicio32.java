package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 32 — Imprimir dados do carro.
public class Exercicio32 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); carro1.nome = "Gol"; carro1.modelo = "VW"; carro1.ano = 2010; carro1.velocidadeAtual = 60;
        Carro carro2 = new Carro(); carro2.nome = "Onix"; carro2.modelo = "Chevrolet"; carro2.ano = 2022; carro2.velocidadeAtual = 80;
        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro1);
        impressora.imprime(carro2);
    }
}
