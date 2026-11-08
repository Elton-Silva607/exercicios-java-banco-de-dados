package ProgramacaoJavaBancoDados.ClassesMetodos.dominio;

public class ComparadorProduto {
    public Produto retornarProdutoMaisCaro(Produto produto1, Produto produto2) {
        // Em caso de empate, retorna o primeiro produto.
        return produto1.preco >= produto2.preco ? produto1 : produto2;
    }
}
