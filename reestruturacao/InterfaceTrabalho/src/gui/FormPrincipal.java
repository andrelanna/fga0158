package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormPrincipal extends JFrame{

	LayoutManager manager; 
	JPanel menuEsquerdo, 
	       menuCentro; 
	
	public FormPrincipal() {
		/**
		 * Definir propriedades principais do Form
		 */
		setSize(1024, 768);
		setTitle("Trabalho de OO");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/**
		 * Definir menu à esquerda
		 */
		menuEsquerdo = new JPanel(new GridLayout(5, 1));
		menuEsquerdo.add(new JButton("Cadastro Veiculos"));
		menuEsquerdo.add(new JButton("Cadastro Acessos"));
		menuEsquerdo.add(new JButton("Sair"));
		
		manager = new GridBagLayout();
		manager.addLayoutComponent(getName(), menuEsquerdo);
	}
}
