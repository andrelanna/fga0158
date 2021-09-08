package figurasGeometricas;

public class Retangulo {

    private float altura;
    private float largura;

    public Retangulo(float alturaRetangulo, float larguraRetangulo) {
        this.altura = alturaRetangulo;
        this.largura = larguraRetangulo;
    }

    public float calcularPerimetro() {
        return (altura * 2) + (largura * 2);
    }

    public float calcularArea() {
        return altura * largura;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargura() {
        return largura;
    }
}
