package br.edu.ifg.tads.mtp.eventif.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.text.MaskFormatter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaADDAtividades {

	private JFrame frmEventif;
	private JTextField txtNomeativ;
	private JTextField txtHorainicial;
	private JTextField txtHorafinal;
	private JTextField txtCargahor;
	private JTextField txtNvagas;
	private JTextArea txtDescrativ;
	private JButton btnCancelar = new JButton("");
	private JButton btnConfirmar = new JButton("");
	private JTextField txtData;
	private JTextField txtMinistrante;

	
	public TelaADDAtividades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventif = new JFrame();
		frmEventif.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaADDAtividades.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		frmEventif.setTitle("EventIF");
		frmEventif.getContentPane().setBackground(new Color(102, 204, 102));
		frmEventif.getContentPane().setLayout(null);
		
		JLabel lblCadastrarAtividade = new JLabel("Cadastrar Atividade");
		lblCadastrarAtividade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCadastrarAtividade.setBounds(272, 11, 231, 48);
		frmEventif.getContentPane().add(lblCadastrarAtividade);
		
		JLabel lblNomeAtividade = new JLabel("Nome Atividade:");
		lblNomeAtividade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNomeAtividade.setBounds(72, 75, 100, 22);
		frmEventif.getContentPane().add(lblNomeAtividade);
		
		JLabel lblHorarioInicial = new JLabel("Horario inicial:");
		lblHorarioInicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblHorarioInicial.setBounds(293, 122, 92, 24);
		frmEventif.getContentPane().add(lblHorarioInicial);
		
		JLabel lblHorarioFinal = new JLabel("Horario Final:");
		lblHorarioFinal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblHorarioFinal.setBounds(513, 122, 92, 24);
		frmEventif.getContentPane().add(lblHorarioFinal);
		
		JLabel lblCargaHoraria = new JLabel("Carga Horaria:");
		lblCargaHoraria.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblCargaHoraria.setBounds(291, 168, 100, 22);
		frmEventif.getContentPane().add(lblCargaHoraria);
		
		JLabel lblNDeVagas = new JLabel("N\u00BA de Vagas:");
		lblNDeVagas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNDeVagas.setBounds(513, 168, 80, 22);
		frmEventif.getContentPane().add(lblNDeVagas);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDescrio.setBounds(77, 212, 80, 24);
		frmEventif.getContentPane().add(lblDescrio);
		
		txtNomeativ = new JTextField();
		txtNomeativ.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtNomeativ.setBackground(Color.WHITE);
		txtNomeativ.setBounds(182, 72, 273, 31);
		frmEventif.getContentPane().add(txtNomeativ);
		txtNomeativ.setColumns(10);
		
		txtHorainicial = new JFormattedTextField(Mascara("##/##/####")); 
		txtHorainicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtHorainicial.setBackground(Color.WHITE);
		txtHorainicial.setBounds(387, 122, 114, 31);
		frmEventif.getContentPane().add(txtHorainicial);
		txtHorainicial.setColumns(10);
		
		txtHorafinal = new JFormattedTextField(Mascara("##/##/####")); 
		txtHorafinal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtHorafinal.setBackground(Color.WHITE);
		txtHorafinal.setBounds(603, 120, 101, 29);
		frmEventif.getContentPane().add(txtHorafinal);
		txtHorafinal.setColumns(10);
		
		txtCargahor = new JTextField();
		txtCargahor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtCargahor.setBackground(Color.WHITE);
		txtCargahor.setBounds(389, 167, 114, 31);
		frmEventif.getContentPane().add(txtCargahor);
		txtCargahor.setColumns(10);
		
		txtNvagas = new JTextField();
		txtNvagas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtNvagas.setBackground(Color.WHITE);
		txtNvagas.setColumns(10);
		txtNvagas.setBounds(603, 167, 101, 29);
		frmEventif.getContentPane().add(txtNvagas);
		
		txtDescrativ = new JTextArea();
		txtDescrativ.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtDescrativ.setBackground(Color.WHITE);
		txtDescrativ.setBounds(182, 213, 522, 124);
		frmEventif.getContentPane().add(txtDescrativ);
		txtDescrativ.setColumns(10);
		
		btnConfirmar.setIcon(new ImageIcon(TelaADDAtividades.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/Symbol_-_Check.png")));
		btnConfirmar.setBounds(272, 365, 89, 59);
		frmEventif.getContentPane().add(btnConfirmar);
		
		btnCancelar.setIcon(new ImageIcon(TelaADDAtividades.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/X.png")));
		btnCancelar.setBounds(569, 365, 89, 59);
		frmEventif.getContentPane().add(btnCancelar);
		
		JLabel lblicon = new JLabel("");
		lblicon.setIcon(new ImageIcon(TelaADDAtividades.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		lblicon.setBounds(29, 245, 125, 186);
		frmEventif.getContentPane().add(lblicon);
		
		JLabel lblTipo = new JLabel("Tipo Atividade:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblTipo.setBounds(77, 130, 100, 18);
		frmEventif.getContentPane().add(lblTipo);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Palestra", "Minicurso", "Oficina"}));
		comboBoxTipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		comboBoxTipo.setBounds(182, 122, 101, 31);
		frmEventif.getContentPane().add(comboBoxTipo);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblData.setBounds(77, 173, 89, 17);
		frmEventif.getContentPane().add(lblData);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtData.setBounds(182, 170, 99, 28);
		frmEventif.getContentPane().add(txtData);
		txtData.setColumns(10);
		
		JLabel lblMinistrante = new JLabel("Ministrante:");
		lblMinistrante.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblMinistrante.setBounds(465, 80, 80, 22);
		frmEventif.getContentPane().add(lblMinistrante);
		
		txtMinistrante = new JTextField();
		txtMinistrante.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		txtMinistrante.setBounds(542, 74, 162, 27);
		frmEventif.getContentPane().add(txtMinistrante);
		txtMinistrante.setColumns(10);
		frmEventif.setBounds(100, 100, 800, 483);
		frmEventif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrmEventif() {
		return frmEventif;
	}

	public void setFrmEventif(JFrame frmEventif) {
		this.frmEventif = frmEventif;
	}

	public JTextField getTxtNomeativ() {
		return txtNomeativ;
	}

	public void setTxtNomeativ(JTextField txtNomeativ) {
		this.txtNomeativ = txtNomeativ;
	}

	public JTextField getTxtHorainicial() {
		return txtHorainicial;
	}

	public void setTxtHorainicial(JTextField txtHorainicial) {
		this.txtHorainicial = txtHorainicial;
	}

	public JTextField getTxtHorafinal() {
		return txtHorafinal;
	}

	public void setTxtHorafinal(JTextField txtHorafinal) {
		this.txtHorafinal = txtHorafinal;
	}

	public JTextField getTxtCargahor() {
		return txtCargahor;
	}

	public void setTxtCargahor(JTextField txtCargahor) {
		this.txtCargahor = txtCargahor;
	}

	public JTextField getTxtNvagas() {
		return txtNvagas;
	}

	public void setTxtNvagas(JTextField txtNvagas) {
		this.txtNvagas = txtNvagas;
	}

	public JTextArea getTxtDescrativ() {
		return txtDescrativ;
	}

	public void setTxtDescrativ(JTextArea txtDescrativ) {
		this.txtDescrativ = txtDescrativ;
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
	public MaskFormatter Mascara(String Mascara){  
        
	       MaskFormatter F_Mascara = new MaskFormatter();  
	       try{  
	           F_Mascara.setMask(Mascara); //Atribui a mascara  
	           F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento   
	       }  
	       catch (Exception excecao) {  
	       excecao.printStackTrace();  
	       }   
	       return F_Mascara;  
	} 
}