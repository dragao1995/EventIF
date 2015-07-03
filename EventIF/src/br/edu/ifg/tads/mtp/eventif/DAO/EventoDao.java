package br.edu.ifg.tads.mtp.eventif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Evento;

public class EventoDao {
	
	public void inserir_evento(Evento evento){
		
		Connection con = null;
		
		try{
			String sql = "insert into estado "
					+ "(nome,uf)" + " values (?,?)";
			
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, evento.getEndereco_eve().getCidade().getEstado().getNome());
			stmt.setString(2,  evento.getEndereco_eve().getCidade().getEstado().getUf());

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

			stmt.setString(1, evento.getEndereco_eve().getCidade().getNome());
			stmt.setInt(2,  idEstado);

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idCidade = 0;
			if(rs.next()){
				idCidade = rs.getInt("idCidade");
			}
			sql = "insert into Endereco_evento "
					+ "(cep,logradouro,bairro,numero,complemento,idCidade)" + " values (?,?,?,?,?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, evento.getEndereco_eve().getCep());
			stmt.setString(2, evento.getEndereco_eve().getLogradouro());
			stmt.setString(3, evento.getEndereco_eve().getBairro());
			stmt.setInt(4, evento.getEndereco_eve().getNumero());
			stmt.setString(5, evento.getEndereco_eve().getComplemento());
			stmt.setInt(6, idCidade);

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idEndereco = 0;
			if(rs.next()){
				idEndereco = rs.getInt("idEndereco_eve");
			}
			sql = "insert into Evento "
					+ "(nome,data_inicio,data_fim,organizador,idEndereco_eve)" + " values (?,?,?,?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql);

			stmt.setString(1, evento.getNome());
			stmt.setString(2, evento.getData_Inicio());
			stmt.setString(3, evento.getData_Fim());
			stmt.setString(4, evento.getOrganizador());
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

}
