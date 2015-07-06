package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.model.Contato;
import br.edu.ifg.tads.mtp.eventif.model.Endereco_Pessoa;
import br.edu.ifg.tads.mtp.eventif.model.Estado;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.view.TelaLogin;

public class ControlTelaLogin {
	Evento evento = new Evento();
	TelaLogin TelaLogin = new TelaLogin();
	 Pessoa pessoa = new Pessoa();
	 Contato contato = new Contato();
	 Estado estado = new Estado();
	 Endereco_Pessoa endereco_Pessoa = new Endereco_Pessoa();
	ControlTelaEventos controlTelaEventos = new ControlTelaEventos(this);
	ControlTelaCadastro controlTelaCadastro = new ControlTelaCadastro(this);
	ControlTelaAtividades controlTelaAtividades = new ControlTelaAtividades(this);
	ControlTelaADDEvento controlTelaADDEvento = new ControlTelaADDEvento(this);
	ControlTelaADDAtividades controlTelaADDAtividades = new ControlTelaADDAtividades(this);
	

public void EventosTelaLogin() {
		
		controlTelaCadastro.EventosTelaCadastro();
		controlTelaEventos.EventosTelaEventos();
		controlTelaAtividades.EventosTelaAtividades();
		controlTelaEventos.EventosTelaEventos();
		controlTelaADDEvento.EventosTelaADDEvento();
		controlTelaADDAtividades.EventosTelaADDAtividades();
		TelaLogin.getFrameLogin().setVisible(true);
		TelaLogin.getBtnCadastro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controlTelaCadastro.TelaCadastro.getFrame().setVisible(true);
				TelaLogin.getFrameLogin().dispose();  
			}
		});

		TelaLogin.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (TelaLogin.getRdbtnGerente().isSelected() || TelaLogin.getRdbtnMonitor().isSelected() ||TelaLogin.getRdbtnParticipante().isSelected()) {			
					controlTelaEventos.TelaEventos.getBtnAdicionar().setVisible(false);
					controlTelaEventos.TelaEventos.getBtnExcluir().setVisible(false);
					controlTelaEventos.TelaEventos.getBtnEditar().setVisible(false);
					controlTelaAtividades.TelaAtividades.getBtnAdicionar().setVisible(false);
					controlTelaAtividades.TelaAtividades.getBtnEditar().setVisible(false);
					controlTelaAtividades.TelaAtividades.getBtnExcluir().setVisible(false);
					if (TelaLogin.getRdbtnGerente().isSelected()) {
					controlTelaEventos.TelaEventos.getBtnAdicionar().setVisible(true);
					controlTelaEventos.TelaEventos.getBtnExcluir().setVisible(true);
					controlTelaEventos.TelaEventos.getBtnEditar().setVisible(true);
					controlTelaAtividades.TelaAtividades.getBtnAdicionar().setVisible(true);
					controlTelaAtividades.TelaAtividades.getBtnEditar().setVisible(true);
					controlTelaAtividades.TelaAtividades.getBtnExcluir().setVisible(true);
				}
				if ( TelaLogin.getRdbtnMonitor().isSelected() ) {
					controlTelaEventos.TelaEventos.getBtnLerQrcode().setVisible(true);
					controlTelaAtividades.TelaAtividades.getBtnLerQrcode().setVisible(true);
				}
				
				controlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
				TelaLogin.getFrameLogin().dispose();  
				}else {
					
					JOptionPane.showMessageDialog(null, "Selecione o modulo");
				}
			}
		});
	}
}
