package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.edu.ifg.tads.mtp.eventif.util.LerQrcode;
import br.edu.ifg.tads.mtp.eventif.view.TelaEventos;

public class ControlTelaEventos {
	int cont = 1;
	TelaEventos TelaEventos = new TelaEventos();

	ControlTelaLogin controlTelaLogin;

	public ControlTelaEventos(ControlTelaLogin controlTelaLogin) {

		this.controlTelaLogin = controlTelaLogin;
	}

	public void EventosTelaEventos() {
		TelaEventos.getBtnPesquisarok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		TelaEventos.getBtnAdicionar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDEvento.TelaADDEvento
						.getFrmCadastrarEvento().setVisible(true);
				TelaEventos.getFrmEventos().dispose();

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
				controlTelaLogin.EventosTelaLogin();
				TelaEventos.getFrmEventos().dispose();
			}
		});
		TelaEventos.getBtnAtividades().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaAtividades.TelaAtividades
						.getFrmEventos().setVisible(true);
				TelaEventos.getFrmEventos().dispose();

			}
		});
		TelaEventos.getBtnLerQrcode().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cont % 2 == 1) {
					LerQrcode.TelaWebcam();
				}
				cont++;
			}
		});
	}

}
