package exercicioFixacao.correcaoExercicio4;

public class ProgressaoAritmetica {
	
	/**
	 * Atributos da classe ProgressaoAritmetica
	 */
	int a0, //primeiro termo 
	    n,  //numero de termos
	    r;  //razao da PA
	int termos[]; 
	
	/**
	 * Construtor alternativo
	 */
	
	ProgressaoAritmetica(int a0, int n, int r) {
		this.a0 = a0; 
		this.n = n; 
		this.r = r; 
		this.termos = new int[n];
		calcularPA();
	}
	
	
	void calcularPA() {
		for (int i=1; i <= n; i++) {
			termos[i-1] = a0 + (i-1) * r;
		}
	}


	/**
	 * Metodo "naive" para somar termos
	 * @return
	 */
	int somaTermos() {
		int soma = 0; 
		for (int i=0; i < termos.length; i++) {
			soma += termos[i];
		}
		return soma; 
	}
	
	/**
	 * Metodo que calcula a soma segundo Gauss
	 * @return
	 */
	int somaTermosGauss() {
		int soma = (a0 + termos[termos.length - 1]) * r / 2;
		return soma; 
	}
}
