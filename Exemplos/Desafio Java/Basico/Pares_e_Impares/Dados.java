package Pares_e_Impares;

import java.util.Scanner;

public class Dados {
    
    public void input (){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 5 números inteiros:\n");

        int[] array = new int[5];

        System.out.println("Digite o primeiro número: ");
        array[0] = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        array[1] = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        array[2] = scan.nextInt();
        System.out.println("Digite o quarto número: ");
        array[3] = scan.nextInt();
        System.out.println("Digite o quinto número: ");
        array[4] = scan.nextInt();
    scan.close();

         for (int i : array) {
            if (i % 2 == 0) {System.out.println("O número " + i + " é par");
            } 
             else {  
                System.out.println("O número " + i + " é impar");
            }
        }
    }
}
    

