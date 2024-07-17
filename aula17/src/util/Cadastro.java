package util;

import java.lang.reflect.Array;

public class Cadastro<C> {
	private C elementos[];
	private int numElementos;
	
	public Cadastro() {
		elementos = (C[]) new Object[0];
	}
	
	public int cadastrar(C c) {
		C[] temp = (C[])new Object[elementos.length + 1];
		for (int i=0; i<elementos.length; i++) {
			temp[i] = elementos[i];
		}
		temp[temp.length-1] = c;
		numElementos++;
		return numElementos;
	}
	
	public Iterador<C> getIterador() {
		Iterador<C> it = new Iterador<C>(this);
		return it;
	}

	public int getSize() {
		return numElementos;
	}

	public <C> C get(int pos) {
		return (C) elementos[pos];
	}
	
}
