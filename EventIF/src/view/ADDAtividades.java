package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ADDAtividades {

	private JFrame frmEventif;
	private JTextField txtNomeativ;
	private JTextField txtHorainicial;
	private JTextField txtHorafinal;
	private JTextField txtCargahor;
	private JTextField txtNvagas;
	private JTextField txtDescrativ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDAtividades window = new ADDAtividades();
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
	public ADDAtividades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventif = new JFrame();
		frmEventif.setIconImage(Toolkit.getDefaultToolkit().getImage(ADDAtividades.class.getResource("/view/if.png")));
		frmEventif.setTitle("EventIF");
		frmEventif.getContentPane().setBackground(new Color(102, 204, 102));
		frmEventif.getContentPane().setLayout(null);
		
		JLabel lblCadastrarAtividade = new JLabel("Cadastrar Atividade");
		lblCadastrarAtividade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCadastrarAtividade.setBounds(272, 11, 231, 48);
		frmEventif.getContentPane().add(lblCadastrarAtividade);
		
		JLabel lblNomeAtividade = new JLabel("Nome Atividade:");
		lblNomeAtividade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNomeAtividade.setBounds(62, 70, 100, 22);
		frmEventif.getContentPane().add(lblNomeAtividade);
		
		JLabel lblHorarioInicial = new JLabel("Horario inicial:");
		lblHorarioInicial.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblHorarioInicial.setBounds(62, 120, 92, 24);
		frmEventif.getContentPane().add(lblHorarioInicial);
		
		JLabel lblHorarioFinal = new JLabel("Horario Final:");
		lblHorarioFinal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblHorarioFinal.setBounds(380, 120, 80, 24);
		frmEventif.getContentPane().add(lblHorarioFinal);
		
		JLabel lblCargaHoraria = new JLabel("Carga Horaria:");
		lblCargaHoraria.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblCargaHoraria.setBounds(62, 165, 100, 22);
		frmEventif.getContentPane().add(lblCargaHoraria);
		
		JLabel lblNDeVagas = new JLabel("N\u00BA de Vagas:");
		lblNDeVagas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNDeVagas.setBounds(380, 168, 92, 22);
		frmEventif.getContentPane().add(lblNDeVagas);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblDescrio.setBounds(62, 210, 80, 24);
		frmEventif.getContentPane().add(lblDescrio);
		
		txtNomeativ = new JTextField();
		txtNomeativ.setBackground(Color.WHITE);
		txtNomeativ.setBounds(182, 72, 522, 31);
		frmEventif.getContentPane().add(txtNomeativ);
		txtNomeativ.setColumns(10);
		
		txtHorainicial = new JTextField();
		txtHorainicial.setBackground(Color.WHITE);
		txtHorainicial.setBounds(182, 118, 188, 31);
		frmEventif.getContentPane().add(txtHorainicial);
		txtHorainicial.setColumns(10);
		
		txtHorafinal = new JTextField();
		txtHorafinal.setBackground(Color.WHITE);
		txtHorafinal.setBounds(470, 120, 234, 29);
		frmEventif.getContentPane().add(txtHorafinal);
		txtHorafinal.setColumns(10);
		
		txtCargahor = new JTextField();
		txtCargahor.setBackground(Color.WHITE);
		txtCargahor.setBounds(182, 165, 188, 31);
		frmEventif.getContentPane().add(txtCargahor);
		txtCargahor.setColumns(10);
		
		txtNvagas = new JTextField();
		txtNvagas.setBackground(Color.WHITE);
		txtNvagas.setColumns(10);
		txtNvagas.setBounds(470, 167, 234, 29);
		frmEventif.getContentPane().add(txtNvagas);
		
		txtDescrativ = new JTextField();
		txtDescrativ.setBackground(Color.WHITE);
		txtDescrativ.setBounds(182, 213, 522, 124);
		frmEventif.getContentPane().add(txtDescrativ);
		txtDescrativ.setColumns(10);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setIcon(new ImageIcon(ADDAtividades.class.getResource("/view/Symbol_-_Check.png")));
		btnConfirmar.setBounds(272, 365, 89, 59);
		frmEventif.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setIcon(new ImageIcon(ADDAtividades.class.getResource("/view/X.png")));
		btnCancelar.setBounds(569, 365, 89, 59);
		frmEventif.getContentPane().add(btnCancelar);
		
		JLabel lblicon = new JLabel("");
		lblicon.setIcon(new ImageIcon(ADDAtividades.class.getResource("/view/if.png")));
		lblicon.setBounds(29, 245, 125, 186);
		frmEventif.getContentPane().add(lblicon);
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

	public JTextField getTxtDescrativ() {
		return txtDescrativ;
	}

	public void setTxtDescrativ(JTextField txtDescrativ) {
		this.txtDescrativ = txtDescrativ;
	}
	
}
