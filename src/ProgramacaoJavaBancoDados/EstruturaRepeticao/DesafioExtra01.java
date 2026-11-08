package ProgramacaoJavaBancoDados.EstruturaRepeticao;

// Desafio extra: Contagem de 1 a 10.
public class DesafioExtra01 {
    public static void main(String[] args) {
        System.out.println("Usando for:");
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");
        System.out.println("\nUsando while:");
        int i = 1;
        while (i <= 10) { System.out.print(i + " "); i++; }
        System.out.println("\nO for deixa a contagem em uma linha; o while destaca a condição.");
    }
}
