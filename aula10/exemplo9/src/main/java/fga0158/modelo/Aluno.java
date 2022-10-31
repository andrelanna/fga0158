package fga0158.modelo;

/**
 * Classe Aluno é uma subclasse de PessoaFisica. Ela herda
 * os atributos e métodos de PessoaFisica. 
 * @author andre
 *
 */
public class Aluno extends PessoaFisica{
	private String matricula, 
				   curso;
	
	/**
	 * Método construtor de Aluno
	 * @param nome nome do aluno
	 * @param dataDeNascimento data de nascimento do aluno.
	 * @param email email do aluno.
	 * @param matricula matricula do aluno.
	 * @param curso curso do aluno. 
	 */
	public Aluno(String nome, 
				 String dataDeNascimento, 
				 String email, 
				 String matricula, 
				 String curso) {
		super(nome, dataDeNascimento, email); //chamada ao construtor da superclasse (PessoaFisica)
		this.matricula = matricula;
		this.curso = curso;
	}
	
	/**
	 * Método sobrescrito da classe PessoaFisica. 
	 * O método foi definido em PessoaFisica, herdado e reimplementado 
	 * em Aluno. 
	 */
	public String relatorio() {
		String resposta = super.relatorio();
		resposta += "MATRICULA: " + matricula + "\n";
		resposta += "CURSO: " + curso + "\n";
		return resposta;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
