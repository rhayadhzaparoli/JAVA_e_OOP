package LIN3.ex004Atividade.View;

import java.util.Scanner;

import LIN3.ex004Atividade.Business.Veiculo;

public class Main {
    
 
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do veículo: ");
        String nome = scan.nextLine();
        System.out.println("\nInforme o fabricante do veículo: ");
        String fabricante = scan.nextLine();
        System.out.println("\nInforme o ano do veículo: ");
        int ano = scan.nextInt();

        Veiculo transporte = new Veiculo(nome, fabricante, ano);

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Desacelerar");
            System.out.println("3 - Parar");
            System.out.println("4 - Sair");

            int escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                  transporte.acelerar();
                    break;
                case 2:
                    transporte.desacelerar();
                    break;
                case 3:
                    transporte.parar();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
    }
}

}