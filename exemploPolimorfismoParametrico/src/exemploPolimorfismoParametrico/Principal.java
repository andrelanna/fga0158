package exemploPolimorfismoParametrico;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Cadastro c = new Cadastro();
		
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

	}

}
