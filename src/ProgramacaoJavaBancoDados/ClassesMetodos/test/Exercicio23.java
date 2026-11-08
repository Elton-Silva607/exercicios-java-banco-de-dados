package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 23 — Verificar multa do carro.
public class Exercicio23 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); carro1.nome = "Carro A"; carro1.velocidadeAtual = 90;
        Carro carro2 = new Carro(); carro2.nome = "Carro B"; carro2.velocidadeAtual = 60;
        int limite = 80;
        System.out.println(carro1.nome + " multado: " + carro1.isMultado(limite));
        System.out.println(carro2.nome + " multado: " + carro2.isMultado(limite));
    }
}
