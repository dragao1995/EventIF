package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import control.telaLogin;

public class main {
	public static void main(String[] args) throws SQLException {
		telaLogin windowcontrol = new telaLogin();
		Connection conexao = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/Projeto", "postgres", "123");
		conexao.close();

		// chama tela login
		windowcontrol.EventosTelaLogin();

	}

}
