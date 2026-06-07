package fga0158.modelo;

/**
 * Classe Professor é uma subclasse de PessoaFisica e 
 * herda todos seus atributos e métodos
 * @author andre
 *
 */
public class Professor extends PessoaFisica{

	private String matriculaFUB;
	
	/**
	 * Método construtor alternativo: recebe os valores dos atributos de professor
	 * e dos atributos de pessoa fisica. O construtor alternativo chama o construtor
	 * da superclasse (PessoaFisica) através do operador super.
	 * @param nome nome do professor
	 * @param dataDeNascimento data de nascimento do professor
	 * @param email email do professor
	 * @param matriculaFUB matricula FUB do professor
	 */
	public Professor(String nome, 
					 String dataDeNascimento, 
					 String email, 
					 String matriculaFUB) {
		super(nome, dataDeNascimento, email); //chama construtor super-classe
		this.matriculaFUB = matriculaFUB;
	}

	/**
	 * Método definido na superclasse (PessoaFísica) e sobrescrito na classe Professor
	 */
	public String relatorio() {
		String resposta = super.relatorio();
		resposta += "MATRICULA FUB: " + matriculaFUB + "\n";
		return resposta;
	}
	
	public String getMatriculaFUB() {
		return matriculaFUB;
	}

	public void setMatriculaFUB(String matriculaFUB) {
		this.matriculaFUB = matriculaFUB;
	}
	
}
