package Palindromo;

import java.util.Scanner;

public class Input {
    
    public void input(){

    System.out.println("Digite uma palavra");

    Scanner scan = new Scanner(System.in);

do {

    String palavra = scan.nextLine();

    String zerador = palavra.replace(" ", "").toLowerCase();

    StringBuilder reversaoInput = new StringBuilder(zerador);
        reversaoInput.reverse();

         if (zerador.equals(reversaoInput.toString())) {
            System.out.println("\"" + palavra + "\" é um palíndromo.");
        } 
            else {
                System.out.println("\"" + palavra + "\" não é um palíndromo.");
        }

        System.out.println();         
            
        System.out.print("Deseja fazer outra verificação? (s/n): ");
            String choice = scan.nextLine();
    scan.close();

            if (!choice.equalsIgnoreCase("s")) {
                break;
            }

            System.out.println();
        }  
        while (true);
    }
}
