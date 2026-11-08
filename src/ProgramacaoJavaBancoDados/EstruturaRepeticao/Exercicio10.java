package ProgramacaoJavaBancoDados.EstruturaRepeticao;

import java.util.Scanner;

// Exercício 10 — Menu com do while.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: System.out.println("Cadastro selecionado."); break;
                case 2: System.out.println("Listagem selecionada."); break;
                case 3: System.out.println("Sistema encerrado"); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
        scanner.close();
    }
}
