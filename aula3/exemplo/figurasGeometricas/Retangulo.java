package figurasGeometricas;

public class Retangulo {

	private float base;
	private float altura;
	
	public Retangulo(float base, float altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
	public float calcularArea() {
		return base * altura;
	}
	
	public float calcularPerimetro() {
		return 2 * (base + altura);
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getBase() {
		return base;
	}
	
	public float getAltura() {
		return altura;
	}
	
}
