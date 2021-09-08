package figurasGeometricas;

public class Circulo {
    private float raio;
    static private float pi = 3.14f;

    public Circulo (float Raio){
        this.raio = Raio;
    }

    public float getRaio (){
        return raio;
    }

    public float calcularPerimetro(){
        return 2*pi*raio;
    }

    public float calcularArea(){
        return pi*raio*raio;
    }
    
}
