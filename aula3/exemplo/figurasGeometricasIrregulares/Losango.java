package figurasGeometricasIrregulares;

public class Losango extends FigGeometricaIrregular{
    
    float diagMenor;
    float diagMaior;
    public boolean hasDiag = false;

    public Losango(float lado1, float lado2, float lado3, float lado4, float diagMenor, float diagMaior){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.diagMenor = diagMenor;
        this.diagMaior = diagMaior;
        hasDiag = true;
    }

    public float getDiagMenor(){
        return diagMenor;
    }

    public float getDiagMaior(){
        return diagMaior;
    }

    public float calcularArea(){
        return (diagMaior*diagMenor)/2;
    }

}
