package figurasGeometricas;

public class Circulo {

	private static final float PI = 3.1415;

	private float raio;

	public Circulo(float raioCirculo) {
		this.raio = raioCirculo;
	}

	public float calcularPerimetro() {
		return 2 * PI * raio; 
	}
	
	public float calcularArea() {
		return PI * raio * raio; 
	}
}
