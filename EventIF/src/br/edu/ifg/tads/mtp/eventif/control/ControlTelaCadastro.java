package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

public class ControlTelaCadastro {
	 Pessoa pessoa = new Pessoa();
	 TelaCadastro TelaCadastro = new TelaCadastro();
	 ControlTelaLogin controlTelaLogin;
	 public ControlTelaCadastro(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }

public void EventosTelaCadastro(){
		
	TelaCadastro.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			pessoa.setNome(TelaCadastro.getTxtNome().getText());
			pessoa.setRg(TelaCadastro.getTxtRg().getText());
			pessoa.setCpf(TelaCadastro.getTxtCpf().getText());
		}
	});
	TelaCadastro.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.EventosTelaLogin();
			TelaCadastro.getFrame().dispose();
			
		}
	});
	
}}