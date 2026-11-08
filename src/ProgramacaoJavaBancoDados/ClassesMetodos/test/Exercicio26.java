package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 26 — Verificar limite de saque.
public class Exercicio26 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(); conta.saldo = 100;
        System.out.println("Pode sacar 50: " + conta.podeSacar(50));
        System.out.println("Pode sacar 120: " + conta.podeSacar(120));
    }
}
