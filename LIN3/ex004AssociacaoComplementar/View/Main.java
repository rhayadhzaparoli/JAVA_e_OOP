package LIN3.ex004AssociacaoComplementar.View;
import LIN3.ex004AssociacaoComplementar.Business.*;
import java.util.Scanner;



public class Main {
 
    
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in )) {
            System.out.println("Informe o valor");
            int choice = scan.nextInt();

            

           
            Veiculo transporte = null;

            switch (choice) {
                case 1:
                    transporte = new Moto("XY-K37", "Honda", 2029,0);
                    break;
                case 2:
                 
                    transporte = new Veiculo("X86", "Porsche", 2548);
                    break;
                case 3:
                    transporte = new Carro("Axis", "Audi", 2032, 0);
                    break;
            }

            if (transporte != null) {
                // Motivo daquela instancia vazia
                System.out.println(String.format("Dados do veículo:\n Nome: " + transporte.getNome() + "\n Fabricante: " + transporte.getFabricante() + "\n Ano: " + transporte.getAno()));
                transporte.parar(0);
                transporte.acelerar(0);
                transporte.desacelerar(0);
                transporte.parar(0);
                
   }

                      
                  
                    
}
}}
