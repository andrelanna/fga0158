package exemploPolimorfismoParametrico;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Cadastro c = new Cadastro<Aluno>();
		Aluno a1 = new Aluno("Andre", 13); 
		Aluno a2 = new Aluno("Maria", 14);
		Aluno a3 = new Aluno("Joao", 15);
		
		c.adicionar(a1);
		c.adicionar(a2);
		c.adicionar(a3);
		
		JOptionPane.showMessageDialog(null, c.imprimirCadastro());
		
		c = new Cadastro<Mesa>();
		Mesa m1 = new Mesa(50, 50, 80, "Branca");
		Mesa m2 = new Mesa(70, 80, 80, "Preta");
		
		c.adicionar(m1);
		c.adicionar(m2);
		
		JOptionPane.showMessageDialog(null, c.imprimirCadastro());
	}
}




