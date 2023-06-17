package hotel;

public class PSVM {
    
    
    public static void main(String[] args) {
        
        RH rh = new RH();
        Almoxarifados_e_Materiais almemat = new Almoxarifados_e_Materiais();

        rh.setDiretor("Kemmel Pinto");
        rh.setGerente("Ana Rosa");
        rh.setQtd_funcionarios(3);

        almemat.setDiretor("Pablo Escobar");
        almemat.setGerente("Duque de Caxias");
        almemat.setQtd_funcionarios(8);

        System.out.println("\n RH \n");
        System.out.println(rh.getDiretor());
        System.out.println(rh.getGerente());
        System.out.println(rh.getQtd_funcionarios());
        System.out.println("\n Akmoxarifado e Materiais \n");
        System.out.println(almemat.getDiretor());
        System.out.println(almemat.getGerente());
        System.out.println(almemat.getQtd_funcionarios());
    }

    
}
