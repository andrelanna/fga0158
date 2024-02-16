package app;

public class Aritmetica extends Progressao{

	public Aritmetica(int a0, int n, int r) {
		super(a0, n, r);
	}

	public int[] calcularProgressao() {
		termos = new int[n];
		
		for (int i=0; i < n; i++) {
			termos[i] = a0 + i * r;
		}
		return termos;
	}

}
