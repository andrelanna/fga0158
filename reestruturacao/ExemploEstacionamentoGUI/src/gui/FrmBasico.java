package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmBasico extends JFrame{
	
	private GridBagLayout gerenciadorLayout;
	JPanel menuEsquerdo;
	private JPanel panelCentral;

	/**
	 * Definir as configurações básicas de todo e qualquer formulário gerado 
	 * para a aplicação
	 */
	public FrmBasico() {
		//Definir o tamanho
		this.setBounds(200, 200, 800, 600);
		
		//Definir o comportamento do botao fechar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Gerenciador de layout
		gerenciadorLayout = new GridBagLayout();
		JPanel panel = new JPanel(); 
		panel.setLayout(gerenciadorLayout);
		setContentPane(panel);

		//Criar Panel do lado esquerdo;
		menuEsquerdo = new JPanel();
		menuEsquerdo.setLayout(new GridLayout(3, 1));
		
		//Criar PaneCentral 
		panelCentral = new JPanel();
		panelCentral.add(new JLabel("Exemplo GUI - Controle de estacionamento"));
		
		//Adicionar elementos no west
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0; 
		gbc.gridy = 1;
		gbc.ipady = 580;
		gbc.ipadx = 200;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel.add(menuEsquerdo, gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 1; 
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 580;
		gbc.ipadx = 600;
		panel.add(panelCentral, gbc);	
	}
}
