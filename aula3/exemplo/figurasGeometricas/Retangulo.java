package figurasGeometricas;

public class Retangulo {

	private float altura;
	private float comprimento;

	public Retangulo(float altura, float comprimento) {
		this.altura = altura;
		this.comprimento = comprimento;
	}

	public float calcularPerimetro() {
		return ((2 * this.altura) + (2 * this.comprimento)); 
	}
	
	public float calcularArea() {
		return this.altura * this.comprimento; 
	}

	public float getAltura() {
		return this.altura;
	}

	public float getComprimento() {
		return this.comprimento;
	}

}
