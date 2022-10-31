package exemplo1;

/**
 * Uma classe que implementa a interface Runnable pode ser 
 * executada como uma Thread. Para isso, a classe deve implementar
 * o método run, presente na interface Runnable 
 * @author andre
 *
 */
public class HelloWorldRunnable implements Runnable{

	int i; 
	
	public HelloWorldRunnable(int i) {
		this.i = i;
	}
	
	
	/**
	 * Método definido na interface Runnable e SOBRESCRITO na classe
	 * HelloWorldRunnable
	 */
	public void run() {
		System.out.println("Hello world, vindo da thread de # " + i);
	}
}
