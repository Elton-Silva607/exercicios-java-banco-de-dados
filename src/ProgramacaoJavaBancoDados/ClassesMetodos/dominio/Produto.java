package ProgramacaoJavaBancoDados.ClassesMetodos.dominio;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public String verificarCategoria() {
        return preco >= 1000 ? "Produto caro" : "Produto barato";
    }

    public double aplicarDesconto(double porcentagem) {
        return preco * (1 - porcentagem / 100);
    }

    public double aumentarPreco(double porcentagem) {
        return preco * (1 + porcentagem / 100);
    }

    public double calcularFrete(double taxaFrete) {
        return preco + taxaFrete;
    }

    public boolean estoqueBaixo(int quantidadeMinima) {
        return quantidade < quantidadeMinima;
    }
}
