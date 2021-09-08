package exemplo.figurasGeometricas;

public class Retangulo {
    private float lado1;
    private float lado2;
    public Retangulo(float lado1Retangulo, float lado2Retangulo) {
		this.lado1 = lado1Retangulo;
        this.lado2 = lado2Retangulo;
	}
    public float calcularPerimetro() {
		return ((lado1 * 2) + (lado2 * 2)); 
	}
    public float calcularArea() {
		return lado1 * lado2; 
	}
    public float getLado1() {
		return lado1;
	}
    public float getLado2() {
		return lado2;
	}
}
