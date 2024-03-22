package fga0158;

import javax.swing.JOptionPane;

public class ExemploVetores {

	/**************************************************************************
	 * Método lerInteiros: responsável por ler um valor do teclado via entrada
	 *                     gráfica e retorná-lo como um int
	 *                      
	 * @param posicao Inteiro que informa a posição (ou ordem) em que o inteiro 
	 *                a ser lido ocupará no vetor de inteiros. 
	 * @return Valor inteiro a ser retornado
	 */
	//Função que le um inteiro do teclado e o retorna no ponto em que foi chamado
	private static int lerInteiros(int posicao) {
		String strValor = JOptionPane.showInputDialog("Informe um valor inteiro para v[" + posicao + "]");
		int valor = Integer.parseInt(strValor);
		return valor;
	}


	/**************************************************************************
	 * Método MAIN: método que inicializa a execução do algoritmo. 
	 * 
	 *************************************************************************/
	public static void main(String[] args) {
		//Ler um numero X de valores inteiros, armazena em vetor, 
		//e ao final informa quantidade de numeros zeros

		String strTamanho = JOptionPane.showInputDialog("Informe a quantidade de numeros");
		int tamanho = Integer.parseInt(strTamanho);

		//declarar e criar o vetor
		int vetor[];  //declaracao do vetor
		vetor = new int[tamanho];  //criacao do vetor

		//ler os valores do vetor
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = lerInteiros(i);
		}

		//contar o numero de O's dentro do vetor
		int qtdeZeros = 0;
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				qtdeZeros++;
			}
		}

		JOptionPane.showMessageDialog(null, "Quantidade de zeros no vetor = " + qtdeZeros);
	}

}
