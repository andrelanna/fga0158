package classes;

import exceptions.Excecao0;
import exceptions.Excecao1;
import exceptions.Excecao2;

public class Base {
	int lado1, lado2;
	private int area; 
	
	public Base(int lado1, int lado2) throws Excecao0 {
		if (lado1 == 0 || lado2 ==0) {
			throw new Excecao0();
		}
		this.lado1 = lado1;
		this.lado2 = lado2; 
	}

	public int calcularArea() {
		try {
			area = lado1*lado2;
			if (area < 0) {
				if (area %2 != 0) {
					throw new Excecao1();
				} else {
					throw new Excecao2();
				}
			}
		} catch (Excecao0 e) {
			area = -area;
		}
		System.out.println("Area = " + area);
		return area; 
	}
}
