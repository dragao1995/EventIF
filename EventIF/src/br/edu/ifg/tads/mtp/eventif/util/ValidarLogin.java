package br.edu.ifg.tads.mtp.eventif.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.view.TelaLogin;
import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;

public class ValidarLogin {
	
	PessoaDAO pd = new PessoaDAO();
	TelaLogin tl = new TelaLogin();
	
	
	public void Validar(){
		
		tl.getTxtUsuario().toString();
		pd.validar(tl.getTxtUsuario().toString(), tl.getTxtSenha().toString());
		
	}

}
