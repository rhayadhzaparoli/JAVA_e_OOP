package sobrecarga_de_metodos;

import javax.swing.JOptionPane;

public class Funciona_sobrecarga {

    public static void main(String[] args) {
        
        Ficha_funcionarios funcionarios = new Ficha_funcionarios(2889.90, "Pedagoda", 22, "Gisele");
        JOptionPane.showMessageDialog(null, funcionarios.mostra_funcionario());

        concatena_aplicacao();
    }

    public static void concatena_aplicacao (){
        Acessa_secundario a = new Acessa_secundario();
    }
    
}
