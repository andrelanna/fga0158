package figurasGeometricas;

public class Retangulo {
    
    //Atributos
    private float comp;
    private float larg;
    
    public Retangulo(float larg, float comp) {
        this.setLarg(larg);
        this.setComp(comp);
    }

    public float calcularPerimetro(){
        return 2*larg+2*comp;
    }

    public float calcularArea(){
        return larg*comp;
    }

    public float getLarg() {
        return larg;
    }

    public void setLarg(float larg) {
        this.larg = larg;
    }

    public float getComp() {
        return comp;
    }

    public void setComp(float comp) {
        this.comp = comp;
    }

    
    
    
}