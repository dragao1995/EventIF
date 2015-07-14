package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDMonitor;

public class ControlTelaADDMonitor {
	TelaADDMonitor telaADDMonitor = new TelaADDMonitor();
	ControlTelaLogin controlTelaLogin;

	public ControlTelaADDMonitor(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }
	
	public void EventosTelaADDMonitor(){
		telaADDMonitor.getBtnPesquisarok().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		telaADDMonitor.getBtnEscolher().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		telaADDMonitor.getBtnVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlTelaLogin.controlTelaADDMonitor.preencheTabela();
				controlTelaLogin.controlTelaADDMonitor.telaADDMonitor.getFrmEventif().dispose();
				controlTelaLogin.controlTelaAtividades.telaAtividades.getFrmEventos().setVisible(true);
			}
		});
	}
	public void preencheTabela(){
		
		Vector<Vector<String>> listaContatos = controlTelaLogin.pessoaDAO.buscar();
		preencheTabela(listaContatos);
			
}
	public void preencheTabela(Vector<Vector<String>> listaContatos){
	
			telaADDMonitor.getTable().clearSelection();
			telaADDMonitor.getTable().removeAll();
			
			Vector<String> colunas = new Vector<String>();
			colunas.add("idPessoa");
			colunas.add("nome");
			colunas.add("cpf");
			//colunas.add("rg");
			//colunas.add("Data Inico");
			//colunas.add("Data Fim");
			
			DefaultTableModel model = new DefaultTableModel(listaContatos, colunas);
			telaADDMonitor.getTable().setModel(model);
			telaADDMonitor.getTable().getColumn("idPesso").setMaxWidth(25);
			//new ButtonColumn(contatoView.getTable(),alterarAction, 5); 
			//new ButtonColumn(contatoView.getTable(),excluirAction, 6);
			//procurar como trazer vetor em tabela
	
	}
	

}
