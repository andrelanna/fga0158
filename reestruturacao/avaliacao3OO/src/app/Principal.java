package app;

import classes.Solido;
import exceptions.Excecao0;

public class Principal {

	public static void main(String[] args) {
		int X = 1;
		int Y = -3;
		int Z = -2;
		Solido s = null; 
		try {
			s = new Solido(X, Y, Z);
			System.out.println("Vol: " + s.calcularVolume());
		} catch (Excecao0 e) {
			System.out.println("Excecao 3 ou 4 capturada");
		}
	}

}


//int lado1 = X; 
//int lado2 = Y;
//Base b = null;
//try {
//	b = new Base(X, Y);
//	b.calcularArea();
//} catch (Excecao0 e) {
//	System.out.println("Excecao capturada.");;
//}
