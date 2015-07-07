package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDEvento;

public class ControlTelaADDEvento {

 TelaADDEvento telaADDEvento = new TelaADDEvento();
 ControlTelaLogin controlTelaLogin;
 public ControlTelaADDEvento(ControlTelaLogin controlTelaLogin){
 	this.controlTelaLogin = controlTelaLogin;
 }
	public  void EventosTelaADDEvento(){
		telaADDEvento.getBtnConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.evento.setNome(telaADDEvento.getTxtNomeev().getText());
				controlTelaLogin.evento.setData_Inicio(telaADDEvento.getTxtDatainicial().getText());
				controlTelaLogin.evento.setData_Fim(telaADDEvento.getTxtDataf().getText());
				controlTelaLogin.evento.setOrganizador(telaADDEvento.getTextOrganizador().getText());
				controlTelaLogin.evento.setDescricao(telaADDEvento.getTxtDescricao().getText());
				controlTelaLogin.evento.getContato().setTelefone(telaADDEvento.getTxtTelefone().getText());
				controlTelaLogin.evento.getContato().setEmail(telaADDEvento.getTxtEmail().getText());
				controlTelaLogin.evento.getEndereco_eve().setLogradouro(telaADDEvento.getTxtEndereco().getText());
				controlTelaLogin.evento.getEndereco_eve().setCep(telaADDEvento.getTxtCep().getText());
				int numeroo =Integer.parseInt(telaADDEvento.getTxtNumero().getText());
				controlTelaLogin.evento.getEndereco_eve().setNumero(numeroo);
				controlTelaLogin.evento.getEndereco_eve().getCidade().setNome(telaADDEvento.getTxtCidade().getText());
				controlTelaLogin.evento.getEndereco_eve().getCidade().getEstado().setUf(telaADDEvento.getTxtUF().getText());
				controlTelaLogin.evento.getEndereco_eve().setBairro(telaADDEvento.getTxtBairro().getText());
			}
		});
		telaADDEvento.getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().dispose();
				controlTelaLogin.controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
			}
		});
	}
	public TelaADDEvento getTelaADDEvento() {
		return telaADDEvento;
	}
	public void setTelaADDEvento(TelaADDEvento telaADDEvento) {
		telaADDEvento = telaADDEvento;
	}
	
}
