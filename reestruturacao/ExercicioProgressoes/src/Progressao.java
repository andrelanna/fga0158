
public abstract class Progressao {
	int n;
	int r; 
	int soma; 
	Termo[] termos;
	
	private Progressao() {}
	
	public Progressao(int a0, int n, int r) {
		termos = new Termo[n]; 
		termos[0] = new Termo(1, a0); 
		this.n = n; 
		this.r = r; 
	}
	
	public abstract Termo[] computarProgressao(); 
	
	public int somarTermos() {
		int soma = 0; 
		for (Termo t: termos) {
			soma += t.getValor();
		}
		this.soma = soma;
		return soma;
	}
	
	public String imprimir() {
		String resposta = "[ "; 
		for (Termo t: termos) {
			resposta += t.getValor() + ", ";
		}
		resposta += "]";
		
		return resposta;
	}
}
