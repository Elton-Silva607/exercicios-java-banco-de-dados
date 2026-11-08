package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 3 — Classe Carro.
public class CarroTest03 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Gol"; carro1.modelo = "Volkswagen"; carro1.ano = 2009;
        Carro carro2 = new Carro();
        carro2.nome = "Onix"; carro2.modelo = "Chevrolet"; carro2.ano = 2022;
        System.out.println(carro1.nome + " | " + carro1.modelo + " | " + carro1.ano);
        System.out.println(carro2.nome + " | " + carro2.modelo + " | " + carro2.ano);
    }
}
