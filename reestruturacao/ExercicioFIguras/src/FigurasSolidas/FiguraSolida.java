package FigurasSolidas;

import FigurasPlanas.FiguraPlana;

public abstract class FiguraSolida {
	
	float altura;
	float volume;
	float areaSuperficie;
	FiguraPlana base; //base
	
	public abstract float calcularAreaSuperficie();
	
	public FiguraSolida(float altura, FiguraPlana base) {
		this.altura = altura;
		this.base = base; 
	}
	
	public float calcularVolume() {
		volume = base.calcularArea() * altura;
		return volume;
	}
	
}
