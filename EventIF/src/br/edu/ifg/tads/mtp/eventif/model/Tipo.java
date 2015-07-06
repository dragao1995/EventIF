package br.edu.ifg.tads.mtp.eventif.model;

public class Tipo {
	
	private long idTipo;
	private String tipo_Atividade;//Paletra,Minicurso,Oficina
	public long getidTipo() {
		return idTipo;
	}
	public void setIdTipo(long idTipo) {
		this.idTipo = idTipo;
	}
	public String getTipo_Atividade() {
		return tipo_Atividade;
	} 
	public void setTipo_Atividade(String tipo_Atividade) {
		this.tipo_Atividade = tipo_Atividade;
	}

}
