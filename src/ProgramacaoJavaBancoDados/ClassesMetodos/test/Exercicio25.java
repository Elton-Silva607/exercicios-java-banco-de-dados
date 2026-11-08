package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 25 — Verificar maioridade.
public class Exercicio25 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); pessoa.nome = "Ana"; pessoa.idade = 18;
        System.out.println(pessoa.nome + " é maior de idade: " + pessoa.isMaiorDeIdade(18));
    }
}
