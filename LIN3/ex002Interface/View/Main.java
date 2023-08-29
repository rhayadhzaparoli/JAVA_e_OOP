package LIN3.ex002Interface.View;

import java.util.Scanner;
import LIN3.ex002Interface.Business.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor 1: ");
        float v1 = scan.nextFloat();

        System.out.println("Informe o valor 2: ");
        float v2 = scan.nextFloat();

        float resultado = 0;

        System.out.println("Escolha a operacao que deseja:");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");


        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                Adicao objAdicao = new Adicao(v1, v2);
                resultado = objAdicao.calcular();
                System.out.println("O resultado da adicao é: " + resultado);
                break;

            case 2:
                Subtracao objSubtracao = new Subtracao(v1, v2);
                resultado = objSubtracao.calcular();
                System.out.println("O resultado da subtracao é: " + resultado);
                break;

            case 3:
                Multiplicacao objMultiplicacao = new Multiplicacao(v1, v2);
                resultado = objMultiplicacao.calcular();
                System.out.println("O resultado da multiplicacao é: " + resultado);
                break;
                
             case 4:
             if (resultado != 0){
                Divisao objDivisao = new Divisao(v1, v2);
                resultado = objDivisao.calcular();
                System.out.println("O resultado da divisao é: " + resultado);
            } else  {
                System.out.println("Erro ao executar a divisao: Divisão por zero.");
            } 
            break;
            
            default:
                System.out.println("Escolha inválida.");
                break;

                
        }
                   
    }
}