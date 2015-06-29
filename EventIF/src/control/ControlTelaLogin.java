package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaCadastro;
import view.TelaLogin;

public class ControlTelaLogin {
	static TelaLogin tl = new TelaLogin();
	static ControlTelaCadastro windowTC = new ControlTelaCadastro();
	
	

	public static void EventosTelaLogin() {
		windowTC.EventosTelaCadastro();
		ControlTelaEventos.EventosTelaEventos();
		ControlTelaAtividades.EventosTelaAtividades();
		ControlTelaEventos.EventosTelaEventos();
		ControlTelaADDEvento.EventosTelaADDEvento();
		ControlTelaADDAtividades.EventosTelaADDAtividades();
		
		tl.getFrameLogin().setVisible(true);
		tl.getBtnCadastro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlTelaCadastro.windowTC.getFrame().setVisible(true);
				tl.getFrameLogin().setVisible(false);
				
			}
		});

		tl.getBtnLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
				tl.getFrameLogin().setVisible(false);
			}
		});

	}
}
