package sobrecarga_de_metodos;

public class calcula_area {
    
    public static void main(String[] args) {
        figuras_geometricas u = new figuras_geometricas();
        
        System.out.println("Area do retangulo: " + u.getArea(u.getLado_a(), u.getLado_b()));
        System.out.println("Area do quadrado: " + u.getArea());
        u.setLado_a(4.0);
        System.out.println("Area do retangulo: " + u.getArea(u.getLado_a(), u.getLado_b()));
        System.out.println("Area do quadrado: " + u.getArea());


    }
}
