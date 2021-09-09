package figurasGeometricas;

public class Circulo {
	private float raio;
	

	
	public Circulo(float raioCirculo) {
		this.raio=raioCirculo;
		
		
		
		
	}
	public double calcularPerimetro() {
		return 2* 3.14 *raio;
	}
	public double calcularArea() {
		return 3.14*3.14*raio;
	}
	public float getRaio() {
		return raio;
	}
}

