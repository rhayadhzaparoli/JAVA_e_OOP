package Break_Continua;

import java.util.Scanner;

public class Break_e_Continue {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

      /*  System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int lim = scan.nextInt();

        for(int i = num; i <= lim; i++) {
            if (i % 7 == 0) {
                System.out.println("O número " + i + " é divisivel por 7"); break;
            } else {
                System.out.println("O número " + i + " não é divisivel por 7"); 
            } 
        }*/

    /************************************   
         EXEMPLO UTILIZANDO LABELS
    *************************************/
/*
    for (int i = 0; i <= 4; i++) {
        label1: {
            label2: {
                label3: {
                    if (i == 1) {
                        break label1; 
                    }
                    if  (i == 2) {
                        break label2; 
                    }
                    if (i == 3) {
                        break label3; 
                    }
                    System.out.println("Label 3");
                }
                System.out.println("Label 2");
            }
            System.out.println("Label 1");
        }
        System.out.println(i);
    } */

    /*************************
     * 
     *      CONTINUE
     *************************/
    System.out.println("Entre com um numero: ");
        int num = scan.nextInt();

        System.out.println("Entre com um limite: ");
        int lim = scan.nextInt();

        for(int i = num; i <= lim; i++) {
            if (i % 7 == 0) {
                System.out.println("O número " + i + " é divisivel por 7"); continue;
            } else {
                System.out.println("O número " + i + " não é divisivel por 7"); 
            } 
        }
    }
}
