package Loop;

public class Loop_for {
    
    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
        System.out.println ("O numero é:  " + i );
       }

       System.out.println("\n");

        for (int i = 3; i > 0; i--) {
        System.out.println ("O numero é:  " + i);
       }

      System.out.println("\n");

        for (int i = 0, j = 10; i < j; i++, j--) {
        System.out.println ("O numero é d i é: " + i + "  e de j é: " + j);
        
       }

     System.out.println("\n");
       
      for(int i = 1, soma = 0 ; i < 5; soma += i++){
      System.out.println ("O numero de soma é:" + soma);
      }
    }
}
