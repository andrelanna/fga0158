
public class PG {
		private int n; 
		private int r; 
		private int soma; 
		private Termo[] termos; 
		
		private PG() {}
		
		public PG(int a0, int n, int r) {
			termos = new Termo[n];
			termos[0] = new Termo(1, a0);
			this.n = n; 
			this.r = r;
		}
		
		public Termo[] computarPG() {
			for (int i=2; i<=n; i++) {
				int valor = termos[i-2].getValor() * (i-1)*r;
				Termo t = new Termo(i, valor);
				termos[i-1] = t;
			}
			return termos;
		}
		
		public int somaTermos() {
			int soma = 0; 
			for (int i=0; i<=n; i++) {
				soma += termos[i].getValor();
			}
			this.soma = soma; 
			return soma;
		}
		
		public String imprimir() {
			String resposta = "[ "; 
			for (int i=0; i<n; i++) {
				resposta += termos[i].getValor() + ", ";
			}
			resposta += "]";
			
			return resposta;
		}
}
