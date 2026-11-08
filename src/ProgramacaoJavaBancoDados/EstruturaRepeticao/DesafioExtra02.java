package ProgramacaoJavaBancoDados.EstruturaRepeticao;

// Desafio extra: Soma de 1 a 100.
public class DesafioExtra02 {
    public static void main(String[] args) {
        int somaFor = 0;
        for (int i = 1; i <= 100; i++) somaFor += i;
        int somaWhile = 0;
        int i = 1;
        while (i <= 100) { somaWhile += i; i++; }
        System.out.println("for: " + somaFor + " | while: " + somaWhile);
        System.out.println("Os dois laços produzem a mesma soma; para este intervalo o for é mais conciso.");
    }
}
