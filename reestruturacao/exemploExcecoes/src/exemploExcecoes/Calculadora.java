package exemploExcecoes;

public class Calculadora {
	
	public static int divisao(int a, int b) throws DivisaoPorZeroException{
		int q = 0;
		
		if (b == 0) { //situacao de excecao
			throw new DivisaoPorZeroException(a, b);
		}
		q = a/b;
		
		return q;
	}
	
	
	public static float raiz (float b, float e) {
		float r = 0; 
		
		if (b < 0 && e ==0.5f) {
			throw new ArithmeticException("Raiz quadrada de negativo");
		}
		
		r = (float) Math.pow(b, e);
		
		return r; 
	}
}
