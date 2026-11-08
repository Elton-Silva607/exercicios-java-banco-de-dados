package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 6 — Classe Celular.
public class CelularTest06 {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.marca = "Samsung"; celular.modelo = "S25"; celular.armazenamento = 256; celular.preco = 4500;
        System.out.println("Celular " + celular.marca + " " + celular.modelo + " com " + celular.armazenamento + "GB custa R$ " + celular.preco);
    }
}
