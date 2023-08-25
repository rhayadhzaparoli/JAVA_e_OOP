package LIN3.ex001OverrideOverload.Zex001TR.Business;

/*
---- "Gato", derivada de "Animal", 
---- com o método "miar()", 
---- no qual deverá ser exibida uma mensagem representando o miado do gato.
 */

 public class Gato extends Animal{
       
   public Gato(String nome, int idade, double peso) {
    super(nome, idade, peso);
    System.out.println();
}

public String miar(){
    return ("miau ");
}

// poderia ser assim tambem com metodo void
/*@Override
public

void brincar(){
    System.out.println("Novelo de la \n");
 
}*/ 
@Override
public

void brincar(){
 System.out.println("novelo de la \n");
    
   }
}
