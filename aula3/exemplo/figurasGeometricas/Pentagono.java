package figurasGeometricas;

public class Pentagono extends FigurasGeometricas {

    float apotema;

    public Pentagono(float lado, float a, int qteLado){
        this.lado=lado;
        this.apotema=a;
        this.qteLado = qteLado;
    }

    public float calcularArea(){
        return calcularPerimetro()*apotema;
    }

    public float getApotema() {
        return apotema;
    }
    
}
