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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEventos window = new TelaEventos();
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
	public TelaEventos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEventos = new JFrame();
		frmEventos.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaEventos.class.getResource("/view/if.png")));
		frmEventos.setTitle("EventIF");
		frmEventos.getContentPane().setBackground(new Color(0, 128, 0));
		frmEventos.getContentPane().setForeground(new Color(0, 0, 0));
		frmEventos.setBackground(new Color(0, 128, 0));
		frmEventos.setBounds(100, 100, 800, 600);
		frmEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventos.getContentPane().setLayout(null);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(153, 36, 493, 34);
		txtPesquisa.setBackground(new Color(255, 0, 0));
		frmEventos.getContentPane().add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JLabel lblPesquisa = new JLabel("Pesquisa :");
		lblPesquisa.setBounds(36, 36, 107, 34);
		lblPesquisa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		frmEventos.getContentPane().add(lblPesquisa);
		
		JButton btnPesquisarok = new JButton("");
		btnPesquisarok.setBounds(656, 36, 83, 34);
		btnPesquisarok.setBackground(Color.WHITE);
		btnPesquisarok.setForeground(Color.WHITE);
		btnPesquisarok.setIcon(new ImageIcon(TelaEventos.class.getResource("/view/Symbol_-_Check.png")));
		frmEventos.getContentPane().add(btnPesquisarok);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 103, 610, 424);
		frmEventos.getContentPane().add(scrollPane);
		  
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		table.setShowVerticalLines(false);
		table.setBackground(new Color(0, 128, 0));
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
		
		JButton btnAdicionar = new JButton("ADD");
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnAdicionar.setBounds(656, 129, 83, 34);
		frmEventos.getContentPane().add(btnAdicionar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnEditar.setBounds(656, 184, 83, 34);
		frmEventos.getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnExcluir.setBounds(656, 233, 83, 34);
		frmEventos.getContentPane().add(btnExcluir);
		
		JButton btnAtividades = new JButton("Atividades");
		btnAtividades.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnAtividades.setBounds(656, 492, 107, 35);
		frmEventos.getContentPane().add(btnAtividades);
	}
}
