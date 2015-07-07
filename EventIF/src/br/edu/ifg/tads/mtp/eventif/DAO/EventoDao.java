package br.edu.ifg.tads.mtp.eventif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Atividade;
import br.edu.ifg.tads.mtp.eventif.model.Contato;
import br.edu.ifg.tads.mtp.eventif.model.Endereco_Evento;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Tipo;

public class EventoDao {
	
	Evento evento = new Evento();
	Atividade atividade = new Atividade();
	Tipo tipo = new Tipo();
	Contato contato = new Contato();
	Endereco_Evento ee = new Endereco_Evento();
	
	public void inserir_evento(Evento evento){
		
		Connection con = null;
		
		try{
			String sql = "insert into ESTADO "
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
			
			sql = "insert into CIDADE "
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
			sql = "insert into ENDERECO_EVENTO "
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
			int idEndereco_eve = 0;
			if(rs.next()){
				idEndereco_eve = rs.getInt("idEndereco_eve");
			}
			
			sql = "insert into CONTATO"
					+"(telefone,email)"+" values (?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, evento.getContato().getTelefone());
			stmt.setString(2, evento.getContato().getEmail());

			// executa
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idContato = 0;
			if(rs.next()){
				idContato = rs.getInt("idContato");
			}
			
			sql = "insert into EVENTO "
					+ "(nome,data_inicio,data_fim,organizador,idEndereco_eve,idContato)" + " values (?,?,?,?,?,?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, evento.getNome());
			stmt.setString(2, evento.getData_Inicio());
			stmt.setString(3, evento.getData_Fim());
			stmt.setString(4, evento.getOrganizador());
			stmt.setInt(5, idEndereco_eve);
			stmt.setInt(6, idContato);
			
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idEvento = 0;
			if(rs.next()){
				idEvento = rs.getInt("idEvento");
			}
			
			sql = "insert into TIPO"
					+"(tipo_avividade)"+" values(?)";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, tipo.getTipo_Atividade());
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			int idTipo = 0;
			if(rs.next()){
				idTipo = rs.getInt("idTipo");
			}
			
			sql = "insert into ATIVIDADE "
					+ "(nome,descricao,ministrante,datas,hora_inicio,hora_fim,carga_horaria,numero_vagas,idEvento,idTpo)"
					+"(values (?,?,?,?,?,?,?,?,?,?))";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, atividade.getNome());
			stmt.setString(2, atividade.getMinistrante());
			stmt.setString(3, atividade.getDescricao());
			stmt.setString(4, atividade.getData());
			stmt.setString(5, atividade.getHora_Inicio());
			stmt.setString(6, atividade.getHora_Fim());
			stmt.setString(7,atividade.getCarga_Horaria());
			stmt.setInt(8,atividade.getNumero_Vagas());
			stmt.setInt(9, idEvento);
			stmt.setInt(10, idTipo);
			
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
	// terminar
	public Evento buscar_evento(Evento e){
		PreparedStatement stmt;
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement("select * from Evento where idEvento = "
					+ e.getIdEvento());
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				evento.setIdEvento(rs.getLong("idEvento"));
				evento.setNome(rs.getString("nome"));
				evento.setDescricao(rs.getString("Descricao"));
				evento.setData_Inicio(rs.getString("Data_inicio"));
				evento.setData_Fim(rs.getString("Data_Fim"));
				evento.setOrganizador(rs.getString("Organizador"));
				contato.setIdContato(rs.getLong("idContato"));
				ee.setIdEndereco_Eve(rs.getLong("idEndereco_eve"));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return evento;
	}
	public Atividade buscar_Atividade(Atividade a){
		PreparedStatement stmt;
		
		try {
			Connection con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement("select * from Atividade where idAtividade = "
					+ a.getIdAtividade());
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				atividade.setIdAtividade(rs.getLong("idAtividade"));
				atividade.setNome(rs.getString("nome"));
				atividade.setDescricao(rs.getString("Descricao"));	
				atividade.setMinistrante(rs.getString("Ministrante"));
				atividade.setData(rs.getString("data"));
				atividade.setHora_Inicio(rs.getString("hora_Inicio"));
				atividade.setHora_Fim(rs.getString("hora_Fim"));
				atividade.setCarga_Horaria(rs.getString("Carga_Horaria"));
				atividade.setNumero_Vagas(rs.getInt("numero_Vagas"));
				evento.setIdEvento(rs.getLong("idEvento"));
				tipo.setIdTipo(rs.getLong("idTipo"));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return atividade;	
	}
	
	public Vector<Vector<String>> buscaEvento(){
		
		try {
			Vector<Vector<String>> Evento = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement("select * from Evento order by id");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				evento.setIdEvento(rs.getLong("idEvento"));
				evento.setNome(rs.getString("nome"));
				evento.setDescricao(rs.getString("email"));
				evento.setOrganizador(rs.getString("endereco"));
				evento.setData_Inicio(rs.getString("data_Inicio"));
				evento.setData_Fim(rs.getString("data_Fim"));
				ee.setIdEndereco_Eve(rs.getLong("idEvento_eve"));
				contato.setIdContato(rs.getLong("idContato"));
				
				Vector<String> colunas = new Vector<String>();
				colunas.add("" + evento.getIdEvento());
				colunas.add(evento.getNome());
				colunas.add("" + ee.getIdEndereco_Eve());
				colunas.add("" + contato.getIdContato());
				colunas.add("alterar");
				colunas.add("excluir");
				Evento.add(colunas);
				
			}
			rs.close();
			stmt.close();
			return Evento;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
}


