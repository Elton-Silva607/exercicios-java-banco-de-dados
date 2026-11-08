package ProgramacaoJavaBancoDados.EstruturaRepeticao;


// Exercício 6 — Mostrar apenas números ímpares.
public class Exercicio06 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 2 != 0) System.out.println(numero);
        }
    }
}
