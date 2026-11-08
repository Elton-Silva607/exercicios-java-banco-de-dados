package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 12 — Verificar aprovação.
public class Exercicio12 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana"; aluno.nota1 = 8; aluno.nota2 = 6;
        System.out.println("Aprovado: " + aluno.isAprovado());
    }
}
