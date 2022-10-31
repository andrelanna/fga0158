package exercicio1;

public class Calculadora {
	
	//Definicao de atributos
	int op1, 
	    op2, 
	    resultado;
	
	//metodo construtor alternativo
	public Calculadora(int o1, int o2) {
		op1 = o1; 
		op2 = o2;
	}
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	void setOp1(int op) {
		op1 = op;
	}
	
	void setOp2(int op) {
		op2 = op;
	}
	
	int getResultado() {
		return resultado;
	}
	
	int somar() {
		resultado = op1 + op2; 
		return resultado;
	}
	
	int subtracao() {
		resultado = op1 - op2;
		return resultado;
	}
	
	
	int getOp1() {
		return op1;
	}
	
	int getOp2() {
		return op2;
	}
	
	
}










