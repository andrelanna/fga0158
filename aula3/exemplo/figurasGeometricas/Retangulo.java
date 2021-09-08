package figurasGeometricas;

public class Retangulo {

	//cálculo de área e perímetro para círculo
	
	private float Base, Altura;
	 
	public Retangulo(float baseRetangulo,float alturaRetangulo) {
		this.Base = baseRetangulo;
		this.Altura = alturaRetangulo;
	}
	
	public double calcularAreaRetangulo() {
		return  Base*Altura;
	}

	public double calcularPerimetroRetangulo() {
		return 2 *(Base+Altura); 
	}
	
}
