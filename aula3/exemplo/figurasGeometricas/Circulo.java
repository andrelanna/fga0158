package figurasGeometricas;

public class Circulo {

	private final float PI = 3.14159F;
	private float raio;
	
	public Circulo(float raio) {
		this.setRaio(raio);
	}
	
	public float calcularArea() {
		return PI * raio * raio;
	}
	
	public float calcularPerimetro() {
		return 2 * PI * raio;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getRaio() {
		return raio;
	}
	
}
