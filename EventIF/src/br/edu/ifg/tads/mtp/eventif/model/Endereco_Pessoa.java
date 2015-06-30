package br.edu.ifg.tads.mtp.eventif.model;

public class Endereco_Pessoa {
	 
	private long idEndereco_Pes;
	private String logradouro;
	private String bairro;
	private int numero;
	private String complemento;
	private Cidade cidade = new Cidade();
	public long getIdEndereco_Pes() {
		return idEndereco_Pes;
	}
	public void setIdEndereco_Pes(long idEndereco_Pes) {
		this.idEndereco_Pes = idEndereco_Pes;
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
