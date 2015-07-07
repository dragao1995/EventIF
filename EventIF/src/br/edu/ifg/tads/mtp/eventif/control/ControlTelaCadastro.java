package br.edu.ifg.tads.mtp.eventif.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

public class ControlTelaCadastro {
	 TelaCadastro telaCadastro = new TelaCadastro();
	 ControlTelaLogin controlTelaLogin;
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
				controlTelaLogin.contato.setTelefone(telaCadastro.getTxtTelefone().getText());
				controlTelaLogin.contato.setEmail(telaCadastro.getTxtEmail().getText());
				controlTelaLogin.endereco_Pessoa.setCep(telaCadastro.getTxtCep().getText());
				int numeroo =Integer.parseInt(telaCadastro.getTxtNumero().getText());
				controlTelaLogin.endereco_Pessoa.setNumero(numeroo);
				controlTelaLogin.endereco_Pessoa.setLogradouro(telaCadastro.getTxtEndereco().getText());
				controlTelaLogin.endereco_Pessoa.setBairro(telaCadastro.getTxtBairro().getText());
				controlTelaLogin.endereco_Pessoa.getCidade().setNome(telaCadastro.getTxtCidade().getText());
				controlTelaLogin.estado.setUf(telaCadastro.getTxtUf().getText());
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