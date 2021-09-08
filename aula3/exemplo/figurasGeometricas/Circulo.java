package figurasGeometricas;

public class Circulo {

	//c�lculo de �rea e per�metro para c�rculo
	
	private float raioR;
	
	public Circulo(float raio) {
		this.raioR = raio;
	}
	
	public double calcularAreaCirculo() {
		return 3.14* raioR * raioR; 
	}

	public double calcularPerimetroCirculo() {
		return 2 * 3.14 * raioR; 
	}
	
}
