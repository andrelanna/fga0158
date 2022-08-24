package exemplo2;

public class HelloWorldThread extends Thread{
	
	int i; 
	
	public HelloWorldThread(int i) {
		this.i = i;
	}
	
	/**
	 * Método definido na classe Thread e sobrescrito na
	 * subclasse HelloWorldThread. A anotação @Override 
	 * é opcional.
	 */
	@Override
	public void run() {
		System.out.println("Hello World, thread de # " + i);
	}
}
