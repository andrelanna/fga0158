import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		String strValorBase = JOptionPane.showInputDialog("Informe medida da base");
		String unBase = JOptionPane.showInputDialog("Informe unidade da base");
		int valorBase = Integer.parseInt(strValorBase);
		
		String strValorAltura= JOptionPane.showInputDialog("Informe medida da altura");
		String unAltura= JOptionPane.showInputDialog("Informe unidade da altura");
		int valorAltura = Integer.parseInt(strValorAltura);
		
		Medida b = new Medida(valorBase, unBase);
		Medida h = new Medida(valorAltura, unAltura);
		Retangulo r = new Retangulo(b, h);
		
		JOptionPane.showMessageDialog(null, "Area= " + r.calcularArea()+ "mm2.");
		
		r.altura = null; 
		r.base = null; 
		r = null; 
		Thread.sleep(4000);
		
		System.gc(); 
		
		Thread.sleep(4000);
	}
}
