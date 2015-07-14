package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import br.edu.ifg.tads.mtp.eventif.DAO.EventoDao;
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
				SimpleDateFormat formater = new SimpleDateFormat("yyyy/mm/dd");
				Date di = null, df = null;
				try {
					di = new Date ((formater.parse(telaADDEvento.getTxtDatainicial().getText())).getTime());
					df = new Date ((formater.parse(telaADDEvento.getTxtDataf().getText())).getTime());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				controlTelaLogin.evento.setData_Inicio(di);
				controlTelaLogin.evento.setData_Fim(df);
				
				controlTelaLogin.evento.setOrganizador(telaADDEvento.getTextOrganizador().getText());
				controlTelaLogin.evento.setDescricao(telaADDEvento.getTxtDescricao().getText());
				controlTelaLogin.evento.getContato().setTelefone(Long.parseLong(telaADDEvento.getTxtTelefone().getText()));
				controlTelaLogin.evento.getContato().setEmail(telaADDEvento.getTxtEmail().getText());
				controlTelaLogin.evento.getEndereco_eve().setLogradouro(telaADDEvento.getTxtEndereco().getText());
				controlTelaLogin.evento.getEndereco_eve().setCep(telaADDEvento.getTxtCep().getText());
				int numeroo =Integer.parseInt(telaADDEvento.getTxtNumero().getText());
				controlTelaLogin.evento.getEndereco_eve().setNumero(numeroo);
				controlTelaLogin.evento.getEndereco_eve().getCidade().setNome(telaADDEvento.getTxtCidade().getText());
				controlTelaLogin.evento.getEndereco_eve().getCidade().getEstado().setUf(telaADDEvento.getTxtUF().getText());
				controlTelaLogin.evento.getEndereco_eve().setBairro(telaADDEvento.getTxtBairro().getText());
				controlTelaLogin.eventoDao.inserir_evento(controlTelaLogin.evento);
				controlTelaLogin.controlTelaEventos.preencheTabela();
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().dispose();
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().removeAll();
				controlTelaLogin.controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
			}
		});
		telaADDEvento.getBtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().dispose();
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().removeAll();
				controlTelaLogin.controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
			}
		});
	}
	
	
}
