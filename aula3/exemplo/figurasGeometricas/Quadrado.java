package figurasGeometricas;

public class Quadrado extends FigurasGeometricas {

	public Quadrado(float lado,int qteLado) {
		this.lado = lado;
		this.qteLado = qteLado;
	}
	
	public float calcularArea() {
		return lado * lado; 
	}

}
