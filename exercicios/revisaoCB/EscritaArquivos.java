

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class EscritaArquivos {
	public static void main(String[] args) throws IOException {
		
		String strN = JOptionPane.showInputDialog("Informe o numero de valores a serem gerados aleatoriamente");
		String strMin = JOptionPane.showInputDialog("Informe o valor minimo do intervalo");
		String strMax = JOptionPane.showInputDialog("Informe o valor maximo do intervalo");
		
		int n = Integer.parseInt(strN);
		int min = Integer.parseInt(strMin);
		int max = Integer.parseInt(strMax);
		
		int numeros[] = new int[n];
		
		Random r = new Random();
		
		for (int i=0; i<n; i++) {
			numeros[i] = r.nextInt(min, max);
		}
		
		//Até aqui o algoritmo gera os números aleatórios
		//A partir desse ponto vamos fazer a escrita para arquivo em formato texto 
		//---------------------------------------------------------------------

		/*
		 *    FileWriter é a classe cujo objeto instanciado é que vai efetivamente realizar 
		 * a gravação dos dados no arquivo "numeros.txt"
		 * 	  BufferedWriter é a classe cujo objeto se associará ao objeto instanciado à 
		 * partir de FileWriter, e será responsável por implementar um buffer. Nosso programa
		 * vai escrever no objeto BufferedWriter que, por sua vez, passará os dados para o 
		 * objeto FileWriter persistir em arquivo.  
		 */
		FileWriter fw = new FileWriter("numeros.txt");  //instanciação do objeto FileWriter
		BufferedWriter bw = new BufferedWriter(fw);     //instanciação do objeto BufferedWriter

		for (int num : numeros) {
			bw.write(Integer.toString(num));            //Escrita de uma string no buffer. Note a conversão de tipo! 
			bw.write('\n');
		}
		bw.close();  //Fecha o buffer e, consequentemente, o arquivo. 
	}
}
