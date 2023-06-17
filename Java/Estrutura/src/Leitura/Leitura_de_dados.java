package Leitura;

import java.util.Scanner;

public class Leitura_de_dados {
    
    public static void main(String[] args) {
         
    Scanner scan = new Scanner (System.in);
/* 
    // Lendo uma linha inteira
    System.out.println("Digite o seu nome completo");
    String nome_completo = scan.nextLine();
    System.out.println("O nome digitado foi: " + nome_completo);

    //Lendo um tipo de dados especifico | Aqui só vai ler o primeiro nome
    System.out.println("Digite o primeiro nome completo");
    String nome = scan.next();
    System.out.println("O primeiro nome é: " + nome);

    // Lendo um tipo int
    System.out.println("Digite um numero inteiro");
    int inteiro = scan.nextInt();
    System.out.println("O numero foi: " + inteiro);
*/

    // Lendo uma quantidade de dados
    System.out.println("Digite o seu primeiro nome, idade, qtd de filhos, altura e se tem animal de estimação");
    
    String primeiro_nome = scan.next();
    int idade = scan.nextInt();
    int qtd_filhos = scan.nextInt();
    float altura = scan.nextFloat();
    boolean pet = scan.nextBoolean();
    
    System.out.println("Os valores digitados foram:" + "\n");
    System.out.println("Primeiro nome: " + primeiro_nome);
    System.out.println("Idade:" + idade);
    System.out.println("Qtd de filhos: " + qtd_filhos);
    System.out.println("Altura: " + altura);
    System.out.println("Tem pet? " + pet);
    }
}
