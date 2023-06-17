package Metodos_Construtores;

public class Automovel2 {
	
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	//método construtor
	Automovel2 () {}
	
	//método construtor
	Automovel2 (int ano, String marca, String modelo, double preco ){
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	static {
		cor = "verde";
	}
	
	public void mostrandocarro() {
		System.out.println("\n" + "Carro marca:" + "\t" + marca + "\n" + "Model:" + "\t" + modelo + "\n" + "Ano: " + "\t" + ano + "\n" + "Cor: " + "\t" + cor + "\n" + "Preço" + "\t" + preco);
	}

}
