package ui;

import app.CadastroAluno;
import exceptions.AlunoCadastradoException;

public class Principal {

	private static CadastroAluno c; 
	
	public static void main(String[] args) {
		
		c = new CadastroAluno();
		
		try {
			c.addAluno();
			c.addAluno();
			c.addAluno();
			c.addAluno();
			
		} catch (AlunoCadastradoException e) {
			e.printStackTrace();
		}
		
	}
}
