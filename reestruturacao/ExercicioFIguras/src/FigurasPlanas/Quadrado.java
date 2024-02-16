package FigurasPlanas;

public class Quadrado extends FiguraRegular{

	public Quadrado(float lado) {
		super(lado);
	}

	public float calcularArea() {
		area = lado * lado; 
		return area;
	}

	public float calcularPerimetro() {
		perimetro = 4 * lado; 
		return perimetro;
	}
	
	
}
