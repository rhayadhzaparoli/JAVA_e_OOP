package Media;

import java.util.Scanner;


public class Notas {

    public void noteiro(){

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite 4 notas\n");


    System.out.println("Digite o valor da nota 1: ");
    double nota1 = scan.nextDouble(); 
    System.out.println("Digite o valor da nota 2: ");
    double nota2 = scan.nextDouble();
    System.out.println("Digite o valor da nota 3: ");
    double nota3 = scan.nextDouble();
    System.out.println("Digite o valor da nota 4: ");
    double nota4 = scan.nextDouble();
    
     
    double media = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println(media);
    
    scan.close();
    if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    } 
}
