package br.edu.ifg.tads.mtp.eventif.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ifg.tads.mtp.eventif.bd.ConnectionFactory;
import br.edu.ifg.tads.mtp.eventif.model.Pessoa;
import br.edu.ifg.tads.mtp.eventif.DAO.PessoaDAO;

public class ValidarLogin {
	
	PessoaDAO pd = new PessoaDAO();
	Pessoa pessoa = new Pessoa();
	
	public void validarLogin(String cpf,String senha){
		if(pd.buscar() == null){
			System.out.println("ERRADO LOGIN");
		}else
			if(pd.validar_cpf(pessoa.getCpf())== pessoa.getCpf()){
				if(pd.validar_senha(pessoa.getSenha())== pessoa.getSenha()){
					
				}
				
			}
		
	}

}
