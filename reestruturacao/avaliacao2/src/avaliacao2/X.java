package avaliacao2;

public class X {
	Inteiro a;
	Inteiro n; 
	Inteiro r;
	Inteiro[] e; 
	
	public X(int k, int l, int m) {
		System.out.println("Construindo objeto X");
		a = new Inteiro(k); 
		n = new Inteiro(l);
		r = new Inteiro(m);
		e = new Inteiro[n.getValor()];
	}
	
	public void calcular() {
		System.out.println("Iniciando calculo");
		e[0] = a;
		for (int i=1; i<e.length; i++) {
			e[i] = new Inteiro(e[i-1].getValor() + r.getValor());
		}
	}
	
	public Inteiro[] getE() {
		return e;
	}

}
