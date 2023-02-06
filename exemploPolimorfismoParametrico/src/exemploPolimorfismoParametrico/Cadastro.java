package exemploPolimorfismoParametrico;

public class Cadastro {
	
	private Aluno[] alunos;
	
	public Cadastro() {
		alunos = new Aluno[0];
	}
	
	public boolean cadastrarAluno(Aluno a) {
		//Criar um vetor de alunos com uma posicao a mais
		Aluno[] temp = new Aluno[alunos.length + 1];
		
		//Copiar todas as referencias atuais para o novo vetor
		for (int i=0; i<alunos.length; i++) {
			temp[i] = alunos[i];
		}
		
		//na posicao adicional de temp, adiciono o novo aluno
		temp[alunos.length] = a;
		
		//atualizar alunos
		alunos = temp; 
		
		return true;
	}
	
	
	public Aluno pesquisarAluno(int matricula) {
		Aluno resposta = null; 
		
		for (int i=0; i<alunos.length; i++) {
			if (alunos[i].getMatricula() == matricula) { //achei o aluno!
				resposta = alunos[i];
				break;
			}
		}
		return resposta; 
	}
}










