package exemplo;

public class Principal {
	
	//O algoritmo começa por aqui... 
	public static void main(String[] args) {
		//a é a referencia para um objeto aluno.
		Aluno a = null;
		Aluno b = null;
		
		
		//Instanciacao de um objeto
		a = new Aluno();
		a.setNome("Andre Lanna");
		a.setCurso("Engenharia de Software");
		a.setIra(3.5f);
		a.setMatricula(13);
		
		b = new Aluno(14, "Miguel", "Engenharia de Software", 4.2f);
		
		
		//Quais valores? 
		System.out.println(b);
		System.out.println(b.imprimirAluno());
		
		a = b; 
		System.out.println(a);
		System.out.println(a.imprimirAluno());
	}
}
