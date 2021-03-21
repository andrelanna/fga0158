package cadastros;

import javax.swing.JOptionPane;

public class CadastroPF {
	
	
	private PessoaFisica[] pfs;
	
	public CadastroPF() {
		pfs = new PessoaFisica[0]; //!= pfs = null
		
	}
	
	public PessoaFisica cadastrarPessoaFisica() {
		/**
		 * 1 - Ler os dados da pessoa fisica
		 * 2 - Instanciar a pessoa fisica
		 * 3 - Armazenar a pessoa fisica no repositorio
		 */
		
		// 1 - Ler os dados da pessoa fisica
		String nome = JOptionPane.showInputDialog("Informe o nome da pessoa fisica");
		String cpf = JOptionPane.showInputDialog("Informe o CPF da pessoa fisica");
		
		// 2 - Instanciar a pessoa fisica
		PessoaFisica temp = new PessoaFisica(nome, cpf);
		
		// 3 - Armazenar a pessoa fisica no repositorio
		PessoaFisica tempPfs[] = new PessoaFisica[pfs.length + 1]; //criei um vetor temporario de uma posicao a mais que pfs.
		for (int i = 0; i < pfs.length; i++) { //copiar o vetor pfs para tempPFs
			tempPfs[i] = pfs[i];
		}
		tempPfs[tempPfs.length - 1] = temp; //alocar temp em tempPFs
		pfs = tempPfs;  //atualizar referencia do vetor
		
		return temp; //return tempPfs[tempPfs.length - 1]; --> dá no mesmo! sao os mesmos objetos
	}

	public void imprimirCadastro() {
		String resposta = "";
		for (int i=0; i<pfs.length; i++) {
			resposta += "[" + i + "] Nome: " + pfs[i].nome + "\t CPF: " + pfs[i].cpf + "\n";
		}
		
		System.out.println(resposta);
	}
	
//	public PessoaFisica pesquisarPessoaFisica(String cpf) {
//		//implementacao
//	}
//	
//	public boolean deletarPessoaFisica(PessoaFisica pf) {
//		//implementacao
//	}
//	
//	public PessoaFisica editarPessoaFisica(PessoaFisica pf) {
//		//implementação
//	}
}
