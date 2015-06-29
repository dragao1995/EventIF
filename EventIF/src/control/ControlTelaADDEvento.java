package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaADDEvento;

public class ControlTelaADDEvento {
static TelaADDEvento TelaADDEvento = new TelaADDEvento();

	public static void EventosTelaADDEvento(){
		TelaADDEvento.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		TelaADDEvento.getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlTelaADDEvento.TelaADDEvento.getFrmCadastrarEvento().setVisible(false);
				ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
			}
		});
	}
}
