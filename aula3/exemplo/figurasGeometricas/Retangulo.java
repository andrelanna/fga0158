package figurasGeometricas;

public class Retangulo {

    private float base;
    private float altura;

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea(){
        return base * altura;
    }

    public float calcularPerimetro(){
        return  2 * altura + 2 * base;
    }
    
    public float getBase(){
        return base;
    }

    public float getAltura(){
        return altura;
    }
}