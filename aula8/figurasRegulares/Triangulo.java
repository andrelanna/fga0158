package figurasRegulares;

public class Triangulo extends FiguraRegular{

	private static float raiz3 = (float) Math.sqrt(3);

	public Triangulo(float lado) {
		super(lado);
	}

	public float calcularArea() {
		float area = (super.calcularArea() * raiz3 ) / 4;
		return area;
	}
	
	public float calcularPerimetro() {
		return 3 * lado;
	}

}
