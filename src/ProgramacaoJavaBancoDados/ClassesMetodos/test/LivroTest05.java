package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 5 — Classe Livro.
public class LivroTest05 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Java"; livro1.autor = "Ana"; livro1.numeroPaginas = 250; livro1.preco = 70;
        Livro livro2 = new Livro();
        livro2.titulo = "Banco de Dados"; livro2.autor = "Bruno"; livro2.numeroPaginas = 400; livro2.preco = 90;
        System.out.println(livro1.titulo + " | " + livro1.autor + " | " + livro1.numeroPaginas + " páginas | R$ " + livro1.preco);
        System.out.println(livro2.titulo + " | " + livro2.autor + " | " + livro2.numeroPaginas + " páginas | R$ " + livro2.preco);
    }
}
