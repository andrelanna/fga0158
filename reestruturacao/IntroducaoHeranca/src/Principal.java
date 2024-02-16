
public class Principal {

	public static void main(String[] args) {
		Carro v = new Carro();
		
		v.anoMarca = 2019;
		v.anoModelo = 2020;
		v.marca = "VW";
		v.modelo = "Polo";
		
		System.out.println(v);
		System.out.println(v.imprimir());
		System.out.println("-----");
		
		Carro c = new Carro();
		c.anoMarca = 2020;
		c.anoModelo = 2021;
		c.marca = "Nissan";
		c.modelo = "kicks";
		c.numOcupantes = 5;
				
		System.out.println(c);
		System.out.println(c.imprimir());
		System.out.println("-----");
		Motocicleta m = new Motocicleta(true);
		m.anoMarca = 2022; 
		m.anoModelo = 2022;
		m.marca = "Honda";
		m.modelo = "CG";
		m.numCilindradas = 125;
		
		System.out.println(m);
		System.out.println(m.imprimir());
	}
}









