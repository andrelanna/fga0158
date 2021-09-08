package figurasGeometricas;

public class Circulo implements FiguraBase {
    private final float raio;

    private final float PI = (float)Math.PI;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float calcularPerimetro() {
        return 2 * PI * this.raio;
    }

    public float calcularArea() {
        return PI * raio * raio;
    }

    public float getRaio() {
        return this.raio;
    }
}
