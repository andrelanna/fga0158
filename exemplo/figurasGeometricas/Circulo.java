package figurasGeometricas;

public class Circulo {

	private float raio;
	private double PI = 3.14;
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	public float calcularPerimetro() {
		return (float) (2 * PI * raio); 
	}
	
	public float calcularArea() {
		return (float) (PI* raio* raio); 
	}

	public float getRaio() {
		return raio;
	}
}
