package Matrizes;

import java.util.Scanner;

public class Matrizes {
    
    public static void main(String[] args) {
        
        System.out.println("Notas dos alunos exemplo padrão");
        

         /*****************************
         *                           *
         *      Matriz Padrão        *
         *                           *
         *****************************/


        int [][] notas = new int[3][4];

            notas[0][0] = 10;
            notas[0][1] = 8;
            notas[0][2] = 7;
            notas[0][3] = 6;
            
            notas[1][0] = 9;
            notas[1][1] = 7;
            notas[1][2] = 6;
            notas[1][3] = 5;
            
            notas[2][0] = 8;
            notas[2][1] = 6;
            notas[2][2] = 5;
            notas[2][3] = 4;

            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas[i].length; j++) {
                    System.out.println(notas[i][j] + " ");
                }
                System.out.println();
            

    }

        /*****************************
         *                           *
         *  Matriz Multidimensional  *
         *                           *
         *****************************/

    System.out.println("Exemplo de matriz multidimensional");

    int [][][] notastrid = new int[3][3][3];

        for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notastrid[i].length; j++) {
                    for (int k = 0; k < notastrid[i].length; k++) {
                        notastrid[i][j][k] = i + j + k;
                    System.out.println(notastrid[i][j][k]);
                }
                System.out.println();
}
}

        /*****************************
         *                           *
         *      Matriz Irregular     *
         *                           *
         *****************************/

        
         
         System.out.println("Entre com o numero de pessoas");
         Scanner scan = new Scanner(System.in);

         int numpessoas = scan.nextInt();
        String [][] nomesfilhos = new String[numpessoas][];

         for (int i = 0; i < nomesfilhos.length; i++) {
            
            System.out.println("Entre com a quantidade de filhos");
            int qtdfilhos  = scan.nextInt();

            nomesfilhos[i] = new String[qtdfilhos];

            for (int j = 0; j < nomesfilhos[i].length; j++) {

                System.out.println("Digite o nome do filho : " + (j+1));

                nomesfilhos[i][j] = scan.next();
        }
    }

        for (int i = 0; i < nomesfilhos.length; i++) {
            for (int j = 0; j < nomesfilhos[i].length; j++) {

                            System.out.println("Pessoa " + i + " tem " + nomesfilhos[i].length + " filhos ");
                        }
                        System.out.println();
                    
}}
}