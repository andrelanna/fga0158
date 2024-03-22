import javax.swing.JOptionPane;

public class CorrecaoExercicio3 {
	

	/**
	 * Metodo principal do exercicio, por onde o algoritmo comeca a ser 
	 * executado. 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Informar os valores de A, B, e C
		 */
		float a, b, c; 
		a = lerLado('A');
		b = lerLado('B');
		c = lerLado('C');
		
		/**
		 * Verificar se os valores A, B e C formam os lados de um triangulo retangulo
		 */
		boolean ehTriangulo = verificaTriangulo(a, b, c);
		
		/**
		 * Imprimir mensagem para o usuário informando o resultado
		 */
		imprimirResposta(ehTriangulo);
	}

	
	
	/**
	 * Função que le o valor do lado através do teclado e retorna o valor como um float
	 * @param lado nome do lado a ser lido
	 * @return valor lido do teclado como um float
	 */
	static float lerLado (char lado) {
		String strLado = JOptionPane.showInputDialog("Informe o valor do lado " + lado);
		float tamanhoLado = Float.parseFloat(strLado);
		return tamanhoLado;
	}
	
	
	
	/**
	 * Imprimir o resultado da analise dos lados
	 * @param ehTriangulo
	 */
	private static void imprimirResposta(boolean ehTriangulo) {
		String resposta = "Os lados informados " + (ehTriangulo ? "formam " : "não formam ") +
        "um triangulo retangulo.";
		
		JOptionPane.showMessageDialog(null, resposta);
	}


	/**
	 * Metodo que avalia se os lados informados formam um triangulo retangulo
	 * @param a valor do lado 1
	 * @param b valor do lado 2
	 * @param c valor do lado 3
	 * @return true significa que eh triangulo retangulo, false significa nao eh triangulo retangulo
	 */
	static boolean verificaTriangulo(float a, float b, float c) {
		boolean resposta = ( a*a == b*b + c*c || 
				             b*b == a*a + c*c || 
				             c*c == a*a + b*b);
		return resposta;
	}

}
