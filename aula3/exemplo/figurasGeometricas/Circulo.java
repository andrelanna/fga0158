package exemplo.figurasGeometricas;

public class Circulo {
    private float raio;

    public Circulo(float raioCirculo){
        this.raio = raioCirculo;
    }
    public float calcularPerimetro(){
        return (float)(2 * 3.14 * raio);
    }
    public float calcularArea(){
        return (float)(3.14 * raio * raio);
    }
    public float getRaio(){
        return raio;
    }
}
