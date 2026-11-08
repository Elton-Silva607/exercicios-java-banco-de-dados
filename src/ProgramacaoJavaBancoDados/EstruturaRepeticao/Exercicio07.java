package ProgramacaoJavaBancoDados.EstruturaRepeticao;


// Exercício 7 — Contador de vendas.
public class Exercicio07 {
    public static void main(String[] args) {
        int quantidadeVendas = 8;
        double valorVenda = 50;
        double faturamento = 0;
        for (int i = 0; i < quantidadeVendas; i++) {
            faturamento += valorVenda;
        }
        System.out.println("Quantidade de vendas: " + quantidadeVendas);
        System.out.println("Faturamento total: R$ " + faturamento);
    }
}
