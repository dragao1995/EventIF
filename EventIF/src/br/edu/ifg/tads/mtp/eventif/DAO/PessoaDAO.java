package br.edu.ifg.tads.mtp.eventif.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import javax.sql.ConnectionEvent;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa_Gerente;



public class PessoaDAO {
	
	public Pessoa verificacao(Pessoa p){
		
		System.out.println(p.getIdPessoa());
		PreparedStatement stmt;
		Pessoa pessoa = new Pessoa();
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement("SELECT * FROM pessoa");
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setSenha(rs.getString("senha"));	
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoa;

	}

}
