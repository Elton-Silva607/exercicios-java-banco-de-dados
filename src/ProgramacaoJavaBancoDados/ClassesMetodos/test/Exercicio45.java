package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 45 — Comparar dois produtos.
public class Exercicio45 {
    public static void main(String[] args) {
        Produto produto1 = new Produto(); produto1.nome = "Notebook"; produto1.preco = 3000;
        Produto produto2 = new Produto(); produto2.nome = "Mouse"; produto2.preco = 80;
        ComparadorProduto comparador = new ComparadorProduto();
        Produto maisCaro = comparador.retornarProdutoMaisCaro(produto1, produto2);
        System.out.println("Produto mais caro: " + maisCaro.nome);
    }
}
