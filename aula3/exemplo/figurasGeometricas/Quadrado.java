package figurasGeometricas;

public class Quadrado {

	private float lado;
	
	public Quadrado(float lado) {
		this.setLado(lado);
	}
	
	public float calcularArea() {
		return lado * lado;
	}
		
	public float calcularPerimetro() {
		return 4 * lado;
	}
	
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float getLado() {
		return lado;
	}
	
}
