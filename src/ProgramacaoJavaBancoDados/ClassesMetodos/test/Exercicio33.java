package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 33 — Imprimir dados do produto.
public class Exercicio33 {
    public static void main(String[] args) {
        Produto produto1 = new Produto(); produto1.nome = "Caderno"; produto1.preco = 20; produto1.quantidade = 5;
        Produto produto2 = new Produto(); produto2.nome = "Lápis"; produto2.preco = 2; produto2.quantidade = 10;
        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto1);
        impressora.imprime(produto2);
    }
}
