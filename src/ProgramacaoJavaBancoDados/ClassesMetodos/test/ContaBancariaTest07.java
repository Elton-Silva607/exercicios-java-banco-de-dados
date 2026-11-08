package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 7 — Classe ContaBancaria.
public class ContaBancariaTest07 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ana"; conta.numeroConta = "123-4"; conta.saldo = 500;
        System.out.println("Titular: " + conta.titular + " | Conta: " + conta.numeroConta + " | Saldo: " + conta.saldo);
    }
}
