package figurasGeometricasIrregulares;

public class Retangulo extends FigGeometricaIrregular {

    public Retangulo(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado1;
        this.lado4 = lado2;
    }
    
    public float calcularArea(){
        return lado1 * lado2;
    }
    

}