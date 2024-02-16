
public class Motocicleta extends Veiculo {
	int numCilindradas;
	boolean bau;
	int capacidadeBau = 40; 
	
	
	public Motocicleta(boolean temBau) {
		bau = temBau;
	}


	public int carregarBau() {
		capacidadeBau--;
		return capacidadeBau;
	}
}
