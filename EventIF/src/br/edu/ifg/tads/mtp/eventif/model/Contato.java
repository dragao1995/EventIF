package br.edu.ifg.tads.mtp.eventif.model;


public class Contato {
	 
	private long idContato;
	private long telefone;
	private String email;
	
	public long getIdContato() {
		return idContato;
	}
	public void setIdContato(long idContato) {
		this.idContato = idContato;
	}

	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
