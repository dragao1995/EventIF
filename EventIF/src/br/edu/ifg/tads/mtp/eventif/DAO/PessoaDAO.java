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
import br.edu.ifg.tads.mtp.eventif.model.Cidade;
import br.edu.ifg.tads.mtp.eventif.model.Endereco_Evento;
import br.edu.ifg.tads.mtp.eventif.model.Endereco_Pessoa;
import br.edu.ifg.tads.mtp.eventif.model.Estado;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa_Gerente;
import br.edu.ifg.tads.mtp.eventif.model.Contato;;

public class PessoaDAO {
	
	Contato c = new Contato();
	Endereco_Pessoa ep = new Endereco_Pessoa();
	Pessoa pessoa = new Pessoa();
	
	public void inserir(Pessoa pessoa){
		
		Connection con = null;
		try {
			
			String sql = "insert into ESTADO "
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
			
			sql = "insert into CIDADE "
					+ "(nome,idEstado)" + " values (?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, pessoa.getEndereco_pes().getCidade().getNome());
			stmt.setInt(2,idEstado);

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idCidade = 0;
			if(rs.next()){
				idCidade = rs.getInt("idCidade");
			}
			
			sql = "insert into ENDERECO_PESSOA "
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
			int idEndereco_pes = 0;
			if(rs.next()){
				idEndereco_pes = rs.getInt("idEndereco_pes");
			}
			sql = "insert into CONTATO"
					+"(telefone,email)"+" values (?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setLong(1, pessoa.getContato().getTelefone());
			stmt.setString(2, pessoa.getContato().getEmail());

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idContato = 0;
			if(rs.next()){
				idContato = rs.getInt("idContato");
			}
			
			sql = "insert into PESSOA "
					+ "(nome,cpf,rg,senha,idEndereco_pes,idContato)" + " values (?,?,?,?,?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getCpf());
			stmt.setString(3, pessoa.getRg());
			stmt.setString(4, pessoa.getSenha());
			stmt.setInt(5, idEndereco_pes);
			stmt.setInt(6, idContato);

			// executa
			stmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(
					"falha ao tentar executar um comando no BD. Verifique sua conexão " + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException(
						"não foi possível fechar a conexão com o BD");
			}
		}
		
	}
	// terminar
	public Pessoa buscar(Pessoa p){
		PreparedStatement stmt;
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement("select * from PESSOA where idPessoa = "
					+ p.getIdPessoa());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				
				pessoa.setIdPessoa(rs.getLong("idPessoa"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setRg(rs.getString("rg"));
				pessoa.setSenha(rs.getString("senha"));
				c.setIdContato(rs.getLong("idContato"));
				ep.setIdEndereco_Pes(rs.getLong("idEndereco_pes"));
				
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return pessoa;
	}
	
	public Vector<Vector<String>> buscar(){
		
		try {
			Vector<Vector<String>> Pessoa = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement("select * from PESSOA order by idPessoa");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				pessoa.setIdPessoa(rs.getLong("idPessoa"));
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setRg(rs.getString("rg"));
				pessoa.setSenha(rs.getString("senha"));
				c.setIdContato(rs.getLong("idContato"));
				ep.setIdEndereco_Pes(rs.getLong("idEndereco_pes"));
				
				Vector<String> colunas = new Vector<String>();
				colunas.add("" + pessoa.getIdPessoa());
				colunas.add(pessoa.getNome());
				colunas.add(pessoa.getCpf());
				colunas.add(pessoa.getRg());
				colunas.add(pessoa.getSenha());
				colunas.add(""+c.getIdContato());
				colunas.add(""+ep.getIdEndereco_Pes());
				colunas.add("alterar");
				colunas.add("excluir");
				Pessoa.add(colunas);
				
			}
			rs.close();
			stmt.close();
			return Pessoa;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	public void altera_contado(Contato cont){
		String sql = "update CONTATO set telefone=?,email=?"
				+ "where idContato=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setLong(1, cont.getTelefone());
			stmt.setString(2, cont.getEmail());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
		
	}
	
	public void altera_estado(Estado est){
		String sql = "update ESTADO set nome=?,uf=?"
				+ "where idEstado=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, est.getNome());
			stmt.setString(2, est.getUf());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	public void altera_cidade(Cidade cid){
		String sql = "update CIDADE set nome=?"
				+ "where idCidade=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, cid.getNome());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
			
	}
	
	public void altera_endereco(Endereco_Pessoa ep){
		String sql = "update ENDERECO_PESSOA set logradouro=?,cep=?, bairro=?, numero=?,complemento=?"
				+ "where idEndereco_pes=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, ep.getLogradouro());
			stmt.setString(2,ep.getCep());
			stmt.setString(3, ep.getBairro());
			stmt.setInt(4, ep.getNumero());
			stmt.setString(5, ep.getComplemento());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
		
	public void altera(Pessoa pessoa) {
		String sql = "update PESSOA set nome=?,cpf=?, rg=?, senha=?"
				+ "where idPessoa=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2,pessoa.getCpf());
			stmt.setString(3,pessoa.getRg());
			stmt.setString(4,pessoa.getSenha());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public String validar(String cpf,String senha) {
		Connection con = new ConnectionFactory().getConnection();
		String sql = "SELECT*FROM PESSOA WHERE cpf = " + cpf;
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				String lc = rs.getString("cpf");
				String ls = rs.getString("senha");
				if(senha.equals(ls)){
					System.out.println("Senha correta");
				}else{
					System.out.println("Senha incorreta ou cpf");
				}
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return senha;
	}

}
