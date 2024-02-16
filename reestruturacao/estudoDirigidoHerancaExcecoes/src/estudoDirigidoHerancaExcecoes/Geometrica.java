package estudoDirigidoHerancaExcecoes;

import exceptions.Excecao1;
import exceptions.Excecao2;

public class Geometrica extends Progressao{
	
	public Geometrica(int a0, int r, int n) throws Excecao1 {
		super(a0, r, n);
		if (r == 0) {
			throw new Excecao1(); 
		} 
		if (r <= 0) {
			throw new Excecao2();
		} 
	}

	public void computarProgressao() {
		termos[0] = a0;
		for (int i=1; i<n; i++) {
			termos[i] = a0 * termos[i-1]*r;
		}
	}
	
	public String imprimirProgressao() {
		String resposta = "Prog. Geom. = " + super.imprimirProgressao();
		return resposta;
	}
}
	