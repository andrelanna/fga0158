package v1;

public class Medida {
	
	//Atributos de medida
	int valor;
	String unidade; 
	
	//Métodos de medida
	public Medida(int valor, String unidade) {
		this.valor = valor; 
		this.unidade = unidade; 
	}
	
	String imprimir() {
		String resposta = ""; 
		resposta = valor + " " + unidade + "(" + this + ")"; 
		return resposta; 
	}
}
