package br.edu.ifg.tads.mtp.eventif.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.edu.ifg.tads.mtp.eventif.view.TelaCadastro;

public class ControlTelaCadastro {
	 TelaCadastro TelaCadastro = new TelaCadastro();
	 ControlTelaLogin controlTelaLogin;
	 public ControlTelaCadastro(ControlTelaLogin controlTelaLogin){
	 	this.controlTelaLogin = controlTelaLogin;
	 }

public void EventosTelaCadastro(){
		
	TelaCadastro.getBtnConfirmar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			controlTelaLogin.pessoa.setCpf(TelaCadastro.getTxtCpf().getText().replace(".", "").replace("-", ""));
			if (controlTelaLogin.pessoa.isCPF()){
				controlTelaLogin.pessoa.setNome(TelaCadastro.getTxtNome().getText());
				controlTelaLogin.pessoa.setRg(TelaCadastro.getTxtRg().getText());
				controlTelaLogin.contato.setTelefone(TelaCadastro.getTxtTelefone().getText());
				controlTelaLogin.contato.setEmail(TelaCadastro.getTxtEmail().getText());
				controlTelaLogin.endereco_Pessoa.setCep(TelaCadastro.getTxtCep().getText());
				int numeroo =Integer.parseInt(TelaCadastro.getTxtNumero().getText());
				controlTelaLogin.endereco_Pessoa.setNumero(numeroo);
				controlTelaLogin.endereco_Pessoa.setLogradouro(TelaCadastro.getTxtEndereco().getText());
				controlTelaLogin.endereco_Pessoa.setBairro(TelaCadastro.getTxtBairro().getText());
				controlTelaLogin.endereco_Pessoa.getCidade().setNome(TelaCadastro.getTxtCidade().getText());
				controlTelaLogin.estado.setUf(TelaCadastro.getTxtUf().getText());
				System.out.println("cpf ok fio");
			}else {
				JOptionPane.showMessageDialog(null, "CPF Invalido!!");
			}
		}
	});
	TelaCadastro.getBtnCancelar().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			controlTelaLogin.EventosTelaLogin();
			TelaCadastro.getFrame().dispose();
			
		}
	});
	
}}