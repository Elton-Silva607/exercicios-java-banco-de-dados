package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 41 — Cadastrar estudante.
public class Exercicio41 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante(); Estudante estudante2 = new Estudante();
        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(estudante1, "Ana", 20, 'F');
        cadastro.cadastrar(estudante2, "João", 22, 'M');
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
