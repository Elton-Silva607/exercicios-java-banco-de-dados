package ProgramacaoJavaBancoDados.EstruturaRepeticao;


// Exercício 8 — Simulação de caixa registradora.
public class Exercicio08 {
    public static void main(String[] args) {
        int quantidadeProdutos = 5;
        double valorProduto = 20;
        double total = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            total += valorProduto;
        }
        System.out.println("Quantidade de produtos: " + quantidadeProdutos);
        System.out.println("Valor de cada produto: R$ " + valorProduto);
        System.out.println("Total da compra: R$ " + total);
    }
}
