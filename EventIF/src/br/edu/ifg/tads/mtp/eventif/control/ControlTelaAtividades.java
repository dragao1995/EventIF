package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
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
			System.out.println(controlTelaLogin.controlTelaEventos.ID_evento);
			controlTelaLogin.eventoDao.idEvento=controlTelaLogin.controlTelaEventos.ID_evento;
			controlTelaLogin.evento = controlTelaLogin.eventoDao.buscar_evento(controlTelaLogin.evento);
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
				
				try{
					controlTelaLogin.eventoDao.idEvento=controlTelaLogin.controlTelaEventos.ID_evento;
					int linhaselect = telaAtividades.getTable().getSelectedRow();
					int ID_ativ= Integer.parseInt(telaAtividades.getTable().getValueAt(linhaselect, 0).toString());
					controlTelaLogin.eventoDao.idAtividade=ID_ativ;
					controlTelaLogin.eventoDao.remove_atividade(controlTelaLogin.eventoDao.atividade);
					
					
					}catch(ArrayIndexOutOfBoundsException e){
						JOptionPane.showMessageDialog(null, "Escolha uma atividade!");
					}
					controlTelaLogin.controlTelaEventos.preencheTabela();	
				
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
		
		Vector<Vector<String>> listaContatos = controlTelaLogin.eventoDao.buscaAtividade(controlTelaLogin.evento);
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
	colunas.add("Data");
	//colunas.add("Data Fim");
	
	DefaultTableModel model = new DefaultTableModel(listaContatos, colunas);
	telaAtividades.getTable().setModel(model);
	telaAtividades.getTable().getColumn("idAtividade").setMaxWidth(25);
	//new ButtonColumn(contatoView.getTable(),alterarAction, 5); 
	//new ButtonColumn(contatoView.getTable(),excluirAction, 6);
	//procurar como trazer vetor em tabela
	
}
}
