

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
	public static void main(String[] args) throws IOException {
		/*
		 *     De modo análogo à escrita em arquivos, a leitura de arquivos utilizará 
		 * dois objetos: um objeto FileReader e um objeto BufferedReader.
		 *     FileReader é a classe cujo objeto vai efetivamente abrir e ler os dados
		 * do arquivo "numeros.txt". O objeto abre o arquivo com permissão de leitura.
		 *     BufferedReader é a classe cujo objeto vai implementar um buffer de lei-
		 * tura dos dados vindos do arquivo. A aplicação vai ler os dados do Buffer e 
		 * à medida que esses dados são lidos, novos dados vindos do arquivo popularão
		 * o Buffer.  
		 */
		FileReader fr = new FileReader("numeros.txt");  // instanciação do objeto FileReader
		BufferedReader br = new BufferedReader(fr);     // instanciação do objeto BufferedReader

		String linha;
		linha = br.readLine();  
		
		do {
			linha = br.readLine();                //método que lê uma linha inteira do buffer
			if (linha != null) {
				int i = Integer.parseInt(linha);
				System.out.println(i);
			}
		} while (linha != null);
		
	}
}
