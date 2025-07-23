package calculadora02;

public class Investidor implements Investimento {
    private String nome;
    private double valorInicial;
    private double taxa; // decimal, ex: 0.05 para 5%
    private int tempoMeses;
    private boolean taxaMensal;

    // Média da poupança em 2024 (~7,09% ao ano)
    private static final double POUPANCA_ANUAL = 0.0709;
    private static final double POUPANCA_MENSAL = Math.pow(1 + POUPANCA_ANUAL, 1.0 / 12) - 1;

    public Investidor(String nome, double valorInicial, double taxa, int tempo, boolean taxaMensal) {
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.taxa = taxa;
        this.taxaMensal = taxaMensal;
        this.tempoMeses = taxaMensal ? tempo : tempo * 12;
    }

    public double calcularValorFinal() {
        return valorInicial * Math.pow(1 + taxa, tempoMeses);
    }

    public double calcularRetiradaMensal() {
        return calcularValorFinal() / tempoMeses;
    }

    public double calcularPoupancaFinal() {
        return valorInicial * Math.pow(1 + POUPANCA_MENSAL, tempoMeses);
    }

    public void imprimirResumo() {
        final String VERDE = "\u001B[32m";
        final String CIANO = "\u001B[36m";
        final String AMARELO = "\u001B[33m";

        double vfInvest = calcularValorFinal();
        double vfPoupa = calcularPoupancaFinal();
        double diferenca = vfInvest - vfPoupa;
        double porcentagem = (diferenca / vfPoupa) * 100;

        System.out.println("\n" + CIANO + "========== RESUMO DO INVESTIMENTO ==========");
        System.out.println("Investidor: " + nome);
        System.out.printf("Valor Inicial: R$ %.2f%n", valorInicial);
        System.out.printf("Taxa de Juros: %.2f%% ao %s%n", taxa * 100, taxaMensal ? "mês" : "ano");
        System.out.printf("Tempo Total: %d meses%n", tempoMeses);
        System.out.printf("Valor Futuro: R$ %.2f%n", vfInvest);
        System.out.printf("Retirada Mensal (simulada): R$ %.2f%n", calcularRetiradaMensal());

        System.out.println("\n" + AMARELO + "📊 Comparação com a poupança (7,09% a.a.):");
        System.out.printf("Valor na Poupança: R$ %.2f%n", vfPoupa);
        System.out.printf("Diferença: R$ %.2f (%+.2f%%)%n", diferenca, porcentagem);
        System.out.println("============================================\n");
    }
}