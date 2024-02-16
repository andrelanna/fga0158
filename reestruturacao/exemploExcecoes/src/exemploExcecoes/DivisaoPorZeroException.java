package exemploExcecoes;

public class DivisaoPorZeroException extends ArithmeticException{
	
	private int num;
	private int den;

	public DivisaoPorZeroException(int n, int d) {
		super("Divisao por Zero!");
		this.num = n; 
		this.den = d;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

}
