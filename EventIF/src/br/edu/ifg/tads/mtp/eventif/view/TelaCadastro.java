package br.edu.ifg.tads.mtp.eventif.view;
import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.text.MaskFormatter;

import br.edu.ifg.tads.mtp.eventif.util.Mascaras;

public class TelaCadastro {
	Mascaras mascaras = new Mascaras();
	private JFrame frmCadastroEventif;
	private JTextField txtNome = new JTextField("");
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
	private JButton btnConfirmar = new JButton("");    
	private JButton btnCancelar = new JButton("");
	private JTextField txtSenha;
	private JTextField txtCsenha;

	public TelaCadastro() {
		initialize();
	}

	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(new Color(102, 204, 102));
		getFrame().getContentPane().setForeground(Color.WHITE);
		getFrame().setBounds(100, 100, 800, 600);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(TelaCadastro.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		lblIcon.setBounds(43, 11, 139, 198);
		getFrame().getContentPane().add(lblIcon);
		
		JLabel lblCadastroEventif = new JLabel("Cadastro EventIF");
		lblCadastroEventif.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 37));
		lblCadastroEventif.setBounds(207, 84, 410, 63);
		getFrame().getContentPane().add(lblCadastroEventif);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNome.setBackground(new Color(0, 128, 0));
		lblNome.setBounds(94, 220, 68, 23);
		frmCadastroEventif.getContentPane().add(lblNome);
		
		
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtNome.setBounds(160, 224, 485, 23);
		frmCadastroEventif.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG: ");
		lblRg.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblRg.setBounds(94, 257, 53, 23);
		frmCadastroEventif.getContentPane().add(lblRg);
		
		txtRg = new JTextField();
		txtRg.setBackground(new Color(255, 255, 255));
		txtRg.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtRg.setBounds(160, 254, 169, 26);
		frmCadastroEventif.getContentPane().add(txtRg);
		txtRg.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblCpf.setBounds(339, 258, 53, 21);
		frmCadastroEventif.getContentPane().add(lblCpf);
	
		txtCpf = new JFormattedTextField(mascaras.Mascara("###.###.###-##")); 
		txtCpf.setBackground(new Color(255, 255, 255));
		txtCpf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtCpf.setBounds(390, 254, 255, 25);
		frmCadastroEventif.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblEmail.setBounds(339, 288, 68, 21);
		frmCadastroEventif.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(255, 255, 255));
		txtEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtEmail.setBounds(400, 285, 245, 24);
		frmCadastroEventif.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Tel:");
		lblTelefone.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblTelefone.setBounds(94, 287, 46, 23);
		frmCadastroEventif.getContentPane().add(lblTelefone);
		
		txtTelefone = new JTextField();
		
		txtTelefone.setBackground(new Color(255, 255, 255));
		txtTelefone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtTelefone.setBounds(160, 288, 169, 26);
		frmCadastroEventif.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblCep.setBounds(94, 321, 53, 23);
		frmCadastroEventif.getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBackground(new Color(255, 255, 255));
		txtCep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtCep.setBounds(160, 321, 169, 26);
		frmCadastroEventif.getContentPane().add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblEndereco.setBounds(76, 355, 86, 23);
		frmCadastroEventif.getContentPane().add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setBackground(new Color(255, 255, 255));
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtEndereco.setBounds(160, 355, 347, 26);
		frmCadastroEventif.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		 
		JLabel lblNumero = new JLabel("N\u00B0: ");
		lblNumero.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblNumero.setBounds(517, 355, 35, 30);
		frmCadastroEventif.getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBackground(new Color(255, 255, 255));
		txtNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtNumero.setBounds(550, 356, 95, 29);
		frmCadastroEventif.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblBairro.setBounds(76, 394, 71, 23);
		frmCadastroEventif.getContentPane().add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBackground(new Color(255, 255, 255));
		txtBairro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtBairro.setBounds(160, 389, 133, 28);
		frmCadastroEventif.getContentPane().add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblCidade.setBounds(306, 392, 71, 24);
		frmCadastroEventif.getContentPane().add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtCidade.setBackground(new Color(255, 255, 255));
		txtCidade.setBounds(375, 392, 132, 27);
		frmCadastroEventif.getContentPane().add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblUf.setBounds(517, 395, 46, 24);
		frmCadastroEventif.getContentPane().add(lblUf);
		
		txtUf = new JTextField();
		txtUf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtUf.setBackground(new Color(255, 255, 255));
		txtUf.setBounds(560, 395, 85, 24);
		frmCadastroEventif.getContentPane().add(txtUf);
		txtUf.setColumns(10);
		
		
		btnConfirmar.setIcon(new ImageIcon(TelaCadastro.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/Symbol_-_Check.png")));
		btnConfirmar.setForeground(Color.BLACK);
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnConfirmar.setBounds(207, 488, 122, 48);
		frmCadastroEventif.getContentPane().add(btnConfirmar);
		
		btnCancelar.setIcon(new ImageIcon(TelaCadastro.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/X.png")));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.ITALIC, 19));
		btnCancelar.setBounds(410, 488, 122, 48);
		frmCadastroEventif.getContentPane().add(btnCancelar);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblSenha.setBounds(76, 428, 71, 23);
		frmCadastroEventif.getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(160, 425, 133, 26);
		frmCadastroEventif.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblConfirmarSenha.setBounds(306, 427, 160, 24);
		frmCadastroEventif.getContentPane().add(lblConfirmarSenha);
		
		txtCsenha = new JPasswordField();
		txtCsenha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtCsenha.setBounds(461, 425, 184, 26);
		frmCadastroEventif.getContentPane().add(txtCsenha);
		txtCsenha.setColumns(10);
	}

	public JFrame getFrame() {
		return frmCadastroEventif;
	} 

	public void setFrame(JFrame frame) {
		this.frmCadastroEventif = frame;
		frmCadastroEventif.setResizable(false);
		frmCadastroEventif.setTitle("EventIF");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCadastro.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 19));
	}

	public JTextField getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(JTextField txtSenha) {
		this.txtSenha = txtSenha;
	}

	public JTextField getTxtCsenha() {
		return txtCsenha;
	}

	public void setTxtCsenha(JTextField txtCsenha) {
		this.txtCsenha = txtCsenha;
	}

	public JFrame getFrmCadastroEventif() {
		return frmCadastroEventif;
	}

	public void setFrmCadastroEventif(JFrame frmCadastroEventif) {
		this.frmCadastroEventif = frmCadastroEventif;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtRg() {
		return txtRg;
	}

	public void setTxtRg(JTextField txtRg) {
		this.txtRg = txtRg;
	}

	public JTextField getTxtCpf() {
		return txtCpf;
	}

	public void setTxtCpf(JTextField txtCpf) {
		this.txtCpf = txtCpf;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtTelefone() {
		return txtTelefone;
	}

	public void setTxtTelefone(JTextField txtTelefone) {
		this.txtTelefone = txtTelefone;
	}

	public JTextField getTxtCep() {
		return txtCep;
	}

	public void setTxtCep(JTextField txtCep) {
		this.txtCep = txtCep;
	}

	public JTextField getTxtEndereco() {
		return txtEndereco;
	}

	public void setTxtEndereco(JTextField txtEndereco) {
		this.txtEndereco = txtEndereco;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtBairro() {
		return txtBairro;
	}

	public void setTxtBairro(JTextField txtBairro) {
		this.txtBairro = txtBairro;
	}

	public JTextField getTxtCidade() {
		return txtCidade;
	}

	public void setTxtCidade(JTextField txtCidade) {
		this.txtCidade = txtCidade;
	}

	public JTextField getTxtUf() {
		return txtUf;
	}

	public void setTxtUf(JTextField txtUf) {
		this.txtUf = txtUf;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}
}