package Heranca5_Secretaria;


public class Quarto_Ciclo_ADS extends Secretaria_Escolar {

  public static void main(String[] args) {

    // instancia sem parametros
    Secretaria_Escolar secretaria = new Secretaria_Escolar();
    Insere_Dados(secretaria);


    // instancia com parametros
    Secretaria_Escolar sec = new Secretaria_Escolar("Rhayadh", 35, 9.5, "Analise e Desenvolvimento de Sistemas");
    Insere_Dados(sec);
     

  }

  public static void Insere_Dados(Secretaria_Escolar s) {

    System.out.println("Nome  do Aluno: \t" + s.getNome_aluno());
    System.out.println("Idade do Aluno: \t" + s.getIdade_aluno());
    System.out.println("Media do aluno: \t" + s.getMedia_aluno());
    System.out.println("Curso do Aluno: \t" + s.getCurso_aluno());
    
  }
}
