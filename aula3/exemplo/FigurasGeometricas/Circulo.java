package FigurasGeometricas;

public class Circulo {
	private float raio;
	
	public Circulo(float raioCirculo) {
		this.raio = raioCirculo;
	}
	
	public float calcularPerimetro() {
		return (float)(2 * Math.PI * raio);
	}
	
	public float calcularArea() {
		return (float) (Math.PI * raio * raio); 
	}

	public float getRaio() {
		return raio;
	}
}
