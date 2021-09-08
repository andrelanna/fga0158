package figurasGeometricas;

public class Triangulo {

	private float lado;
	
	public Triangulo(float lado) {
		this.lado = lado;
	}

	public float calcularPerimetro() {
		return 3 * lado; 
	}
	
	public float calcularArea() {
		return (lado * lado)/2; 
	}

	public float getLado() {
		return lado;
	}

}
