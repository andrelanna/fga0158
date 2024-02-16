package ui;

import app.Aritmetica;
import app.Geometrica;
import app.Progressao;

public class Principal {

	public static void main(String[] args) {
		Progressao p;
		
		p = new Aritmetica(1, 3, 2);
		p.calcularProgressao(); 
		System.out.println(p.imprimir());

		p = new Geometrica(1, 3, 2);
		p.calcularProgressao(); 
		System.out.println(p.imprimir());
	}

}
