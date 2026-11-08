package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 28 — Verificar bônus do funcionário.
public class Exercicio28 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); funcionario.nome = "Ana"; funcionario.salario = 2000;
        System.out.println("Bônus de 10%: " + funcionario.calcularBonus(10));
    }
}
