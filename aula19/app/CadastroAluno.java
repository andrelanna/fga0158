package app;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.AlunoCadastradoException;
import exceptions.CampoEmBrancoException;

public class CadastroAluno {
	
	private List<Aluno> alunos;
	
	public CadastroAluno() {
		alunos = new LinkedList<Aluno>();
	}
	
	public boolean addAluno() throws AlunoCadastradoException {
		String strName = JOptionPane.showInputDialog("Informe nome do aluno");
		String strMat = JOptionPane.showInputDialog("Informe matricula do aluno");
		
		int matricula = (strMat.equalsIgnoreCase("") ? -1 : Integer.parseInt(strMat));
		
		Aluno a = findAluno(strName);
		if (a != null) {
			throw new AlunoCadastradoException(a);
		}
		
		try {
			a = Aluno.criarAluno(strName, matricula);
		} catch (CampoEmBrancoException e) {
			e.printStackTrace();
		}
		
		boolean resposta = alunos.add(a);
		return resposta;
	}
	
	public Aluno findAluno(String nome) {
		Aluno resposta = null; 
		for (Aluno a: alunos) {
			if (a.getNome().equalsIgnoreCase(nome)) {
				resposta = a;
				break;
			}
		}
		return resposta; 
	}
	
	public Aluno findAluno(int matricula) {
		Aluno resposta = null;
		for (Aluno a : alunos) {
			if (a.getMatricula() == matricula) {
				resposta = a; 
				break; 
			}
		}
		return resposta;
	}
	
	
	
	
	
	
}
