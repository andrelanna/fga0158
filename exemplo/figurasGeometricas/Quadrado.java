package figurasGeometricas;

public class Quadrado {

	private float lado;

	public Quadrado(float ladoQuadrado) {
		this.lado = ladoQuadrado;
	}

	public float calcularPerimetro() {
		return 4 * lado; 
	}
	
	public float calcularArea() {
		return lado * lado; 
	}

	public float getLado() {
		return lado;
	}
}
