package fga0158;

import javax.swing.JOptionPane;

public class ExemploString {

	
	/**************************************************************************
	 * Método MAIN: método que inicializa a execução do algoritmo. 
	 * 
	 *************************************************************************/
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Informe a palavra desejada");
		String strChar = JOptionPane.showInputDialog("Informe o caractere a ser contado");
		char caractere = strChar.charAt(0); // semelhante a strChar[0].
		
		int qtdeChars = buscarCaractere(palavra, caractere);
		
		JOptionPane.showMessageDialog(null, "A quantidade de " + caractere + "'s em "
										     + palavra + " e igual a " + qtdeChars);
		
	}

	
	/**************************************************************************
	 * Método buscarCaractere: método que busca um determinado caractere dentro 
	 *                         de uma String, ambos passados como parâmetros para 
	 *                         o método. Ao final retorna o número de ocorrências
	 *                         do caractere dentro da palavra.
	 *                         
	 * @param palavra Palavra dentro da qual o caractere vai ser buscado
	 * @param caractere Caractere a ser pesquisado (e contado) dentro da palavra
	 * @return número (inteiro) de ocorrências do caractere dentro da palavra. 
	 */
	private static int buscarCaractere(String palavra, char caractere) {
		int qtde = 0;
		for (int i=0; i<palavra.length(); i++) {  //vetor.length <--> palavra.length() semelhante! 
			if (palavra.charAt(i) == caractere) { //semelhante a palavra[i]  
				qtde++;
			}
		}
		
		return qtde;
	}

}
