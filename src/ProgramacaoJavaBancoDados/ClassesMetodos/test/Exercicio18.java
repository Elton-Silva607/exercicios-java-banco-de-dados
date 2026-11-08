package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 18 — Livro grande ou pequeno.
public class Exercicio18 {
    public static void main(String[] args) {
        Livro livro1 = new Livro(); livro1.titulo = "Livro A"; livro1.numeroPaginas = 300;
        Livro livro2 = new Livro(); livro2.titulo = "Livro B"; livro2.numeroPaginas = 301;
        System.out.println(livro1.titulo + ": " + livro1.verificarTamanho());
        System.out.println(livro2.titulo + ": " + livro2.verificarTamanho());
    }
}
