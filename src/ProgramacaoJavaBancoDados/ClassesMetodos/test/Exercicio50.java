package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 50 — Sistema completo simples.
public class Exercicio50 {
    public static void main(String[] args) {
        Carro carro1 = new Carro(); Carro carro2 = new Carro();
        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Gol", "Volkswagen", 2010, 90);
        cadastro.cadastrar(carro2, "Onix", "Chevrolet", 2022, 60);
        ImpressoraCarro impressora = new ImpressoraCarro();
        int limiteDaVia = 80;
        impressora.imprimir(carro1, limiteDaVia);
        impressora.imprimir(carro2, limiteDaVia);
    }
}
