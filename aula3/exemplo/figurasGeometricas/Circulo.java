package figurasGeometricas;

public class Circulo {

    // Declaração da variavel cirfunc que vai receber o valor da circunfederência
	private float circunf;

    public static float PI = 3.14159f;

	public Circulo(float circunferencia) {
		this.circunf = circunferencia;
	}

	public float CalculaPerimetro() {
		return 2 * PI * circunf;
	}

	public float calcularArea() {
		return PI * circunf * circunf;
	}

    public float getLado() {
        return circunf;
    }
}
