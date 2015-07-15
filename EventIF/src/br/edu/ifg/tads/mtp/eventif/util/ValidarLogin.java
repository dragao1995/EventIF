package br.edu.ifg.tads.mtp.eventif.util;

import java.security.NoSuchAlgorithmException;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;

public class ValidarLogin {
	ControlTelaLogin controlTelaLogin;
	public ValidarLogin(ControlTelaLogin controlTelaLogin) {
		   
		this.controlTelaLogin = controlTelaLogin;
	}
	public void Validar(){
		
		try {
			System.out.println(controlTelaLogin.senha);
			System.out.println(controlTelaLogin.login.replace(".", "").replace("-", ""));

			controlTelaLogin.pessoaDAO.validar(controlTelaLogin.login.replace(".", "").replace("-", ""),controlTelaLogin.mascaras.MD5(controlTelaLogin.senha) );
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
	}

}
