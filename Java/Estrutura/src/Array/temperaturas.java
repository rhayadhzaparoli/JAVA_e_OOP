package Array;

public class temperaturas {

    public static void main(String[] args) {
        
        double tempDia001 = 30.00;
        double tempDia002 = 31.00;
        double tempDia003 = 33.00;
        double tempDia004 = 34.00;
        double tempDia005 = 50.00;

        double[] temp = new double[365];
        temp[0] = 30.00;
        temp[1] = 31.00;
        temp[2] = 33.00;
        temp[3] = 34.00;
        temp[4] = 50.00;

        System.out.println("Atemperatura do dia 001 é: " + temp[3]);

        System.out.println("O tamanho do vetor é: " + temp.length);

        System.out.println("Endereço de memória onde o array está apontando: " + temp);

        for (int i=0; i <= temp.length; i++) {
           System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temp[i]);
        }

        for (double t : temp) {
            System.out.println(t);
        }
    }
}
