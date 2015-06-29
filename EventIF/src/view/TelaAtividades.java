package view; 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
 
public class TelaAtividades {

	private JFrame frmEventos;
	private JTable tableAtividades;	
	private JButton btnEditar = new JButton("Editar");
	private JButton btnExcluir = new JButton("Excluir");
	private JButton btnVoltar = new JButton("Voltar");
	private JButton btnAdicionar = new JButton("ADD");
	private JButton btnInscrever = new JButton("Inscrever");
	

	public TelaAtividades() {
		initialize();
	}
  
	private void initialize() {
		frmEventos = new JFrame();
		frmEventos.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAtividades.class.getResource("/view/if.png")));
		frmEventos.setTitle("EventIF");
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
		btnAdicionar.setBounds(656, 186, 89, 34);
		frmEventos.getContentPane().add(btnAdicionar);
		
		
		btnEditar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnEditar.setBounds(656, 254, 89, 34);
		frmEventos.getContentPane().add(btnEditar);
		
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(656, 322, 89, 34);
		frmEventos.getContentPane().add(btnExcluir);
		
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnVoltar.setBounds(656, 492, 107, 35);
		frmEventos.getContentPane().add(btnVoltar);
		
		JLabel lblAtividades = new JLabel("Atividades");
		lblAtividades.setForeground(new Color(0, 0, 0));
		lblAtividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		lblAtividades.setBounds(261, 27, 168, 49);
		frmEventos.getContentPane().add(lblAtividades);
		
		btnInscrever.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnInscrever.setBounds(656, 120, 89, 34);
		frmEventos.getContentPane().add(btnInscrever);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaAtividades.class.getResource("/view/if.png")));
		label.setBounds(657, -23, 125, 186);
		frmEventos.getContentPane().add(label);
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
	
}