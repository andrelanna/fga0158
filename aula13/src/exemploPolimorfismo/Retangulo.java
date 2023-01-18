package exemploPolimorfismo;

public class Retangulo extends Quadrilatero{
	
	private int altura; 
	
	public Retangulo (int b, int a) {
		super(b);
		altura = a; 
	}
	
	public float calcularArea() {
		float area = altura * getBase(); 
		return area;
	}
	
	public float calcularPerimetro() {
		float perimetro = 2*altura + 2 * getBase();
		return perimetro;
	}
}
