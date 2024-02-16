package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FrmEstacionamento extends FrmBasico{

	private JButton btnVeiculo = new JButton("Cadastro de Veiculos");
	private JButton btnAcessos = new JButton("Cadastro de Acessos");
	private JButton btnSair = new JButton("sair");
	private static FrmCadastroAcessos frmCadastroAcessos;
	
	public FrmEstacionamento() {
		setTitle("Estacionamento");
		
		btnAcessos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (frmCadastroAcessos == null) { 
					frmCadastroAcessos = new FrmCadastroAcessos();
				}
				frmCadastroAcessos.setVisible(true);
			}
		});
		
		menuEsquerdo.add(btnAcessos); 
		menuEsquerdo.add(btnVeiculo);
		menuEsquerdo.add(btnSair);
		
	}
}
