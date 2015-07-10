package br.edu.ifg.tads.mtp.eventif.main;

import java.io.File;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;

public class main {
	public static void main(String[] args) {
		File dir = new File("D:/eventIF/cracha");  
		dir.mkdirs();  
		/*
		ConnectionFactory cf = new ConnectionFactory();
		try{
			Connection c = cf.getConnection();
			System.out.println("Conectado!");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		*/
		//Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto","postgres","12345");
		//conexao.close();
		// tem que ver onde ficar esse conexão.close não fica no pacote bd
		// verificar se aquele PreparedStatement estar certo na pessoa gerente
		Pessoa pessoa = new Pessoa();
		ControlTelaLogin controlTelaLogin = new ControlTelaLogin();
		controlTelaLogin.todosEventos();
		controlTelaLogin.Login();
		
					
	}
	
	
}
