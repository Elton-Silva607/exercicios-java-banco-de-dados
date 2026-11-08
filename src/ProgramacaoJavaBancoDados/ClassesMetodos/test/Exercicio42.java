package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 42 — Cadastrar carro.
public class Exercicio42 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); Carro carro2 = new Carro();
        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Gol", "VW", 2010, 60);
        cadastro.cadastrar(carro2, "Onix", "Chevrolet", 2022, 80);
        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro1);
        impressora.imprime(carro2);
    }
}
