package figurasGeometricas;

public class Retangulo {

    private float largura;
	private float altura;

	public Retangulo(float alturaRetangulo, float larguraRetangulo) {
		this.largura = larguraRetangulo;
		this.altura = alturaRetangulo;
	}

	public float calcularPerimetro() {
		return (2 * largura) + (2 * altura); 
	}
	
	public float calcularArea() {
		return largura * altura; 
	}

	public float getAltura() {
		return altura;
	}

	public float getLargura() {
		return largura;
	}
}
