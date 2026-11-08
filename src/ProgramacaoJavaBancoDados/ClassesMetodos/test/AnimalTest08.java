package ProgramacaoJavaBancoDados.ClassesMetodos.test;

import ProgramacaoJavaBancoDados.ClassesMetodos.dominio.*;

// Exercício 8 — Classe Animal.
public class AnimalTest08 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nome = "Luna"; animal1.especie = "Gato"; animal1.idade = 3;
        Animal animal2 = new Animal();
        animal2.nome = "Bob"; animal2.especie = "Cachorro"; animal2.idade = 5;
        System.out.println(animal1.nome + " | " + animal1.especie + " | " + animal1.idade);
        System.out.println(animal2.nome + " | " + animal2.especie + " | " + animal2.idade);
    }
}
