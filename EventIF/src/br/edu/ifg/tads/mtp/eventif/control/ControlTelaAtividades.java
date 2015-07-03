package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.util.LerQrcode;
import br.edu.ifg.tads.mtp.eventif.view.TelaAtividades;



public class ControlTelaAtividades {
  TelaAtividades TelaAtividades=new TelaAtividades();
  ControlTelaLogin controlTelaLogin;
  public ControlTelaAtividades(ControlTelaLogin controlTelaLogin){
  	this.controlTelaLogin = controlTelaLogin;
  }
 
 public void EventosTelaAtividades(){
	 TelaAtividades.getBtnAdicionar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.ControlTelaADDAtividades.TelaADDAtividades.getFrmEventif().setVisible(true);
			controlTelaLogin.ControlTelaAtividades.TelaAtividades.getFrmEventos().dispose();
			
		}
	});
	 TelaAtividades.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 TelaAtividades.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 TelaAtividades.getBtnInscrever().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 TelaAtividades.getBtnVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
				controlTelaLogin.ControlTelaAtividades.TelaAtividades.getFrmEventos().dispose();
			}
		});
	 
	 TelaAtividades.getBtnLerQrcode().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				LerQrcode.TelaWebcam();
			}
	});
	 
 }
}
