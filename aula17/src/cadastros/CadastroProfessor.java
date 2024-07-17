package cadastros;

import app.Professor;
import util.Cadastro;

public class CadastroProfessor {
		private Cadastro<Professor> professores;
		
		public int cadastrarProfesor(Professor p) {
			int x = professores.cadastrar(p);
			return x;
		}
}
