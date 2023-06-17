package Heranca6_Cinema;


public class Cinemas_Antigos extends Cinemas_de_Santos {
    

    private String nome_do_cinema ;

    Cinemas_Antigos(String antigo) {
    System.out.println("Historias dos cinemas de Santos \n" + antigo);
    
    }

    public void setnome (String nome_do_cinema) {
        this.nome_do_cinema = nome_do_cinema;
    }

    public String getnome(){
        return nome_do_cinema;
    }
}
