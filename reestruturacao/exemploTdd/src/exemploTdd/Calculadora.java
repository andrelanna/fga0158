package exemploTdd;

public class Calculadora {

	private int op1;
	private int op2;
	private int soma;
	private int quociente;

	public void setOp1(int op1) {
		this.op1 = op1; 
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public int soma() {
		this.soma = op1 + op2; 
		return soma;
	}

	public int divisao() {
		this.quociente = op1/op2;
		return quociente;
	}

}
