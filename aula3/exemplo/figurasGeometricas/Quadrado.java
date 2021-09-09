package figurasGeometricas;


public class quadrado {
	private float lado;

	public quadrado(float ladoQuadrado) {
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
