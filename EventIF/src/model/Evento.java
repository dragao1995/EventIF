package model;

public class Evento {
	
	private long id;
	private String nome;//
	private String data_Inicio;
	private String data_Fim;
	private String organizador;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_Inicio() {
		return data_Inicio;
	}
	public void setData_Inicio(String data_Inicio) {
		this.data_Inicio = data_Inicio;
	}
	public String getData_Fim() {
		return data_Fim;
	}
	public void setData_Fim(String data_Fim) {
		this.data_Fim = data_Fim;
	}
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	
}
