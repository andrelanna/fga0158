package polimorfismoParametrico;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import modelos.Professor;

public class CadastroProfessor {
	
	private List<Professor> professores;
	
	public CadastroProfessor() {
		professores = new LinkedList<Professor>();
	}
	
	public boolean addProfessor(Professor p) {
		return professores.add(p);
	}
	
	public Professor buscarProfessor(String nome) {
		Iterator<Professor> it = professores.iterator();
		while (it.hasNext()) {
			Professor p = it.next();
			if (p.getNome().equalsIgnoreCase(nome)) 
				return p; 
		}
		return null;
	}
	
	public boolean delProfessor (Professor p ) {
		return professores.remove(p);
	}
}
