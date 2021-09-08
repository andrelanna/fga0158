package figurasGeometricas;

public class Circulo {

	public static final float PI = 3.14f;

    private float raio;

    public Circulo() {}

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float calcularPerimetro() {
		return 2 * PI * raio; 
	}
	
	public float calcularArea() {
		return PI * raio * raio; 
	}

	public float getRaio() {
		return raio;
	}
}
