package exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		//Definicao das referencias
		Calculadora c1, 
		            c2; //não são objetos, ainda
		
		c1 = new Calculadora(2, 3);  //objeto!
		c1.somar();
		
		c2 = new Calculadora();  //objeto!
		//c2.op1 = 2;  //Não quero acessar diretamente!
		c2.setOp1(2);
		c2.setOp2(-2);
		c2.somar();

		//C1
		System.out.println("O resultado de " + 
		           c1.getOp1() + " + " + c1.getOp2() + 
		           " e igual a " + c1.getResultado());
		System.out.println("O resultado de " + 
		           c1.getOp1() + " - " + c1.getOp2() + 
		           " e igual a " + c1.subtracao());
		
		//C2
		System.out.println("O resultado de " + 
				c2.getOp1() + " + " + c2.getOp2() + 
				" e igual a " + c2.getResultado());
	}

}
