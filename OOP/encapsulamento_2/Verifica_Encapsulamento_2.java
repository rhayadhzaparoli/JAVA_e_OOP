package encapsulamento_2;

import encapsulamento_1.Acesso_numeros;

public class Verifica_Encapsulamento_2 {
	public static void main(String args[]) {
		
		Acesso_numeros chave = new Acesso_numeros();
		
		/*chave.a = 10; ENCAPSULAMENTO PACKAGE-PRIVATE
		 * NÃO PERMITE ACESSO DE FORA DO PACOTE*/
		chave.setNumero("a", 10);
		chave.b = 20;
		//chave.c = 30; NÃO É POSSÍVEL ACESSAR VARIÁVEL PRIVATE DIRTATEMENTE;
		chave.setNumero("c", 30);
		/*chave.d = 40; NÃO É POSSÍVEL ACESSAR VARIÁVEL PROTECTED DIRETAMENTE
		 * FORA DO PACOTE*/
		chave.setNumero("d", 40);
		
		chave.mostra_numero();
	}

}
