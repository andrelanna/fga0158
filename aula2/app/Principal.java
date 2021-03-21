package app;

import javax.swing.JOptionPane;

import cadastros.CadastroPF;

public class Principal {

	private static CadastroPF cadPf; 
	
	public static void main(String[] args) {
		
		cadPf = new CadastroPF();
		
		menu();
	}

	
	public static void menu() {
		int opcao = 0;
		do {
			String menu = "Informe a opção desejada: \n" + "1 - Cadastrar Pessoa Fisica\n"
					+ "2 - Pesquisa Pessoa Fisica \n" + "3 - Editar Pessoa Fisoca \n" + "4 - Deletar Pessoa Fisica \n"
					+ "0 - Sair";

			String strOpcao = JOptionPane.showInputDialog(menu);

			opcao = Integer.parseInt(strOpcao);
			switch (opcao) {
			case 1: {
				cadPf.cadastrarPessoaFisica();
				cadPf.imprimirCadastro(); 
				break;
			}
			case 2: {
				JOptionPane.showMessageDialog(null, "Implementar pesquisa PF");
				break;
			}
			case 3: {
				JOptionPane.showMessageDialog(null, "Implementar edição PF");
				break;
			}
			case 4: {
				JOptionPane.showMessageDialog(null, "Implementar remoção PF");
				break;
			}
			case 0: {
				JOptionPane.showMessageDialog(null, "Implementar saida programa");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida!");
			}
		} while (opcao != 0);
	}
}
