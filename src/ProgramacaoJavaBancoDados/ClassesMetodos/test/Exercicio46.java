package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 46 — Transferir dinheiro entre contas.
public class Exercicio46 {
    public static void main(String[] args) {
        ContaBancaria origem = new ContaBancaria(); origem.titular = "Ana"; origem.saldo = 200;
        ContaBancaria destino = new ContaBancaria(); destino.titular = "Bia"; destino.saldo = 50;
        Banco banco = new Banco();
        banco.transferir(origem, destino, 80);
        System.out.println("Saldo de " + origem.titular + ": " + origem.saldo);
        System.out.println("Saldo de " + destino.titular + ": " + destino.saldo);
    }
}
