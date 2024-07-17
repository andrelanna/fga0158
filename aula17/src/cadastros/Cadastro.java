package cadastros;

public class Cadastro <T> {
	int numElementos;
	private T elementos[];
	
	public Cadastro() {
		numElementos = 0;
		elementos = (T[])(new Object[0]);
	}
	
	public int cadastrar(T t) {
		T[] temp = (T[])(new Object[elementos.length + 1]);
		for (int i=0; i<elementos.length; i++) {
			temp[i] = elementos[i];
		}
		temp[temp.length - 1] = t;
		elementos = temp;
		numElementos++;
		return numElementos;
	}
	
	public boolean remover (T remover) {
		if (remover == null) {
			return false;
		}
		
		T[] temp = (T[]) new Object[elementos.length - 1];
		int j=0;
		for (int i=0; i<numElementos; i++) {
			if(elementos[i] != remover) {
				temp[j] = elementos[i];
				j++;
			} else {
				elementos[i] = null; 
			}
		}
		elementos = temp;
		numElementos--;
		return true;
	}
	
	public String imprimir() {
		String resposta = ""; 
		for (T t: elementos) {
			resposta += t;
			resposta += "-------\n";
		}
		resposta += "FIM DO CADASTRO!";
		return resposta;
	}
	
	public T getPrimeiro() {
		return elementos[0]; 
	}
}
















