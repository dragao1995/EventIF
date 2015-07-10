package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.util.LerQrcode;
import br.edu.ifg.tads.mtp.eventif.view.TelaAtividades;



public class ControlTelaAtividades {
  TelaAtividades telaAtividades=new TelaAtividades();
  ControlTelaLogin controlTelaLogin;
  public ControlTelaAtividades(ControlTelaLogin controlTelaLogin){
  	this.controlTelaLogin = controlTelaLogin;
  }
 
 public void EventosTelaAtividades(){
	 telaAtividades.getBtnAdicionar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.controlTelaADDAtividades.telaADDAtividades.getFrmEventif().setVisible(true);
			controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().dispose();
			
		}
	});
	 telaAtividades.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 telaAtividades.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 telaAtividades.getBtnInscrever().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 telaAtividades.getBtnVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
				controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().dispose();
			}
		});
	 
	 telaAtividades.getBtnLerQrcode().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				LerQrcode.TelaWebcam();
			}
	});
	 
	 telaAtividades.getBtnAddMonitor().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					controlTelaLogin.controlTelaADDMonitor.telaADDMonitor.getFrmEventif().setVisible(true);
					controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().dispose();
				}
		});
 }
}
