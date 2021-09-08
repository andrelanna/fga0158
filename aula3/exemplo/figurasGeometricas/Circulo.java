package figurasGeometricas;

public class Circulo {

    public static final double PI = 3.1415;

    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return 2 * PI *raio;
    }

    public double calcularArea(){
        return PI * raio *raio;
    }

    public float getRaio(){
        return raio;
    }

    
}
