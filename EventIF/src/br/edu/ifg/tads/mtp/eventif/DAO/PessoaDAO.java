package br.edu.ifg.tads.mtp.eventif.DAO;

import java.beans.Statement;
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
	
	public void inserir(Pessoa pessoa){
		
		
		Connection con = null;
		try {
			
			String sql = "insert into estado "
					+ "(nome,uf)" + " values (?,?)";
			
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, pessoa.getEndereco_pes().getCidade().getEstado().getNome());
			stmt.setString(2,  pessoa.getEndereco_pes().getCidade().getEstado().getUf());

			// executa
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			int idEstado = 0;
			if(rs.next()){
				idEstado = rs.getInt("idEstado");
			}
			
			sql = "insert into cidade "
					+ "(nome,idEstado)" + " values (?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, pessoa.getEndereco_pes().getCidade().getNome());
			stmt.setInt(2,  idEstado);

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idCidade = 0;
			if(rs.next()){
				idCidade = rs.getInt("idCidade");
			}
			
			sql = "insert into Endereco_pessoa "
					+ "(cep,logradouro,bairro,numero,complemento,idCidade)" + " values (?,?,?,?,?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, pessoa.getEndereco_pes().getCep());
			stmt.setString(2, pessoa.getEndereco_pes().getLogradouro());
			stmt.setString(3, pessoa.getEndereco_pes().getBairro());
			stmt.setInt(4, pessoa.getEndereco_pes().getNumero());
			stmt.setString(5, pessoa.getEndereco_pes().getComplemento());
			stmt.setInt(6, idCidade);

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idEndereco = 0;
			if(rs.next()){
				idEndereco = rs.getInt("idEndereco_pes");
			}
			
			sql = "insert into pessoa "
					+ "(nome,cpf,rg,senha,idEndereco_pes)" + " values (?,?,?,?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getCpf());
			stmt.setString(3, pessoa.getRg());
			stmt.setString(4, pessoa.getSenha());
			stmt.setInt(5, idEndereco);

			// executa
			stmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(
					"falha ao tentar executar um comando no BD. Verifique sua conexão");
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException(
						"não foi possível fechar a conexão com o BD");
			}
		}
		
	}
	
	// toda essa parte a baixo no modelo fazer alteração para verificação
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
				System.out.println("Inserido");
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
