package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.view.TelaLogin;

public class ControlTelaLogin {
	TelaLogin TelaLogin = new TelaLogin();
	ControlTelaEventos ControlTelaEventos = new ControlTelaEventos(this);
	ControlTelaCadastro ControlTelaCadastro = new ControlTelaCadastro(this);
	ControlTelaAtividades ControlTelaAtividades = new ControlTelaAtividades(this);
	ControlTelaADDEvento ControlTelaADDEvento = new ControlTelaADDEvento(this);
	ControlTelaADDAtividades ControlTelaADDAtividades = new ControlTelaADDAtividades(this);
	

public void EventosTelaLogin() {
		
		ControlTelaCadastro.EventosTelaCadastro();
		ControlTelaEventos.EventosTelaEventos();
		ControlTelaAtividades.EventosTelaAtividades();
		ControlTelaEventos.EventosTelaEventos();
		ControlTelaADDEvento.EventosTelaADDEvento();
		ControlTelaADDAtividades.EventosTelaADDAtividades();
		TelaLogin.getFrameLogin().setVisible(true);
		TelaLogin.getBtnCadastro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ControlTelaCadastro.TelaCadastro.getFrame().setVisible(true);
				TelaLogin.getFrameLogin().dispose();  
			}
		});

		TelaLogin.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (TelaLogin.getRdbtnGerente().isSelected() || TelaLogin.getRdbtnMonitor().isSelected() ||TelaLogin.getRdbtnParticipante().isSelected()) {			
					ControlTelaEventos.TelaEventos.getBtnAdicionar().setVisible(false);
					ControlTelaEventos.TelaEventos.getBtnExcluir().setVisible(false);
					ControlTelaEventos.TelaEventos.getBtnEditar().setVisible(false);
					ControlTelaAtividades.TelaAtividades.getBtnAdicionar().setVisible(false);
					ControlTelaAtividades.TelaAtividades.getBtnEditar().setVisible(false);
					ControlTelaAtividades.TelaAtividades.getBtnExcluir().setVisible(false);
					if (TelaLogin.getRdbtnGerente().isSelected()) {
					ControlTelaEventos.TelaEventos.getBtnAdicionar().setVisible(true);
					ControlTelaEventos.TelaEventos.getBtnExcluir().setVisible(true);
					ControlTelaEventos.TelaEventos.getBtnEditar().setVisible(true);
					ControlTelaAtividades.TelaAtividades.getBtnAdicionar().setVisible(true);
					ControlTelaAtividades.TelaAtividades.getBtnEditar().setVisible(true);
					ControlTelaAtividades.TelaAtividades.getBtnExcluir().setVisible(true);
				}
				if ( TelaLogin.getRdbtnMonitor().isSelected() ) {
					ControlTelaEventos.TelaEventos.getBtnLerQrcode().setVisible(true);
					ControlTelaAtividades.TelaAtividades.getBtnLerQrcode().setVisible(true);
				}
				
				ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
				TelaLogin.getFrameLogin().dispose();  
				}else {
					
					JOptionPane.showMessageDialog(null, "Selecione o modulo");
				}
			}
		});
	}
}
