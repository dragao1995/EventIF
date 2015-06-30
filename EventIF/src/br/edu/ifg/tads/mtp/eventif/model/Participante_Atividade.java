package br.edu.ifg.tads.mtp.eventif.model;

public class Participante_Atividade {
	
	private long idParticipante_ativ; // eu(mary) coloquei esse id, so que tem que mudar no banco
	private Pessoa_Participante pessoa_part = new Pessoa_Participante();
	private Atividade atividade;
	private String checkin;
	private String checkout;
	
	
	public long getIdParticipante_ativ() {
		return idParticipante_ativ;
	}
	public void setIdParticipante_ativ(long idParticipante_ativ) {
		this.idParticipante_ativ = idParticipante_ativ;
	}
	public Pessoa_Participante getPessoa_part() {
		return pessoa_part;
	}
	public void setPessoa_part(Pessoa_Participante pessoa_part) {
		this.pessoa_part = pessoa_part;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

}
