package Matriz;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas a serem entrevistadas:");
        int numPessoas = scanner.nextInt();

        // Criação do vetor irregular para armazenar os nomes dos filhos
        String[][] nomesFilhos = new String[numPessoas][];

        // Solicitação da quantidade de filhos para cada pessoa e seus nomes
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Informe a quantidade de filhos para a pessoa " + (i + 1) + ":");
            int numFilhos = scanner.nextInt();

            // Criação do vetor para armazenar os nomes dos filhos da pessoa atual
            nomesFilhos[i] = new String[numFilhos];

            // Solicitação dos nomes dos filhos
            for (int j = 0; j < numFilhos; j++) {
                System.out.println("Informe o nome do filho " + (j + 1) + " da pessoa " + (i + 1) + ":");
                nomesFilhos[i][j] = scanner.next();
            }
        }

        // Impressão das informações
        System.out.println("\nResultados da Entrevista:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("A pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filho(s):");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("- " + nomesFilhos[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
