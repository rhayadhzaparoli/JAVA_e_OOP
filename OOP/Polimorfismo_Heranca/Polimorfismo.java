package Polimorfismo_Heranca;

import javax.swing.JOptionPane;

public class Polimorfismo {
    
    public static void main(String[] args) {
        
        // Declaracao do objeto da superClasse como vazio

        Contribuinte pessoa = null;

        // Interface para fazer a leitura do apontamento

        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digitar opcao entre 1 e 4" + "\n" + "1 para Contribuinte" + "\n" + "2 para Pessoa Fisica" + "\n" + "3 para Pessoa Juridica" + "\n" + "4 para Funcionario"));

        // Apontador

        switch(tipo){
            case 1:
                pessoa = new Contribuinte();
                break;

            case 2:
                pessoa = new PessoaFisica();
                break;

            case 3:
                pessoa = new PessoaJuridica();
                break;
            
            case 4:
                pessoa = new Funcionario();
                break;

                default:
                    System.out.println("Tipo de dado nao aponta para nenhuma opcao");
                    System.exit(0);
        }

            pessoa.mostraClasse();

    }
}
