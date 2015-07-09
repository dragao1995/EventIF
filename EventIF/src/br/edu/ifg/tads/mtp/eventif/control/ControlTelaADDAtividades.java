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
						controlTelaLogin.atividade.setCarga_Horaria(telaADDAtividades.getTxtCargahor().getText());
						controlTelaLogin.atividade.setHora_Inicio(telaADDAtividades.getTxtHorainicial().getText());
						controlTelaLogin.atividade.setHora_Fim(telaADDAtividades.getTxtHorafinal().getText());
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
						
					}
				});

	}
}
