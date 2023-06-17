package Condicionais;

import java.util.Scanner;

public class If_Else {
    
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);

    System.out.println ("Digite a sua idade:");

    int idade = scan.nextInt();

    if (idade >= 18) {
        System.out.println("Voce tem " + idade + "\n" + "Pode ver o conteudo");
    } else {
        System.out.println("Voce é menor de idade por ter " + idade + " anos");
    }

}}