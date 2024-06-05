import java.util.Random;

public class Aleatorizador {
	
	public static void main(String[] args) {
		/*
		 * Random é a classe em Java que gera valores aleatórios. 
		 * r é a referencia para um objeto instanciado a partir da classe Random
		 */
		Random r = new Random();
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(0, 100);  //r.nextInt(minimo, maximo) retorna um numero aleatorio 
										// dentro do intervalo [minimo, maximo)
			numeros[i] = n;
		}
		
		String resposta = "[ ";
		for (int i = 0; i < numeros.length; i++) {
			resposta += numeros[i] + ", ";
		}
		resposta += "]";
		
		System.out.println(resposta);
	}
}
