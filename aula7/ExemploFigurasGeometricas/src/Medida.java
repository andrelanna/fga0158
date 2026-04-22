
public class Medida {
	
	///Atributos de uma medida
	float valor;
	String unidade; 
	
	public Medida(float valor, String unidade) {
		this.valor = valor; 
		this.unidade = unidade; 
	}

	
	//metodos get - leitura do estado do objeto
	public float getValor() {
		return valor;
	}

	public String getUnidade() {
		return unidade;
	}
	
}
