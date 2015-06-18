package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;

public class TelaCadastro {
 
	private JFrame frmEventif;
	private JTextField txtNome;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUf;

	public TelaCadastro() {
		initialize();
	}

	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(new Color(0, 128, 0));
		getFrame().getContentPane().setForeground(Color.WHITE);
		getFrame().setBounds(100, 100, 800, 600);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(TelaCadastro.class.getResource("/view/if.png")));
		lblIcon.setBounds(43, 11, 139, 198);
		getFrame().getContentPane().add(lblIcon);
		
		JLabel lblCadastroEventif = new JLabel("Cadastro EventIF");
		lblCadastroEventif.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 37));
		lblCadastroEventif.setBounds(206, 54, 410, 63);
		getFrame().getContentPane().add(lblCadastroEventif);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNome.setBackground(new Color(0, 128, 0));
		lblNome.setBounds(94, 220, 68, 23);
		frmEventif.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBackground(Color.RED);
		txtNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtNome.setBounds(160, 224, 485, 23);
		frmEventif.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG: ");
		lblRg.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblRg.setBounds(94, 257, 53, 23);
		frmEventif.getContentPane().add(lblRg);
		
		txtRg = new JTextField();
		txtRg.setBackground(Color.RED);
		txtRg.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtRg.setBounds(160, 254, 169, 26);
		frmEventif.getContentPane().add(txtRg);
		txtRg.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblCpf.setBounds(339, 258, 53, 21);
		frmEventif.getContentPane().add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setBackground(Color.RED);
		txtCpf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtCpf.setBounds(390, 254, 255, 25);
		frmEventif.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblEmail.setBounds(339, 288, 68, 21);
		frmEventif.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.RED);
		txtEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtEmail.setBounds(400, 285, 245, 24);
		frmEventif.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Tel:");
		lblTelefone.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblTelefone.setBounds(94, 287, 46, 23);
		frmEventif.getContentPane().add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBackground(Color.RED);
		txtTelefone.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTelefone.setBounds(160, 288, 169, 26);
		frmEventif.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblCep.setBounds(94, 321, 53, 23);
		frmEventif.getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBackground(Color.RED);
		txtCep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtCep.setBounds(160, 321, 169, 26);
		frmEventif.getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblEndereco.setBounds(76, 355, 86, 23);
		frmEventif.getContentPane().add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setBackground(Color.RED);
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtEndereco.setBounds(160, 355, 347, 26);
		frmEventif.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00B0: ");
		lblNumero.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNumero.setBounds(517, 355, 35, 30);
		frmEventif.getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBackground(Color.RED);
		txtNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtNumero.setBounds(550, 355, 95, 29);
		frmEventif.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblBairro.setBounds(76, 394, 71, 23);
		frmEventif.getContentPane().add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBackground(Color.RED);
		txtBairro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtBairro.setBounds(160, 389, 133, 28);
		frmEventif.getContentPane().add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblCidade.setBounds(306, 392, 71, 24);
		frmEventif.getContentPane().add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBackground(Color.RED);
		txtCidade.setBounds(375, 392, 132, 27);
		frmEventif.getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblUf.setBounds(517, 395, 46, 24);
		frmEventif.getContentPane().add(lblUf);
		
		txtUf = new JTextField();
		txtUf.setBackground(Color.RED);
		txtUf.setBounds(560, 395, 85, 24);
		frmEventif.getContentPane().add(txtUf);
		txtUf.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setForeground(Color.BLACK);
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnConfirmar.setBounds(207, 488, 122, 48);
		frmEventif.getContentPane().add(btnConfirmar);
		    
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnCancelar.setBounds(410, 488, 122, 48);
		frmEventif.getContentPane().add(btnCancelar);
	}

	public JFrame getFrame() {
		return frmEventif;
	}

	public void setFrame(JFrame frame) {
		this.frmEventif = frame;
		frmEventif.setResizable(false);
		frmEventif.setTitle("EventIF");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastro.class.getResource("/view/if.png")));
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 19));
	}
}
