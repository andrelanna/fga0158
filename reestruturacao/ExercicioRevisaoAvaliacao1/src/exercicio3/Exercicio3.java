package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		//----- Constantes para utilizar no codigo
		final int ARITMETICA = 0;
		final int GEOMETRICA = 1;
		
		//----- Variaveis a serem lidas/calculadas para o programa
		int a0, n, r;
		int tipoProgressao; 
		String[] progressoes = new String[] {"Aritmetica", "Geometrica"};
		
		int progressao[];
		
		//----- Algoritmo
		String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo da progressao:");
		String strN = JOptionPane.showInputDialog("Informe o numero de termos da progressao:");
		String strR = JOptionPane.showInputDialog("Informe a razao da progressao");
		
		a0 = Integer.parseInt(strA0);  //type casting String --> inteiro
		n = Integer.parseInt(strN);    //type casting String --> inteiro
		r = Integer.parseInt(strR);    //type casting String --> inteiro
		
		tipoProgressao = JOptionPane.showOptionDialog(null, 
				               "Qual é o tipo da progressão?", 
				               "FGA0158 - Orientação a Objetos",
				               JOptionPane.DEFAULT_OPTION, 
				               JOptionPane.QUESTION_MESSAGE, 
				               null, 
				               progressoes, 
				               null);
		
		//1o. passo: criar o vetor da progressao
		progressao = new int[n];
		progressao[0] = a0;
		
		//2o. passo: calcular as progressoes
		if (tipoProgressao == ARITMETICA) {
			for (int i=1; i<n; i++) {
				progressao[i] = progressao[i-1] + r;
			}
		} else if (tipoProgressao == GEOMETRICA) {
			for (int i=1; i<n; i++) {
				progressao[i] = progressao[i-1] * r;
			}
		}
		
		//3o. passo: imprimir a progressao
		imprimirProgressao(progressao);
		
		//4o. passo: 
		
		//5o. passo: 
	}
	
	
	

	private static void imprimirProgressao(int[] progressao) {
		String resposta = "[ ";
		for (int a: progressao) {
			resposta += a + " ";
		}
		resposta += "]";
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
