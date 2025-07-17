package aula1607;

import java.util.Scanner;

public class teste {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada do nome do aluno
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            // Variáveis de notas como Strings
            String nota01, nota02, nota03, nota04, nota05, nota06, nota07, nota08, nota09, nota10;

            // Entrada das notas
            System.out.print("Digite a nota do semestre 1: ");
            nota01 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 2: ");
            nota02 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 3: ");
            nota03 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 4: ");
            nota04 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 5: ");
            nota05 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 6: ");
            nota06 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 7: ");
            nota07 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 8: ");
            nota08 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 9: ");
            nota09 = scanner.nextLine();

            System.out.print("Digite a nota do semestre 10: ");
            nota10 = scanner.nextLine();

            // Variáveis de cálculo
            double soma = 0.0;
            double media;
            double valor;

            System.out.println("\nO nome do aluno é: " + nome);
            System.out.println("Calcule a média do aluno " + nome + "\n");

            // Convertendo e somando as notas
            valor = Double.parseDouble(nota01);
            System.out.printf("A nota do semestre 1 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota02);
            System.out.printf("A nota do semestre 2 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota03);
            System.out.printf("A nota do semestre 3 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota04);
            System.out.printf("A nota do semestre 4 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota05);
            System.out.printf("A nota do semestre 5 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota06);
            System.out.printf("A nota do semestre 6 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota07);
            System.out.printf("A nota do semestre 7 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota08);
            System.out.printf("A nota do semestre 8 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota09);
            System.out.printf("A nota do semestre 9 é: %.2f%n", valor);
            soma += valor;

            valor = Double.parseDouble(nota10);
            System.out.printf("A nota do semestre 10 é: %.2f%n", valor);
            soma += valor;

            // Calculando a média
            media = soma / 10;

            // Exibindo o resultado
            System.out.printf("A média do aluno %s é: %.2f%n", nome, media);

            scanner.close();
        }
    }

