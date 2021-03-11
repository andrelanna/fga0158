package exercicioFixacao.correcaoExercicio4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	
	static ProgressaoAritmetica[] progressoes;
	static int posicaoLivre;
	
	public static void main(String[] args) {
		
		//1o.) criar o vetor de referencias de progressoes
		progressoes = new ProgressaoAritmetica[10];
		posicaoLivre = 0;
		
		
		//2o.) apresentar menu ao usuario
		int opcaoEscolhida = 0;
		do {
			Scanner sc = new Scanner(System.in);
			
			String menu = "Menu de opcoes \n"
					    + "============== \n\n"
					    + "1 - Cadastrar PA \n"
					    + "2 - Imprimir PAs existentes \n"
					    + "0 - Sair";
			System.out.println(menu);
			opcaoEscolhida = sc.nextInt();
			
			
			switch (opcaoEscolhida) {
			case 1: {
				cadastrarPA();
				break;
			}
			case 2: {
				imprimirPAs();
				break;
			}
			default:
			}
		} while (opcaoEscolhida != 0);
	}

	private static void imprimirPAs() {
		for (int i=0; i < progressoes.length; i++) {
			if (progressoes[i] != null) {
				String resposta = "PA[ " + i + " ]\n";
				resposta += "A0: " + progressoes[i].a0 + '\n';
				resposta += "N: " + progressoes[i].n + '\n'; 
				resposta += "R: " + progressoes[i].r + '\n';
				System.out.println(resposta);
				System.out.println("---------------");
			}
		}
	}

	static void cadastrarPA() {
		String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo (a0) da PA: ");
		String strN = JOptionPane.showInputDialog("Informe o numero de termos (n) da PA: ");
		String strR = JOptionPane.showInputDialog("Informe a razao (r) da PA: "); 
		
		//conversao de tipos
		int a0 = Integer.parseInt(strA0);
		int n = Integer.parseInt(strN);
		int r = Integer.parseInt(strR);
		
		//instanciar um objeto do tipo ProgressaoAritmetica
		ProgressaoAritmetica pa = new ProgressaoAritmetica(a0, n, r);
		
		progressoes[posicaoLivre] = pa;
		posicaoLivre++;
	}
}
