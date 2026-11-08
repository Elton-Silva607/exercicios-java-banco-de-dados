package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 34 — Mensagem de aprovação.
public class Exercicio34 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); aluno.nome = "Ana"; aluno.nota1 = 6; aluno.nota2 = 7;
        aluno.imprimirSituacao();
    }
}
