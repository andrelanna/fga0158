package classes;

import exceptions.Excecao0;
import exceptions.Excecao3;
import exceptions.Excecao4;

public class Solido {
	Base base; 
	int altura;
	private int volume;
	
	public Solido(Base base, int altura) {
		this.base = base; 
		this.altura = altura;
	}
	
	public Solido (int lado1, int lado2, int altura) throws Excecao0 {
		base = new Base(lado1, lado2);
		this.altura = altura;
	}
	
	public int calcularVolume() throws Excecao3, Excecao4 {
		volume = base.calcularArea() * altura;
		if (volume < 0) {
			if (volume %2 != 0) {
				throw new Excecao3();
			} else {
				throw new Excecao4();
			}
		}
		return volume; 
	}
	
	public int getVolume() {
		return volume;
	}
}
