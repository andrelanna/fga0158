package fga0158;

import javax.swing.JOptionPane;

public class ExemploTamanhoVetor {

	public static void main(String[] args) {
		//Pegar o tamanho do vetor "de largada".
		int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		int vetor[] = new int[tamanhoVetor];

		// vetor.length retorna o tamanho do vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
