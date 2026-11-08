package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 44 — Comparar dois alunos.
public class Exercicio44 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(); aluno1.nome = "Ana"; aluno1.nota1 = 8; aluno1.nota2 = 9;
        Aluno aluno2 = new Aluno(); aluno2.nome = "Bia"; aluno2.nota1 = 6; aluno2.nota2 = 7;
        ComparadorAluno comparador = new ComparadorAluno();
        Aluno maiorMedia = comparador.retornarAlunoComMaiorMedia(aluno1, aluno2);
        System.out.println("Maior média: " + maiorMedia.nome);
    }
}
