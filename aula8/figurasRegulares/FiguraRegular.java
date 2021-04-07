package figurasRegulares;

public class FiguraRegular {
	
	float lado; 
	
	
	public FiguraRegular(float lado) {
		this.lado = lado; 
	}


	public float calcularArea() {
		return lado * lado; 
	}
	
	
	public float calcularPerimetro() {
		return 4 * lado; 
	}
	
}
