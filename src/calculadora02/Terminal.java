package calculadora02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        // Códigos ANSI para colorir o texto no terminal
        final String VERMELHO = "\u001B[31m";
        final String AMARELO = "\u001B[33m";
        final String CIANO = "\u001B[36m";
        final String AZUL = "\u001B[34m";

        Scanner scanner = new Scanner(System.in);

        boolean entradaValida = false;
        String nome = "";
        double VP = 0, taxa = 0;
        int tempo = 0;
        boolean taxaMensal = true;

        // Loop para repetir caso o usuário digite algo inválido
        while (!entradaValida) {
            try {
                System.out.print(AZUL + "Digite o nome do investidor: ");
                nome = scanner.nextLine();

                System.out.print(AZUL + "Digite o valor do investimento (ex: 1000): ");
                VP = scanner.nextDouble();
                if (VP <= 0) {
                    System.out.println(VERMELHO + "O valor deve ser maior que zero.");
                    continue;
                }

                System.out.print(AZUL + "Digite a taxa de juros (ex: 0.05 para 5%): ");
                taxa = scanner.nextDouble();
                while (taxa < 0 || taxa > 1.0) {
                    System.out.print(VERMELHO + "Erro: a taxa deve estar entre 0 e 1 (ex: 0.05 para 5%).\n" + AZUL + "Digite novamente: ");
                    taxa = scanner.nextDouble();
                }

                System.out.print(AZUL + "Digite o tempo do investimento (em número): ");
                tempo = scanner.nextInt();
                if (tempo <= 0) {
                    System.out.println(VERMELHO + "O tempo deve ser maior que zero.");
                    continue;
                }

                System.out.print(AZUL + "A taxa é mensal ou anual? (m/a): ");
                String tipo = scanner.next().toLowerCase();
                if (tipo.equals("m")) {
                    taxaMensal = true;
                } else if (tipo.equals("a")) {
                    taxaMensal = false;
                } else {
                    System.out.println(VERMELHO + "Opção inválida. Digite 'm' ou 'a'.");
                    continue;
                }

                entradaValida = true; // Tudo certo, sai do loop

            } catch (InputMismatchException e) {
                System.out.println(VERMELHO + "Entrada inválida. Use números com ponto (ex: 0.05).");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        // Cria o objeto Investidor e imprime o resumo
        Investidor investidor = new Investidor(nome, VP, taxa, tempo, taxaMensal);
        investidor.imprimirResumo();

        scanner.close();
    }
}