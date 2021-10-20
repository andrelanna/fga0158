package byteES.app;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cadastro {
	List<Aluno> alunos;
	
	String nomeArquivo = "alunos.txt";
	
	public Cadastro() {
		alunos = new LinkedList<Aluno>();
	}
	
	public void cadastrarAluno() {
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
		String matricula = JOptionPane.showInputDialog("Informe a matricula:");
		
		Aluno a = new Aluno(nome, matricula);
		
		boolean resposta = alunos.add(a);
		if (resposta) 
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
		
		return;
	}
	
	
	
	
	public void gravarAlunos() {
		BufferedWriter buffer = null;
		FileWriter out = null;
		
		try {
			out = new FileWriter(nomeArquivo);
			buffer = new BufferedWriter(out);
			
			for (Aluno a : alunos) {
				buffer.write(a.toString());
				buffer.write('\n');
			}
			
			buffer.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	
	
	public void lerAlunos() {
		FileInputStream in = null;  //objeto que "lida" com o arquivo de entrada
		
		try {
			in = new FileInputStream(nomeArquivo); //tenta abrir o arquivo em modo leitura
			
			byte[] conteudoArquivo = in.readAllBytes();
			//Transformar o vetor em uma String!
			
			String cadastro = "";
			for (int i=0; i<conteudoArquivo.length; i++) {
				cadastro += (char)conteudoArquivo[i];
			}
			
			
			String[] strAlunos = cadastro.split("\n");
			for (String als : strAlunos) {
				String[] str = als.split(";");
				Aluno a = new Aluno(str[0], str[1]);
				alunos.add(a);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
