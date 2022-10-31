package exemplo1;

public class Principal {

	public static void main(String[] args) {
		for (int i=0; i<10; i++ ) {
			/* Instanciacao do objeto HelloWorldRunnable, mas a thread
			 * ainda não foi disparada 
			 */
			HelloWorldRunnable hw = new HelloWorldRunnable(i);
			/* Instanciação da Thread, passando objeto HelloWorldRunnable
			 * como argumento, e em seguida, disparo da Thread via método
			 * start()
			 * 
			 * A sequencia de execução das Threads não é determinada. 
			 */
			new Thread(hw).start();
		}
	}

}
