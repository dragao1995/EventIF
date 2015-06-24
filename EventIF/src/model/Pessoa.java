package model;

public class Pessoa {
	
	private long idPessoa;
	private String nome;
	private String cpf;
	private String rg;
	private String senha;
	private Endereco_Pessoa endereco_pes;
	private Contato contato;
	
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

}
