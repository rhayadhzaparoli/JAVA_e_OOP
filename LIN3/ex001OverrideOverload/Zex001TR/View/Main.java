package LIN3.ex001OverrideOverload.Zex001TR.View;

import LIN3.ex001OverrideOverload.Zex001TR.Business.*;

/* 
-- As classes Cachorro e Gato deverão sobrescrever o método "brincar()", 
-- informando, em cada "override", de que forma cada tipo de animal mais gosta de brincar.

-- Na classe Principal, instancie objetos aleatórios das classes Gato e Cachorro 
-- (2 ou 3 objetos para cada classe), 
-- colocando valores em cada um de seus atributos e 
-- executando todos os seus respectivos comportamentos. */


public class Main {

    public static void main(String[] args) {
    
       

        Gato gato0 = new Gato("Jeronimo", 12, 3.10);
        System.out.println(gato0.dados());
        System.out.println(gato0.miar()); 
        gato0.brincar();        

        Gato gato1 = new Gato("Nelson", 2, 1.50);
        System.out.println(gato1.dados());
        System.out.println(gato1.miar()); 
        gato1.brincar(); 


        Cachorro cachorro0 = new Cachorro("Zoe", 5, 7.23);
        System.out.println(cachorro0.dados());
        System.out.println(cachorro0.latir()); 
        cachorro0.brincar(); 

        Cachorro cachorro1 = new Cachorro("Toby", 15, 12.55);
        System.out.println(cachorro1.dados());
        System.out.println(cachorro1.latir()); 
        cachorro1.brincar(); 
            
        // caso queira gerar uma acao diferente para cada metodo, deve-se fazer o Overload
        // na classe referente (filha) e aqui dar a cao desejada 
    }}