package app;

public class Geometrica extends Progressao{

	public Geometrica(int a0, int n, int r) {
		super(a0, n, r);
	}

	public int[] calcularProgressao() {
		termos = new int[n];
		
		for (int i=1; i<=n; i++) {
			termos[i-1] = a0 * i *r;
		}
		
		return termos;
	}

}
