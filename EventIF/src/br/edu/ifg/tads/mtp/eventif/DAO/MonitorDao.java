package br.edu.ifg.tads.mtp.eventif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Monitor_Evento;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa_Monitor;
import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;

public class MonitorDao {
	
	Pessoa pessoa = new Pessoa();
	PessoaDAO pessoaDao = new PessoaDAO();
	Pessoa_Monitor pessoa_Monitor = new Pessoa_Monitor();
	int idPessoa_Monitor;
	
	public void inserir_Monitor(Pessoa_Monitor pm){
		
		Connection con = null;
		try {
			
			String sql = "insert into PESSOA_MONITOR "
					+ "(idPessoa)" + " Select idPessoa from Pessoa where cpf = ?";
			
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setLong(1, pessoaDao.idPessoa);
			stmt.setString(2,pessoa.getCpf());
			
			idPessoa_Monitor = 0;
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()){
				idPessoa_Monitor = rs.getInt("idPessoa_Monitor");
			}
			rs = stmt.getGeneratedKeys();
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

	public void inserir_monitor_atividade(Pessoa_Monitor pm){
		
		Connection con = null;
		try {
			
			String sql = "insert into MONITOR_ATIVIDADE "
					+ "(idPessoa_mon)" + " Select idPessoa_mon from Pessoa_Monitor " +
							"where idPessoa_mon = pessoa.idPessoa and pessoa.cpf = ?";
			
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setLong(1, pm.getIdPessoa_Mon());
			stmt.setString(2,pessoa.getCpf());
			
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

}
