package br.edu.ifg.tads.mtp.eventif.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaADDEvento {

	private JFrame frmCadastrarEvento;
	private JTextField txtNomeev;
	private JTextField txtEndereco;
	private JTextField txtDatainicial;
	private JTextField txtDataf;
	private JTextField textOrganizador;
	private JTextArea txtDescricao;
	private JButton btnCancelar = new JButton("");
	private JButton btnConfirmar = new JButton("");
	
	public TelaADDEvento() {
		initialize();
	}

	private void initialize() {
		frmCadastrarEvento = new JFrame();
		frmCadastrarEvento.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
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
		txtNomeev.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtNomeev.setBackground(Color.WHITE);
		txtNomeev.setBounds(139, 50, 539, 31);
		frmCadastrarEvento.getContentPane().add(txtNomeev);
		txtNomeev.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtEndereco.setBackground(Color.WHITE);
		txtEndereco.setBounds(139, 97, 539, 31);
		frmCadastrarEvento.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtDatainicial = new JFormattedTextField(Mascara("##/##/####")); 
		txtDatainicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtDatainicial.setBackground(Color.WHITE);
		txtDatainicial.setBounds(139, 145, 200, 33);
		frmCadastrarEvento.getContentPane().add(txtDatainicial);
		txtDatainicial.setColumns(10);
		txtDataf = new JFormattedTextField(Mascara("##/##/####")); 
		txtDataf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtDataf.setBackground(Color.WHITE);
		txtDataf.setBounds(429, 150, 249, 29);
		frmCadastrarEvento.getContentPane().add(txtDataf);
		txtDataf.setColumns(10);
		
		textOrganizador = new JTextField();
		textOrganizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textOrganizador.setBackground(Color.WHITE);
		textOrganizador.setBounds(139, 199, 539, 35);
		frmCadastrarEvento.getContentPane().add(textOrganizador);
		textOrganizador.setColumns(10);
		
		txtDescricao = new JTextArea();
		txtDescricao.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtDescricao.setBackground(Color.WHITE);
		txtDescricao.setBounds(139, 252, 539, 119);
		frmCadastrarEvento.getContentPane().add(txtDescricao);
		txtDescricao.setColumns(10);
		
		btnConfirmar.setIcon(new ImageIcon(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/Symbol_-_Check.png")));
		btnConfirmar.setBounds(218, 388, 89, 59);
		frmCadastrarEvento.getContentPane().add(btnConfirmar);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setIcon(new ImageIcon(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/X.png")));
		btnCancelar.setBounds(515, 388, 89, 59);
		frmCadastrarEvento.getContentPane().add(btnCancelar);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(TelaADDEvento.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
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