import java.util.Scanner;

public class Calculos {
    
    Scanner scan = new Scanner(System.in);
    
    int escolha = scan.nextInt();


    public void calc(){

        
        switch(escolha) {

                case 1:   

                    System.out.println("\n--Digite os 2 números para serem somados--\n");
                    System.out.println("\ncaso utilize pontuação, use ( , )\n");
                    
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();

                    System.out.println("\nA soma de: " + a + " + " + b);
                    System.out.println("\nO resultado é:  " + (a+b) + "\n"); break;
                
                case 2: 

                    System.out.println("\n--Digite os 2 números para serem subtraídos--\n");
                    System.out.println("\ncaso utilize pontuação, use ( , )\n");
                    
                    double c = scan.nextDouble();
                    double d = scan.nextDouble();

                    System.out.println("\nA subtração de: " + c + " - " + d);
                    System.out.println("\nO resultado é:  " + (c-d) + "\n"); break; 
                
                case 3:
            
                    System.out.println("\n--Digite os 2 números para serem multiplicados--\n");
                    System.out.println("\ncaso utilize pontuação, use ( , )\n");
                    
                    double e = scan.nextDouble();
                    double f = scan.nextDouble();

                    System.out.println("\nA multiplicação de: " + e + " * " + f);
                    System.out.println("\nO resultado é:  " + (e*f) + "\n"); break;
                
                case 4:
            
                    System.out.println("\n--Digite os 2 números para serem dividos--\n");
                    System.out.println("\ncaso utilize pontuação, use ( , )\n"); 
                    
                    double g = scan.nextDouble();
                    double h = scan.nextDouble();

                    System.out.println("\nA multiplicação de: " + g + " / " + h);
                    System.out.println("\nO resultado é:  " + (g/h) + "\n"); break; 
                
                default:System.out.println("Valor inválido");
            }
            
           
         } 
          
       }

