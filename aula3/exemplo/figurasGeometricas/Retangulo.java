package figurasGeometricas;

public class Retangulo {

	private float lado;
    private float base;

	public Quadrado(float ladoRetangulo, float baseRetangulo) {
		this.lado = ladoRetangulo;
        this.base = baseRetangulo;
	}

	public float calcularPerimetro() {
		return ((2 * lado) + (2 * base)); 
	}
	
	public float calcularArea() {
		return lado * base; 
	}

	public float getLado() {
		return lado;
	}

    public float getBase() {
		return base;
	}
}
