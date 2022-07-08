package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.ArrayList;
import java.util.List;

public class Time {

	private String nome;
	private String sigla;
	private Cor cor;
	private Status status = new Mandante();
	
	private List<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();

	public Time() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}

	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
