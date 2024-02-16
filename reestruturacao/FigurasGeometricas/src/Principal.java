
public class Principal {
	
	public static void main(String[] args) {
	
		FiguraGeometrica f; 
		f = new Quadrado(5); 

		System.out.println(f.calcularArea());
		System.out.println(f.calcularPerimetro());
//		Quadrado q = (Quadrado)f;
//		System.out.println("A base do quadrado = " + q.getBase());
		System.out.println("A base do quadrado = " + ((Quadrado)f).getBase());
		System.out.println(f);
		System.out.println("-------------------------");
		
		f = new Retangulo(10, 20);
		System.out.println(f.calcularArea());
		System.out.println(f.calcularPerimetro());
		System.out.println(f);
	}
}
