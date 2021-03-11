package exercicioFixacao.correcaoExercicio4_procedural;

import javax.swing.JOptionPane;

/**
 * Exercicio 4 - Construir 3 versoes de um programa que dados a0, n e r de uma 
 * progressao aritmetica (PA), calcula os termos da PA e os imprime.
 * 
 * @author andrelanna
 */

public class Exercicio4 {

	/**
	 * Declaracao de atributos.
	 */

	static int a0;  //referencia para um vetor de inteiros
	static int n;
	static int r;
	static int pa[];
	static int soma; 
	
	public static void main(String[] args) {
		
		//1o passo: ler os da PA.
		//Leitura usando componentes graficos. 
		
		String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo (a0) da PA: ");
		a0 = Integer.parseInt(strA0);
		
		String strN = JOptionPane.showInputDialog("Informe o numero de elementos (n) da PA:");
		n = Integer.parseInt(strN);
		
		String strR = JOptionPane.showInputDialog("Informe a razao (r) da PA: ");
		r = Integer.parseInt(strR);

		
		//2o passo: preparar o vetor que vai receber os termos da PA. 
		pa = new int[n]; //criando um vetor de inteiros de n posicoes.
		
		
		//3o passo: calcular os termos da PA e inserir no vetor de PA
		int i = 1;  //variavel de controle da estrutura de repeticao
		while (i <= n) {
			int termo = a0 + (i-1) * r; 
			pa[i-1] = termo; 
			i++; 
		}
		
		//4o passo: imprimir a PA
		String resposta = "[ ";
		i = 0;
		while (i < n)  {
			resposta += pa[i] + ", ";
			i++;
		}
		resposta += "]";
		JOptionPane.showMessageDialog(null, resposta);
		
		
		//5o passo: somar os termos da PA, elemento por elemento
		soma = somaTermos();
		String resposta2 = "A soma dos termos da PA é " + soma + ".";
		JOptionPane.showMessageDialog(null, resposta2);
		
	}

	static int somaTermos() {
		int resposta = 0;
		for (int i=0; i < pa.length; i++) {
			resposta += pa[i];
		}
		return resposta;
	}

}
