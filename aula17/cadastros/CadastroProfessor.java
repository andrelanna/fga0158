package cadastros;

import modelos.Professor;

public class CadastroProfessor {

	private Professor[] professores;
	
	public CadastroProfessor() {
		professores = new Professor[0];
	}
	
	
	public boolean addProfessor(Professor p) {
		Professor[] temp = new Professor[professores.length + 1]; 
		
		for (int i=0; i<professores.length; i++) {
			temp[i] = professores[i];
		}
		
		int index = professores.length;
		temp[index] = p; 
		
		professores = temp; 
		
		if (professores[index] == p) 
			return true; 
		else 
			return false; 
	}
	
	public Professor buscarProfessor (String nome) {
		Professor resposta = null; 
		
		for (Professor p: professores) {
			if (p.getNome().equalsIgnoreCase(nome))
				resposta = p; 
		}
		
		return resposta; 
	}
	
	public Professor buscarProfessor (int matricula) {
		Professor resposta = null; 
		
		for (Professor p: professores) {
			if (p.getMatriculaFub() == matricula) 
				resposta = p;
		}
		
		return resposta; 
	}
	
	public boolean delProfessor (Professor p) {
		boolean apaguei = false; 
		
		int posicaoApagar = -1;
		for (int i=0; i<professores.length; i++) {
			if (professores[i] == p) { 
				posicaoApagar = i; 
			}
		}
		
		if (posicaoApagar == -1) {
			apaguei = false; 
			return apaguei;
		}
		
		Professor[] temp = new Professor[professores.length - 1];
		//copiar todos os elementos antes do elemento a ser apagado
		for (int i=0; i<posicaoApagar; i++) {
			temp[i] = professores[i];
		}
		//copiar os elementos posteriores ao elemento a apagar
		for (int i=posicaoApagar+1; i<professores.length; i++) {
			temp[i-1] = professores[i];
		}
		
		professores = temp; 
		apaguei = true;
		return apaguei; 
	}
}











