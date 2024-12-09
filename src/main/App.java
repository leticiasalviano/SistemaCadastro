package main;

import services.UsuarioService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();

        while (true) {
            System.out.println("\n=== Sistema de Cadastro ===");
            System.out.println("1. Adicionar Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Procurar Usuario por Nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do usuário: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    usuarioService.adicionarUsuario(nome, idade);
                    break;

                case 2:
                    usuarioService.listarUsuarios();
                    break;

                case 3:
                    System.out.print("Digite o nome do usuário que deseja procurar: ");
                    String busca = scanner.nextLine();
                    usuarioService.procurarUsuario(busca);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema. Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
