package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 48 — Alterar preço de produto por referência.
public class Exercicio48 {
    public static void main(String[] args) {
        Produto produto = new Produto(); produto.nome = "Livro"; produto.preco = 100;
        System.out.println("Preço antes: " + produto.preco);
        Promocao promocao = new Promocao();
        promocao.aplicarDesconto(produto, 10);
        System.out.println("Preço depois: " + produto.preco);
    }
}
