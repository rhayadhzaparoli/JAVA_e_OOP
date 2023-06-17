package Transporte;

public class Consulta_Transporte {
	
	public static void main(String args[]) {
		
		Transporte a = new Transporte();
		
		a.Recebe_tipo("Carro");
		a.Recebe_marca("GM");
		a.Recebe_modelo("Vectra");
		a.Recebe_ano(2006);
		
		System.out.println("Tipo do transporte: " + a.Retorna_tipo());
		System.out.println("Marca: " + a.Retorna_marca());
		System.out.println("Modelo: " + a.Retorna_modelo());
		System.out.println("Ano: " + a.Retorna_ano());
		
	}

}