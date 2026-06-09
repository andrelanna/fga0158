package fga0158;

public class Cadastro<T> {
	
	private T elementos[];
	
	public Cadastro() {
		elementos = (T[]) new Object[0];
	}
	
	public int getTamanho() {
		return elementos.length;
	}
	
	public boolean cadastrar (T t) {
		T[] temp = (T[])new Object[elementos.length + 1];
		for (int i=0; i<getTamanho(); i++) {
			temp[i] = elementos[i];
		}
		
		temp[temp.length-1] = t;
		
		elementos = temp;
		
		if (elementos[elementos.length-1] == t) 
			return true;
		else 
			return false;
	}
}
