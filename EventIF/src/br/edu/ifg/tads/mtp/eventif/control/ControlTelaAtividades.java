package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import br.edu.ifg.tads.mtp.eventif.DAO.EventoDao;
import br.edu.ifg.tads.mtp.eventif.util.LerQrcode;
import br.edu.ifg.tads.mtp.eventif.view.TelaAtividades;



public class ControlTelaAtividades {
  TelaAtividades telaAtividades=new TelaAtividades();
  ControlTelaLogin controlTelaLogin;
  public ControlTelaAtividades(ControlTelaLogin controlTelaLogin){
  	this.controlTelaLogin = controlTelaLogin;
  }
 
 public void EventosTelaAtividades(){
	 telaAtividades.getBtnAdicionar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			controlTelaLogin.controlTelaADDAtividades.telaADDAtividades.initialize();
			controlTelaLogin.controlTelaADDAtividades.telaADDAtividades.getFrmEventif().setVisible(true);
			controlTelaLogin.controlTelaADDAtividades.telaADDAtividades.getFrmEventif().repaint();
			controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().dispose();
			
		}
	});
	 telaAtividades.getBtnEditar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 telaAtividades.getBtnExcluir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 telaAtividades.getBtnInscrever().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	 telaAtividades.getBtnVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
				controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().dispose();
			}
		});
	 
	 telaAtividades.getBtnLerQrcode().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				LerQrcode.TelaWebcam();
			}
	});
	 
	 telaAtividades.getBtnAddMonitor().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					controlTelaLogin.controlTelaADDMonitor.preencheTabela();
					controlTelaLogin.controlTelaADDMonitor.telaADDMonitor.getFrmEventif().setVisible(true);
					controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().dispose();
				}
		});
 }
 
 public void preencheTabela(){
		
		Vector<Vector<String>> listaContatos = controlTelaLogin.eventoDao.buscaAtividade();
		preencheTabela(listaContatos);
			
}
public void preencheTabela(Vector<Vector<String>> listaContatos){
	
	telaAtividades.getTable().clearSelection();
	telaAtividades.getTable().removeAll();
	
	Vector<String> colunas = new Vector<String>();
	colunas.add("idAtividade");
	colunas.add("nome");
	colunas.add("Descrição");
	colunas.add("Organizador");
	colunas.add("Data Inico");
	colunas.add("Data Fim");
	
	DefaultTableModel model = new DefaultTableModel(listaContatos, colunas);
	telaAtividades.getTable().setModel(model);
	telaAtividades.getTable().getColumn("idAtividade").setMaxWidth(25);
	//new ButtonColumn(contatoView.getTable(),alterarAction, 5); 
	//new ButtonColumn(contatoView.getTable(),excluirAction, 6);
	//procurar como trazer vetor em tabela
	
}
}
