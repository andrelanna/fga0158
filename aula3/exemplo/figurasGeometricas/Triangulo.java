package figurasGeometricas;

public class Triangulo extends FigurasGeometricas {

    float altura;

    public Triangulo(float lado ,float altura, int qteLado){
        this.lado = lado;
        this.altura = altura;
        this.qteLado = qteLado;
    }

    public float getAltura(){
        return altura;
    }

    public float calcularArea(){
        return (lado*altura)/2;
    }

}
