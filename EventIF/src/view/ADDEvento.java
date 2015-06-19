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

	private JFrame frmEventif;
	private JTextField txtNomeev;
	private JTextField txtEndereco;
	private JTextField txtDatainicial;
	private JTextField txtDataf;
	private JTextField textField;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDEvento window = new ADDEvento();
					window.frmEventif.setVisible(true);
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
		frmEventif = new JFrame();
		frmEventif.setIconImage(Toolkit.getDefaultToolkit().getImage(ADDEvento.class.getResource("/view/if.png")));
		frmEventif.setTitle("EventIF");
		frmEventif.getContentPane().setBackground(new Color(0, 128, 0));
		frmEventif.getContentPane().setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento");
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCadastrarEvento.setBounds(276, 11, 200, 31);
		frmEventif.getContentPane().add(lblCadastrarEvento);
		
		JLabel lblNomeDeEvento = new JLabel("Nome Evento:");
		lblNomeDeEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNomeDeEvento.setBounds(37, 52, 92, 24);
		frmEventif.getContentPane().add(lblNomeDeEvento);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblEndereo.setBounds(37, 99, 103, 24);
		frmEventif.getContentPane().add(lblEndereo);
		
		JLabel lblDataInicial = new JLabel("Data inicial:");
		lblDataInicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDataInicial.setBounds(37, 150, 92, 24);
		frmEventif.getContentPane().add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final:");
		lblDataFinal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDataFinal.setBounds(349, 150, 69, 24);
		frmEventif.getContentPane().add(lblDataFinal);
		
		JLabel lblOrganizador = new JLabel("Organizador: ");
		lblOrganizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblOrganizador.setBounds(37, 203, 82, 24);
		frmEventif.getContentPane().add(lblOrganizador);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDescrio.setBounds(37, 249, 82, 24);
		frmEventif.getContentPane().add(lblDescrio);
		
		txtNomeev = new JTextField();
		txtNomeev.setBounds(139, 50, 539, 31);
		frmEventif.getContentPane().add(txtNomeev);
		txtNomeev.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(139, 97, 539, 31);
		frmEventif.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtDatainicial = new JTextField();
		txtDatainicial.setBounds(139, 145, 200, 33);
		frmEventif.getContentPane().add(txtDatainicial);
		txtDatainicial.setColumns(10);
		
		txtDataf = new JTextField();
		txtDataf.setBounds(429, 150, 249, 29);
		frmEventif.getContentPane().add(txtDataf);
		txtDataf.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(139, 199, 539, 35);
		frmEventif.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(139, 252, 539, 119);
		frmEventif.getContentPane().add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setIcon(new ImageIcon(ADDEvento.class.getResource("/view/Symbol_-_Check.png")));
		btnConfirmar.setBounds(221, 382, 89, 59);
		frmEventif.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setIcon(new ImageIcon(ADDEvento.class.getResource("/view/X.png")));
		btnCancelar.setBounds(518, 382, 89, 59);
		frmEventif.getContentPane().add(btnCancelar);
		frmEventif.setBounds(100, 100, 800, 509);
		frmEventif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
