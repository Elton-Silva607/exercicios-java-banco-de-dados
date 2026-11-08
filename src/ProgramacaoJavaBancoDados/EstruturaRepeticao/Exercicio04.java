package ProgramacaoJavaBancoDados.EstruturaRepeticao;


// Exercício 4 — Somar números de 1 até 100.
public class Exercicio04 {
    public static void main(String[] args) {
        int soma = 0;
        for (int numero = 1; numero <= 100; numero++) {
            soma += numero;
        }
        System.out.println("A soma de 1 até 100 é: " + soma);
    }
}
