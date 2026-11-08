package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 49 — Atualizar situação do aluno.
public class Exercicio49 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); aluno.nome = "Ana"; aluno.nota1 = 4; aluno.nota2 = 4;
        System.out.println("Situação anterior: " + aluno.getSituacao());
        Secretaria secretaria = new Secretaria();
        secretaria.atualizarAluno(aluno, 8, 8);
        System.out.println("Nova situação: " + aluno.getSituacao());
    }
}
