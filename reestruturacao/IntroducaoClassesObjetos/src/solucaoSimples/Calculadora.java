package solucaoSimples;

public class Calculadora {

	/**
	 * Atributos da classe Calculadora
	 */
	int op1, op2, 
	    resSoma, resDiferenca, 
	    resMult, resDivisao;
	
	/**
	 * Métodos da classe Calculadora
	 */
	int soma() {
		resSoma = op1 + op2;
		return resSoma;
	}
	
	int subtracao() {
		resDiferenca = op1 - op2;
		return resDiferenca;
	}
	
	int multiplicacao() {
		resMult = op1 * op2; 
		return resMult;
	}
	
	double divisao() {
		resDivisao = op1 / op2;
		return resDivisao;
	}
	
	public Calculadora(int o1, int o2) {
		op1 = o1; 
		op2 = o2;
	}
	
	
	
	
	public static void main(String[] args) {
		Calculadora[] c;
		
		c = new Calculadora[3];
		
		//instanciacao de objetos
		c[0] = new Calculadora(3, 4);
		c[1] = new Calculadora(7, 9);
		c[2] = new Calculadora(6, 3);
		
		
		for (int i=0; i<3; i++) {
			System.out.println("c[" + i + "]: " +
		                        c[i] + " --> " + 
					            c[i].soma());
		}
		
	}

}













