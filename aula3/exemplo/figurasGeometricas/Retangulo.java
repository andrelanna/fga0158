package figurasGeometricas;

public class Retangulo {

    private float ladoA;
    private float ladoB;

    public Retangulo() {}

    public Retangulo(float ladoA, float ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public float calcularPerimetro() {
		return 2 * (ladoA + ladoB); 
	}
	
	public float calcularArea() {
		return ladoA * ladoB; 
	}

	public float getLadoA() {
		return ladoA;
	}

    public float getLadoB() {
		return ladoB;
	}
}
