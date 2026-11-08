package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 29 — Verificar temperatura.
public class Exercicio29 {
    public static void main(String[] args) {
        Termometro termometro = new Termometro(); termometro.temperaturaAtual = 38;
        System.out.println("Passou do limite: " + termometro.passouDoLimite(37));
    }
}
