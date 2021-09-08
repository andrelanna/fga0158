package figurasGeometricas;

import static java.lang.Math.PI;

public class Circulo {

	private float raio;

	public Circulo(float raio) {
		this.raio = raio;
	}

	public float calcularPerimetro() {
		return 2 * ((float) PI) * this.raio; 
	}
	
	public float calcularArea() {
		return ((float) PI) * this.raio * this.raio; 
	}

	public float getRaio() {
		return this.raio;
	}
}
