
public class Divisao {
	
	public static int divisao (int a, int b) throws ArithmeticException{
		if (b == 0) {
			throw new DivisaoPorZeroException();
		}
		return a / b;
	}
}
