package br.edu.ifg.tads.mtp.eventif.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;
import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

public class ControlTelaCadastro {
	 TelaCadastro telaCadastro = new TelaCadastro();
	 ControlTelaLogin controlTelaLogin;
	 PessoaDAO pessoaDAO = new PessoaDAO();
	 public ControlTelaCadastro(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }

public void EventosTelaCadastro(){
		
	telaCadastro.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			controlTelaLogin.pessoa.setCpf(telaCadastro.getTxtCpf().getText().replace(".", "").replace("-", ""));
			if (controlTelaLogin.pessoa.isCPF()){
				controlTelaLogin.pessoa.setNome(telaCadastro.getTxtNome().getText());
				controlTelaLogin.pessoa.setRg(telaCadastro.getTxtRg().getText());
				controlTelaLogin.pessoa.getContato().setTelefone(telaCadastro.getTxtTelefone().getText());
				controlTelaLogin.pessoa.getContato().setEmail(telaCadastro.getTxtEmail().getText());
				controlTelaLogin.pessoa.getEndereco_pes().setCep(telaCadastro.getTxtCep().getText());
				int numeroo =Integer.parseInt(telaCadastro.getTxtNumero().getText());
				controlTelaLogin.pessoa.getEndereco_pes().setNumero(numeroo);
				controlTelaLogin.pessoa.getEndereco_pes().setLogradouro(telaCadastro.getTxtEndereco().getText());
				controlTelaLogin.pessoa.getEndereco_pes().setBairro(telaCadastro.getTxtBairro().getText());
				controlTelaLogin.pessoa.getEndereco_pes().getCidade().setNome(telaCadastro.getTxtCidade().getText());
				controlTelaLogin.pessoa.getEndereco_pes().getCidade().getEstado().setUf(telaCadastro.getTxtUf().getText());
				pessoaDAO.inserir(controlTelaLogin.pessoa);
				System.out.println("cpf ok fio");
			}else {
				JOptionPane.showMessageDialog(null, "CPF Invalido!!");
			}
		}
	});
	telaCadastro.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			controlTelaLogin.EventosTelaLogin();
			telaCadastro.getFrame().dispose();
			
		}
	});
	
}}