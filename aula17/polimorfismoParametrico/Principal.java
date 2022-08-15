package polimorfismoParametrico;

import javax.swing.JOptionPane;

import modelos.Aluno;
import modelos.Professor;

public class Principal {

	static CadastroAluno ca;
	static CadastroProfessor cp;
	
	public static void main(String[] args) {
		ca = new CadastroAluno();
		cp = new CadastroProfessor();
		
		int opcao; 
		do {
			opcao = exibirMenu();
			switch (opcao) {
			case 1:
				cadastrarProfessor();
				break;

			case 2: 
				cadastrarAluno();
				break;
				
			case 3: 
				Professor p = pesquisarProfessor(); 
				JOptionPane.showMessageDialog(null, p.toString());
				break; 
				
			case 4: 
				Professor p1 = pesquisarProfessor(); 
				JOptionPane.showMessageDialog(null, p1.toString());
				break;
				
			default:
				break;
			}
		} while (opcao != 0);
	}

	private static Professor pesquisarProfessor() {
		String mensagem = "Deseja pesquisar por nome ou matricula? \n"
				+ "1 - Nome \n"
				+ "2 - Matricula";
		String strOpcao = JOptionPane.showInputDialog(mensagem);
		int opcao = Integer.parseInt(strOpcao);
		
		Professor resposta = null;
		switch (opcao) {
		case 1:
			String nome = JOptionPane.showInputDialog("Qual o nome?");
			resposta = cp.buscarProfessor(nome);
			break;

		case 2: 
			String strMatFub = JOptionPane.showInputDialog("QUal a matricula fub?");
			int matFub = Integer.parseInt(strMatFub);
//			resposta = cp.buscarProfessor(matFub);
		default:
			break;
		}
		return resposta;
	}

	private static void cadastrarAluno() {
		String nome = JOptionPane.showInputDialog("Nome do aluno"); 
		String strMat = JOptionPane.showInputDialog("Matricula ");
		int mat = Integer.parseInt(strMat);
		
		Aluno a = new Aluno(nome, mat);
		ca.addAluno(a);		
	}

	private static void cadastrarProfessor() {
		String nome = JOptionPane.showInputDialog("Nome do professor"); 
		String strMatFub = JOptionPane.showInputDialog("Matricula FUB");
		int matFub = Integer.parseInt(strMatFub);
		
		Professor p = new Professor(nome, matFub);
		cp.addProfessor(p);
	}

	private static int exibirMenu() {
		String mensagem = "1 - Cadastrar Professor \n"
				+ "2 - Cadastrar Aluno \n"
				+ "3 - Pesquisar Professor por nome \n "
				+ "4 - Pesquisar Professor por mat \n"
				+ "5 - Pesquisar Aluno por nome \n"
				+ "6 - Pesquisar Aluno por mat \n"
				+ "7 - Apagar professor \n"
				+ "8 - Apagar aluno \n"
				+ "0 - sair";
		String strOpcao = JOptionPane.showInputDialog(mensagem);
		return Integer.parseInt(strOpcao);
	}
}
