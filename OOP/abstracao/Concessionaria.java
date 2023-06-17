package abstracao;
import javax.swing.JOptionPane;
public class Concessionaria {
	public static void main(String args[]) {
		
		Automovel e = new Automovel();
		
		String mr,md,pr,cr;
		double pp;
		
		mr = JOptionPane.showInputDialog("digite a marca: ");
		md = JOptionPane.showInputDialog("digite o modelo: ");
		cr = JOptionPane.showInputDialog("digite a cor: ");
		pr = JOptionPane.showInputDialog("digite o preço: ");
		
		pp = Double.parseDouble(pr);
		
		e.setMarca(mr);
		e.setModelo(md);
		e.setCor(cr);
		e.setPreco(pp);
		
		System.out.println("Marca:\t" + e.getMarca());
		System.out.println("Modelo:\t" + e.getModelo());
		System.out.println("Cor:\t" + e.getCor());
		System.out.println("Preço:\t" + e.getPreco());
	
		
		//e.Informa_Automovel();
	}

}
