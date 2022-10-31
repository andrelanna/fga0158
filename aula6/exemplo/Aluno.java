package exemplo;

public class Aluno {
	
	//Definição dos atributos de aluno
	int matricula;
	String nome;
	String curso;
	float ira; 
	
    //Definição dos métodos de aluno
	//Construtor padrão = construtor sem parametros
	Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	//Construtor alternativo = construtor com parametros de inicializacao
	Aluno(int mat, String n, String c, float i) {
		matricula = mat;
		nome = n;
		curso = c; 
		ira = i; 
	}

	int getMatricula() {
		return matricula;
	}

	void setMatricula(int mat) {
		matricula = mat;
	}

	String getNome() {
		return nome;
	}

	void setNome(String n) {
		nome = n;
	}

	String getCurso() {
		return curso;
	}

	void setCurso(String c) {
		curso = c;
	}

	float getIra() {
		return ira;
	}

	void setIra(float i) {
		ira = i;
	}
	
	String imprimirAluno() {
		String resposta = "";
		
		resposta += "MATRICULA: " + matricula + '\n';
		resposta += "NOME: " + nome + '\n';
		resposta += "CURSO: " + curso + '\n'; 
		resposta += "IRA: " + ira + '\n';
		resposta += "---------------------\n";
		
		return resposta;
	}
	
	
}
