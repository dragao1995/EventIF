package br.edu.ifg.tads.mtp.eventif.model;

import java.util.InputMismatchException;

import br.edu.ifg.tads.mtp.eventif.util.ValidarCPF;

public class Pessoa implements ValidarCPF {
	
	private long idPessoa;
	private String nome;
	private String cpf;
	private String rg;
	private String senha;
	private Endereco_Pessoa endereco_pes = new Endereco_Pessoa();
	private Contato contato = new Contato();
	
	public long getIdPessoa() {
		return idPessoa;
	} 
	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Endereco_Pessoa getEndereco_pes() {
		return endereco_pes;
	}
	public void setEndereco_pes(Endereco_Pessoa endereco_pes) {
		this.endereco_pes = endereco_pes;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public boolean isCPF() {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
				if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
					cpf.equals("22222222222") || cpf.equals("33333333333") ||
					cpf.equals("44444444444") || cpf.equals("55555555555") ||
					cpf.equals("66666666666") || cpf.equals("77777777777") ||
					cpf.equals("88888888888") || cpf.equals("99999999999") ||
					(cpf.length() != 11))
				       return(false);
				
				char dig10, dig11;
				int sm, i, r, num, peso;
				
				// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
				try { 
					// Calculo do 1o. Digito Verificador
					sm = 0; 
					peso = 10; 
					for (i=0; i<9; i++) { 
						// converte o i-esimo caractere do CPF em um numero: 
						// por exemplo, transforma o caractere '0' no inteiro 0 
						// (48 eh a posicao de '0' na tabela ASCII) 
						
						num = (int)(cpf.charAt(i) - 48);
						sm = sm + (num * peso); 
						peso = peso - 1; 
					}
					
					r = 11 - (sm % 11); 
					if ((r == 10) || (r == 11)){ 
						dig10 = '0'; 
					}	
					else{ 
						dig10 = (char)(r + 48);// converte no respectivo caractere numerico

					}
					
					// Calculo do 2o. Digito Verificador 
					sm = 0; 
					peso = 11;
					
					for(i=0; i<10; i++) { 
						num = (int)(cpf.charAt(i) - 48); 
						sm = sm + (num * peso); 
						peso = peso - 1; 
					}
					
					r = 11 - (sm % 11); 
					if ((r == 10) || (r == 11)) {
						dig11 = '0'; 
					}	
					else {
						dig11 = (char)(r + 48);
					}
					
					// Verifica se os digitos calculados conferem com os digitos informados.
					if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) { 
						return(true); 
					}	
					else { 
						return(false);
					}
				} catch (InputMismatchException erro) {
			        return(false);
			    }
	}

}
