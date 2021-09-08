package figurasGeometricas;

public class Circulo {

    private float raio;

    public Circulo(float raioCirculo) {
        this.raio = raioCirculo;
    }

    public float calcularPerimetro() {
        return (Float.parseFloat(String.valueOf(Math.PI)) * 2 * raio);
    }

    public float calcularArea() {
        return (Float.parseFloat(String.valueOf(Math.PI)) * raio * raio);
    }
    public float getRaio() {
        return raio;
    }
}