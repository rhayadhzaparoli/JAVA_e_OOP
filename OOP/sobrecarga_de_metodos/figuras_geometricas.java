package sobrecarga_de_metodos;

public class figuras_geometricas {

    private double lado_a;
    private static double lado_b;
    private double lado_c;
    private double area;

    public double getLado_a() {
        return lado_a;
    }


    public void setLado_a(double lado_a) {
        this.lado_a = lado_a;
    }


    public static double getLado_b() {
        return lado_b;
    }


    public static void setLado_b(double lado_b) {
        figuras_geometricas.lado_b = lado_b;
    }



    figuras_geometricas(){
        lado_a = 2.0;
        lado_b = 3.0;
        lado_c = 1.0;
    }

    public double getArea ( double lado_a, double lado_b ){
        this.lado_a = lado_a;
        this.lado_b = lado_b;
        area = lado_a * lado_b;
        return area;
    }

    public double getArea(){
        area = lado_c * lado_c;
        return area;
    }
    
}
