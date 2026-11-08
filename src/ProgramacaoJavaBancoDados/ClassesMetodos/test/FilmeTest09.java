package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 9 — Classe Filme.
public class FilmeTest09 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Aventura"; filme.genero = "Ação"; filme.duracaoMinutos = 125; filme.classificacaoIndicativa = 12;
        System.out.println(filme.titulo + " | " + filme.genero + " | " + filme.duracaoMinutos + " minutos | " + filme.classificacaoIndicativa + " anos");
    }
}
