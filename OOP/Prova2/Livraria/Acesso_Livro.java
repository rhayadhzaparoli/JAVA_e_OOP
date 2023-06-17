package Prova2.Livraria;

public class Acesso_Livro {
    
    public static void main(String[] args) {
        
        Livro livro = null;


        acessa_classes("new", livro);
        acessa_classes("rom", livro);
        acessa_classes("esp", livro);


    }

    public static void acessa_classes(String acesso, Livro livro){
        if (acesso == "new")
        livro = new Livro();
        
        else if (acesso == "rom")
        livro = new Tipo_Romance("Autor: Jose de Alencar");
        
        else if (acesso == "esp")
        livro = new Tipo_Espirita("Autor: Chico Xavier");


        livro.consulta_livro();
        
     }
}
