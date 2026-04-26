package fga0158;

public class Calculadora {

	//Atributos de Calculadora
	int operando1, 
	    operando2, 
	    resposta; 
	
	
	//Construtores de Calculadora
	//Construtor padrão
	public Calculadora() {
		System.out.println("Executando construtor padrao.");
	}
	
	//Construtor alternativo recebe um parametro
	public Calculadora(int operando1) {
		this();
		System.out.println("Executando construtor alternativo 1 parametro.");
		System.out.println("Atribuindo " + operando1 + " a operando1");
		this.operando1 = operando1;
	}
	
	//Construtor alternativo recebe dois parametros
	public Calculadora (int operando1, int operando2) {
		this(operando1);
		System.out.println("Executando construtor alternativo 2 parametros");
		System.out.println("Atribuindo " + operando2 + " a operando2");
		this.operando2 = operando2;
	}
	
	
	//Metodo soma
	int calcularSoma() {
		resposta = operando1 + operando2; 
		return resposta;
	}
	
	
	//Metodo "destrutor" de JAVA
	protected void finalize() throws Throwable {
		System.out.println("****************\n" +
						   "O objeto " + this + " de estado \n" + 
	                       "operando1: " + operando1 + "\n" + 
				           "operando2: " + operando2 + "\n" + 
	                       "resultado: " + resposta + "\n" + 
				           "vai ser destruído agora \n" + 
				           "****************\n\n"); 
	}
}























