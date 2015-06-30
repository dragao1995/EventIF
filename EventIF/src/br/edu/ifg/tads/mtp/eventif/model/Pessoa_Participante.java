package br.edu.ifg.tads.mtp.eventif.model;

public class Pessoa_Participante {
	
	private long idPessoa_Part;
	private Pessoa pessoa = new Pessoa();
	
	public long getIdPessoa_Part() {
		return idPessoa_Part;
	}
	public void setIdPessoa_Part(long idPessoa_Part) {
		this.idPessoa_Part = idPessoa_Part;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

}
