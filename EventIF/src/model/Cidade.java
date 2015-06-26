package model;

public class Cidade {
	 
	private long idCidade;
	private String nome;
	private Estado estado= new Estado();
	
	public long getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(long idCidade) {
		this.idCidade = idCidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
