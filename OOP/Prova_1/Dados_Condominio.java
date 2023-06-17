package Prova_1;

public class Dados_Condominio {
    
    public static void main(String args []) {
        
        // instaciamento
        Condominio a = new Condominio();
        Condominio b = new Condominio(360000);

        // setando valores
        a.setNome_condominio("Jardim das Flores");
        a.setEndereco_condominio("Rua Kemmel Pinto, 171");
        a.setQuantidade_apartamentos(22);

        //getando valores
        System.out.println("Nome do condominio:\t" + a.getNome_condominio());
        System.out.println("Endereco do condominio:\t" + a.getEndereco_condominio());
        System.out.println("Quantidade de apartamentos:\t" + a.getQuantidade_apartamentos());
        System.out.println("Preco do condominio:\t" + b.getValor_condominio());
    }

}
