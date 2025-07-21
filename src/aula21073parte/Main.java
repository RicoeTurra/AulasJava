package aula21073parte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contato contato = new Contato();  // Cria objeto Contato

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        contato.setNome(nome);

        System.out.print("Digite o telefone (10 ou 11 dígitos): ");
        String telefone = scanner.nextLine();
        contato.setTelefone(telefone);

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        contato.setEmail(email);

        System.out.println("\nContato cadastrado:");
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());

        scanner.close();
    }
}
