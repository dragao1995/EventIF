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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividades window = new TelaAtividades();
					window.frmEventos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAtividades() {
		initialize();
	}
  
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventos = new JFrame();
		frmEventos.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaAtividades.class.getResource("/view/if.png")));
		frmEventos.setTitle("EventIF");
		frmEventos.getContentPane().setBackground(new Color(0, 128, 0));
		frmEventos.getContentPane().setForeground(new Color(0, 0, 0));
		frmEventos.setBackground(new Color(0, 128, 0));
		frmEventos.setBounds(100, 100, 800, 600);
		frmEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventos.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 103, 610, 424);
		frmEventos.getContentPane().add(scrollPane);
		  
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		table.setBackground(new Color(0, 128, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Atividade", "Tema", "Horario", "Data", "Local", "Ministrante"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(137);
		table.getColumnModel().getColumn(5).setPreferredWidth(97);
		scrollPane.setViewportView(table);
		
		JButton btnAdicionar = new JButton("ADD");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnAdicionar.setBounds(656, 186, 89, 34);
		frmEventos.getContentPane().add(btnAdicionar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnEditar.setBounds(656, 254, 89, 34);
		frmEventos.getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(656, 322, 89, 34);
		frmEventos.getContentPane().add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnVoltar.setBounds(656, 492, 107, 35);
		frmEventos.getContentPane().add(btnVoltar);
		
		JLabel lblAtividades = new JLabel("Atividades");
		lblAtividades.setForeground(new Color(255, 0, 0));
		lblAtividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		lblAtividades.setBounds(261, 27, 168, 49);
		frmEventos.getContentPane().add(lblAtividades);
		
		JButton btnInscrever = new JButton("Inscrever");
		btnInscrever.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnInscrever.setBounds(656, 120, 89, 34);
		frmEventos.getContentPane().add(btnInscrever);
	}
}