package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.edu.ifg.tads.mtp.eventif.view.TelaADDMonitor;

public class ControlTelaADDMonitor {
	TelaADDMonitor telaADDMonitor = new TelaADDMonitor();
	ControlTelaLogin controlTelaLogin;
	int ID_Atividade;

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
				try{
					int linhaselect = telaADDMonitor.getTable().getSelectedRow();
					ID_Atividade= Integer.parseInt(telaADDMonitor.getTable().getValueAt(linhaselect, 0).toString());
					
					controlTelaLogin.atividade.setIdAtividade((long)ID_Atividade);
					System.out.println(ID_Atividade);
					controlTelaLogin.atividade = controlTelaLogin.eventoDao.buscar_Atividade(controlTelaLogin.atividade);
					controlTelaLogin.controlTelaAtividades.telaAtividades
						.getFrmEventos().setVisible(true);
				telaADDMonitor.getFrmEventif().dispose();
					
					controlTelaLogin.controlTelaAtividades.preencheTabela();
					}catch(ArrayIndexOutOfBoundsException e){
						JOptionPane.showMessageDialog(null, "Escolha uma atividade!");
					}
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
			telaADDMonitor.getTable().getColumn("idPessoa").setMaxWidth(25);
			//new ButtonColumn(contatoView.getTable(),alterarAction, 5); 
			//new ButtonColumn(contatoView.getTable(),excluirAction, 6);
			//procurar como trazer vetor em tabela
	
	}
	

}
