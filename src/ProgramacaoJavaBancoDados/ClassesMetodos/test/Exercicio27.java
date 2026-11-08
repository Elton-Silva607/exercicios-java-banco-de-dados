package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 27 — Calcular frete do produto.
public class Exercicio27 {
    public static void main(String[] args) {
        Produto produto = new Produto(); produto.preco = 100;
        System.out.println("Preço com frete: " + produto.calcularFrete(20));
    }
}
