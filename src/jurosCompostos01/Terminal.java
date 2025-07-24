package jurosCompostos01;
import java.util.Scanner;
public class Terminal {

    public static void main(String[] args) {

        // Definição de códigos ANSI para colorir os textos no terminal
        final String VERMELHO = "\u001B[31m";  // Vermelho: usado para mensagens de erro
        final String CIANO = "\u001B[36m";     // Ciano: usado para destaque da saída final
        final String AZUL = "\u001B[34m";      // Azul: usado para mensagens ao usuário

        // Criação do objeto Scanner para entrada de dados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor do investimento inicial (VP) e lê o valor digitado
        System.out.println(AZUL + "Digite o valor do investimento: ");
        double VP = scanner.nextDouble();

        // Solicita ao usuário a taxa de juros (i) em formato decimal (ex: 0,05 para 5%)
        System.out.println(AZUL + "Digite o valor do juros (ex: 0,05 para 5%):");
        double i = scanner.nextDouble();

        // Validação da taxa de juros: deve estar entre 0 e 1 (0% a 100%)
        while (i > 1.0 || i < 0) {
            // Caso inválido, exibe mensagem de erro em vermelho e pede para tentar novamente em azul
            System.out.println(VERMELHO + "Erro: O valor do juros deve estar entre 0 e 1.00 (ou 100%).\n"
                    + AZUL + "Tente novamente (ex: 0,05 para 5%):");
            i = scanner.nextDouble();
        }

        // Solicita o tempo do investimento (T), que inicialmente pode estar em anos ou meses
        System.out.println(AZUL + "Digite o tempo do investimento: ");
        double T = scanner.nextDouble();

        // Variável para armazenar se a taxa de juros é mensal ('m') ou anual ('a')
        String tipoTaxa;

        // Loop para garantir que o usuário informe um tipo de taxa válido
        while (true) {
            System.out.println(AZUL + "A taxa de juros é mensal ou anual? (Digite 'm' para mensal ou 'a' para anual): ");
            tipoTaxa = scanner.next().toLowerCase();  // Converte a entrada para minúsculo para facilitar comparação

            if (tipoTaxa.equals("m")) {
                // Se mensal, o tempo (T) permanece o mesmo (já em meses)
                break;
            } else if (tipoTaxa.equals("a")) {
                // Se anual, converte o tempo para meses multiplicando por 12 (para uniformizar a unidade)
                T = T * 12;
                break;
            } else {
                // Entrada inválida: informa erro e repete o loop
                System.out.println(VERMELHO + "Opção inválida.");
            }
        }

        // Cálculo do valor futuro (VF) com juros compostos usando fórmula: VF = VP * (1 + i)^T
        double VF = VP * Math.pow(1 + i, T);

        // Exibe o resultado formatado com 2 casas decimais e em cor ciano para destaque
        System.out.printf(CIANO + "O valor futuro do investimento de R$%.2f com juros de %.2f durante %.0f períodos será de: R$%.2f%n",
                VP, i, T, VF);

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}



