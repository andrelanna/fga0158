package figurasGeometricas;

public class Retangulo {

	public float altura;
    private float base;
    

    public Retangulo(float BaseRetangulo, float AlturaRetangulo) {
		this.base = BaseRetangulo;
        this.altura =AlturaRetangulo;
    }
    
	public float calcularPerimetro() {
		return 2*(base+altura) ; 
	}
	
	public float calcularArea() {
		return base * altura; 
	}

	public float getAltura() {
		return altura;
	}
    public float getBase() {
		return base;
	}
}
    

