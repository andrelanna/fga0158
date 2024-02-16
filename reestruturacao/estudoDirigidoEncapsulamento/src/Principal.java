
public class Principal {
	
	public static void main(String[] args) {
		Calculadora c[] = new Calculadora[4];
		
		Operando o1, o2, o3; 
		o1 = new Operando(2);
		o2 = new Operando(0);
		o3 = new Operando(3);
		
		c[0] = new Calculadora();
		c[1] = new Calculadora(o1, o2);
		c[2] = new Calculadora(o2, o3);
		c[3] = new Calculadora(o1, o3);
		
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i].soma());
			System.out.println(c[i].subtracao());
			System.out.println(c[i].o1.getOperando() * Calculadora.PI);
			System.out.println("-----");
		}
		
	}
}
