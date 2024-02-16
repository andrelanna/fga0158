package usandoPolimorfismoParametrico;

import javax.swing.JOptionPane;

import exemploPolimorfismoParametrico.Aluno;

public class PrincipalParametrico {

	public static void main(String[] args) {
		CadastroParametrico c = new CadastroParametrico();
		
		for (int i=0; i<3; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
			String strMat = JOptionPane.showInputDialog("Informe matricula");
			int mat = Integer.parseInt(strMat);
			
			Aluno a = new Aluno(nome, mat);
			c.cadastrarAluno(a);
		}

		
		for (int i=0; i<2; i++) {
			String strMat = JOptionPane.showInputDialog("Qual matricula vc quer pesquisar?");
			int mat = Integer.parseInt(strMat);
			
			Aluno a = c.pesquisarAluno(mat);
			if (a == null) {
				JOptionPane.showMessageDialog(null, "Aluno nao encontrado!");
			} else {
				System.out.println(a.getMatricula() + " - " + a.getNome());
			}
		}
		
		String strMat = JOptionPane.showInputDialog("Qual matricula vc quer apagar?");
		int mat = Integer.parseInt(strMat);
		Aluno a = c.pesquisarAluno(mat);
		
		boolean resposta = (c.removerAluno(a) ? true : false); 
		if (resposta)
			System.out.println("aluno apagado");
		else 
			System.out.println("aluno nao encontrado");
	}
}
