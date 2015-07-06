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
				controlTelaLogin.evento.setNome(TelaADDEvento.getTxtNomeev().getText());
				controlTelaLogin.evento.setData_Inicio(TelaADDEvento.getTxtDatainicial().getText());
				controlTelaLogin.evento.setData_Fim(TelaADDEvento.getTxtDataf().getText());
				controlTelaLogin.evento.setOrganizador(TelaADDEvento.getTextOrganizador().getText());
				controlTelaLogin.evento.setDescricao(TelaADDEvento.getTxtDescricao().getText());
				
			}
		});
		TelaADDEvento.getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDEvento.TelaADDEvento.getFrmCadastrarEvento().dispose();
				controlTelaLogin.controlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
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
