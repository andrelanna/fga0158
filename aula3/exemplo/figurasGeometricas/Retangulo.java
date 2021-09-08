package figurasGeometricas;

public class Retangulo {

    private double altura;
    private double largura;

    public setAltura(double altura) {
        this.altura = altura;
    }

    public setLargura(double largura) {
        this.largura = largura;
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (altura * 2) + (largura * 2);
    }
}
