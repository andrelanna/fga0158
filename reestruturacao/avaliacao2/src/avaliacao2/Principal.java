package avaliacao2;

public class Principal {

	public static void main(String[] args) {
		X a = new X(1, 3, 3);
		X b = new X(0, 4, 4);
		
		a.calcular();
		b.calcular();
		
		Inteiro[] v = a.getE();
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].getValor());
		}
		
		v = b.getE();
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].getValor());
		}
	}

}
