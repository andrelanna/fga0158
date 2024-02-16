import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Quadrado q; 
		
		q = new Quadrado(3);
		
		JOptionPane.showMessageDialog(null, "Area do quadrado = " + q.calcularArea());
		
		q = new Quadrado(4);
		
		JOptionPane.showMessageDialog(null, "Area do quadrado = " + q.calcularArea());
	}
}
