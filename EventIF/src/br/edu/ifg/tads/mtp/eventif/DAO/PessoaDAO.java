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
	
	public Pessoa_Gerente verificacao(Pessoa_Gerente pg){
		
		System.out.println(pg.getIdPessoa_Ger());
		PreparedStatement stmt;
		Pessoa pessoa = new Pessoa();
		Pessoa_Gerente pessoa_ger = new Pessoa_Gerente();
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement("select * from pessoa_gerente where idPessoa_ger = (select idPessoa from Pessoa) "
					+ pg.getIdPessoa_Ger());
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				pessoa.setCpf("cpf");
				pessoa.setSenha("senha");	
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pessoa_ger;

	}

}
