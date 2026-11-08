package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 19 — Filme longo ou curto.
public class Exercicio19 {
    public static void main(String[] args) {
        Filme filme = new Filme(); filme.titulo = "Aventura"; filme.duracaoMinutos = 130;
        System.out.println("Filme longo: " + filme.isFilmeLongo());
    }
}
