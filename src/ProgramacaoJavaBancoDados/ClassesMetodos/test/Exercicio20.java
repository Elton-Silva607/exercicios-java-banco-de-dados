package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 20 — Celular premium.
public class Exercicio20 {
    public static void main(String[] args) {
        Celular celular1 = new Celular(); celular1.modelo = "Modelo A"; celular1.preco = 4000;
        Celular celular2 = new Celular(); celular2.modelo = "Modelo B"; celular2.preco = 1500;
        System.out.println(celular1.modelo + " é premium: " + celular1.isPremium());
        System.out.println(celular2.modelo + " é premium: " + celular2.isPremium());
    }
}
