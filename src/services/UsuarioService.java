package services;

import models.Usuario;
import java.util.ArrayList;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Adicionar um novo usuário
    public void adicionarUsuario(String nome, int idade) {
        Usuario usuario = new Usuario(nome, idade);
        usuarios.add(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    // Listar todos os usuários
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\n=== Lista de Usuários ===");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    // Procurar usuário por nome
    public void procurarUsuario(String nome) {
        boolean encontrado = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Usuário encontrado: " + usuario);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Usuário não encontrado.");
        }
    }
}
