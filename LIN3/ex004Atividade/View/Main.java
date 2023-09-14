package LIN3.ex004Atividade.View;

import java.util.Scanner;

import LIN3.ex004AssociacaoComplementar.Business.Moto;
import LIN3.ex004Atividade.Business.Carro;
import LIN3.ex004Atividade.Business.Veiculo;

public class Main {
    
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         System.out.println("Escolha o veículo que será utilizado");
         System.out.println("1: Veiculo \n2: Carro \n3:Moto");
        
        int choice = scan.nextInt();
         switch (choice) {
            case 1: 
            Veiculo veiculo = new Veiculo("Fusca", "VW", 1968);
            break;

            case 2:
            Carro carro = new Carro("X86", "Audi", 2023, 4);
            break;

            case 3:
            Moto moto = new Moto("XJ6", "Yamaha", 2022, choice);
            break;

            default: 
            System.out.println("Valor invalido");
         }

         Veiculo transporte = new Veiculo(null, null, choice);

         while (true) {
            System.out.println();
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


