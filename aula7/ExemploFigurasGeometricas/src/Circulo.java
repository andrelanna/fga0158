
public class Circulo {
	
	//atributos de um circulo
	Medida raio, 
	       perimetro, 
	       area;
	
	//construtores alternativos de circulo
	public Circulo(float valor, String unidade) {
		raio = new Medida(valor, unidade);
	}
	
	public Circulo(Medida raio) {
		this.raio = raio; 
	}
	 
	//metodos de um circulo
	public Medida calcularPerimetro() {
		float valorPerimetro = 2 * raio.getValor() * 3.14f;
		perimetro = new Medida(valorPerimetro, raio.getUnidade());
		return perimetro;
	}
	
	public Medida calcularArea() {
		float valorArea = (float)Math.PI * (float)Math.pow(raio.getValor(), 2);
		String unidadeArea = raio.getUnidade() + "2";
		area = new Medida(valorArea, unidadeArea);
		return area;
	}
	
}

















