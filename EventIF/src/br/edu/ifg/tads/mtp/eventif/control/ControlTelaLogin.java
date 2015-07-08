package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.model.Atividade;
import br.edu.ifg.tads.mtp.eventif.model.Contato;
import br.edu.ifg.tads.mtp.eventif.model.Endereco_Pessoa;
import br.edu.ifg.tads.mtp.eventif.model.Estado;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.view.TelaGerarCracha;
import br.edu.ifg.tads.mtp.eventif.view.TelaLogin;

public class ControlTelaLogin {
	Evento evento = new Evento();
	TelaLogin TelaLogin = new TelaLogin();
	 Pessoa pessoa = new Pessoa();
	 Atividade atividade= new Atividade();
	public TelaGerarCracha telaGerarCracha= new TelaGerarCracha();
	public ControlTelaEventos controlTelaEventos = new ControlTelaEventos(this);
	public ControlTelaCadastro controlTelaCadastro = new ControlTelaCadastro(this);
	public ControlTelaAtividades controlTelaAtividades = new ControlTelaAtividades(this);
	public ControlTelaADDEvento controlTelaADDEvento = new ControlTelaADDEvento(this);
	public ControlTelaADDAtividades controlTelaADDAtividades = new ControlTelaADDAtividades(this);
	
	

public void EventosTelaLogin() {
		
		TelaLogin.getFrameLogin().setVisible(true);
		TelaLogin.getBtnCadastro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				controlTelaCadastro.telaCadastro.getFrame().setVisible(true);
				TelaLogin.getFrameLogin().dispose();  
			}
		});

		TelaLogin.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (TelaLogin.getRdbtnGerente().isSelected() || TelaLogin.getRdbtnMonitor().isSelected() ||TelaLogin.getRdbtnParticipante().isSelected()) {			
					controlTelaEventos.telaEventos.getBtnAdicionar().setVisible(false);
					controlTelaEventos.telaEventos.getBtnExcluir().setVisible(false);
					controlTelaEventos.telaEventos.getBtnEditar().setVisible(false);
					controlTelaAtividades.telaAtividades.getBtnAdicionar().setVisible(false);
					controlTelaAtividades.telaAtividades.getBtnEditar().setVisible(false);
					controlTelaAtividades.telaAtividades.getBtnExcluir().setVisible(false);
					if (TelaLogin.getRdbtnGerente().isSelected()) {
					controlTelaEventos.telaEventos.getBtnAdicionar().setVisible(true);
					controlTelaEventos.telaEventos.getBtnExcluir().setVisible(true);
					controlTelaEventos.telaEventos.getBtnEditar().setVisible(true);
					controlTelaAtividades.telaAtividades.getBtnAdicionar().setVisible(true);
					controlTelaAtividades.telaAtividades.getBtnEditar().setVisible(true);
					controlTelaAtividades.telaAtividades.getBtnExcluir().setVisible(true);
				}
				if ( TelaLogin.getRdbtnMonitor().isSelected() ) {
					controlTelaEventos.telaEventos.getBtnLerQrcode().setVisible(true);
					controlTelaAtividades.telaAtividades.getBtnLerQrcode().setVisible(true);
				}
				
				controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
				TelaLogin.getFrameLogin().dispose();  
				}else {
					
					JOptionPane.showMessageDialog(null, "Selecione o modulo");
				}
			}
		});
	}

public void todosEventos(){
	controlTelaCadastro.EventosTelaCadastro();
	controlTelaEventos.EventosTelaEventos();
	controlTelaAtividades.EventosTelaAtividades();
	controlTelaEventos.EventosTelaEventos();
	controlTelaADDEvento.EventosTelaADDEvento();
	controlTelaADDAtividades.EventosTelaADDAtividades();
}
}
