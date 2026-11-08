package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 1 — Classe Estudante.
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ana";
        estudante.idade = 20;
        estudante.sexo = 'F';
        System.out.println("Nome: " + estudante.nome + " | Idade: " + estudante.idade + " | Sexo: " + estudante.sexo);
    }
}
