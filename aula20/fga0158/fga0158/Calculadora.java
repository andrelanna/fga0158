package fga0158;

public class Calculadora {
	private int op1;
	private int op2;
	
	public Calculadora(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public int divisao() throws ArithmeticException{
		int quociente = op1 / op2;
		return quociente;
	}
}
