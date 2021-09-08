package figurasGeometricas;

public class Retângulo {
    private float base, altura;

    public Retângulo (float baseRetangulo, float alturaRetangulo){
        this.base = baseRetangulo;
        this.altura = alturaRetangulo;
    }

    public float calcularPerimetro(){
        return (2*base)+(2*altura);
    }

    public float calcularArea (){
        return (base*altura);
    }

    public float getBase (){
        return base;
    }

    public float getAltura (){
        return altura;
    }
    
}
