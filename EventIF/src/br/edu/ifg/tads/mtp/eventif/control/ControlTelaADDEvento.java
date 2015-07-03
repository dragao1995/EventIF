package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDEvento;



public class ControlTelaADDEvento {
 TelaADDEvento TelaADDEvento = new TelaADDEvento();
 ControlTelaLogin controlTelaLogin;
 public ControlTelaADDEvento(ControlTelaLogin controlTelaLogin){
 	this.controlTelaLogin = controlTelaLogin;
 }
	public  void EventosTelaADDEvento(){
		TelaADDEvento.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		TelaADDEvento.getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.ControlTelaADDEvento.TelaADDEvento.getFrmCadastrarEvento().dispose();
				controlTelaLogin.ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
			}
		});
	}
	public TelaADDEvento getTelaADDEvento() {
		return TelaADDEvento;
	}
	public void setTelaADDEvento(TelaADDEvento telaADDEvento) {
		TelaADDEvento = telaADDEvento;
	}
	
}
