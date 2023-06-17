package Condicionais;

import java.util.Scanner;

public class Switch_case {
    
    public static void main(String[] args) {
        
        System.out.println("Digite de 1 - 7 para o dia da semana \n");

        Scanner scan = new Scanner(System.in);

        int dia_da_semana = scan.nextInt();

        switch(dia_da_semana){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-Feira"); break;
            case 3: System.out.println("Terca- Feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-Feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Não é um dia da semana!");
        }
    }
}
