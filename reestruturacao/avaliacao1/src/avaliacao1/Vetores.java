package avaliacao1;

public class Vetores {
	public static void main(String[] args) {
		int a[], 
		    b[];
		
		a = new int[10];
		b = new int[10];
		a[0] = 1; 
		a[1] = 1;
		
		for (int i=2; i<10; i++) {
			a[i] = a[i-1] + a[i-2];
		}
		
		for (int i=0; i<10; i++) {
			if (a[i] % 2 != 0) {
				b[i] = 2 * a[i];
			} else {
				b[i] = a[i] * a[i];
			}
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(b[i]);
		}
	}
}
