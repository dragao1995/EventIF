package br.edu.ifg.tads.mtp.eventif.model;

public class Atividade {
	
	private long idAtividade;
	private String descricao;
	private String data_Inicio;
	private String data_Fim;//Calendar ver como funciona com hora conversão util
	private String carga_Horaria;
	private int numero_Vagas;
	private Evento evento;
	private Tipo tipo = new Tipo();
	
	public long getIdAtividade() {
		return idAtividade;
	}
	public void setId(long idAtividade) {
		this.idAtividade = idAtividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public String getCarga_Horaria() {
		return carga_Horaria;
	}
	public void setCarga_Horaria(String carga_Horaria) {
		this.carga_Horaria = carga_Horaria;
	}
	public int getNumero_Vagas() {
		return numero_Vagas;
	}
	public void setNumero_Vagas(int numero_Vagas) {
		this.numero_Vagas = numero_Vagas;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public void setIdAtividade(long idAtividade) {
		this.idAtividade = idAtividade;
	}
	
}
