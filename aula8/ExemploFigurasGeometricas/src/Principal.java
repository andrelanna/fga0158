
public class Principal {

	public static void main(String[] args) {
		Circulo circ = new Circulo(10, "mm");
		Cilindro cil = new Cilindro(circ, new Medida(100, "mm"));
		
		circ.calcularArea();
		circ.calcularPerimetro();
		
		cil.calcularAreaSuperficie();
		cil.calcularVolume();
		
		
	}

}
