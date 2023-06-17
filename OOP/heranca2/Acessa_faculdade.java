package heranca2;

public class Acessa_faculdade {

    public static void main(String[] args) {
        Faculdade_CEETEPS ceetps = new Faculdade_CEETEPS();
        /* a variavel de instancia tem acesso as classes de relacao de heranca da hierarquia superior */

        ceetps.setFatec("Fatec Baixada Santista");
        System.out.println("Fatec \t" + ceetps.getFatec());
    }
    
}
