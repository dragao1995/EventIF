package model;

public class Participante_Atividade {
	
	private Pessoa_Participante pessoa_part;
	private Atividade atividade;
	private String checkin;
	private String checkout;
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
