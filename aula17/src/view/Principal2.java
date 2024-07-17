package view;

import app.Aluno;
import app.Professor;
import cadastros.Cadastro;

public class Principal2 {
	
	static Cadastro<Aluno> cadAlunos;
	static Cadastro<Professor> cadProf;
	static Cadastro<Integer> cadInt;
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Andre", "1313","andre@aluno.unb.br","13","Eng Software");
		Aluno a2 = new Aluno("Lanna", "1414","lanna@aluno.unb.br","14","Eng Eletr");
		Aluno a3 = new Aluno("Miguel", "1515","lanna@aluno.unb.br","15","Eng Energ");
		cadAlunos = new Cadastro<Aluno>();
		cadAlunos.cadastrar(a1);
		cadAlunos.cadastrar(a2);
		cadAlunos.cadastrar(a3);
		cadAlunos.remover(a1);
		System.out.println(cadAlunos.imprimir());
		
		Aluno a4 = cadAlunos.getPrimeiro();
		System.out.println(a4);
		
//		Professor p1 = new Professor("Andre Lanna", "131313", "andrelanna@unb.br", "Comput", "123123");
//		Professor p2 = new Professor("Cristiane", "141414", "Csramos@unb.br", "Comput", "321321");
//		cadProf = new Cadastro<Professor>();
//		cadProf.cadastrar(p1);
//		cadProf.cadastrar(p2);
//		System.out.println(cadProf.imprimir());
//		
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		cadInt = new Cadastro<Integer>();
//		cadInt.cadastrar(i1);
//		cadInt.cadastrar(i2);
//		cadInt.cadastrar(i3);
//		System.out.println(cadInt.imprimir());
	}
}







