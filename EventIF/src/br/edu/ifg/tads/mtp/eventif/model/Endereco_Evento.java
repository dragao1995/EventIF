package br.edu.ifg.tads.mtp.eventif.model;

public class Endereco_Evento {
	
	private long idEndereco_Eve;
	private String logradouro;
	private String bairro;
	private int numero;
	private String complemento;
	private Cidade cidade = new Cidade();
	
	public long getIdEndereco_Eve() {
		return idEndereco_Eve;
	}
	public void setIdEndereco_Eve(long idEndereco_Eve) {
		this.idEndereco_Eve = idEndereco_Eve;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
