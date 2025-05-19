package figurasGeometricas;

public class Circulo {
	
	public static final float PI = 3.14f;
	
	private Medida raio;
	private Medida perimetro;
	private Medida area;
	
	public Circulo(Medida raio) {
		this.raio = raio; 
	}
	
	public Medida calcularPerimetro() {
		float valor = 2 * PI * raio.getValor();
		String unidade = raio.getUnidade();
		perimetro = new Medida(valor, unidade);
		return perimetro;
	}
	
	public Medida calcularArea() {
		float valor  = PI * raio.getValor() * raio.getValor();
		String unidade = raio.getUnidade()+"2";
		area = new Medida(valor, unidade);
		return area; 
	}
}
