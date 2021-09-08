package figurasGeometricas;

public class Retangulo {

	private float altura, comprimento;

	public Retangulo(float alturaRetangulo, float compRetangulo) {
		this.altura = alturaRetangulo;
        this.comprimento = compRetangulo;
	}

	public float calcularPerimetro() {
		return 2 * altura + 2 * comprimento; 
	}
	
	public float calcularArea() {
		return altura * comprimento; 
	}

	public float getAltura() {
		return altura;
	}
    public float getComprimento() {
		return comprimento;
	}
}
