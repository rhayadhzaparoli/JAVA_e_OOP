package LIN3.ex004AssociacaoComplementar.View;
import LIN3.ex004AssociacaoComplementar.Business.*;
import java.util.Scanner;



public class Main {
 
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in );
        Veiculo veic = null;
        System.out.println("Informe o valor");
        int choice = scan.nextInt();



        switch (choice){
             case 1: veic = new Carro("X86", "Posrche", 2030);
             {

                System.out.println(String.format("Dados do carro:\n Nome: " + veic.getNome() +"\n Fabricante: "+ veic.getFabricante() + "\n Ano: " + veic.getAno()));
                veic.parar(0);
                veic.acelerar(0);
                veic.desacelerar(0);
                veic.parar(0);

             } break;
             case 2: veic = new Moto("XY-K37", "Honda", 2029);
             {
                   System.out.println(String.format("Dados da moto:\n Nome: " + veic.getNome() +"\n Fabricante: "+ veic.getFabricante() + "\n Ano: " + veic.getAno()));
                   veic.parar(0);
                   veic.acelerar(0);
                   veic.desacelerar(0);
                   veic.parar(0);
             } break;
            
             case 3: veic = new Veiculo("Axis", "Audi", 2032);{

                System.out.println(String.format("Dados do Veiculo:\n Nome: " + veic.getNome() +"\n Fabricante: "+ veic.getFabricante() + "\n Ano: " + veic.getAno()));
                veic.parar(0);
                veic.acelerar(0);
                veic.desacelerar(0);
                veic.parar(0);
             } break;
        }

     

    }
}
