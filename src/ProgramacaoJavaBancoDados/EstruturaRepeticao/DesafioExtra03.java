package ProgramacaoJavaBancoDados.EstruturaRepeticao;

// Desafio extra: Tentativas de login.
public class DesafioExtra03 {
    public static void main(String[] args) {
        int tentativas = 0;
        System.out.println("Usando while:");
        while (tentativas < 3) { System.out.println("Tentando fazer login..."); tentativas++; }
        System.out.println("Usando for:");
        for (int i = 0; i < 3; i++) System.out.println("Tentando fazer login...");
        System.out.println("O for é direto para três repetições; o while destaca a condição de parada.");
    }
}
