import java.util.Scanner;

public class Code {

    public void cod(){

        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            // Array unidimensional
            int[] arrayUnidimensional = {1, 2, 3, 4, 5};

            // Array multidimensional
            int[][] arrayMultidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            // Array irregular
            int[][] arrayIrregular = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
            };

            // For each
            System.out.println("Elementos do array unidimensional:");
            for (int elemento : arrayUnidimensional) {
                System.out.print(elemento + " ");
            }
            System.out.println();

            // For
            System.out.println("Elementos do array multidimensional:");
            for (int i = 0; i < arrayMultidimensional.length; i++) {
                for (int j = 0; j < arrayMultidimensional[i].length; j++) {
                    System.out.print(arrayMultidimensional[i][j] + " ");
                }
                System.out.println();
            }

            // Array irregular
            System.out.println("Elementos do array irregular:");
            for (int i = 0; i < arrayIrregular.length; i++) {
                for (int j = 0; j < arrayIrregular[i].length; j++) {
                    System.out.print(arrayIrregular[i][j] + " ");
                }
                System.out.println();
            }

            // While
            int contador = 0;
            System.out.println("Contagem progressiva:");
            while (contador >= 0) {
                System.out.println(contador);
                contador++;
                if (contador > 11) {
                    break;
                }
            }

            // If-else
            int numero = 10;
            if (numero > 5) {
                System.out.println("O número é maior que 5.");
            } else {
                System.out.println("O número é menor ou igual a 5.");
            }

            // Solicitar s/n para saída ou continuar
            System.out.print("Deseja sair? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar != 's');

        scanner.close();
    }

}