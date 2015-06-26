package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADDEvento {

	private JFrame frmCadastrarEvento;
	private JTextField txtNomeev;
	private JTextField txtEndereco;
	private JTextField txtDatainicial;
	private JTextField txtDataf;
	private JTextField textOrganizador;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDEvento window = new ADDEvento();
					window.frmCadastrarEvento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ADDEvento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastrarEvento = new JFrame();
		frmCadastrarEvento.setIconImage(Toolkit.getDefaultToolkit().getImage(ADDEvento.class.getResource("/view/if.png")));
		frmCadastrarEvento.setTitle("EventIF");
		frmCadastrarEvento.getContentPane().setBackground(new Color(102, 204, 102));
		frmCadastrarEvento.getContentPane().setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento");
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCadastrarEvento.setBounds(276, 11, 200, 31);
		frmCadastrarEvento.getContentPane().add(lblCadastrarEvento);
		
		JLabel lblNomeDeEvento = new JLabel("Nome Evento:");
		lblNomeDeEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNomeDeEvento.setBounds(37, 52, 92, 24);
		frmCadastrarEvento.getContentPane().add(lblNomeDeEvento);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblEndereo.setBounds(37, 99, 103, 24);
		frmCadastrarEvento.getContentPane().add(lblEndereo);
		
		JLabel lblDataInicial = new JLabel("Data inicial:");
		lblDataInicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDataInicial.setBounds(37, 150, 92, 24);
		frmCadastrarEvento.getContentPane().add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final:");
		lblDataFinal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDataFinal.setBounds(349, 150, 69, 24);
		frmCadastrarEvento.getContentPane().add(lblDataFinal);
		
		JLabel lblOrganizador = new JLabel("Organizador: ");
		lblOrganizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblOrganizador.setBounds(37, 203, 82, 24);
		frmCadastrarEvento.getContentPane().add(lblOrganizador);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDescrio.setBounds(37, 249, 82, 24);
		frmCadastrarEvento.getContentPane().add(lblDescrio);
		
		txtNomeev = new JTextField();
		txtNomeev.setBackground(Color.WHITE);
		txtNomeev.setBounds(139, 50, 539, 31);
		frmCadastrarEvento.getContentPane().add(txtNomeev);
		txtNomeev.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBackground(Color.WHITE);
		txtEndereco.setBounds(139, 97, 539, 31);
		frmCadastrarEvento.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtDatainicial = new JTextField();
		txtDatainicial.setBackground(Color.WHITE);
		txtDatainicial.setBounds(139, 145, 200, 33);
		frmCadastrarEvento.getContentPane().add(txtDatainicial);
		txtDatainicial.setColumns(10);
		
		txtDataf = new JTextField();
		txtDataf.setBackground(Color.WHITE);
		txtDataf.setBounds(429, 150, 249, 29);
		frmCadastrarEvento.getContentPane().add(txtDataf);
		txtDataf.setColumns(10);
		
		textOrganizador = new JTextField();
		textOrganizador.setBackground(Color.WHITE);
		textOrganizador.setBounds(139, 199, 539, 35);
		frmCadastrarEvento.getContentPane().add(textOrganizador);
		textOrganizador.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setBackground(Color.WHITE);
		txtDescricao.setBounds(139, 252, 539, 119);
		frmCadastrarEvento.getContentPane().add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setIcon(new ImageIcon(ADDEvento.class.getResource("/view/Symbol_-_Check.png")));
		btnConfirmar.setBounds(218, 388, 89, 59);
		frmCadastrarEvento.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setIcon(new ImageIcon(ADDEvento.class.getResource("/view/X.png")));
		btnCancelar.setBounds(515, 388, 89, 59);
		frmCadastrarEvento.getContentPane().add(btnCancelar);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(ADDEvento.class.getResource("/view/if.png")));
		lblIcon.setBounds(0, 309, 154, 138);
		frmCadastrarEvento.getContentPane().add(lblIcon);
		frmCadastrarEvento.setBounds(100, 100, 800, 509);
		frmCadastrarEvento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrmCadastrarEvento() {
		return frmCadastrarEvento;
	}

	public void setFrmCadastrarEvento(JFrame frmCadastrarEvento) {
		this.frmCadastrarEvento = frmCadastrarEvento;
	}

	public JTextField getTxtNomeev() {
		return txtNomeev;
	}

	public void setTxtNomeev(JTextField txtNomeev) {
		this.txtNomeev = txtNomeev;
	}

	public JTextField getTxtEndereco() {
		return txtEndereco;
	}

	public void setTxtEndereco(JTextField txtEndereco) {
		this.txtEndereco = txtEndereco;
	}

	public JTextField getTxtDatainicial() {
		return txtDatainicial;
	}

	public void setTxtDatainicial(JTextField txtDatainicial) {
		this.txtDatainicial = txtDatainicial;
	}

	public JTextField getTxtDataf() {
		return txtDataf;
	}

	public void setTxtDataf(JTextField txtDataf) {
		this.txtDataf = txtDataf;
	}

	public JTextField getTextOrganizador() {
		return textOrganizador;
	}

	public void setTextOrganizador(JTextField textOrganizador) {
		this.textOrganizador = textOrganizador;
	}

	public JTextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(JTextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}
	
	
}
