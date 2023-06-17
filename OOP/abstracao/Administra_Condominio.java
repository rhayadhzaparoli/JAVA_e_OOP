package abstracao;

public class Administra_Condominio {
    
    public static void main(String[] args) {
        

    // INSTACIAS    
    Condominio condominio = new Condominio();
    Condominio conceito = new Condominio();

    // CALCULO REFERENTE AO METODO calcula_condominio
    final double a = 234.08;

    System.out.println("Nome do condominio : " + condominio.getNome_Condominio());
    System.out.println("Valor do condominio : " + condominio.calcula_condominio(a));

   // condominio.endereco_condominio(); // Gera o mesmo resultado

   conceito.endereco_condominio();

}

}
