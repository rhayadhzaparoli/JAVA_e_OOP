package Heranca6_Cinema;

public class Cinemas_do_Shopping extends Cinemas_de_Santos {

    private String nome_do_cineshop ;

    Cinemas_do_Shopping(String cineshop) {
    System.out.println("\nCineMark " + cineshop);
    
    }

    public void setnome (String nome_do_cineshop) {
        this.nome_do_cineshop = nome_do_cineshop;
    }

    public String getnome(){
        return nome_do_cineshop;
    }
}
