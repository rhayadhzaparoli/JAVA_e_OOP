package LIN3.ex001OverrideOverload.Zex001TR.Business;
/*
---- "Cachorro", derivada de "Animal", 
---- com o método "latir()", 
---- no qual deverá ser exibida uma mensagem representando o latido do cachorro;

 */

public class Cachorro extends Animal{

    
   
   public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }


    public String latir(){
        return ("au au ");
    }

@Override
public
 void brincar(){
 System.out.println("Correr pela casa \n");
    
   }

    
}
