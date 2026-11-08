package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 17 — Conta bancária com saldo positivo.
public class Exercicio17 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(); conta.saldo = 250;
        System.out.println("Conta tem saldo: " + conta.temSaldo());
    }
}
