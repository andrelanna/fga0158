
public class Retangulo {
	Medida base, 
	       altura; 
	
	Retangulo(Medida base, Medida altura) {
		this.base = base; 
		this.altura = altura;
	}
	
	int calcularArea() {
		int area = base.getMedida() * altura.getMedida(); 
		return area;
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Vou destruir o objeto " + this);
	}
}
