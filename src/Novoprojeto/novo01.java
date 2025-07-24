package Novoprojeto;

import java.util.*;

class Agendamento {
    String nome;
    String servico;
    double valor;
    String horario;
    String pagamento;

    public Agendamento(String nome, String servico, double valor, String horario, String pagamento) {
        this.nome = nome;
        this.servico = servico;
        this.valor = valor;
        this.horario = horario;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s | Serviço: %s | Valor: R$ %.2f | Horário: %s | Pagamento: %s",
                nome, servico, valor, horario, pagamento);
    }
}

public class novo01 {
    static List<Agendamento> agendamentos = new ArrayList<>();
    static Set<String> horariosReservados = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] servicos = {"Design de sobrancelhas", "Cílios", "Maquiagem"};
        double[] precos = {35.00, 150.00, 80.00};
        List<String> horarios = gerarHorarios();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n==== Novo Agendamento ====");

            System.out.print("Digite o nome da cliente: ");
            String nome = scanner.nextLine();

            // Escolher serviço
            int escolhaServico;
            while (true) {
                System.out.println("\nEscolha o serviço:");
                for (int i = 0; i < servicos.length; i++) {
                    System.out.printf("%d - %s (R$ %.2f)\n", i + 1, servicos[i], precos[i]);
                }
                System.out.print("Digite o número do serviço: ");
                escolhaServico = scanner.nextInt();
                if (escolhaServico >= 1 && escolhaServico <= servicos.length) break;
                System.out.println("Opção inválida. Tente novamente.");
            }

            // Escolher horário disponível
            System.out.println("\n=== Horários disponíveis ===");
            List<Integer> opcoesValidas = new ArrayList<>();
            for (int i = 0; i < horarios.size(); i++) {
                String h = horarios.get(i);
                if (!horariosReservados.contains(h)) {
                    System.out.printf("%d - %s\n", i + 1, h);
                    opcoesValidas.add(i + 1);
                }
            }

            if (opcoesValidas.isEmpty()) {
                System.out.println("❌ Todos os horários estão ocupados.");
                break;
            }

            int escolhaHorario;
            while (true) {
                System.out.print("Digite o número do horário desejado: ");
                escolhaHorario = scanner.nextInt();
                if (opcoesValidas.contains(escolhaHorario)) break;
                System.out.println("Horário já ocupado ou inválido. Tente outro.");
            }

            String horarioEscolhido = horarios.get(escolhaHorario - 1);
            horariosReservados.add(horarioEscolhido);
            scanner.nextLine(); // limpar buffer

            // Forma de pagamento
            String[] formasPagamento = {"PIX", "Cartão", "Dinheiro"};
            int escolhaPagamento;
            System.out.println("\nFormas de pagamento:");
            for (int i = 0; i < formasPagamento.length; i++) {
                System.out.printf("%d - %s\n", i + 1, formasPagamento[i]);
            }

            while (true) {
                System.out.print("Escolha a forma de pagamento: ");
                escolhaPagamento = scanner.nextInt();
                if (escolhaPagamento >= 1 && escolhaPagamento <= formasPagamento.length) break;
                System.out.println("Opção inválida. Tente novamente.");
            }

            String pagamento = formasPagamento[escolhaPagamento - 1];

            // Criar e salvar agendamento
            Agendamento a = new Agendamento(
                    nome,
                    servicos[escolhaServico - 1],
                    precos[escolhaServico - 1],
                    horarioEscolhido,
                    pagamento
            );
            agendamentos.add(a);

            System.out.println("\n✅ Agendamento realizado com sucesso!");
            System.out.println(a);

            // Perguntar se deseja continuar
            System.out.print("\nDeseja realizar outro agendamento? (s/n): ");
            String resp = scanner.next();
            scanner.nextLine(); // limpar
            if (!resp.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Mostrar todos os agendamentos
        System.out.println("\n📋 Resumo do Dia - Agendamentos:");
        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento realizado.");
        } else {
            double total = 0;
            for (Agendamento a : agendamentos) {
                System.out.println(a);
                total += a.valor;
            }
            System.out.printf("💰 Total em serviços do dia: R$ %.2f\n", total);
        }

        scanner.close();
    }

    public static List<String> gerarHorarios() {
        List<String> horarios = new ArrayList<>();
        int hora = 9;
        int minuto = 0;
        while (hora < 19 || (hora == 19 && minuto == 0)) {
            String horaFormatada = String.format("%02d:%02d", hora, minuto);
            horarios.add(horaFormatada);
            minuto += 30;
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
        }
        return horarios;
    }
}