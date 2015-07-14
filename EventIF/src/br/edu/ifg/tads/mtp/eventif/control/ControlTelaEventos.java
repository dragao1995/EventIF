package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.util.LerQrcode;
import br.edu.ifg.tads.mtp.eventif.view.TelaEventos;

public class ControlTelaEventos {
	
	TelaEventos telaEventos = new TelaEventos();
	ControlTelaLogin controlTelaLogin;
	//private Action alterarAction;
	//private Action excluirAction;

	public ControlTelaEventos(ControlTelaLogin controlTelaLogin) {

		this.controlTelaLogin = controlTelaLogin;
	}

	public void EventosTelaEventos() {
		telaEventos.getBtnPesquisarok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		telaEventos.getBtnAdicionar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.initialize();
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().repaint();
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().setVisible(true);
				telaEventos.getFrmEventos().dispose();

			}
		});
		telaEventos.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		telaEventos.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				int linhaselect = telaEventos.getTable().getSelectedRow();
				int ID_evento= Integer.parseInt(telaEventos.getTable().getValueAt(linhaselect, 0).toString());
				Evento e = new Evento();
				e.setIdEvento((long)ID_evento);
				System.out.println(ID_evento);
				Evento eve = controlTelaLogin.eventoDao.buscar_evento(e);
				controlTelaLogin.eventoDao.remove_evento(eve);
				
				}catch(ArrayIndexOutOfBoundsException e){
					JOptionPane.showMessageDialog(null, "Escolha um evento!");
				}
				controlTelaLogin.controlTelaEventos.preencheTabela();	
			}
		});
		telaEventos.getBtnLogout().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.Login();
				telaEventos.getFrmEventos().dispose();
			}
		});
		telaEventos.getBtnAtividades().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaAtividades.preencheTabela();
				System.out.println("bbb");
				controlTelaLogin.controlTelaAtividades.telaAtividades
						.getFrmEventos().setVisible(true);
				telaEventos.getFrmEventos().dispose();

			}
		});
		telaEventos.getBtnLerQrcode().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					LerQrcode.TelaWebcam();
			}
		});
	}
	public void preencheTabela(){
			
			Vector<Vector<String>> listaContatos = controlTelaLogin.eventoDao.buscaEvento();
			preencheTabela(listaContatos);
				
	}
	public void preencheTabela(Vector<Vector<String>> listaContatos){
		
		telaEventos.getTable().clearSelection();
		telaEventos.getTable().removeAll();
		
		Vector<String> colunas = new Vector<String>();
		colunas.add("idEvento");
		colunas.add("nome");
		colunas.add("Descrição");
		colunas.add("Organizador");
		colunas.add("Data Inico");
		colunas.add("Data Fim");
		
		DefaultTableModel model = new DefaultTableModel(listaContatos, colunas);
		telaEventos.getTable().setModel(model);
		telaEventos.getTable().getColumn("idEvento").setMaxWidth(25);
		//new ButtonColumn(contatoView.getTable(),alterarAction, 5); 
		//new ButtonColumn(contatoView.getTable(),excluirAction, 6);
		//procurar como trazer vetor em tabela
		
	}

}
