package br.edu.ifg.tads.mtp.eventif.main;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;


public class main {
	public static void main(String[] args) {
		
		//Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto","postgres","12345");
		//conexao.close();
		// tem que ver onde ficar esse conexão.close não fica no pacote bd
		// verificar se aquele PreparedStatement estar certo na pessoa gerente
		
					main.chamarlogin();
	}
	
	public static void chamarlogin(){
		ControlTelaLogin.EventosTelaLogin();
	}

}
