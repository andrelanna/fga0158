package figurasGeometricas;

public class Quadrado {

	private float altura;
    private float base;

	public Quadrado(float lado_1, float lado_2) {
		
        // Definindo a base como sendo o lado de maior tamanho
        if (lado_1 > lado_2) {
            this base = lado_1;
            this.altura = lado_2;
        } else {
            this base = lado_1;
            this.altura = lado_2;
        }
	}

	// Dupla que fez o trabalho:
	// Gian Medeiros Rosa - 19/0055006
	// Raphaela Guimarães de Araújo dos Santos - 190116072


	public float calcularPerimetro() {
		return  base * 2 + altura * 2);  
	}
	
	public float calcularArea() {
		return base * altura; 
	}

	public float getBase() {
		return base;
	}

    public float getAltura() {
		return altura;
	}
}
