package ProgramacaoJavaBancoDados.ClassesMetodos.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;
    public double velocidadeAtual;

    public String verificarIdadeDoCarro() {
        return ano < 2010 ? "Carro antigo" : "Carro novo";
    }

    public boolean isMultado(int limiteDaVia) {
        return velocidadeAtual > limiteDaVia;
    }

    public String gerarMensagemMulta(int limiteDaVia) {
        return isMultado(limiteDaVia) ? "Passou do limite da via" : "Não passou do limite da via";
    }

    public void imprimirMulta(int limiteDaVia) {
        System.out.println(isMultado(limiteDaVia) ? "Você tem uma multa para pagar" : "Zero multas");
    }

    public void acelerar(double valor) {
        velocidadeAtual += valor;
    }

    public void frear(double valor) {
        velocidadeAtual = Math.max(0, velocidadeAtual - valor);
    }
}
