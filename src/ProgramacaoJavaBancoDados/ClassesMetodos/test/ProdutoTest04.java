package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 4 — Classe Produto.
public class ProdutoTest04 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook"; produto.preco = 3500; produto.quantidade = 3;
        System.out.println(produto.nome + " | R$ " + produto.preco + " | Quantidade: " + produto.quantidade);
    }
}
