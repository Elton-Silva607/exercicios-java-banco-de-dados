package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 22 — Aumentar preço do produto.
public class Exercicio22 {
    public static void main(String[] args) {
        Produto produto = new Produto(); produto.nome = "Livro"; produto.preco = 100;
        System.out.println("Preço com aumento de 20%: " + produto.aumentarPreco(20));
    }
}
