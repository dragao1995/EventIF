package br.edu.ifg.tads.mtp.eventif.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.edu.ifg.tads.mtp.eventif.util.Mascaras;

public class TelaADDEvento {
	Mascaras mascaras = new Mascaras();
	private JFrame frmCadastrarEvento;
	private JTextField txtNomeev;
	private JTextField txtEndereco;
	private JTextField txtDatainicial;
	private JTextField txtDataf;
	private JTextField textOrganizador;
	private JTextArea txtDescricao;
	private JButton btnCancelar = new JButton("");
	private JButton btnConfirmar = new JButton("");
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtCep;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUF;
	
	public TelaADDEvento() {
		initialize();
	}

	private void initialize() {
		frmCadastrarEvento = new JFrame();
		frmCadastrarEvento.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		frmCadastrarEvento.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		frmCadastrarEvento.setTitle("EventIF");
		frmCadastrarEvento.getContentPane().setBackground(new Color(102, 204, 102));
		frmCadastrarEvento.getContentPane().setLayout(null);
		
		JLabel lblCadastrarEvento = new JLabel("Cadastrar Evento");
		lblCadastrarEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCadastrarEvento.setBounds(313, 11, 200, 31);
		frmCadastrarEvento.getContentPane().add(lblCadastrarEvento);
		
		JLabel lblNomeDeEvento = new JLabel("Nome Evento:");
		lblNomeDeEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNomeDeEvento.setBounds(67, 64, 109, 24);
		frmCadastrarEvento.getContentPane().add(lblNomeDeEvento);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblEndereo.setBounds(67, 245, 103, 24);
		frmCadastrarEvento.getContentPane().add(lblEndereo);
		
		JLabel lblDataInicial = new JLabel("Data inicial:");
		lblDataInicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblDataInicial.setBounds(68, 101, 92, 24);
		frmCadastrarEvento.getContentPane().add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final:");
		lblDataFinal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblDataFinal.setBounds(387, 101, 82, 24);
		frmCadastrarEvento.getContentPane().add(lblDataFinal);
		
		JLabel lblOrganizador = new JLabel("Organizador: ");
		lblOrganizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblOrganizador.setBounds(67, 138, 109, 24);
		frmCadastrarEvento.getContentPane().add(lblOrganizador);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblDescricao.setBounds(69, 280, 82, 24);
		frmCadastrarEvento.getContentPane().add(lblDescricao);
		
		txtNomeev = new JTextField();
		txtNomeev.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtNomeev.setBackground(Color.WHITE);
		txtNomeev.setBounds(176, 64, 539, 26);
		frmCadastrarEvento.getContentPane().add(txtNomeev);
		txtNomeev.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtEndereco.setBackground(Color.WHITE);
		txtEndereco.setBounds(176, 245, 226, 26);
		frmCadastrarEvento.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtDatainicial = new JFormattedTextField(mascaras.Mascara("####/##/##")); 
		txtDatainicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtDatainicial.setBackground(Color.WHITE);
		txtDatainicial.setBounds(177, 101, 200, 26);
		frmCadastrarEvento.getContentPane().add(txtDatainicial);
		txtDatainicial.setColumns(10);
		txtDataf = new JFormattedTextField(mascaras.Mascara("####/##/##")); 
		txtDataf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtDataf.setBackground(Color.WHITE);
		txtDataf.setBounds(475, 101, 240, 26);
		frmCadastrarEvento.getContentPane().add(txtDataf);
		txtDataf.setColumns(10);
		
		textOrganizador = new JTextField();
		textOrganizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textOrganizador.setBackground(Color.WHITE);
		textOrganizador.setBounds(176, 138, 539, 26);
		frmCadastrarEvento.getContentPane().add(textOrganizador);
		textOrganizador.setColumns(10);
		
		txtDescricao = new JTextArea();
		txtDescricao.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtDescricao.setBackground(Color.WHITE);
		txtDescricao.setBounds(178, 282, 539, 99);
		frmCadastrarEvento.getContentPane().add(txtDescricao);
		txtDescricao.setColumns(10);
		
		btnConfirmar.setIcon(new ImageIcon(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/Symbol_-_Check.png")));
		btnConfirmar.setBounds(248, 404, 89, 59);
		frmCadastrarEvento.getContentPane().add(btnConfirmar);
		
		btnCancelar.setIcon(new ImageIcon(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/X.png")));
		btnCancelar.setBounds(548, 404, 89, 59);
		frmCadastrarEvento.getContentPane().add(btnCancelar);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		lblIcon.setBounds(27, 325, 154, 138);
		frmCadastrarEvento.getContentPane().add(lblIcon);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTelefone.setBounds(67, 175, 92, 26);
		frmCadastrarEvento.getContentPane().add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtTelefone.setColumns(10);
		txtTelefone.setBackground(Color.WHITE);
		txtTelefone.setBounds(176, 173, 169, 26);
		frmCadastrarEvento.getContentPane().add(txtTelefone);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblEmail.setBounds(355, 176, 68, 26);
		frmCadastrarEvento.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtEmail.setColumns(10);
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setBounds(416, 173, 299, 26);
		frmCadastrarEvento.getContentPane().add(txtEmail);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCep.setBounds(67, 208, 53, 26);
		frmCadastrarEvento.getContentPane().add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtCep.setColumns(10);
		txtCep.setBackground(Color.WHITE);
		txtCep.setBounds(176, 208, 169, 26);
		frmCadastrarEvento.getContentPane().add(txtCep);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtNumero.setColumns(10);
		txtNumero.setBackground(Color.WHITE);
		txtNumero.setBounds(435, 245, 60, 26);
		frmCadastrarEvento.getContentPane().add(txtNumero);
		
		JLabel lblNumero = new JLabel("N\u00B0: ");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNumero.setBounds(404, 245, 35, 26);
		frmCadastrarEvento.getContentPane().add(lblNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblBairro.setBounds(502, 245, 60, 26);
		frmCadastrarEvento.getContentPane().add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtBairro.setColumns(10);
		txtBairro.setBackground(Color.WHITE);
		txtBairro.setBounds(561, 245, 154, 27);
		frmCadastrarEvento.getContentPane().add(txtBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCidade.setBounds(355, 211, 68, 24);
		frmCadastrarEvento.getContentPane().add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtCidade.setColumns(10);
		txtCidade.setBackground(Color.WHITE);
		txtCidade.setBounds(416, 208, 198, 25);
		frmCadastrarEvento.getContentPane().add(txtCidade);
		
		JLabel lblUF = new JLabel("UF:");
		lblUF.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblUF.setBounds(624, 212, 35, 24);
		frmCadastrarEvento.getContentPane().add(lblUF);
		
		txtUF = new JTextField();
		txtUF.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtUF.setColumns(10);
		txtUF.setBackground(Color.WHITE);
		txtUF.setBounds(655, 210, 60, 24);
		frmCadastrarEvento.getContentPane().add(txtUF);
		frmCadastrarEvento.setBounds(100, 100, 800, 506);
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

	public JTextArea getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(JTextArea txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}
	
	public JTextField getTxtTelefone() {
		return txtTelefone;
	}

	public void setTxtTelefone(JTextField txtTelefone) {
		this.txtTelefone = txtTelefone;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtCep() {
		return txtCep;
	}

	public void setTxtCep(JTextField txtCep) {
		this.txtCep = txtCep;
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

	public JTextField getTxtUF() {
		return txtUF;
	}

	public void setTxtUF(JTextField txtUF) {
		this.txtUF = txtUF;
	}

		
}