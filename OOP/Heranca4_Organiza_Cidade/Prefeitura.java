package Heranca4_Organiza_Cidade;

public class Prefeitura {

    public static void main(String[] args) {

        Regiao_de_Santos regiao = new Regiao_de_Santos(null);
        Bairro_de_Santos bairro = new Bairro_de_Santos();
        Cidade_de_Santos cidade = new Cidade_de_Santos(null);
        Logradouros logradouros = new Logradouros();

        /*
         * classe de hierarquia mais inferior da
         * acesso a todos os atributos
         */

        bairro.setBairro("Vila Matias");
        bairro.setRegiao("Zona Central");
        bairro.setRua("Av.: Senador Feijo");
        bairro.setPopulacao(9999);

        System.out.println("Bairro: \t" + bairro.getBairro());
        System.out.println("Regiao: \t" + bairro.getRegiao());
        System.out.println("Rua: \t\t" + bairro.getRua());
        System.out.println("Populacao: \t" + bairro.getPopulacao());
        System.out.println("\n");

        /* não da acesso aos atributos da classe inferior */
        regiao.setRegiao("Zona Leste");
        regiao.setBairro("Marape");
        regiao.setPopulacao(7777);

        System.out.println("Regiao: \t" + regiao.getRegiao());
        System.out.println("Bairro: \t" + regiao.getBairro());
        System.out.println("Populacao: \t" + regiao.getPopulacao());
        System.out.println("\n");

        cidade.setRegiao("Zona Central");
        cidade.setPopulacao(5555);

        System.out.println("Regiao: \t" + cidade.getRegiao());
        System.out.println("Populacao: \t" + cidade.getPopulacao());
        System.out.println("\n");

        logradouros.setTipo_logradouro("Publico");
        logradouros.setLocal_logradouro("Praça");

        System.out.println("Tipo: \t\t" + logradouros.getTipo_logradouro());
        System.out.println("Local: \t\t" + logradouros.getLocal_logradouro());
        System.out.println("\n");
    }

}
