package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.main.main;
import br.edu.ifg.tads.mtp.eventif.view.TelaEventos;



public class ControlTelaEventos {
TelaEventos TelaEventos = new TelaEventos();

ControlTelaLogin controlTelaLogin;
public ControlTelaEventos(ControlTelaLogin controlTelaLogin){
	this.controlTelaLogin = controlTelaLogin;
}

public  void EventosTelaEventos(){
	TelaEventos.getBtnPesquisarok().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	TelaEventos.getBtnAdicionar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.ControlTelaADDEvento.TelaADDEvento.getFrmCadastrarEvento().setVisible(true);
			TelaEventos.getFrmEventos().setVisible(false);
			
			
		}
	});
	TelaEventos.getBtnEditar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	TelaEventos.getBtnExcluir().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	TelaEventos.getBtnLogout().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			main.chamarlogin();
			TelaEventos.getFrmEventos().setVisible(false);
		}
	});
	TelaEventos.getBtnAtividades().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.ControlTelaAtividades.TelaAtividades.getFrmEventos().setVisible(true);
			TelaEventos.getFrmEventos().setVisible(false);
			
		}
	});
	
}

}
