
public class Cilindro {
	//atributos do cilindro
	Circulo base; 
	Medida altura, 
	       areaSuperficie, 
	       volume;
	
	//construtores
	public Cilindro(float raio, float altura, String unidade) {
		base = new Circulo(raio, unidade);
		this.altura = new Medida(altura, unidade);
	}
	
	public Cilindro(Circulo base, Medida altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Medida calcularVolume() {
		Medida areaBase = base.calcularArea();
		float valorVolume = areaBase.getValor() * altura.getValor();
		String unidadeVolume = altura.getUnidade() + "3";
		this.volume = new Medida(valorVolume, unidadeVolume);
		return this.volume;
	}
	
	public Medida calcularAreaSuperficie() {
		float valorArea = 2 * base.calcularArea().getValor() + 
				          base.calcularPerimetro().getValor() * altura.getValor();
		String unidade = base.calcularArea().getUnidade();
		this.areaSuperficie = new Medida(valorArea, unidade);
		return this.areaSuperficie;
	}
}




















