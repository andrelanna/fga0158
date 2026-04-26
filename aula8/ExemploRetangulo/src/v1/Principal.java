package v1;

public class Principal {

	public static void main(String[] args) {
		Retangulo r1, r2; 
		
		r1 = new Retangulo(5, 4, "mm");
		
		//criar retangulo r2
		Medida base = new Medida(3, "cm");
		Medida altura = new Medida(5, "cm");
		r2 = new Retangulo(base, altura);
		
		r1.calcularArea();
		r1.calcularPerimetro();
		r2.calcularArea();
		r2.calcularPerimetro();
		
		System.out.println(r1.imprimir());
		System.out.println("-----------------------------");
		System.out.println(r2.imprimir());
	}

}
