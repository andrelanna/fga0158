package estudoDirigidoHerancaExcecoes;

import exceptions.Excecao1;

public class Principal {

	public static void main(String[] args) {
		try {
			Progressao p = new Geometrica(1, 0, 15);
			p.computarProgressao();
			System.out.println(p.imprimirProgressao());
		} catch (Excecao1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
