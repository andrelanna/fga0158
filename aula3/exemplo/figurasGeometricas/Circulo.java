package figurasGeometricas;


public class Circulo {
	public static double  pi = 3.14;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calcularPerimetro() {
		return 2 * pi * raio; 
	}
	public double calcularArea() {
		return pi * raio * raio; 
	}
	public double calcularDiametro() {
		return 2*raio; 
	}
	public double getRaio() {
		return raio;
	}
}
