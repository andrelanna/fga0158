package FigurasSolidas;

import FigurasPlanas.Quadrado;

public class Cubo extends FiguraSolida{

	public Cubo(float altura) {
		super(altura, new Quadrado(altura));
	}

	public float calcularAreaSuperficie() {
		areaSuperficie = 6 * base.calcularArea();
		return areaSuperficie;
	}

}
