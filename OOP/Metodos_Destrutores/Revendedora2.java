package Metodos_Destrutores;

public class Revendedora2 {
	
	public static void main(String args[]) {
		Automovel_II c = new Automovel_II(200, "Ford", 5000.00);
		
		c.mostracarro();
		
		c = null;
		System.gc();
	}

}
