package app;

public abstract class Progressao {

	/**
	 * Atributos de toda e qualquer progressao
	 */
	int a0; 
	int n; 
	int r; 
	
	int[] termos;
	
	/**
	 * Construtor alternativo
	 * @param a0 primeiro termo
	 * @param n numero de termos
	 * @param r razao da progressao
	 */
	public Progressao(int a0, int n, int r) {
		this.a0 = a0;
		this.n = n; 
		this.r = r; 
	}
	
	/**
	 * Método para calcular progressao 
	 * @return a progressao
	 */
	public abstract int[] calcularProgressao();
	
	
	/**
	 * Calcula soma de termos de qualquer tipo de progressao
	 * @return soma dos termos
	 */
	public int calcularSoma() {
		int soma = 0; 
		for (int t: termos) {
			soma += t;
		}
		return soma;
	}
	
	/**
	 * Imprimir os termos de toda e qualquer progressao
	 * @return uma string representando a progressao
	 */
	public String imprimir() {
		String resposta = "["; 
		for (int t: termos) {
			resposta += " " + t + ","; 
		}
		resposta += "]";
		return resposta; 
	}
}








