package br.edu.ifg.tads.mtp.eventif.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	 public Connection getConnection() {
	        try {
	        	
	            return DriverManager.getConnection(
	            		"jdbc:postgresql://localhost:5432/Projeto", "postgres", "123");
	        } catch (Exception e) {
	            throw new RuntimeException("falha ao tentar acessar o BD. Verifique sua coneção. "+ e.getMessage());
	        }
	    }
}
