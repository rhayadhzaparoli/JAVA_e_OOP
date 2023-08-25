package LIN3.Zex002TR.View;

import java.util.Scanner;

import LIN3.Zex002TR.Business.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        System.out.println("Informe o numero referente a operacao que deseja");

        
        switch(choice){
            case "1": 
            System.out.println("insira o valor 1");
            scan.nextFloat();
            System.out.println("insira o valor 2");
            scan.nextFloat();
            Adicao ObjAdd = new Adicao();
            ObjAdd.calcular();
            resultado

            
        }
    }
}
