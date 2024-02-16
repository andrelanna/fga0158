
public class Calculadora {
	
	private int op1;
	private int op2;

	Calculadora (int op1, int op2) {
		this.op1 = op1; 
		this.op2 = op2;
	}
	
	
	int operacao(String op) throws OperacaoInvalidaException {
		int resultado = 0; 
		
		if (op.equalsIgnoreCase("divisao")) {
				resultado = Divisao.divisao(op1, op2); 
		} else {
			throw new OperacaoInvalidaException();
		}
		
		return resultado;
	}

//	private int divisao() {
//		int resposta; 
////		try {
//			resposta = op1 / op2; 
////		} catch (ArithmeticException e) {
////			if (op1 > 0) 
////				resposta = Integer.MAX_VALUE;
////			else 
////				resposta = Integer.MIN_VALUE;
////		}
		
//		return resposta;
//	}
}







