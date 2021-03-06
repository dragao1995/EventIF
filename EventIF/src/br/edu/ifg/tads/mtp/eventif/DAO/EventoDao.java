package br.edu.ifg.tads.mtp.eventif.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Atividade;
import br.edu.ifg.tads.mtp.eventif.model.Cidade;
import br.edu.ifg.tads.mtp.eventif.model.Contato;
import br.edu.ifg.tads.mtp.eventif.model.Endereco_Evento;
import br.edu.ifg.tads.mtp.eventif.model.Estado;
import br.edu.ifg.tads.mtp.eventif.model.Evento;
import br.edu.ifg.tads.mtp.eventif.model.Tipo;

public class EventoDao {
	
	Evento evento = new Evento();
	public Atividade atividade = new Atividade();
	Tipo tipo = new Tipo();
	Contato contato = new Contato();
	Endereco_Evento ee = new Endereco_Evento();
	
	public int idEvento;
	public int idAtividade;
	
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

			stmt.setLong(1, evento.getContato().getTelefone());
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
			stmt.setDate(2, new Date (evento.getData_Inicio().getTime()));
			stmt.setDate(3, new Date (evento.getData_Fim().getTime()));
			stmt.setString(4, evento.getOrganizador());
			stmt.setInt(5, idEndereco_eve);
			stmt.setInt(6, idContato);
			
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			
			if(rs.next()){
				idEvento = rs.getInt("idEvento");
			}
			stmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(
					"falha ao tentar executar um comando no BD. Verifique sua conex�o "+e.getMessage());
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				throw new RuntimeException(
						"n�o foi poss�vel fechar a conex�o com o BD");
			}
		
		}
		
	}
	
	public void inserir_Atividade(Atividade atividade){
		
		Connection con = null;
		
		try{
			String sql = "insert into TIPO"
						+"(tipo_atividade)"+" values(?)";
			con = new ConnectionFactory().getConnection();
			PreparedStatement stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, tipo.getTipo_Atividade());
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			int idTipo = 0;
			if(rs.next()){
				idTipo = rs.getInt("idTipo");
			}
			
			sql = "insert into ATIVIDADE "
					+ "(nome,descricao,ministrante,datas,hora_inicio,hora_fim,carga_horaria,numero_vagas,idEvento,idTipo)"
					+"(values (?,?,?,?,?,?,?,?,?,?))";
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			
			stmt.setString(1, atividade.getNome());
			stmt.setString(2, atividade.getDescricao());
			stmt.setString(3, atividade.getMinistrante());
			stmt.setDate(4, new Date(atividade.getData().getTime()));
			stmt.setDate(5, new Date(atividade.getHora_Inicio().getTime()));
			stmt.setDate(6, new Date (atividade.getHora_Fim().getTime()));
			stmt.setInt(7,atividade.getCarga_Horaria());
			stmt.setInt(8,atividade.getNumero_Vagas());
			System.out.println(idEvento);
			stmt.setInt(9, idEvento);
			stmt.setInt(10, idTipo);
			
			idAtividade = 0;
			if(rs.next()){
				idAtividade = rs.getInt("idAtividade");
			}
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
	} catch (Exception e) {
		throw new RuntimeException(
				"falha ao tentar executar um comando no BD. Verifique sua conex�o "+e.getMessage());
	} finally {
		try {
			con.close();
		} catch (Exception e) {
			throw new RuntimeException(
					"n�o foi poss�vel fechar a conex�o com o BD");
		}
	
	}
		
	}
	
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
				evento.setData_Inicio(rs.getDate("Data_inicio"));
				evento.setData_Fim(rs.getDate("Data_Fim"));
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
				atividade.setData(rs.getDate("data"));
				atividade.setHora_Inicio(rs.getDate("hora_Inicio"));
				atividade.setHora_Fim(rs.getDate("hora_Fim"));
				atividade.setCarga_Horaria(rs.getInt("Carga_Horaria"));
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
					.prepareStatement("select * from EVENTO order by idEvento");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				evento.setIdEvento(rs.getLong("idEvento"));
				evento.setNome(rs.getString("nome"));
				evento.setDescricao(rs.getString("descricao"));
				evento.setOrganizador(rs.getString("organizador"));
				evento.setData_Inicio(rs.getDate("data_inicio"));
				evento.setData_Fim(rs.getDate("data_fim"));
				ee.setIdEndereco_Eve(rs.getLong("idEndereco_eve"));
				contato.setIdContato(rs.getLong("idContato"));
				
				Vector<String> colunas = new Vector<String>();
				colunas.add("" + evento.getIdEvento());
				colunas.add(evento.getNome());
				colunas.add(evento.getDescricao());
				colunas.add(evento.getOrganizador());
				colunas.add(""+evento.getData_Inicio());
				colunas.add(""+evento.getData_Fim());
				colunas.add("" + ee.getIdEndereco_Eve());
			//	colunas.add("" + contato.getIdContato());
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
	
	public Vector<Vector<String>> buscaEventoNome(Evento e) {

		try {
			Vector<Vector<String>> eventos = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(
							"select * from EVENTO where nome like '%"
									+ e.getNome() + "%'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Evento evento = new Evento();
				evento.setIdEvento(rs.getLong("idEvento"));
				evento.setNome(rs.getString("nome"));
				evento.setOrganizador(rs.getString("Organizador"));
				evento.setData_Inicio(rs.getDate("data_incio"));
				evento.setData_Fim(rs.getDate("data_fim"));

				Vector<String> colunas = new Vector<String>();
				colunas.add("" + evento.getIdEvento());
				colunas.add(evento.getNome());
				colunas.add(evento.getOrganizador());
				colunas.add(""+evento.getData_Inicio());
				colunas.add(""+evento.getData_Fim());
				colunas.add("alterar");
				colunas.add("excluir");

				// adicionando o objeto à lista
				eventos.add(colunas);
			}
			rs.close();
			stmt.close();
			return eventos;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	public Vector<Vector<String>> buscaAtividade(Evento e){
		try {
			Vector<Vector<String>> Atividade = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement("select * from ATIVIDADE where idEvento=? order by idAtividade");
			stmt.setLong(1, e.getIdEvento());
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				atividade.setIdAtividade(rs.getLong("idAtividade"));
				atividade.setNome(rs.getString("nome"));
				atividade.setDescricao(rs.getString("descricao"));
				atividade.setMinistrante(rs.getString("ministrante"));
				atividade.setData(rs.getDate(("datas")));
				atividade.setHora_Inicio(rs.getDate("hora_inicio"));
				atividade.setHora_Fim(rs.getDate("hora_fim"));
				atividade.setCarga_Horaria(rs.getInt("carga_horaria"));
				atividade.setNumero_Vagas(rs.getInt("numero_vagas"));
				evento.setIdEvento(rs.getLong("idEvento"));
				tipo.setIdTipo(rs.getLong("idTipo"));
				
				Vector<String> colunas = new Vector<String>();
				colunas.add("" + atividade.getIdAtividade());
				colunas.add(atividade.getNome());
				colunas.add(atividade.getDescricao());
				colunas.add(atividade.getMinistrante());
				colunas.add(""+atividade.getData());
				colunas.add(""+atividade.getHora_Inicio());
				colunas.add(""+atividade.getHora_Fim());
				colunas.add(""+atividade.getCarga_Horaria());
				colunas.add(""+atividade.getNumero_Vagas());
				colunas.add(""+evento.getIdEvento());
				colunas.add(""+tipo.getidTipo());
				colunas.add("alterar");
				colunas.add("excluir");
				
				Atividade.add(colunas);
			}
			rs.close();
			stmt.close();
			return Atividade;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
				
	}
	
	public Vector<Vector<String>> buscaAtividadeNome(Atividade a) {

		try {
			Vector<Vector<String>> eventos = new Vector<Vector<String>>();
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(
							"select * from ATIVIDADE where nome like '%"
									+ a.getNome() + "%'");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// criando o objeto Contato
				Atividade atividade = new Atividade();
				atividade.setIdAtividade(rs.getLong("idAtividade"));
				atividade.setNome(rs.getString("nome"));
				atividade.setMinistrante(rs.getString("ministrante"));
				atividade.setDescricao(rs.getString("descricao"));
				atividade.setHora_Inicio(rs.getDate("hora_incio"));
				atividade.setHora_Inicio(rs.getDate("hora_fim"));

				Vector<String> colunas = new Vector<String>();
				colunas.add("" + atividade.getIdAtividade());
				colunas.add(atividade.getNome());
				colunas.add(atividade.getMinistrante());
				colunas.add(atividade.getDescricao());
				colunas.add(""+atividade.getHora_Inicio());
				colunas.add(""+atividade.getHora_Fim());
				colunas.add("alterar");
				colunas.add("excluir");

				// adicionando o objeto à lista
				eventos.add(colunas);
			}
			rs.close();
			stmt.close();
			return eventos;
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
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
	
	public void altera_endereco(Endereco_Evento ev){
		String sql = "update ENDERECO_PESSOA set logradouro=?,cep=?, bairro=?, numero=?,complemento=?"
				+ "where idEndereco_pes=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, ev.getLogradouro());
			stmt.setString(2,ev.getCep());
			stmt.setString(3, ev.getBairro());
			stmt.setInt(4, ev.getNumero());
			stmt.setString(5, ev.getComplemento());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public void altera_Evento(Evento evento) {
		String sql = "update EVENTO set nome=?,organizador=?, descricao=?, data_inicio=?, data_fim=?"
				+ "where idEvento=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, evento.getNome());
			stmt.setString(2, evento.getOrganizador());
			stmt.setString(3, evento.getDescricao());
			stmt.setDate(4, new Date(evento.getData_Inicio().getTime()));
			stmt.setDate(5, new Date (evento.getData_Fim().getTime()));
			
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	public void altera_Tipo(Tipo tipo) {
		String sql = "update TIPO set tipo_atividade=?"
				+ "where idTipo=?";
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, tipo.getTipo_Atividade());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
		
	}
	public void altera_Atividade(Atividade atividade) {
		String sql = "update ATIVIDADE set nome=?,descricao=?, ministrante=?,data=? , hora_inicio=?, hora_fim=?,"
				+ "carga_horaria=? numero_vagas=? where idAtividade=?";
		
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement(sql);
			stmt.setString(1, atividade.getNome());
			stmt.setString(2, atividade.getDescricao());
			stmt.setString(3, atividade.getMinistrante());
			stmt.setDate(4,new Date(atividade.getData().getTime()));
			stmt.setDate(5, new Date (atividade.getHora_Inicio().getTime()));
			stmt.setDate(6, new Date (atividade.getHora_Fim().getTime()));
			stmt.setInt(7, atividade.getCarga_Horaria());
			stmt.setInt(8, atividade.getNumero_Vagas());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public void remove_evento(Evento evento) {
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement("delete from EVENTO where idEvento=?");
			stmt.setLong(1, evento.getIdEvento());
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void remove_atividade(Atividade atividade) {
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement("delete from ATIVIDADE where idAtividade=?");
			stmt.setLong(1, atividade.getIdAtividade());
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void remove_tipo(Tipo tipo) {
		try {
			PreparedStatement stmt = new ConnectionFactory().getConnection()
					.prepareStatement("delete from TIPO where idTipo=?");
			stmt.setLong(1, tipo.getidTipo());
			stmt.execute();
			stmt.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}	