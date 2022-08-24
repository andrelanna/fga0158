package exemplo4;

import java.util.Random;

public class Citacao implements Runnable{
	String linhas[] = {"Nada de desgosto,", 
			"Nem de desânimo;",
			"Se acabas de fracassar,",
			"recomeça.",
			"(Marco Aurélio)"
	};
	
	private int tempo;
	
	public Citacao() {
		tempo = new Random().nextInt(3000);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
