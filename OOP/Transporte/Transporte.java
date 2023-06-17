package Transporte;

public class Transporte {
	String tipo;
	String marca;
	String modelo;
	int ano;
	
	public void Recebe_tipo(String t) {
		tipo = t;
	}
	public String Retorna_tipo() {
		return tipo;
	}
	
	public void Recebe_marca(String m) {
		marca = m;
	}
	public String Retorna_marca() {
		return marca;
	}
	
	public void Recebe_modelo(String md) {
		modelo = md;
	}
	public String Retorna_modelo() {
		return modelo;
	}
	public void Recebe_ano(int a) {
		ano = a;
	}
	public int Retorna_ano() {
		return ano;
	}

}