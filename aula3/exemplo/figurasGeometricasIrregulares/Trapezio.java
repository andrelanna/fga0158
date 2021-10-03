package figurasGeometricasIrregulares;

public class Trapezio extends FigGeometricaIrregular{

    float altura;
    public boolean hasAltura = false;

    public Trapezio(float lado1, float lado2, float baseMenor, float baseMaior, float altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = baseMenor;
        this.lado4 = baseMaior;
        this.altura = altura;
        hasAltura = true;
    }

    public float getBaseMenor(){
        return lado3;
    }

    public float getBaseMaior(){
        return lado4;
    }

    public float getAltura(){
        return altura;
    }

    public float calcularArea(){
        return ((lado3*lado4)*altura)/2;
    }

}
