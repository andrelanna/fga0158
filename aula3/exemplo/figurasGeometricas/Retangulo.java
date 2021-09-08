package figurasGeometricas;

public class Retangulo {

	//c�lculo de �rea e per�metro para c�rculo
	
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
