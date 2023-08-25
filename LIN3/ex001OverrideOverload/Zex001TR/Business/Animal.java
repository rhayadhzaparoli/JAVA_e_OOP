package LIN3.ex001OverrideOverload.Zex001TR.Business;

/*
---- "Animal" (abstrata), 
----  com os atributos "nome" (obrigatório no construtor), 
---- "peso" e 
---- "idade", 
----  além do método "brincar()"; */

   abstract class Animal {
    
    private String nome;
    private int idade;
    private double peso;

    
   
    public double getPeso() {
        return peso;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public Animal (String nome, int idade, double peso2){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso2;
    }

    public String dados(){
        return String.format("Nome: %s \nIdade: %d \nPeso:%.2fkg", nome, idade, peso );
    
    }
     void brincar(){
        
     };

}
