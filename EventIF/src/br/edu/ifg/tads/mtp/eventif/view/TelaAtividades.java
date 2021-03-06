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
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
 
public class TelaAtividades {

	private JFrame frmEventos;
	private JTable tableAtividades;	
	private JButton btnEditar = new JButton("Editar");
	private JButton btnExcluir = new JButton("Excluir");
	private JButton btnVoltar = new JButton("Voltar");
	private JButton btnAdicionar = new JButton("ADD");
	private JButton btnInscrever = new JButton("Se Inscrever");
	private JButton btnLerQrcode = new JButton("Ler QRcode");
	private final JButton btnAddMonitor = new JButton("ADD Monitor");

	public TelaAtividades() {
		initialize();
	}
  
	private void initialize() {
		frmEventos = new JFrame();
		frmEventos.getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		frmEventos.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAtividades.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		frmEventos.setTitle("Atividades");
		frmEventos.getContentPane().setBackground(new Color(102, 204, 102));
		frmEventos.getContentPane().setForeground(new Color(0, 0, 0));
		frmEventos.setBackground(new Color(0, 128, 0));
		frmEventos.setBounds(100, 100, 800, 600);
		frmEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventos.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 103, 610, 424);
		
		frmEventos.getContentPane().add(scrollPane);
		  
		tableAtividades = new JTable();
		tableAtividades.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		tableAtividades.setForeground(new Color(0, 0, 0));
		tableAtividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		tableAtividades.setBackground(new Color(102, 204, 102));
		tableAtividades.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Atividade", "Tema", "Horario", "Data", "Local", "Ministrante"
			}
		));
		tableAtividades.getColumnModel().getColumn(0).setPreferredWidth(137);
		tableAtividades.getColumnModel().getColumn(5).setPreferredWidth(97);
		scrollPane.setViewportView(tableAtividades);
		
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnAdicionar.setBounds(657, 173, 106, 34);
		btnAdicionar.setVisible(false);
		frmEventos.getContentPane().add(btnAdicionar);
		
		
		btnEditar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnEditar.setBounds(657, 218, 106, 34);
		btnEditar.setVisible(false);
		frmEventos.getContentPane().add(btnEditar);
		
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(657, 263, 106, 34);
		btnExcluir.setVisible(false);
		frmEventos.getContentPane().add(btnExcluir);
		
		btnLerQrcode.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnLerQrcode.setBounds(657, 432, 106, 35);
		btnLerQrcode.setVisible(false);
		frmEventos.getContentPane().add(btnLerQrcode);
		
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnVoltar.setBounds(656, 492, 107, 35);
		frmEventos.getContentPane().add(btnVoltar);
		
		JLabel lblAtividades = new JLabel("Atividades");
		lblAtividades.setForeground(new Color(0, 0, 0));
		lblAtividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		lblAtividades.setBounds(261, 27, 168, 49);
		frmEventos.getContentPane().add(lblAtividades);
		
		btnInscrever.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnInscrever.setBounds(656, 120, 107, 34);
		frmEventos.getContentPane().add(btnInscrever);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaAtividades.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		label.setBounds(657, -23, 125, 186);
		frmEventos.getContentPane().add(label);
		btnAddMonitor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnAddMonitor.setBounds(657, 308, 106, 34);
		
		frmEventos.getContentPane().add(btnAddMonitor);
		
		
	}

	public JFrame getFrmEventos() {
		return frmEventos;
	}

	public void setFrmEventos(JFrame frmEventos) {
		this.frmEventos = frmEventos;
	}

	public JTable getTable() {
		return tableAtividades;
	}

	public void setTable(JTable table) {
		this.tableAtividades = table;
	}

	public JTable getTableAtividades() {
		return tableAtividades;
	}

	public void setTableAtividades(JTable tableAtividades) {
		this.tableAtividades = tableAtividades;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	public void setBtnExcluir(JButton btnExcluir) {
		this.btnExcluir = btnExcluir;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public void setBtnVoltar(JButton btnVoltar) {
		this.btnVoltar = btnVoltar;
	}

	public JButton getBtnAdicionar() {
		return btnAdicionar;
	}

	public void setBtnAdicionar(JButton btnAdicionar) {
		this.btnAdicionar = btnAdicionar;
	}

	public JButton getBtnInscrever() {
		return btnInscrever;
	}

	public void setBtnInscrever(JButton btnInscrever) {
		this.btnInscrever = btnInscrever;
	}

	public JButton getBtnLerQrcode() {
		return btnLerQrcode;
	}

	public void setBtnLerQrcode(JButton btnLerQrcode) {
		this.btnLerQrcode = btnLerQrcode;
	}

	public JButton getBtnAddMonitor() {
		return btnAddMonitor;
	}
	
}