
public class Quadrilátero extends FiguraGeometrica {
	
	private int base;

	public Quadrilátero() {
		System.out.println("Iniciando const padrao Quadrilatero");
	}
	
	public Quadrilátero(int b) {
		this();
		System.out.println("Iniciando const alt Quadrilatero");
		base = b; 
	}
	
	public float calcularArea() {
		float area = base * base; 
		return area;
	}

	public float calcularPerimetro() {
		float perimetro = 4 * base; 
		return perimetro;
	}

	public int getBase() {
		return base;
	}
	
	
}
