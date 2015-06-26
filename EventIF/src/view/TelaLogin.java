package view;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaLogin {
  
	private JFrame frameLogin;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	
	public static void main(String[] args) throws SQLException  {
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto","postgres","123");
		
		System.out.println(conexao);
		conexao.close();
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frameLogin.setVisible(true);
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
		frameLogin = new JFrame();
		frameLogin.setResizable(false);
		frameLogin.getContentPane().setBackground(new Color(102, 204, 102));
		frameLogin.getContentPane().setForeground(Color.WHITE);
		frameLogin.setBounds(100, 100, 691, 417);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);
		frameLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastro.class.getResource("/view/if.png")));
		

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblUsuario.setBounds(242, 143, 88, 35);
		frameLogin.getContentPane().add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblSenha.setBounds(242, 189, 66, 35);
		frameLogin.getContentPane().add(lblSenha);

		txtUsuario = new JTextField();
		txtUsuario.setBackground(new Color(255, 255, 255));
		txtUsuario.setBounds(324, 149, 260, 31);
		frameLogin.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		txtSenha = new JTextField();
		txtSenha.setBackground(new Color(255, 255, 255));
		txtSenha.setBounds(324, 189, 260, 31);
		frameLogin.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);

		JRadioButton rdbtnGerente = new JRadioButton("Gerente");
		rdbtnGerente.setBackground(new Color(102, 204, 102));
		rdbtnGerente.setBounds(324, 227, 76, 23);
		frameLogin.getContentPane().add(rdbtnGerente);

		JRadioButton rdbtnMonitor = new JRadioButton("Monitor");
		rdbtnMonitor.setBackground(new Color(102, 204, 102));
		rdbtnMonitor.setBounds(406, 227, 76, 23);
		frameLogin.getContentPane().add(rdbtnMonitor);

		JRadioButton rdbtnParticipante = new JRadioButton("Participante");
		rdbtnParticipante.setBackground(new Color(102, 204, 102));
		rdbtnParticipante.setBounds(490, 227, 94, 23);
		frameLogin.getContentPane().add(rdbtnParticipante);
  
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnGerente);
		radioGroup.add(rdbtnMonitor);
		radioGroup.add(rdbtnParticipante);
        
		JLabel lblIcon = new JLabel(" ");
		lblIcon.setIcon(new ImageIcon(TelaLogin.class
				.getResource("/view/if.png")));
		lblIcon.setBounds(63, 97, 168, 169);
		frameLogin.getContentPane().add(lblIcon);

		JButton btnLogin = new JButton("");
		btnLogin.setIcon(new ImageIcon(TelaLogin.class
				.getResource("/view/Symbol_-_Check.png")));
		btnLogin.setBounds(337, 282, 88, 67);
		frameLogin.getContentPane().add(btnLogin);

		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnCadastro.setBounds(472, 282, 108, 67);
		frameLogin.getContentPane().add(btnCadastro);
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							TelaCadastro window = new TelaCadastro();
							window.getFrame().setVisible(true);
							frameLogin.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
	}

	public JFrame getFrameLogin() {
		return frameLogin;
	}

	public void setFrameLogin(JFrame frameLogin) {
		this.frameLogin = frameLogin;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(JTextField txtSenha) {
		this.txtSenha = txtSenha;
	}
	
}
