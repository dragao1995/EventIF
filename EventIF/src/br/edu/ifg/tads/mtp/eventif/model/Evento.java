package br.edu.ifg.tads.mtp.eventif.model;

import java.util.Date;

public class Evento {
	
	private long idEvento;
	private String nome;
	private Date data_Inicio;
	private Date data_Fim;
	private String organizador;//quem é esse loco ?
	private String descricao;
	private Contato contato = new Contato();
	private Endereco_Evento endereco_eve = new Endereco_Evento();
	
	public long getIdEvento() {
		return idEvento;
	} 
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getData_Inicio() {
		return data_Inicio;
	}
	public void setData_Inicio(Date data_Inicio) {
		this.data_Inicio = data_Inicio;
	}
	public Date getData_Fim() {
		return data_Fim;
	}
	public void setData_Fim(Date data_Fim) {
		this.data_Fim = data_Fim;
	}
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	public Endereco_Evento getEndereco_eve() {
		return endereco_eve;
	}
	public void setEndereco_eve(Endereco_Evento endereco_eve) {
		this.endereco_eve = endereco_eve;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	
}
