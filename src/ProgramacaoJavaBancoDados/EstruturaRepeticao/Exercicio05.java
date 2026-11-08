package ProgramacaoJavaBancoDados.EstruturaRepeticao;


// Exercício 5 — Mostrar apenas números pares.
public class Exercicio05 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 2 == 0) System.out.println(numero);
        }
    }
}
