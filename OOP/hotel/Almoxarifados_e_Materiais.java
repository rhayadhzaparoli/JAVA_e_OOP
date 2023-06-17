package hotel;

public class Almoxarifados_e_Materiais extends Departamento_Financeiro {
    
    private String materiais;

    public String getMateriais() {
        return materiais;
    }

    public void setMateriais(String materiais) {
        this.materiais = materiais;
    }

    Almoxarifados_e_Materiais(){
        super();
        System.out.println("Acesso ao setor de Almoxarifados e Materiais");
    }
}
