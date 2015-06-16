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
 
public class TelaEventos {

	private JFrame frmEventos;
	private JTextField txtPesquisa;

	/**
	 * Launch the application.
	 */
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
		frmEventos.setTitle("Eventos");
		frmEventos.getContentPane().setBackground(new Color(0, 128, 0));
		frmEventos.getContentPane().setForeground(new Color(0, 0, 0));
		frmEventos.setBackground(new Color(0, 128, 0));
		frmEventos.setBounds(100, 100, 800, 600);
		frmEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEventos.getContentPane().setLayout(null);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBackground(new Color(255, 0, 0));
		txtPesquisa.setBounds(153, 36, 493, 34);
		frmEventos.getContentPane().add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JLabel lblPesquisa = new JLabel("Pesquisa :");
		lblPesquisa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblPesquisa.setBounds(36, 36, 107, 34);
		frmEventos.getContentPane().add(lblPesquisa);
		
		JButton btnPesquisarok = new JButton("");
		btnPesquisarok.setBackground(Color.WHITE);
		btnPesquisarok.setForeground(Color.WHITE);
		btnPesquisarok.setIcon(new ImageIcon(TelaEventos.class.getResource("/view/Symbol_-_Check.png")));
		btnPesquisarok.setBounds(656, 36, 83, 34);
		frmEventos.getContentPane().add(btnPesquisarok);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(337, 25, 5, 5);
		frmEventos.getContentPane().add(tabbedPane);
	}
}
