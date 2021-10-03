package figurasGeometricasIrregulares;

public class FigGeometricaIrregular {
    
    float lado1;
    float lado2;
    float lado3;
    float lado4;

    public float getLado1(){
        return lado1;
    }

    public float getLado2(){
        return lado2;
    }

    public float getLado3(){
        return lado3;
    }

    public float getLado4(){
        return lado4;
    }

    public float calcularPerimetro(){
        return lado1+lado2+lado3+lado4;
    }
}
