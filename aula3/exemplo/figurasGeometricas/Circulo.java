package figurasGeometricas;

public class Circulo {

	private float raio;

	public Circulo(float raioCirculo) {
		this.raio = raioCirculo;
	}

	public float calcularPerimetro() {
		return (2 * raio * 3.14); 
	}
	
	public float calcularArea() {
		return (3.14 * (raio * raio)); 
	}

    public float getRaio() {
		return raio;
	}
}
