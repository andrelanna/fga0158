package v1;

public class Retangulo {
	//atributos de Retangulo
	Medida base, 
	       altura, 
	       perimetro,
	       area; 
	
	Retangulo(Medida base, Medida altura) {
		this.base = base; 
		this.altura = altura; 
	}
	
	Retangulo(int base, int altura, String unidade) {
		this.base = new Medida(base, unidade);
		this.altura = new Medida(altura, unidade);
	}
	
	Medida calcularPerimetro() {
		int valor = 2 * base.valor + 2 * altura.valor;
		String un = base.unidade;
		
		perimetro = new Medida(valor, un);
		return perimetro;
	}
	
	Medida calcularArea() {
		int valor = base.valor * altura.valor; 
		String un = base.unidade + "2";
		
		area = new Medida(valor, un);
		return area; 
	}
	
	String imprimir() {
		String resposta = ""; 
		resposta += "Retangulo: " + this + "\n";
		resposta += "Base: " + base.imprimir() + "\n";
		resposta += "Altura: " + altura.imprimir() + "\n";
		resposta += "Perimetro: " + perimetro.imprimir() + "\n";
		resposta += "Area: " + area.imprimir() + "\n";
		return resposta; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
