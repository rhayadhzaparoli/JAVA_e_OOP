package abstracao_academia;

public class Aplication {

    public static void main(String[] args) {
        
        // Instance
        Atributes_and_Methods abstract_class  = new Create_Action();

        // Output's Setter
        abstract_class.setModalities("Jiu-jitsu" + "\n" + " Judo" + "\n" 
        + " Karate" + "\n" + " Krav-Maga");

        // Call abstract method
        abstract_class.show_modalities();
    }
    
}
