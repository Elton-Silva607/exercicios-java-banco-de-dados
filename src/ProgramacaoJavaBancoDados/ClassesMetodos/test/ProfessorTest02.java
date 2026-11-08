package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 2 — Classe Professor.
public class ProfessorTest02 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Marcos";
        professor.idade = 40;
        professor.disciplina = "Java";
        professor.salario = 4500;
        System.out.println(professor.nome + " | " + professor.idade + " anos | " + professor.disciplina + " | R$ " + professor.salario);
    }
}
