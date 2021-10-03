package figurasGeometricas;

public class FigurasGeometricas {
    
    /* public static final double PI = 3.1415; */
    float lado;
    int qteLado;


    public float getLado() {
		return lado;
	}

    public int getQteLado(){
        return qteLado;
    }

    public float calcularPerimetro(){
        return lado*qteLado;
    }

}
