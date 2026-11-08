package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 11 — Média do aluno.
public class Exercicio11 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana"; aluno.nota1 = 8; aluno.nota2 = 6;
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
