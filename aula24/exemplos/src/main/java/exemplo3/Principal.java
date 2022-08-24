package exemplo3;

public class Principal {

	/**
	 * A thread relativa à execuçao do método main, da classe Principal
	 * sofrerá interrupções de 1300 milisegundos, por 5 vezes. 
	 * O método Thread.sleep pode 
	 * @param args
	 */
	public static void main(String[] args) {
		Citacao c = new Citacao();
		
		for (int i=0; i<5; i++) {
			String linha = c.getLinha(i);
			System.out.println(linha);
			try {
				Thread.sleep(1300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
