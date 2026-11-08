package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 40 — Atualizar nota do aluno.
public class Exercicio40 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); aluno.nota1 = 4; aluno.nota2 = 6;
        System.out.println("Média anterior: " + aluno.calcularMedia());
        aluno.atualizarNotas(8, 10);
        System.out.println("Nova média: " + aluno.calcularMedia());
    }
}
