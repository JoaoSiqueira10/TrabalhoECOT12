package br.edu.unifei.ecot12.trabalho.futebol;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.trabalho.pessoa.Jogador;

public class Time {

	private String nome;
	private String sigla;
	private Cor cor;
	private Status status = new Mandante();
	
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	private List<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
	
	@Override
	public String toString() {
		return nome;
	}

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
	
	public void mudaUniforme() {
		status.inverter(null);
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

}
