package calculadora03;

import java.util.Scanner;
public class Terminal {
    public static void main(String[] args) {
        final String VERMELHO = "\u001B[31m";
        final String AMARELO = "\u001B[33m";
        final String CIANO = "\u001B[36m";
        final String AZUL = "\u001B[34m";
        Scanner scanner = new Scanner(System.in);

        System.out.println(AZUL + "Digite o valor do investimento: ");
        double VP = scanner.nextDouble();

        System.out.println(AZUL + "Digite o valor do juros (ex: 0,05 para 5%):");
        double i = scanner.nextDouble();

        while (i > 1.0 || i < 0) {
            System.out.println(VERMELHO + "Erro: O valor do juros deve estar entre 0 e 1.00 (ou 100%).\n" + AZUL + "Tente novamente (ex: 0,05 para 5%):");
            i = scanner.nextDouble();
        }

        System.out.println(AZUL + "Digite o tempo do investimento: ");
        double T = scanner.nextDouble();

        String tipoTaxa;
        while (true) {
            System.out.println( AZUL + "A taxa de juros é mensal ou anual? (Digite 'm' para mensal ou 'a' para anual): ");
            tipoTaxa = scanner.next().toLowerCase();

            if (tipoTaxa.equals("m")) {
                break;
            } else if (tipoTaxa.equals("a")) {
                T = T * 12;
                break;
            } else {
                System.out.println(VERMELHO + "Opção inválida.");
            }
        }

        double VF = VP * Math.pow(1 + i, T);
        System.out.printf(CIANO + "O valor futuro do investimento de R$%.2f com juros de %.2f durante %.0f períodos será de: R$%.2f%n", VP, i, T, VF);

        scanner.close();
    }
}

