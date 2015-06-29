package model;

public class Monitor_Evento {
	
	private Atividade atividade = new Atividade();
	private Pessoa_Monitor pessoa_mon = new Pessoa_Monitor();
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public Pessoa_Monitor getPessoa_mon() {
		return pessoa_mon;
	}
	public void setPessoa_mon(Pessoa_Monitor pessoa_mon) {
		this.pessoa_mon = pessoa_mon;
	}

}
