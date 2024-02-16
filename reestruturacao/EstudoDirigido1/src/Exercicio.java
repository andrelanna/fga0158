import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {
		//Declaracao de variaveis
		int n,   //numero de termos
		    r,   //razao
		    a0;  //primeiro termo
		
		int numPares = 0,
			numImpares = 0;
		
		int[] pa;
		
		//ler as variaveis
		a0 = lerInteiro("a0");
		r = lerInteiro("r");
		n = lerInteiro("n");
		
		//Calcular a PA
		pa = calculaPA(a0, n, r); 
		imprimirPA(pa);
		
		numPares = contarPares(pa);
		numImpares = contarImpares(pa);
		
		System.out.println("O numero de elementos pares é " + numPares + 
				           " e o numero de elementos impares é " + numImpares);
		
	}

	
	
	private static int lerInteiro(String v) {
		String str = JOptionPane.showInputDialog("Informe o valor de " + v);
		int i = Integer.parseInt(str);
		return i;
	}



	private static int contarImpares(int[] pa) {
		int n = 0;
		for (int i : pa) {
			if (i % 2 != 0) 
				n++;
		}
		return n;
	}



	private static int contarPares(int[] pa) {
		int n = 0;
		for (int i=0; i < pa.length; i++) {
			if (pa[i] % 2 == 0) 
				n++;
		}
		return n;
	}



	private static void imprimirPA(int[] temp) {
		//Imprimir a PA.
		String pa = "[ ";
		for (int i=0; i < temp.length; i++) {
			pa += temp[i] + ", ";
		}
		pa += " ]";
		JOptionPane.showMessageDialog(null, pa);
	}



	private static int[] calculaPA(int a0, int n, int r) {
		int temp[] = new int[n];
		for (int i=0; i<n; i++) {
			temp[i] = a0 + i*r;  //calculando cada termo da PA.
		}
		return temp;
	}

}









