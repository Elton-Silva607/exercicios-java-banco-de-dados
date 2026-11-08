package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 10 — Classe Aluno.
public class AlunoTest10 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana"; aluno.nota1 = 8; aluno.nota2 = 7;
        System.out.println(aluno.nome + " | Nota 1: " + aluno.nota1 + " | Nota 2: " + aluno.nota2);
    }
}
