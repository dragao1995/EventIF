package model;

public class Atividade {
	
	private long id;
	private String descricao;
	private String data_Inicio;
	private String data_Fim;// todos vão ficar com String ?
	private String carga_Horaria;// colocar horario de inicio e fim ?
	private String numero_Vagas;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getNumero_Vagas() {
		return numero_Vagas;
	}
	public void setNumero_Vagas(String numero_Vagas) {
		this.numero_Vagas = numero_Vagas;
	}
	
}
