package LIN3.ex002InterfaceUpcasting.View;

import java.util.Scanner;

import LIN3.ex002InterfaceUpcasting.Business.*;

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

        Calculo calc = null;
        switch (choice) {
       /*     case 1:
                Calculo objAdicaoUp = new Adicao(v1, v2);
               // objAdicao.calcular();
               // Calculo objCalculoUp = objAdicaoUp;
                System.out.println("O resultado da adicao é: " + objAdicaoUp.calcular());
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
                break;*/

        // Upcasting
        
        case 1: calc = new Adicao(v1, v2); break;
        case 2: calc = new Subtracao(v1, v2); break;
        case 3: calc = new Multiplicacao(v1, v2); break;
        case 4: calc = new Divisao(v1, v2); break;



        }       
            // Declaracao  
                calc.calcular();
                    System.out.println("O resultado da multiplicacao é: " + calc.getResultado());
                
    }
}