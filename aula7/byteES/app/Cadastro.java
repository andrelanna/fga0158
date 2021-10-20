package byteES.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		FileOutputStream out = null;  //objeto que "lida" com o arquivo de saida
		
		try {
			out = new FileOutputStream(nomeArquivo);  //tentar criar objeto de manipulacao de arquivo
			
			Iterator<Aluno> it = alunos.iterator();  //Iterador sobre os objetos do tipo Aluno na lista alunos
			while (it.hasNext()) {  //enquanto houver alunos a serem percorridos
				Aluno a = it.next();   //obtem o proximo objeto Aluno
				String a_str = a.toString();  //transforma os dados do objeto em uma string 
				for (int i=0; i<a_str.length(); i++) {  //para essa string, transforma cada caractere em um byte e o escreve no arquivo
					byte b = (byte) a_str.charAt(i);
					out.write(b);
				}
				out.write((byte)'\n');  //ao final da escrita de um objeto aluno, pula uma linha no arquivo
			}
		} catch (IOException e) {
			e.printStackTrace();
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
