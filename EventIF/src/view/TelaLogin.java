package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class TelaLogin {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 691, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblUsuario.setBounds(242, 143, 88, 35);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblSenha.setBounds(242, 189, 66, 35);
		frame.getContentPane().add(lblSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setBackground(Color.RED);
		txtUsuario.setBounds(324, 149, 260, 31);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBackground(Color.RED);
		txtSenha.setBounds(324, 189, 260, 31);
		frame.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		 
		JRadioButton rdbtnGerente = new JRadioButton("Gerente");
		rdbtnGerente.setBackground(new Color(0, 128, 0));
		rdbtnGerente.setBounds(324, 227, 76, 23);
		frame.getContentPane().add(rdbtnGerente);
		
		JRadioButton rdbtnMonitor = new JRadioButton("Monitor");
		rdbtnMonitor.setBackground(new Color(0, 128, 0));
		rdbtnMonitor.setBounds(406, 227, 76, 23);
		frame.getContentPane().add(rdbtnMonitor);
		
		JRadioButton rdbtnParticipante = new JRadioButton("Participante");
		rdbtnParticipante.setBackground(new Color(0, 128, 0));
		rdbtnParticipante.setBounds(490, 227, 94, 23);
		frame.getContentPane().add(rdbtnParticipante);

		ButtonGroup radioGroup = new ButtonGroup();  
		radioGroup.add(rdbtnGerente);  
		radioGroup.add(rdbtnMonitor);  
		radioGroup.add(rdbtnParticipante); 
		
		
		JLabel lblIcon = new JLabel(" ");
		lblIcon.setIcon(new ImageIcon(TelaLogin.class.getResource("/view/if.png")));
		lblIcon.setBounds(63, 97, 168, 169);
		frame.getContentPane().add(lblIcon);
		
		JButton btnLogin = new JButton("");
		btnLogin.setIcon(new ImageIcon(TelaLogin.class.getResource("/view/Symbol_-_Check.png")));
		btnLogin.setBounds(337, 282, 88, 67);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnCadastro.setBounds(472, 282, 108, 67);
		frame.getContentPane().add(btnCadastro);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							TelaCadastro window = new TelaCadastro();
							window.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}}});} });
	}
}
