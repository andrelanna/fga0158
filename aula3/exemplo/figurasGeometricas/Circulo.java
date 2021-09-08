package figurasGeometricas;

public class Circulo {

	private float raio;

	public Circulo(float raioCirculo) {
		this.raio = raioCirculo;
	}

	public float calcularPerimetro() {
		return (float)(2*(Math.PI*raio));
	}
	
	public float calcularArea() {
		return  (float)(Math.PI*(Math.pow(raio,2)));
	}

	public float getRaio() {
		return raio;
	}
}
