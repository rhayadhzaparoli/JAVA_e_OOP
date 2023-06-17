package Plano_Ensino;

public class Plano {
	
	String materia;
	String conteudo;
	String criterio;
	String bibliografia;
		
	Plano(String materia, String bibliografia){
		this.materia = materia;
		conteudo = "Java";
		criterio = "na";
		this.bibliografia = bibliografia;
	}
	
	public void mostraPlano() {
		System.out.println("\n" + "Materia" + "\t" + materia + "\n" + "Conteurdo:" + "\t" + conteudo + "\n" + "Criterio:" + "\t" + criterio + "\n" + "Bibliografia:" + "\t" + bibliografia);
	}
	
		
	

}
