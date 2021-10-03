package figurasGeometricas;

import java.lang.Math;


public class Hexagono extends FigurasGeometricas {
    
    public Hexagono(float lado, int qteLado){
        this.lado=lado;
        this.qteLado = qteLado;
    }

    public float calcularArea(){
        return (float) (3*lado*lado*Math.sqrt(3))/2;
    }
}
