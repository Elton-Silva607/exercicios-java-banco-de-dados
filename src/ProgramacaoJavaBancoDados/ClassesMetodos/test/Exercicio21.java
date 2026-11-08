package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 21 — Aplicar desconto em produto.
public class Exercicio21 {
    public static void main(String[] args) {
        Produto produto = new Produto(); produto.nome = "Livro"; produto.preco = 100;
        System.out.println("Preço com 10% de desconto: " + produto.aplicarDesconto(10));
    }
}
