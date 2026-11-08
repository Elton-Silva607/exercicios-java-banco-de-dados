package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 37 — Sacar da conta.
public class Exercicio37 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(); conta.saldo = 100;
        conta.sacar(40);
        System.out.println("Saldo após saque: " + conta.saldo);
        conta.sacar(100);
        System.out.println("Saldo final: " + conta.saldo);
    }
}
