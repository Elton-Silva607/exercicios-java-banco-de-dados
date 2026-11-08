package ProgramacaoJavaBancoDados.ClassesMetodos.dominio;

public class ImpressoraCarro {
    public void imprime(Carro carro) {
        System.out.println("Nome: " + carro.nome + " | Modelo: " + carro.modelo + " | Ano: " + carro.ano + " | Velocidade: " + carro.velocidadeAtual);
    }

    public void imprimir(Carro carro, int limiteDaVia) {
        imprime(carro);
        System.out.println(carro.gerarMensagemMulta(limiteDaVia));
    }
}
