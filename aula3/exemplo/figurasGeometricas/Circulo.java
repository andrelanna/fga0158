package figurasGeometricas;
public class Circulo {
    
    private double raio;
    private double pi = Math.PI;

    public Circulo(float raioCirculo) {
        this.raio = raioCirculo;
    }

    public double calcularPerimetro(){
        return 2*pi*raio;
    }

    public double calcularArea(){
        return raio*raio*pi;
    }

    public double getRaio(){
        return raio;
    }
    
}