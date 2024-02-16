import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Progressao p1, 
		           p2, 
		           p3; 
		
		p1 = new NovaPA(0, 10, 2); 
		p2 = new NovaPG(1, 15, 3);
		p3 = new NovaPA(-1, 5, 4);
		
		p1.computarProgressao();
		p2.computarProgressao();
		p3.computarProgressao();
		
		JOptionPane.showMessageDialog(null, p1.imprimir());
		JOptionPane.showMessageDialog(null, p2.imprimir());
		JOptionPane.showMessageDialog(null, p3.imprimir());
		
//		NovaPG pg1, 
//		       pg2, 
//		       pg3; 
//		
//		pg1 = new NovaPG(1, 10, 2); 
//		pg2 = new NovaPG(1, 15, 3);
//		pg3 = new NovaPG(-1, 5, 4);
//		
//		pg1.computarProgressao();
//		pg2.computarProgressao();
//		pg3.computarProgressao();
//		
//		JOptionPane.showMessageDialog(null, pg1.imprimir());
//		JOptionPane.showMessageDialog(null, pg2.imprimir());
//		JOptionPane.showMessageDialog(null, pg3.imprimir());
	}

}
