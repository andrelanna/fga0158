package exemploPolimorfismoParametrico;

public class Cadastro<T> {
	
	T[] elementos; 
	
	public Cadastro() {
		elementos = (T[]) new Object[0];
	}
	
	public boolean adicionar(T t) {
		//Criar um vetor com ua posicao a mais que elementos
		T[] temp = (T[]) new Object[elementos.length + 1];
		
		//Copiar elementos para temp
		for (int i=0; i<elementos.length; i++) {
			temp[i] = elementos[i];
		}
		
		//adicionar t em temp
		temp[elementos.length] = t;
		
		//atualizar referencias
		elementos = temp;
		
		return true;
	}

	public String imprimirCadastro() {
		String resposta = ""; 
		for (T e : elementos) {
			resposta += e.toString() + "\n";
		}
		return resposta; 
	}
	
	
}
