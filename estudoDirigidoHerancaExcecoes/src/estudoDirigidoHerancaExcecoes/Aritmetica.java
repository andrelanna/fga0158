package estudoDirigidoHerancaExcecoes;

import exceptions.Excecao1;

public class Aritmetica extends Progressao{

	public Aritmetica(int a1, int r, int n) throws Excecao1 {
		super(a1, r, n);
		if (r <= 0) {
			throw new Excecao1(); 
		}
	}

	public void computarProgressao() {
		for (int i=0; i<n; i++) {
			termos[i] = a0 + (n-1)*r;
		}
	}

	public String imprimirProgressao() {
		String resposta = "Prog. Arit. = " + super.imprimirProgressao();
		return resposta;
	}
}
