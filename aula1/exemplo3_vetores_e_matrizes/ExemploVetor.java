package exemplo3_vetores_e_matrizes;

import java.util.Scanner;

public class ExemploVetor {
	public static void main(String[] args) {
//		int v[]; //isso aqui nao é o vetor! 
		
//		v = new int[5];  //aqui é criado o vetor e atribuido a variavel v!
		
		//Ler um conjunto de valores inteiros aleatorios e armazenar em um vetor
//		Scanner sc = new Scanner(System.in);
//		for (int i=0; i<5; i++) {
//			System.out.println("informe um valor inteiro: ");
//			v[i] = sc.nextInt();
//		}
		
		int v[] = {4, 7, 3, 2, 10, 20, 25, 26};
		
		//Imprimir os numeros pares
		System.out.println("numeros pares!");
		for (int i=0; i < v.length; i++) {
			if (v[i] % 2 == 0 )
				System.out.println(v[i]);
		}
		//imprimir os numeros impares
		System.out.println("***********");
		System.out.println("numeros impares!");

		for (int i : v) {  //varrendo todo o v e a cada iteracao atribuo um elemento de v a i.
			if (i % 2 != 0 )
				System.out.println(i);
		}
	}
}
