package br.edu.ifg.tads.mtp.eventif.control;


import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;
import br.edu.ifg.tads.mtp.eventif.util.Cracha;
import br.edu.ifg.tads.mtp.eventif.util.CriarQRCode;
import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

public class ControlTelaCadastro {
	Cracha cracha = new Cracha();
		public TelaCadastro telaCadastro = new TelaCadastro();
		ControlTelaLogin controlTelaLogin;
		public PessoaDAO pessoaDAO = new PessoaDAO();
		public JLabel llblNome;
		public CriarQRCode ccriarQRCode = new CriarQRCode();
		
	public ControlTelaCadastro(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }

public void EventosTelaCadastro(){
		
	telaCadastro.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println("ssss"+telaCadastro.getTxtSenha().getText()+" == "+telaCadastro.getTxtCsenha().getText());
			
			if (telaCadastro.getTxtSenha().getText().equals(telaCadastro.getTxtCsenha().getText())) {
				System.out.println(telaCadastro.getTxtSenha().getText()+" babacao "+telaCadastro.getTxtCsenha().getText());
			controlTelaLogin.pessoa.setCpf(telaCadastro.getTxtCpf().getText().replace(".", "").replace("-", ""));
			if (controlTelaLogin.pessoa.isCPF()){
				try {cracha.SalvarNomeaq(telaCadastro.getTxtNome().getText());} catch (IOException e1) {e1.printStackTrace();}
				//cracha
				llblNome= new JLabel(telaCadastro.getTxtNome().getText());
				controlTelaLogin.telaGerarCracha.setLlblNome(llblNome);
				llblNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
				llblNome.setBounds(32, 180, 383, 52);
				llblNome.setHorizontalAlignment(SwingConstants.CENTER);  
				ccriarQRCode.setCpfQR(telaCadastro.getTxtCpf().getText().replace(".", "").replace("-", ""));
				ccriarQRCode.criarQRcode();
				try {
					controlTelaLogin.telaGerarCracha.cracha();} catch (IOException e) {}
				//fim cracha
				controlTelaLogin.pessoa.setNome(telaCadastro.getTxtNome().getText());
				controlTelaLogin.pessoa.setRg(telaCadastro.getTxtRg().getText());
				controlTelaLogin.pessoa.getContato().setTelefone(Integer.parseInt(telaCadastro.getTxtTelefone().getText()));
				controlTelaLogin.pessoa.getContato().setEmail(telaCadastro.getTxtEmail().getText());
				controlTelaLogin.pessoa.getEndereco_pes().setCep(telaCadastro.getTxtCep().getText());
				int numeroo =Integer.parseInt(telaCadastro.getTxtNumero().getText());
				controlTelaLogin.pessoa.getEndereco_pes().setNumero(numeroo);
				controlTelaLogin.pessoa.getEndereco_pes().setLogradouro(telaCadastro.getTxtEndereco().getText());
				controlTelaLogin.pessoa.getEndereco_pes().setBairro(telaCadastro.getTxtBairro().getText());
				controlTelaLogin.pessoa.getEndereco_pes().getCidade().setNome(telaCadastro.getTxtCidade().getText());
				controlTelaLogin.pessoa.getEndereco_pes().getCidade().getEstado().setUf(telaCadastro.getTxtUf().getText());
				controlTelaLogin.pessoa.setSenha(telaCadastro.getTxtSenha().getText());
				pessoaDAO.inserir(controlTelaLogin.pessoa);
				System.out.println("cpf ok fio");
				
				
			}else {
				JOptionPane.showMessageDialog(null, "CPF Invalido!!");
			}
		}}
	});
	telaCadastro.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			controlTelaLogin.EventosTelaLogin();
			telaCadastro.getFrame().dispose();
			
		}
	});
	
}

}