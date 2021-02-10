package exemplo2_instrucoesDeControle;

import java.util.Scanner;

public class ExemploExpressoes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Informe x");
		int x = sc.nextInt();
		
		int resto = x % 3;
		
		switch (resto) {
		case 0:
			System.out.println("x é multiplo de tres");
			break;

		default:
			System.out.println("x não é multiplo de tres!");
			break;
		}
	}
}
