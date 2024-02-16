package exemploInicialGui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormPrincipal extends JFrame{
	
	JLabel lblName, lblDataDeNascimento;
	JTextField txtName, txtDataDeNascimento;  
	JButton btnOk, btnLimpar;
	LayoutManager manager; 
	
	
	public FormPrincipal() {
		/**
		 * Seção de definições da própria JFrame
		 */
		setSize(800, 600);
		setBounds(200, 300, 900, 600);
		setTitle("Aula inicial GUI, usando Java.Swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Criei Gerenciador de layout e o atribui à interface
//		manager = new FlowLayout();
		manager = new GridLayout(3, 2);
		setLayout(manager);
		
		/**
		 * Adicionar elementos graficos
		 */
		lblName = new JLabel("Nome:" );
		lblName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
		add(lblName);
		txtName = new JTextField("Insira o nome aqui");
		add(txtName);
		lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		add(lblDataDeNascimento);
		txtDataDeNascimento = new JTextField("Insira data de nascimento");
		add(txtDataDeNascimento);
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInputDialog("YEY!");
			}
		});
		
		btnLimpar = new JButton("Limpar");
		
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtDataDeNascimento.setText("");
				txtName.setText("");
			}
		});
		
		add(btnOk);
		add(btnLimpar);
		
		setVisible(true);
	}
}
