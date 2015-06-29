package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import control.ControlTelaLogin;


public class main {
	public static void main(String[] args) throws SQLException  {
		
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Projeto","postgres","123");
		conexao.close();
		
					main.chamarlogin();
					
					
	}
	
	public static void chamarlogin(){
		ControlTelaLogin windowcontrol = new ControlTelaLogin();
		windowcontrol.EventosTelaLogin();
	}

}
