package fga0158;

import javax.swing.JOptionPane;

import fga0158.modelo.Aluno;
import fga0158.modelo.PessoaFisica;
import fga0158.modelo.Professor;

/**
 * Exercicio para apresentar o uso do tipo de uma superclasse para referenciar 
 * objetos de suas subclasses diretas ou indiretas.
 * 
 * @author andre
 *
 */
public class GerenciadorCadastros {

	/**
	 * Referencia pf do tipo PessoaFisica: ela consegue referenciar objetos
	 * do tipo Aluno e Professor, já que ambas são subclasses de PessoaFisica
	 */
	static PessoaFisica[] pf = new PessoaFisica[0]; 

	
	/**
	 * Método principal da classe gerenciadora de cadastros.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int opcao = 0;
		do {
			String nome = JOptionPane.showInputDialog("Informe o nome"); 
			String dataNascimento = JOptionPane.showInputDialog("Informe data nascimento");
			String email = JOptionPane.showInputDialog("Informe email");
			
			int ehProfessor = JOptionPane.showConfirmDialog(null, "É professor?");
			
			PessoaFisica temp; //referencia temporaria para referenciar ou um professor ou um aluno 
			
			if (ehProfessor == JOptionPane.YES_OPTION) {
				String matFub = JOptionPane.showInputDialog("Informe matricula FUB");
				temp = new Professor(nome, dataNascimento, email, matFub);  //temp referenciando um professor
			} else {
				String matricula = JOptionPane.showInputDialog("Informe matricula"); 
				String curso = JOptionPane.showInputDialog("informe curso");
				temp  = new Aluno(nome, dataNascimento, email, matricula, curso);  //temp referenciando um aluno
			}
			
			cadastrarPessoaFisica(temp);
			opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar nova PF?");
		} while (opcao == JOptionPane.YES_OPTION);
		
		for (int i=0; i<pf.length; i++) {
			JOptionPane.showMessageDialog(null, pf[i].relatorio());	//varrendo o vetor de PessoaFisica pf, e imprimindo o relatorio de cada objeto PessoaFisica
		}
	}

	/**
	 * Método para cadastrar pessoas fisicas no vetor PF. 
	 * @param temp o objeto PessoaFisica que vai ser cadastrado no vetor.  
	 */
	private static void cadastrarPessoaFisica(PessoaFisica temp) {
		PessoaFisica tempPF[] = new PessoaFisica[pf.length+1];
		for (int i=0; i<pf.length; i++) {
			tempPF[i] = pf[i];
		}
		
		tempPF[pf.length] = temp; 
		pf = tempPF;
	}

}
