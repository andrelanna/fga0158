package figurasGeometricas;

public class Retangulo {

	private float ladoMaior;
	private float ladoMenor;

	public Retangulo(float ladoMaiorRetangulo, float ladoMenorRetangulo) {
		this.ladoMaior = ladoMaiorRetangulo;
		this.ladoMenor = ladoMenorRetangulo;
	}

	public float calcularPerimetro() {
		return 2 * ladoMaior + 2 * ladoMenor; 
	}
	
	public float calcularArea() {
		return ladoMaior * ladoMenor; 
	}

	public float getLadoMaior() {
		return ladoMaior;
	}

	public float getLadoMenor() {
		return ladoMenor;
	}
}
