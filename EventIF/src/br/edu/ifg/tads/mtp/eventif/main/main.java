package br.edu.ifg.tads.mtp.eventif.main;

import java.io.File;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;

public class main {
	public static void main(String[] args) {
		File dir = new File("D:/eventIF/cracha");  
		dir.mkdirs();  
		
		ControlTelaLogin controlTelaLogin = new ControlTelaLogin();
		controlTelaLogin.todosEventos();
		controlTelaLogin.Login();
		
					
	}
	
	
}
