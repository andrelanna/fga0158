package exceptions;

import app.Aluno;

public class AlunoCadastradoException extends Exception{

	public AlunoCadastradoException(Aluno a) {
		super("Aluno já cadastrado: " + a.getNome()); 
	}

}
