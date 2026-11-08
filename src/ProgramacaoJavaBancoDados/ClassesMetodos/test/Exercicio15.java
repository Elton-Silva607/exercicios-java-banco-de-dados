package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 15 — Produto caro ou barato.
public class Exercicio15 {
    public static void main(String[] args) {
        Produto produto1 = new Produto(); produto1.nome = "Notebook"; produto1.preco = 1000;
        Produto produto2 = new Produto(); produto2.nome = "Mouse"; produto2.preco = 90;
        System.out.println(produto1.nome + ": " + produto1.verificarCategoria());
        System.out.println(produto2.nome + ": " + produto2.verificarCategoria());
    }
}
