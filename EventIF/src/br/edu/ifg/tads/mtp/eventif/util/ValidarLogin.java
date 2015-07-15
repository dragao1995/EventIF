package br.edu.ifg.tads.mtp.eventif.util;

import java.security.NoSuchAlgorithmException;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;

public class ValidarLogin {
	ControlTelaLogin controlTelaLogin;
	public ValidarLogin(ControlTelaLogin controlTelaLogin) {
		   
		this.controlTelaLogin = controlTelaLogin;
	}
	public boolean Validar(){
		
			
			System.out.println(controlTelaLogin.login.replace(".", "").replace("-", ""));
			System.out.println(controlTelaLogin.senha);
			if(controlTelaLogin.pessoaDAO.validar(controlTelaLogin.login.replace(".", "").replace("-", ""),controlTelaLogin.senha)){
				return true;
			}
		
		return false;
	}

}
