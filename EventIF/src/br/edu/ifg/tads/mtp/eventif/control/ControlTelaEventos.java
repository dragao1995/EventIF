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
				telaEventos.getFrmEventos().dispose();
				try{
					int linhaselect = telaEventos.getTable().getSelectedRow();
					int ID_evento= Integer.parseInt(telaEventos.getTable().getValueAt(linhaselect, 0).toString());
					
					controlTelaLogin.evento.setIdEvento((long)ID_evento);
					System.out.println(ID_evento);
					Evento eve = controlTelaLogin.eventoDao.buscar_evento(controlTelaLogin.evento);
					
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.initialize();
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getFrmCadastrarEvento().setVisible(true);
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTextOrganizador().setText(eve.getOrganizador());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtDescricao().setText(eve.getDescricao());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtTelefone().setText(""+eve.getContato().getTelefone());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtEmail().setText(eve.getContato().getEmail());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtEndereco().setText(eve.getEndereco_eve().getLogradouro());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtCep().setText(eve.getEndereco_eve().getCep());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtNumero().setText(""+eve.getEndereco_eve().getNumero());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtCidade().setText(eve.getEndereco_eve().getCidade().getNome());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtUF().setText(eve.getEndereco_eve().getCidade().getEstado().getUf());
				controlTelaLogin.controlTelaADDEvento.telaADDEvento.getTxtBairro().setText(eve.getEndereco_eve().getBairro());
				controlTelaLogin.controlTelaEventos.preencheTabela();	
				controlTelaLogin.eventoDao.altera_Evento(eve);
				}catch(ArrayIndexOutOfBoundsException e){
					JOptionPane.showMessageDialog(null, "Escolha um evento!");
				}
			}
		});
		telaEventos.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				int linhaselect = telaEventos.getTable().getSelectedRow();
				int ID_evento= Integer.parseInt(telaEventos.getTable().getValueAt(linhaselect, 0).toString());
				
				controlTelaLogin.evento.setIdEvento((long)ID_evento);
				System.out.println(ID_evento);
				Evento eve = controlTelaLogin.eventoDao.buscar_evento(controlTelaLogin.evento);
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
