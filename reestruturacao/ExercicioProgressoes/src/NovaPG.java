
public class NovaPG extends Progressao{

	public NovaPG(int a0, int n, int r) {
		super(a0, n, r);
	}

	public Termo[] computarProgressao() {
		for (int i=2; i<=n; i++) {
			int valor = termos[i-2].getValor() * (i-1)*r;
			Termo t = new Termo(i, valor);
			termos[i-1] = t;
		}
		return termos;
	}

}
