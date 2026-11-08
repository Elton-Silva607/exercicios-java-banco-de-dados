package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 14 — Produto com valor total.
public class Exercicio14 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caderno"; produto.preco = 20; produto.quantidade = 5;
        System.out.println("Valor total em estoque: R$ " + produto.calcularValorTotal());
    }
}
