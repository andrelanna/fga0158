
class Quadrado {
	
	float area, 
	      perimetro;
	
	Medida lado;
	

	public Quadrado(float i) {
		lado = new Medida(i);
	}

	float calcularArea() {
		//area = lado * lado; 
		area = lado.valor * lado.valor;
		return area; 
	}
	
	float calcularPerimetro() {
		//perimetro = 4*lado;
		perimetro = 4 * lado.valor;
		return perimetro;
	}
}
