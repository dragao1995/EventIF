package br.edu.ifg.tads.mtp.eventif.model;

public class Pessoa_Monitor {
	
	private long idPessoa_Mon;//composição
	private Pessoa pessoa = new Pessoa();
	private Atividade atividade = new Atividade();
	public long getIdPessoa_Mon() {
		return idPessoa_Mon;
	}
	public void setIdPessoa_Mon(long idPessoa_Mon) {
		this.idPessoa_Mon = idPessoa_Mon;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	
}
