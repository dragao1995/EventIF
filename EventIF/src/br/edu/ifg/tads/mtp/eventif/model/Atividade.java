package br.edu.ifg.tads.mtp.eventif.model;

import java.util.Date;

public class Atividade {
	
	private long idAtividade;
	private String nome;
	private String ministrante;
	private String descricao;
	private Date data;
	private String hora_Inicio;// olhar como ta no bd
	private String hora_Fim;//Calendar ver como funciona com hora conversão util
	private String carga_Horaria;
	private int numero_Vagas;
	private String tempo_total;
	private Evento evento = new Evento();
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
	
	public String getHora_Inicio() {
		return hora_Inicio;
	}
	public void setHora_Inicio(String hora_Inicio) {
		this.hora_Inicio = hora_Inicio;
	}
	public String getHora_Fim() {
		return hora_Fim;
	}
	public void setHora_Fim(String hora_Fim) {
		this.hora_Fim = hora_Fim;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMinistrante() {
		return ministrante;
	}
	public void setMinistrante(String ministrante) {
		this.ministrante = ministrante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTempo_total() {
		return tempo_total;
	}
	public void setTempo_total(String tempo_total) {
		this.tempo_total = tempo_total;
	}
	
}
