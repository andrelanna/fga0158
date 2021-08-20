package ui;

import javax.swing.JOptionPane;

import app.Aluno;
import app.Turma;

public class SGA {

	
	public static void main(String[] args) {
		//instanciar os objetos! 
		Aluno andre, 
		      cinthia, 
		      miguel, 
		      marcus, 
		      jr, 
		      carlos;
	
		Turma oo, 
		      tppe, 
		      vvts;

		
		//instanciei alguns alunos!
		andre = new Aluno("Andre Lanna", "13/131313", "andre@gmail.com");
		cinthia = new Aluno("Cinthia", "20/202020", "cinthia@gmail.com");
		miguel = new Aluno("Miguel", "19/191919", "miguel@gmail.com");
		//o resto é com vocês!!! 
		
		//instanciei algumas turmas!
		oo = new Turma("OO", "FGA0158", 4, 40);
		vvts = new Turma("VVTS", "CIC0251", 4, 20);
		// TPPE é com vocês! 
		
		//Matricular alunos em turmas!
		JOptionPane.showMessageDialog(null, "Vou matricular o aluno " + 
							andre.getNome() + 
							" na turma " + 
							oo.getDisciplina());
		boolean resposta = oo.matricularAluno(andre);
		if (resposta) 
			JOptionPane.showMessageDialog(null, andre.getNome() + " matriculado! ");
		
		JOptionPane.showMessageDialog(null, "Vou matricular o aluno " + 
				cinthia.getNome() + 
				" na turma " + 
				oo.getDisciplina());
		resposta = oo.matricularAluno(cinthia);
		if (resposta) 
		JOptionPane.showMessageDialog(null, cinthia.getNome() + " matriculada! ");
		

		JOptionPane.showMessageDialog(null, "Vou matricular o aluno " + 
				miguel.getNome() + 
				" na turma " + 
				oo.getDisciplina());
		resposta = oo.matricularAluno(miguel);
		if (resposta) 
		JOptionPane.showMessageDialog(null, miguel.getNome() + " matriculado! ");

		
		//------------------------------------------------------------------------------------
		
		//Imprimir o relatorio da turma de OO
		String relatorio = ""; 
		relatorio += "Disciplina: " + oo.getDisciplina() + "\n";
		relatorio += "Codigo: " + oo.getCodigo() + "\n";
		relatorio += "Vagas Ocupadas: " + oo.getVagasOcupadas() + "\n";
		
		Aluno[] alunosOO = oo.getAlunos() ; 
		for (Aluno a : alunosOO) {  //percorrer todos os alunos de OO
			if (a != null) {
				relatorio += "Aluno: " + a.getMatricula() + 
						" - " + a.getNome() + 
						": " + a.getContato() + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
	}

}



















