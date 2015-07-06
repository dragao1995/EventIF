package br.edu.ifg.tads.mtp.eventif.model;

public class Estado {
	 
	private long idEstado;
	private String nome;
	private String uf;
	
	public long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(long idEstado) {
		this.idEstado = idEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

}
