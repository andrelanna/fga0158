
public class Calculadora {
	Operando o1, o2; 
	public static final float PI = 3.14f;
	
	public Calculadora() {
		System.out.println("--> Construtor padrão Calculadora");
		o1 = new Operando();
		o2 = new Operando();
	}
	
	public Calculadora(Operando o1, Operando o2) {
		this.o1 = o1; 
		this.o2 = o2;
	}
	
	public float soma() {
		return o1.getOperando() + o2.getOperando();
	}
	
	public float subtracao() {
		return o1.getOperando() - o2.getOperando();
	}
	
	 
}
