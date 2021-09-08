package figurasGeometricas;

public class Circulo {

	private float raio;
	public static final float PI = 3.14f;

	public Circulo(float raioCirculo) {
		this.raio = raioCirculo;
	}

	public float calcularPerimetro() {
		return 2 * PI * raio; 
	}
	
	public float calcularArea() {
		return PI * raio * raio; 
	}

	public float getRaio() {
		return raio;
	}
}
