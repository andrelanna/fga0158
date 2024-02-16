
public class Principal {

	public static void main(String[] args) {
		
		Aluno[] alunos; 
		alunos = new Aluno[3];

		alunos[0] = new Aluno();
		alunos[1] = new Aluno();
		alunos[2] = new Aluno();
		
		alunos[1] = alunos[2];
		
		alunos[1].matricula = 13; 
		alunos[2].nome = "Andre";

		for (int i=0; i<=2; i++) {
			System.out.println(i + "(" + alunos[i] +"): " + alunos[i].mostrarEstado());
		}
	}

}
