
abstract class Veiculo {
	
	int anoMarca, anoModelo;
	String marca, modelo;
	private boolean ligado;
	private int velocidade;
	
	public boolean ligarDesligar() {
		if (!ligado) 
			ligado = true; 
		else 
			ligado = false;
		return ligado; 
	}
	
	public int acelerar() {
		velocidade++; 
		return velocidade; 
	}
	
	public float frear() {
		if (velocidade != 0) {
			velocidade--; 
		}
		return velocidade;
	}
	
	public String imprimir() {
		String resposta = ""; 
		resposta += "Ano Marca: " + anoMarca + '\n';
		resposta += "Ano Modelo: " + anoModelo + '\n';
		resposta += "Marca: " + marca + '\n';
		resposta += "Modelo: " + modelo + '\n';
		resposta += "Ligado: " + ligado + '\n';
		resposta += "Velocidade: " + velocidade + '\n';
		
		return resposta; 
	}
}





