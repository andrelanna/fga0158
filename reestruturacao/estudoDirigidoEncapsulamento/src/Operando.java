

public class Operando {
	private float valor; 
	
	public Operando() {
		System.out.println("--> Construtor padrão de Operando");
		this.valor = 0; 
	}
	
	public Operando(float valor) {
		this.valor = valor;
	}
	
	public float getOperando() {
		return valor;
	}
}
