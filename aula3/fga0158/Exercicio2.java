package fga0158;

import javax.swing.JOptionPane;

/**
 * "Pontapé" para o exercicio 2. 
 * IMPORTANTE: 
 *   - O esboço em estágio muito inicial está apresentado a seguir. Cabe a cada 
 *     aluno terminar o desenvolvimento do exercicio
 *   - Atente-se para o uso constante de funções e procedimentos nesse esboco. 
 *     Continue desenvolvendo, sempre que possível, através de funções. 
 * @author andre
 *
 */
public class Exercicio2 {

	/**
	 * Metodo MAIN: ponto de inicio da execucao do algoritmo.	
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Declaracao de variaveis
		 */
		int qtdeValores;
		int[] numeros;
		float media; 
		// ... demais variaveis
		
		
		/*
		 * Inicio da execucao do algoritmo
		 */
		qtdeValores = lerInteiro("Informe o numero de valores a serem lidos");
		
		//instanciacao do vetor
		numeros = preencherVetor(qtdeValores);
		
		//calculo da media
		media = calcularMedia(numeros);
		
		
	}

	/**
	 * Funcao para calcular a media dos valores do vetor
	 * @param numeros vetor de numeros inteiros, para o qual será calculada a media
	 * @return media dos valores do vetor
	 */
	private static float calcularMedia(int[] numeros) {

		//retorno da media
		return 0;
	}

	/**
	 * Metodo que instancia e preenche o vetor com os valores inteiros.
	 * @param n numero de valores a serem lidos do teclado
	 * @return vetor preenchido com n valores
	 */
	private static int[] preencherVetor(int n) {
		// instanciacao do vetor com n posicoes
		
		// leitura dos n valores a partir do teclado
		// Aqui você pode reaproveitar uma função já disponível nesse esboco?  
		
		// retorno do vetor para a funcao principal
		return null;
	}

	/**
	 * Funcao que le um valor do teclado e retorna-o como um inteiro
	 * @param mensagem Mensagem a ser apresentada ao usuário quando a funcao for chamada
	 * @return valor inteiro lido a partir do teclado
	 */
	private static int lerInteiro(String mensagem) {
		String strNumero = JOptionPane.showInputDialog(mensagem);
		int numero = Integer.parseInt(strNumero);  //<--- down-casting de String para int
		return numero;
	}
}
