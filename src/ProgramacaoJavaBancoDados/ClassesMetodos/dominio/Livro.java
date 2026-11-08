package ProgramacaoJavaBancoDados.ClassesMetodos.dominio;

public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;
    public double preco;

    public String verificarTamanho() {
        return numeroPaginas > 300 ? "Livro grande" : "Livro pequeno";
    }
}
