package exemplo2;

public class Principal {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			/* Instanciacao do objeto ht, do tipo HelloWorldThread, 
			 * mas a thread ainda não foi disparada
			 */
			HelloWorldThread ht = new HelloWorldThread(i);
			
			/* Disparo da thread
			 */
			ht.start();
		}
	}

}
