package br.edu.ifg.tads.mtp.eventif.util;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;

public class ValidarLogin {
	ControlTelaLogin controlTelaLogin;
	public ValidarLogin(ControlTelaLogin controlTelaLogin) {
		   
		this.controlTelaLogin = controlTelaLogin;
	}
	
	
	
	
	public boolean Validar(){
			if(controlTelaLogin.pessoaDAO.validar(controlTelaLogin.login.replace(".", "").replace("-", ""),controlTelaLogin.senha)){
				return true;
			}
		return false;
	}
	
	
	
	
	public boolean ValidarGerente(){
		if(controlTelaLogin.pessoaDAO.validar_gerente(controlTelaLogin.login.replace(".", "").replace("-", ""),controlTelaLogin.senha)){
			return true;
		}
	return false;
}
	

}
