package LIN3.ex005.Business;

public class Disciplina {
    private int codigo;
    private String ementa;
   
   
    public int getCodigo() {
        return codigo;
    }
    public String getEmenta() {
        return ementa;
    }

    
    public Disciplina(int codigo, String ementa) {
        this.codigo = codigo;
        this.ementa = ementa;
    }


    
}
