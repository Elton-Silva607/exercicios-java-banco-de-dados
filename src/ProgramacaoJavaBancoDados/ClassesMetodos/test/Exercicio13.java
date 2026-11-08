package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 13 — Situação do aluno.
public class Exercicio13 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana"; aluno1.nota1 = 8; aluno1.nota2 = 8;
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bia"; aluno2.nota1 = 6; aluno2.nota2 = 6;
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Caio"; aluno3.nota1 = 4; aluno3.nota2 = 4;
        System.out.println(aluno1.nome + ": " + aluno1.getSituacao());
        System.out.println(aluno2.nome + ": " + aluno2.getSituacao());
        System.out.println(aluno3.nome + ": " + aluno3.getSituacao());
    }
}
