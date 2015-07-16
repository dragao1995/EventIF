package br.edu.ifg.tads.mtp.eventif.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class TelaADDMonitor {

	private JFrame frmEventif;
	private JTable table;
	private JTextField txtPesquisa;
	private JButton btnPesquisarok = new JButton("");
	private JButton btnEscolher = new JButton("Escolher");
	private JButton btnVoltar = new JButton("");
 
	public TelaADDMonitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventif = new JFrame();
		frmEventif.setTitle("EventIF");
		frmEventif.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaADDMonitor.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		frmEventif.getContentPane().setBackground(new Color(51, 204, 102));
		frmEventif.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Escolha um Monitor");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTitulo.setBounds(267, 0, 310, 70);
		frmEventif.getContentPane().add(lblTitulo);
		frmEventif.setBounds(100, 100, 800, 600);
		frmEventif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 126, 610, 424);
		frmEventif.getContentPane().add(scrollPane);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtPesquisa.setBounds(113, 67, 507, 34);
		txtPesquisa.setBackground(new Color(255, 255, 255));
		frmEventif.getContentPane().add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JLabel lblPesquisa = new JLabel("Pesquisa :");
		lblPesquisa.setBounds(10, 64, 107, 34);
		lblPesquisa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		frmEventif.getContentPane().add(lblPesquisa);
		
		
		btnPesquisarok.setBounds(649, 67, 83, 34);
		btnPesquisarok.setBackground(Color.WHITE);
		btnPesquisarok.setForeground(Color.WHITE);
		btnPesquisarok.setIcon(new ImageIcon(TelaEventos.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/Symbol_-_Check.png")));
		frmEventif.getContentPane().add(btnPesquisarok);  
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		table.setBackground(new Color(102, 204, 102));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Participantes", "CPF"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(137);
		scrollPane.setViewportView(table);
		
		
		btnEscolher.setBounds(649, 146, 91, 34);
		frmEventif.getContentPane().add(btnEscolher);
		
		btnVoltar.setIcon(new ImageIcon(TelaADDMonitor.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/X.png")));
		btnVoltar.setBounds(668, 498, 89, 40);
		frmEventif.getContentPane().add(btnVoltar);
	}

	public JFrame getFrmEventif() {
		return frmEventif;
	}

	public void setFrmEventif(JFrame frmEventif) {
		this.frmEventif = frmEventif;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTxtPesquisa() {
		return txtPesquisa;
	}

	public void setTxtPesquisa(JTextField txtPesquisa) {
		this.txtPesquisa = txtPesquisa;
	}

	public JButton getBtnPesquisarok() {
		return btnPesquisarok;
	}

	public void setBtnPesquisarok(JButton btnPesquisarok) {
		this.btnPesquisarok = btnPesquisarok;
	}

	public JButton getBtnEscolher() {
		return btnEscolher;
	}

	public void setBtnEscolher(JButton btnEscolher) {
		this.btnEscolher = btnEscolher;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}
	
}
