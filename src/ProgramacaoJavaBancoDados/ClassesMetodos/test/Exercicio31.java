package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 31 — Imprimir dados do estudante.
public class Exercicio31 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante(); estudante1.nome = "Ana"; estudante1.idade = 20; estudante1.sexo = 'F';
        Estudante estudante2 = new Estudante(); estudante2.nome = "João"; estudante2.idade = 22; estudante2.sexo = 'M';
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
