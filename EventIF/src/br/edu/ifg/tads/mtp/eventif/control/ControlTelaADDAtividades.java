package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDAtividades;

public class ControlTelaADDAtividades {
	TelaADDAtividades telaADDAtividades = new TelaADDAtividades();
	ControlTelaLogin controlTelaLogin;

	public ControlTelaADDAtividades(ControlTelaLogin controlTelaLogin) {
		this.controlTelaLogin = controlTelaLogin;
	};

	public void EventosTelaADDAtividades() {
		telaADDAtividades.getBtnCancelar().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						controlTelaLogin.controlTelaADDAtividades.telaADDAtividades.getFrmEventif().dispose();
						controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().setVisible(true);
					}
				});
		telaADDAtividades.getBtnConfirmar().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						controlTelaLogin.atividade.setDescricao(telaADDAtividades.getTxtDescricao().getText());
						controlTelaLogin.atividade.setCarga_Horaria(Integer.parseInt(telaADDAtividades.getTxtCargahor().getText()));
						SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");  
					   	java.util.Date date1 = null,date2 = null;
					   	long tempototal = 0;
						try {
							date1 = sdf.parse(telaADDAtividades.getTxtHorainicial().getText());
							date2=sdf.parse(telaADDAtividades.getTxtHorafinal().getText());
							tempototal = date2.getTime() - date1.getTime();
						} catch (ParseException e1) {}
					      
						controlTelaLogin.atividade.setHora_Inicio(date1);
						controlTelaLogin.atividade.setHora_Fim(date2);
						controlTelaLogin.atividade.setTempo_total(tempototal);
						int nuneroVagas = Integer.parseInt(telaADDAtividades.getTxtNvagas().getText());
						controlTelaLogin.atividade.setNumero_Vagas(nuneroVagas);
						controlTelaLogin.atividade.getTipo().setTipo_Atividade((String) telaADDAtividades.getComboBoxTipo().getSelectedItem());
						controlTelaLogin.atividade.setNome(telaADDAtividades.getTxtNomeativ().getText());
						controlTelaLogin.atividade.setMinistrante(telaADDAtividades.getTxtMinistrante().getText());
						SimpleDateFormat formater = new SimpleDateFormat("yyyy/mm/dd");
						Date datas = null;
						try {
							datas = new Date ((formater.parse(telaADDAtividades.getTxtData().getText())).getTime());
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						controlTelaLogin.atividade.setData(datas);
						controlTelaLogin.eventoDao.inserir_Atividade(controlTelaLogin.atividade);
						controlTelaLogin.controlTelaADDAtividades.telaADDAtividades.getFrmEventif().dispose();
						controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().setVisible(true);
						
					}
				});

	}
}
