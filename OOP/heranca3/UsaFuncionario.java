package heranca3;

import javax.swing.JOptionPane;

public class UsaFuncionario {

    public static void main(String[] args) {
        
        //Objetos

        Funcionario funcionario = new Funcionario();
        PessoaJuridica func = new PessoaJuridica();

        String u, v, t, z;
        int x;

        z = JOptionPane.showInputDialog("digite 1 se o contribuinte é pessoa fisica \n 2 se é pessoa juridica");

        x = Integer.parseInt(z);
        if (z.length()==1) {
         switch (x) {
        case 1: {
                u = JOptionPane.showInputDialog("escrever o nome do contribuinte:");
                v = JOptionPane.showInputDialog("escrever o RG do contribuinte:", args);
                t = JOptionPane.showInputDialog("escrever a identificação do cartao do contribuinte:", args);

                funcionario.setNome(u);
                funcionario.setRg(v);
                funcionario.setCartao(t);

                System.out.println("Nome: \t" + funcionario.getNome());
                System.out.println("RG: \t" + funcionario.getRg());
                System.out.println("Cartao: \t" + funcionario.getCartao());

                break;

            }

            case 2: {

                u = JOptionPane.showInputDialog("escrever o nome do contribuinte:");
                v = JOptionPane.showInputDialog("esrever o CNPJ do contribuinte:");
                t = JOptionPane.showInputDialog("escrever a identificacao do cartao do contribuinte", args);
                funcionario.setNome(u);
                func.setCnpj(v);
                funcionario.setCartao(t);

                System.out.println("Nome: \t" + funcionario.getNome());
                System.out.println("CNPJ: \t" + func.getCnpj());
                System.out.println("Cartao: \t" + funcionario.getCartao());

                break;
            }
        }
    }
    
} }
