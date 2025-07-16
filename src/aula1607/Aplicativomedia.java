package aula1607;

public class Aplicativomedia {
    public static void main (String[] args) {
        String nome = "Paulo";

        // Notas como Strings
        String nota01 = "5.30";
        String nota02 = "7.25";
        String nota03 = "8.50";
        String nota04 = "6.66";
        String nota05 = "5.99";
        String nota06 = "10.00";
        String nota07 = "9.10";
        String nota08 = "8.20";
        String nota09 = "8.55";
        String nota10 = "6.99";

        // Variáveis de cálculo
        double soma = 0.0;
        double media;
        double valor;


        System.out.println("O nome do aluno é?\n" + nome);
        System.out.println("Calcule a media do aluno " + nome + "\n");

        // Convertendo e somando as notas
        valor = Double.parseDouble(nota01);
        System.out.printf("A nota do semestre 1 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota02);
        System.out.printf("A nota do semestre 2 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota03);
        System.out.printf("A nota do semestre 3 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota04);
        System.out.printf("A nota do semestre 4 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota05);
        System.out.printf("A nota do semestre 5 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota06);
        System.out.printf("A nota do semestre 6 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota07);
        System.out.printf("A nota do semestre 7 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota08);
        System.out.printf("A nota do semestre 8 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota09);
        System.out.printf("A nota do semestre 9 é: %.2f%n", valor);
        soma = soma + valor;

        valor = Double.parseDouble(nota10);
        System.out.printf("A nota do semestre 10 é: %.2f%n", valor);
        soma = soma + valor;

        // Calculando a média
        media = soma / 10;

        // Exibindo o resultado
        System.out.printf("A média do aluno %s é: %.2f%n", nome, media);


    }

}
