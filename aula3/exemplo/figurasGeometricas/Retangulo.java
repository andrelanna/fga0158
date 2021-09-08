package figurasGeometricas;

public class Retangulo {

    private float base;
    private float altura;

    public Retangulo(float alturaRetangulo,float baseRetangulo)
    {
        this.base = baseRetangulo;
        this.altura = alturaRetangulo;
    }

    public float calcularPerimetro()
    {
        return (2 * base + 2 * altura);
    }

    public float calcularArea() {
        return base * altura;
    }

    public float getAltura() {
        return altura;
    }
    public float getBase(){
        return base;
    }
}
