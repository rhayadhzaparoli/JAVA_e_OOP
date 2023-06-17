package abstracao;

public abstract class Conceito {

    // DECLARA ATRIBUTOS

    private String nome_condominio;
    
    private double despesa_condominio;



    // GETTER DE FORMA PROTECTED

    protected String getNome_condominio() {
        return nome_condominio;    



    // METODO TRAZENDO O ATRIBUTO 
    protected double calcula_condominio (double despesa_condominio) {
        
        this.despesa_condominio = despesa_condominio;

        return despesa_condominio;

    }

    // METODO ABSTRATO
    public abstract void endereco_condominio ();
}

}
