package br.edu.unifei.ecot12.trabalho.futebol;

public class Partida {

	private String tipoPartida;
	private Time mandante;
	private Time visitante;
	private Estadio estadio;
	private Relogio inicio;
	private Relogio termino;

	public Partida() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTipoPartida() {
		return tipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Relogio getInicio() {
		return inicio;
	}

	public void setInicio(Relogio inicio) {
		this.inicio = inicio;
	}

	public Relogio getTermino() {
		return termino;
	}

	public void setTermino(Relogio termino) {
		this.termino = termino;
	}
}
