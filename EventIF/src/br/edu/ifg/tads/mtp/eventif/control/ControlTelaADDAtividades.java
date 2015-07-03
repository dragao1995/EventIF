package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDAtividades;

public class ControlTelaADDAtividades {
	TelaADDAtividades TelaADDAtividades = new TelaADDAtividades();
	ControlTelaLogin controlTelaLogin;

	public ControlTelaADDAtividades(ControlTelaLogin controlTelaLogin) {
		this.controlTelaLogin = controlTelaLogin;
	};

	public void EventosTelaADDAtividades() {
		TelaADDAtividades.getBtnCancelar().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						controlTelaLogin.ControlTelaADDAtividades.TelaADDAtividades
								.getFrmEventif().setVisible(false);
						controlTelaLogin.ControlTelaAtividades.TelaAtividades
								.getFrmEventos().setVisible(true);
					}
				});
		TelaADDAtividades.getBtnConfirmar().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

					}
				});

	}
}
