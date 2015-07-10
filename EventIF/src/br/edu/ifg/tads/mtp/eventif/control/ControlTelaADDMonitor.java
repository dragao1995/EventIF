package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDMonitor;

public class ControlTelaADDMonitor {
	TelaADDMonitor telaADDMonitor = new TelaADDMonitor();
	ControlTelaLogin controlTelaLogin;

	public ControlTelaADDMonitor(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }
	
	public void EventosTelaADDMonitor(){
		telaADDMonitor.getBtnPesquisarok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		telaADDMonitor.getBtnEscolher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		telaADDMonitor.getBtnVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDMonitor.telaADDMonitor.getFrmEventif().dispose();
				controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().setVisible(true);
			}
		});
	}

}
