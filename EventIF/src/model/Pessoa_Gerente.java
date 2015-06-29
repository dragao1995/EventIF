package model;

public class Pessoa_Gerente {
	
	private long idPessoa_Ger;
	private Pessoa pessoa = new Pessoa();
	public long getIdPessoa_Ger() {
		return idPessoa_Ger;
	}
	public void setIdPessoa_Ger(long idPessoa_Ger) {
		this.idPessoa_Ger = idPessoa_Ger;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
