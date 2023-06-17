package Loop;

public class while_doWhile {
    
    public static void main(String[] args) {
        int count = 1;
        int max = 100;

   /*     while (count < max) {
            System.out.println("Valor de count = " + count);
            count ++;
        }

        System.out.println("PAROU no: " + count);  */

        do {
            count++;
            System.out.println("Valor de count: " + count);
        } while (count < 23);

        System.out.println("PAROU no: " + count);

        
    }

}
