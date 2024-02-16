package FigurasPlanas;

public class TrianguloEquilatero extends FiguraRegular{

	public TrianguloEquilatero(float lado) {
		super(lado);
	}

	public float calcularArea() {
		area = (float) (Math.pow(lado, 2) * Math.sqrt(3) / 4);
		return area;
	}

	public float calcularPerimetro() {
		perimetro = 3 * lado; 
		return perimetro;
	}

}
