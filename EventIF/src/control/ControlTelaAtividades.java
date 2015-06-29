package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaADDAtividades;
import view.TelaAtividades;

public class ControlTelaAtividades {
 static TelaAtividades TelaAtividades=new TelaAtividades();
 
 
 public static void EventosTelaAtividades(){
	 TelaAtividades.getBtnAdicionar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			ControlTelaADDAtividades.TelaADDAtividades.getFrmEventif().setVisible(true);
			ControlTelaAtividades.TelaAtividades.getFrmEventos().setVisible(false);
			
		}
	});
	 TelaAtividades.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 TelaAtividades.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 TelaAtividades.getBtnInscrever().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 TelaAtividades.getBtnVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControlTelaEventos.TelaEventos.getFrmEventos().setVisible(true);
				ControlTelaAtividades.TelaAtividades.getFrmEventos().setVisible(false);
			}
		});
	 
 }
}
