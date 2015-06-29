package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaADDAtividades;

public class ControlTelaADDAtividades {
static TelaADDAtividades TelaADDAtividades = new TelaADDAtividades();
	
	
public static void EventosTelaADDAtividades(){
	TelaADDAtividades.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ControlTelaADDAtividades.TelaADDAtividades.getFrmEventif().setVisible(false);
			ControlTelaAtividades.TelaAtividades.getFrmEventos().setVisible(true);
		}
	});
	TelaADDAtividades.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			 
		}
	});
	
	
	
	
	
}
}
