package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 16 — Carro antigo ou novo.
public class Exercicio16 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); carro1.nome = "Carro A"; carro1.ano = 2009;
        Carro carro2 = new Carro(); carro2.nome = "Carro B"; carro2.ano = 2010;
        System.out.println(carro1.nome + ": " + carro1.verificarIdadeDoCarro());
        System.out.println(carro2.nome + ": " + carro2.verificarIdadeDoCarro());
    }
}
