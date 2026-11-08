package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 43 — Cadastrar produto.
public class Exercicio43 {
    public static void main(String[] args) {
        Produto produto1 = new Produto(); Produto produto2 = new Produto();
        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(produto1, "Caderno", 20, 5);
        cadastro.cadastrar(produto2, "Lápis", 2, 10);
        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto1);
        impressora.imprime(produto2);
    }
}
