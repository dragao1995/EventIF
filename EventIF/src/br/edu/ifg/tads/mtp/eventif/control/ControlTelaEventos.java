package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.edu.ifg.tads.mtp.eventif.view.TelaEventos;
import br.edu.ifg.tads.mtp.eventif.main.main;



public class ControlTelaEventos {
static TelaEventos TelaEventos = new TelaEventos();


public static void EventosTelaEventos(){
	TelaEventos.getBtnPesquisarok().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	});
	TelaEventos.getBtnAdicionar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ControlTelaADDEvento.TelaADDEvento.getFrmCadastrarEvento().setVisible(true);
			ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(false);
			
			
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
			ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(false);
		}
	});
	TelaEventos.getBtnAtividades().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ControlTelaAtividades.TelaAtividades.getFrmEventos().setVisible(true);
			ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(false);
			
		}
	});
	
}

}
