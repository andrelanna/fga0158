import figurasGeometricas.Circulo;
import figurasGeometricas.Medida;

public class Avaliacao2_Questao4 {

	public static void main(String[] args) {
		Circulo cs[] = new Circulo[2];
		cs[1] = new Circulo(new Medida(10, "mm"));
		cs[2] = new Circulo(new Medida(10, "cm"));
		
		for (Circulo c: cs) {
			System.out.println(c.calcularArea().getValor() + c.calcularArea().getUnidade());
			System.out.println(c.calcularPerimetro().getValor() + c.calcularPerimetro().getUnidade());
		}
	}

}
