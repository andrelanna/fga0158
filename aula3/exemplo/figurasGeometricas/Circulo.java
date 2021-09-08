package figurasGeometricas;

public class Circulo {

	private float raio;

	public float getRaio() {
		return raio;
  }
	public Circulo(float valorraio) {
		this.raio = valorraio;
	}

	public float calcularPerimetro() {
		return 2 * 3.14 * raio; 
	}
	
	public float calcularArea() {
		return 3.14 * (getRaio() * getRaio()); 
	}

	
}
