package figurasGeometricas;

public class Circulo {

	private float raio;
    public float pi = (float) 3.14;
    

	public Circulo(float raiocirculo) {
		this.raio = raiocirculo;
	}

	public float calcularPerimetro() {
		return 2 * raio * pi; 
	}
	
	public float calcularArea() {
		return pi*(raio*raio); 
	}

	public float getRaio() {
		return raio;
	}
}