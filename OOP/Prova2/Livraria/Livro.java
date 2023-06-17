package Prova2.Livraria;

public class Livro {

    //ATRIBUTOS
    private String autor;
    private String titulo;


    //GETTER AND SETTERS
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //CONSTRUTOR VAZIO
    Livro(){};

    //CONSTRUTOR COM MSG
    Livro(String msg) {
        System.out.println(msg);
    }


    //ACAO DO CONSTRUTOR ACIMA
    public void consulta_livro(){
        System.out.println("\n");
        System.out.println(".........................");
        System.out.println("\n\n        LIVROS     \n");
        System.out.println(".........................");
    }
    
}
