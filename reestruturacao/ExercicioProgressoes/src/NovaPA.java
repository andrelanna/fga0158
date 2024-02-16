
public class NovaPA extends Progressao{

	public NovaPA(int a0, int n, int r) {
		super(a0, n, r);
	}

	public Termo[] computarProgressao() {
		for (int i=2; i<=n; i++) {
			int valor = termos[0].getValor() + (i-1) * r;
			Termo t = new Termo(i, valor);
			termos[i-1] = t; 
		}
		return termos;
	}

}
