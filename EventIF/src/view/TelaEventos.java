package view; 

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
 
public class TelaEventos {

	private JFrame frmEventos;
	private JTextField txtPesquisa;
	private JTable table;
	private JButton btnEditar = new JButton("Editar");
	private JButton btnAdicionar = new JButton("ADD");
	private JButton btnExcluir = new JButton("Excluir");
	private JButton btnAtividades = new JButton("Atividades");
	private JButton btnLogout = new JButton("logout");
	private JButton btnPesquisarok = new JButton("");

	public TelaEventos() {
		initialize();
	}

	private void initialize() {
		frmEventos = new JFrame();
		frmEventos.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaEventos.class.getResource("/view/if.png")));
		frmEventos.setTitle("Eventos");
		frmEventos.getContentPane().setBackground(new Color(102, 204, 102));
		frmEventos.getContentPane().setForeground(new Color(0, 0, 0));
		frmEventos.setBackground(new Color(0, 128, 0));
		frmEventos.setBounds(100, 100, 800, 600);
		frmEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventos.getContentPane().setLayout(null);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtPesquisa.setBounds(153, 67, 493, 34);
		txtPesquisa.setBackground(new Color(255, 255, 255));
		frmEventos.getContentPane().add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JLabel lblPesquisa = new JLabel("Pesquisa :");
		lblPesquisa.setBounds(36, 67, 107, 34);
		lblPesquisa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		frmEventos.getContentPane().add(lblPesquisa);
		
		
		btnPesquisarok.setBounds(656, 67, 83, 34);
		btnPesquisarok.setBackground(Color.WHITE);
		btnPesquisarok.setForeground(Color.WHITE);
		btnPesquisarok.setIcon(new ImageIcon(TelaEventos.class.getResource("/view/Symbol_-_Check.png")));
		frmEventos.getContentPane().add(btnPesquisarok);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 129, 610, 424);
		frmEventos.getContentPane().add(scrollPane);
		  
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		table.setShowVerticalLines(false);
		table.setBackground(new Color(102, 204, 102));
		table.setModel(new DefaultTableModel( 
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nome Evento", "Horario", "Data", "Local", "Palestrante"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(137);
		table.getColumnModel().getColumn(4).setPreferredWidth(97);
		scrollPane.setViewportView(table);
		
		
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnAdicionar.setBounds(656, 129, 83, 34);
		frmEventos.getContentPane().add(btnAdicionar);
		
		
		btnEditar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnEditar.setBounds(656, 184, 83, 34);
		frmEventos.getContentPane().add(btnEditar);
		
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(656, 233, 83, 34);
		frmEventos.getContentPane().add(btnExcluir);
		
		btnAtividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnAtividades.setBounds(656, 492, 107, 35);
		frmEventos.getContentPane().add(btnAtividades);
		
		btnLogout.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnLogout.setBounds(695, 0, 89, 23);
		frmEventos.getContentPane().add(btnLogout);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(TelaEventos.class.getResource("/view/if.png")));
		lblIcon.setBounds(0, -13, 127, 146);
		frmEventos.getContentPane().add(lblIcon);
	}

	public JFrame getFrmEventos() {
		return frmEventos;
	}

	public void setFrmEventos(JFrame frmEventos) {
		this.frmEventos = frmEventos;
	}

	public JTextField getTxtPesquisa() {
		return txtPesquisa;
	}

	public void setTxtPesquisa(JTextField txtPesquisa) {
		this.txtPesquisa = txtPesquisa;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public void setBtnAdicionar(JButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	public void setBtnExcluir(JButton btnExcluir) {
		this.btnExcluir = btnExcluir;
	}

	public JButton getBtnAtividades() {
		return btnAtividades;
	}

	public void setBtnAtividades(JButton btnAtividades) {
		this.btnAtividades = btnAtividades;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}

	public void setBtnLogout(JButton btnLogout) {
		this.btnLogout = btnLogout;
	}

	public JButton getBtnPesquisarok() {
		return btnPesquisarok;
	}

	public void setBtnPesquisarok(JButton btnPesquisarok) {
		this.btnPesquisarok = btnPesquisarok;
	}
}
