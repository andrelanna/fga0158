package estudoDirigidoHerancaExcecoes;

import exceptions.Excecao1;

public class Principal {

	public static void main(String[] args) {
		try {
			Progressao p3 = new Geometrica(1, 2, 12);
			p3.computarProgressao();
			System.out.println(p3.imprimirProgressao());
		} catch (Excecao1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
