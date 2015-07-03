package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.main.main;
import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

public class ControlTelaCadastro {
	
	 TelaCadastro TelaCadastro = new TelaCadastro();
	 ControlTelaLogin controlTelaLogin;
	 public ControlTelaCadastro(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }

public void EventosTelaCadastro(){
		
	TelaCadastro.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	TelaCadastro.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.EventosTelaLogin();
			TelaCadastro.getFrame().dispose();
			
		}
	});
	
}}