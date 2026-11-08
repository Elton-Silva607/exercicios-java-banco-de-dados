package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 30 — Verificar estoque mínimo.
public class Exercicio30 {
    public static void main(String[] args) {
        Produto produto = new Produto(); produto.nome = "Caderno"; produto.quantidade = 4;
        System.out.println("Estoque baixo: " + produto.estoqueBaixo(5));
    }
}
