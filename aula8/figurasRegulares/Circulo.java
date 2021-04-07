package figurasRegulares;

public class Circulo {

	private float raio;
	private static final float pi = 3.1415f;

	public Circulo(float raio) {
		this.raio = raio;
	}

	public float calcularArea() {
		float area = pi  * raio * raio; 
		return area;
	}

	public float calcularPerimetro() {
		float perimetro = 2 * pi * raio;
		return perimetro;
	}

}
