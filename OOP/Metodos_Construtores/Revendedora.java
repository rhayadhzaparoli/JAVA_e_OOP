package Metodos_Construtores;

public class Revendedora {
	public static void main(String args[]) {
		
		Automovel2 A = new Automovel2();
		A.mostrandocarro();
		
		Automovel2 B = new Automovel2(2006, "GM", "Vectra", 98000.00);
		B.mostrandocarro();
	
	}

}
