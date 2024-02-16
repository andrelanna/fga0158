package gui;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PaneCentral extends JPanel {
	
	private JTextArea conteudo;

	public PaneCentral() {
		conteudo = new JTextArea("Exemplo GUI - Controle de estacionamento");
		setVisible(true);
	}
}
