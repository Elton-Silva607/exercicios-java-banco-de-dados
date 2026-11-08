package ProgramacaoJavaBancoDados.ClassesMetodos.dominio;

public class ImpressoraProduto {
    public void imprime(Produto produto) {
        System.out.println("Nome: " + produto.nome + " | Preço: " + produto.preco + " | Quantidade: " + produto.quantidade + " | Total: " + produto.calcularValorTotal());
    }
}
