package Heranca5_Secretaria;

public class Matricula extends Quarto_Ciclo_ADS{

    public static void main(String[] args) {
        
        // instancia da classe Quarto_Ciclo_ADS()

        Quarto_Ciclo_ADS quarto_Ciclo_ADS = new Quarto_Ciclo_ADS();
        quarto_Ciclo_ADS.setMatricula_aluno("RA 00112233040");
        System.out.println("Matricula do Aluno: \t" + quarto_Ciclo_ADS.getMatricula_aluno());
    }


    
}
