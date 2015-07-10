package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.edu.ifg.tads.mtp.eventif.util.LerQrcode;
import br.edu.ifg.tads.mtp.eventif.view.TelaEventos;

public class ControlTelaEventos {
	TelaEventos telaEventos = new TelaEventos();

	ControlTelaLogin controlTelaLogin;

	public ControlTelaEventos(ControlTelaLogin controlTelaLogin) {

		this.controlTelaLogin = controlTelaLogin;
	}

	public void EventosTelaEventos() {
		telaEventos.getBtnPesquisarok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		telaEventos.getBtnAdicionar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDEvento.telaADDEvento
						.getFrmCadastrarEvento().setVisible(true);
				telaEventos.getFrmEventos().dispose();

			}
		});
		telaEventos.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		telaEventos.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		telaEventos.getBtnLogout().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.Login();
				telaEventos.getFrmEventos().dispose();
			}
		});
		telaEventos.getBtnAtividades().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("bbb");
				controlTelaLogin.controlTelaAtividades.telaAtividades
						.getFrmEventos().setVisible(true);
				telaEventos.getFrmEventos().dispose();

			}
		});
		telaEventos.getBtnLerQrcode().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					LerQrcode.TelaWebcam();
			}
		});
	}

}
