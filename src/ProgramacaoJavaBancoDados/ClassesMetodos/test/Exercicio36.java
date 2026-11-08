package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 36 — Depositar na conta.
public class Exercicio36 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(); conta.saldo = 100;
        System.out.println("Saldo antes: " + conta.saldo);
        conta.depositar(50);
        System.out.println("Saldo depois: " + conta.saldo);
    }
}
