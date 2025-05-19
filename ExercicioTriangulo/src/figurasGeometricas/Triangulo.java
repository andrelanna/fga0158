package figurasGeometricas;


public class Triangulo {
	/*
	 * Atributos de Triangulo
	 */
	float a;  //cateto1 
	float b;  //cateto2
	float c;  //hipotenusa
	float area, perimetro;
	
	/*
	 * Metodo construtor alternativo
	 */
	public Triangulo(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	public float calcularArea() {
		area = a * b / 2;
		return area;
	}
	
	public float calcularPerimetro() {
		perimetro = a + b + c;
		return perimetro;
	}
	
	public boolean ehTriangulo() {
		boolean resposta = (Math.abs(b-c) <= a && a <= b+c) && 
				           (Math.abs(a-c) <= b && b <= a+c) && 
				           (Math.abs(a-b) <= c && c <= a+b);
		return resposta; 
	}


	public void imprimir() {
		String resposta = "";
		if (ehTriangulo()) {
			resposta += "A: " + a + "\n";
			resposta += "B: " + b + "\n";
			resposta += "C: " + c + "\n";
			resposta += "Area: " + calcularArea() + "\n";
			resposta += "Perimetro: " + calcularPerimetro() + "\n";
		} else {
			resposta += "Não é um triangulo";
		}
		System.out.println(resposta);
	}
	

}
