package Heranca6_Cinema;

public class Consulta_Cinemas {

    public static void main(String[] args) {
        Cine_Roxy roxy = new Cine_Roxy();
        Cine_Caicara caicara = new Cine_Caicara("Antigo cinema da " + "Av. Conselheiro Nebias - Boqueirao");
        Cine_Cinemark cinemark = new Cine_Cinemark("Primeiro cinema de shopping em Santos");
        
        /* A classe Cine_Roxy nao podeutilizar o atributo porque nao 
        há declaração da mesma e tambem nao esta chamando um super() */


        caicara.setLocalizacao("Av.: Conselheiro Nebias com a praia");
        caicara.setnome("Cine Caicara");
        System.out.println("\nCinema: " + caicara.getnome() + "\nFicava na esquina da " + caicara.getLocalizacao() + "\n");


        cinemark.setLocalizacao("Shopping Praiamar");
        cinemark.setnome("Cinemark\n" );
        System.out.println("Nome do cinema:\t" + cinemark.getnome() + "Fica dentro do shopping: " + cinemark.getLocalizacao() + "\n");

    }
    
}
