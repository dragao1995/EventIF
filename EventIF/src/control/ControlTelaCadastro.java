package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.main;
import view.TelaCadastro;
public class ControlTelaCadastro {
	
	static TelaCadastro windowTC = new TelaCadastro();


public static void EventosTelaCadastro(){
		
	windowTC.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	windowTC.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			main.chamarlogin();
			windowTC.getFrame().setVisible(false);
			
		}
	});
	
}}