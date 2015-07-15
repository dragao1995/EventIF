package br.edu.ifg.tads.mtp.eventif.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.DAO.EventoDao;
import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;
import br.edu.ifg.tads.mtp.eventif.model.Atividade;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.util.Mascaras;
import br.edu.ifg.tads.mtp.eventif.util.ValidarLogin;
import br.edu.ifg.tads.mtp.eventif.view.TelaGerarCracha;
import br.edu.ifg.tads.mtp.eventif.view.TelaLogin;

public class ControlTelaLogin {
	Evento evento = new Evento();
	public TelaLogin telaLogin = new TelaLogin();
	public Pessoa pessoa = new Pessoa();
	public Atividade atividade= new Atividade();
	public EventoDao eventoDao= new EventoDao();
	public ValidarLogin validarLogin = new ValidarLogin(this); 
	public Mascaras mascaras= new Mascaras();
	public PessoaDAO pessoaDAO = new PessoaDAO();
	public TelaGerarCracha telaGerarCracha= new TelaGerarCracha();
	public ControlTelaEventos controlTelaEventos = new ControlTelaEventos(this);
	public ControlTelaCadastro controlTelaCadastro = new ControlTelaCadastro(this);
	public ControlTelaAtividades controlTelaAtividades = new ControlTelaAtividades(this);
	public ControlTelaADDEvento controlTelaADDEvento = new ControlTelaADDEvento(this);
	public ControlTelaADDAtividades controlTelaADDAtividades = new ControlTelaADDAtividades(this);
	public ControlTelaADDMonitor controlTelaADDMonitor = new ControlTelaADDMonitor(this);
	public String login="";
	public String senha="";

public void Login() {
	telaLogin.getFrameLogin().setVisible(true);
}

public void todosEventos(){
	
	controlTelaCadastro.EventosTelaCadastro();
	controlTelaEventos.EventosTelaEventos();
	controlTelaAtividades.EventosTelaAtividades();
	controlTelaADDEvento.EventosTelaADDEvento();
	controlTelaADDAtividades.EventosTelaADDAtividades();
	controlTelaADDMonitor.EventosTelaADDMonitor();
	
	telaLogin.getBtnCadastro().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			controlTelaCadastro.telaCadastro.initialize();
			controlTelaCadastro.telaCadastro.getFrame().repaint();
			controlTelaCadastro.telaCadastro.getFrame().setVisible(true);
			telaLogin.getFrameLogin().dispose();  
		}
	});

	telaLogin.getBtnLogin().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			if (telaLogin.getRdbtnGerente().isSelected() || telaLogin.getRdbtnMonitor().isSelected() ||telaLogin.getRdbtnParticipante().isSelected()) {			
				senha = telaLogin.getTxtSenha().getText() ;
				login = telaLogin.getTxtUsuario().getText();

				validarLogin.Validar();
				controlTelaEventos.preencheTabela();
				controlTelaEventos.telaEventos.getBtnAdicionar().setVisible(false);
				controlTelaEventos.telaEventos.getBtnExcluir().setVisible(false);
				controlTelaEventos.telaEventos.getBtnEditar().setVisible(false);
				controlTelaAtividades.telaAtividades.getBtnAdicionar().setVisible(false);
				controlTelaAtividades.telaAtividades.getBtnEditar().setVisible(false);
				controlTelaAtividades.telaAtividades.getBtnExcluir().setVisible(false);
				controlTelaEventos.telaEventos.getBtnLerQrcode().setVisible(false);
				controlTelaAtividades.telaAtividades.getBtnLerQrcode().setVisible(false);
				controlTelaAtividades.telaAtividades.getBtnAddMonitor().setVisible(false);
				if (telaLogin.getRdbtnGerente().isSelected()) {
				controlTelaEventos.telaEventos.getBtnAdicionar().setVisible(true);
				controlTelaEventos.telaEventos.getBtnExcluir().setVisible(true);
				controlTelaEventos.telaEventos.getBtnEditar().setVisible(true);
				controlTelaAtividades.telaAtividades.getBtnAdicionar().setVisible(true);
				controlTelaAtividades.telaAtividades.getBtnEditar().setVisible(true);
				controlTelaAtividades.telaAtividades.getBtnExcluir().setVisible(true);
				controlTelaAtividades.telaAtividades.getBtnAddMonitor().setVisible(true);
				
			}
			if ( telaLogin.getRdbtnMonitor().isSelected() ) {
				controlTelaEventos.telaEventos.getBtnLerQrcode().setVisible(true);
				controlTelaAtividades.telaAtividades.getBtnLerQrcode().setVisible(true);
			}
			
			controlTelaEventos.telaEventos.getFrmEventos().setVisible(true);
			telaLogin.getFrameLogin().dispose();  
			}else {
				
				JOptionPane.showMessageDialog(null, "Selecione o modulo");
			}
		
		}
	});

}
}
