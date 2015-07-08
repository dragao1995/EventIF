package br.edu.ifg.tads.mtp.eventif.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;
import br.edu.ifg.tads.mtp.eventif.util.Cracha;

public class TelaGerarCracha {
	ControlTelaLogin ccontrolTelaLogin;
	Cracha cracha = new Cracha();
	private JFrame frame;
	public JLabel llblNome;
	JLabel lblQr = new JLabel("");
	
	
	
	public TelaGerarCracha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(TelaGerarCracha.class.getResource("/br/edu/ifg/tads/mtp/eventif/view/if.png")));
		lblIcon.setBounds(22, 11, 148, 148);
		frame.getContentPane().add(lblIcon);
		
		JLabel lblEventif = new JLabel("EventIF");
		lblEventif.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblEventif.setBounds(182, 88, 127, 31);
		frame.getContentPane().add(lblEventif);
		
		frame.setBounds(100, 100, 441, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	public void cracha() throws IOException{
		lblQr.setIcon(new ImageIcon("D:\\ifg2015.png"));
		lblQr.setBounds(115, 243, 194, 160);
		frame.getContentPane().add(lblQr);
		frame.getContentPane().add(llblNome);
		frame.setVisible(true);
		Print();
	
	}
	
	
	public void Print() throws IOException {
		cracha.Nome();  
			// criar imagem em memória  
	        int width = frame.getWidth();  
	        int height = frame.getHeight();  
	        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);  
	        // obter contexto gráfico da imagem  
	        Graphics graphics = image.getGraphics();  
	        frame.paintAll(graphics);  
	        graphics.dispose();  
	        // salvar imagem  
	        ImageIO.write(image, "png", new FileOutputStream("D:/eventIF/"+cracha.line+".png"));
	}  


	public JLabel getLlblNome() {
		return llblNome;
	}

	public void setLlblNome(JLabel llblNome) {
		this.llblNome = llblNome;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
