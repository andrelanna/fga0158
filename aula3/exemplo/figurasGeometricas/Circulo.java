package figurasGeometricas;

public class Circulo {

	private float raio;

	public Circulo(float raioCirculo) {
		this.raio = raioCirculo;
	}

	public float calcularPerimetro() {
		return 2 *(float)Math.PI*raio; 
	}
	
	public float calcularArea() {
		return  (float)Math.PI*raio * raio; 
	}

	public float getLado() {
		return raio;
	}
}