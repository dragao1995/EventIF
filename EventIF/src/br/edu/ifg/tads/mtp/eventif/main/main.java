package br.edu.ifg.tads.mtp.eventif.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.edu.ifg.tads.mtp.eventif.control.ControlTelaLogin;


public class main {
	public static void main(String[] args) throws SQLException  {
		
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto","postgres","123");
		conexao.close();
					main.chamarlogin();
	}
	
	public static void chamarlogin(){
		ControlTelaLogin.EventosTelaLogin();
	}

}
